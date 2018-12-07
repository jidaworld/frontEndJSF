package Beans;

import Model.Services.LoginService;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.io.IOException;
import java.io.Serializable;

@ManagedBean
@SessionScoped
public class LoginBean implements Serializable {

    private String email;
    private String password;
    private LoginService loginService = new LoginService();
    private boolean loggedIn = false;

    public void login(){
        FacesContext context = FacesContext.getCurrentInstance();
        if(loginService.loginUser(email, password)){
            context.getExternalContext().getSessionMap().put("user", email);
            loggedIn = true;
            try{
                context.getExternalContext().redirect("/home.xhtml");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            context.addMessage(null, new FacesMessage("Username or password were wrong"));
        }
    }

    public void logout(){
        FacesContext context = FacesContext.getCurrentInstance();
        context.getExternalContext().invalidateSession();
        loggedIn = false;
        try {
            context.getExternalContext().redirect("login.xhtml");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
