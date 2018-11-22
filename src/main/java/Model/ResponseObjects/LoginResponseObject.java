package Model.ResponseObjects;

public class LoginResponseObject {

    private boolean successful;

    public LoginResponseObject(boolean successful) {
        this.successful = successful;
    }

    public boolean isSuccessful() {
        return successful;
    }
}
