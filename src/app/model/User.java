package app.model;

import javafx.beans.property.*;
import javafx.scene.image.Image;

public class User {

    private final IntegerProperty userID;
    private final StringProperty login;
    private final StringProperty password;
    private Employee employee;
    private ObjectProperty<Image> userImage;

    private static int nextID = 1;

    public User(int userID, String login, String password, Employee employee, Image userImage) {
        this.userID = new SimpleIntegerProperty(userID);
        this.login = new SimpleStringProperty(login);
        this.password = new SimpleStringProperty(password);
        this.employee = employee;
        this.userImage = new SimpleObjectProperty<>(userImage);
    }

    public int getUserID() {
        return userID.get();
    }

    public IntegerProperty userIDProperty() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID.set(userID);
    }

    public String getLogin() {
        return login.get();
    }

    public StringProperty loginProperty() {
        return login;
    }

    public void setLogin(String login) {
        this.login.set(login);
    }

    public String getPassword() {
        return password.get();
    }

    public StringProperty passwordProperty() {
        return password;
    }

    public void setPassword(String password) {
        this.password.set(password);
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public ObjectProperty getUserImage() {
        if (this.userImage.get() != null) {
            return this.userImage;
        } else {
            Image defaultImg = new Image("file:src/app/view/images/default-user.png");
            this.userImage = new SimpleObjectProperty<>(defaultImg);
            return this.userImage;
        }
    }

    public void setUserImage(Object userImage) {
        this.userImage.set(userImage);
    }

    public boolean equals(User user) {
        if (this.getUserID() != user.getUserID()) return false;
        if (!(this.getLogin().equals(user.getLogin()))) return false;
        if (!(this.getPassword().equals(user.getPassword()))) return false;

        return true;
    }
}
