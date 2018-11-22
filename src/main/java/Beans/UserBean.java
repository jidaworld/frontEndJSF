package Beans;

import Model.Services.*;
import Model.ViewModels.UserViewModel;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.html.HtmlDataTable;
import javax.faces.context.FacesContext;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;

@ManagedBean
@SessionScoped
public class UserBean implements Serializable {

    private String UserName;
    private String Password;
    private String Email;
    private String Name;
    private String LastName;
    private AddUserService addUser;
    private GetUsersService getUsers;
    private List<UserViewModel> list;

    public void addUser() {
        addUser = new AddUserService();
        addUser.addUser(UserName, Password, Email, Name, LastName);
    }

    public void getUsers(String email){
        getUsers = new GetUsersService();
        setList(getUsers.getUsers(email));
    }

    public List<UserViewModel> getList() {
        return list;
    }

    public void setList(List<UserViewModel> list) {
        this.list = list;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }
}
