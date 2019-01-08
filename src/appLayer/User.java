package appLayer;

import dataLayer.DB_user;

public class User {

    public boolean isValidUserCredentials(String sUsername, String sUserPassword){
        DB_user db_user = new DB_user();

        return db_user.isValidUserLogin(sUsername, sUserPassword);

    }

}
