package appLayer;

public class User {

    public boolean isValidUserCredentials(String sUsername, String sUserPassword){
        if(sUsername.equals("tobi@code.de") && sUserPassword.equals("test1234")){
            return true;
        }
        return false;
    }

}
