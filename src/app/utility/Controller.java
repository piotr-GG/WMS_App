package app.utility;

import app.database.DB;
import app.model.User;

public class Controller {

    private DB database;

    private User loggedUser = null;
    private boolean isLogged = false;

    public Controller() {
        database = new DB();
    }

    public boolean isLogged() {return isLogged;}

    public void setLogged(boolean setLogged) {this.isLogged = setLogged;}

    public User getLoggedUser() {return loggedUser;}

    public void setLoggedUser(User loggedUser) {this.loggedUser = loggedUser;}

    public boolean logout(){
        if(getLoggedUser() != null && isLogged){
            setLoggedUser(null);
            setLogged(false);
            return true;
        } else {
            System.out.println("Brak zalogowanego użytkownika.");
            return false;
        }
    }

    public DB getDatabase(){return database;}


}
