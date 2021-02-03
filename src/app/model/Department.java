package app.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Department extends GeographicalData {
    private final IntegerProperty departmentID;
    private final StringProperty departmentName;
    private final StringProperty phone;
    private final StringProperty email;

    public Department(int departmentID, String departmentName, String phone, String address, String city, String postalCode, String country, String email){
        super(address, city, postalCode, country);
        this.departmentID = new SimpleIntegerProperty(departmentID);
        this.departmentName = new SimpleStringProperty(departmentName);
        this.phone = new SimpleStringProperty(phone);
        this.email = new SimpleStringProperty(email);
    }

    public int getDepartmentID() {
        return departmentID.get();
    }

    public IntegerProperty departmentIDProperty() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID.set(departmentID);
    }

    public String getDepartmentName() {
        return departmentName.get();
    }

    public StringProperty departmentNameProperty() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName.set(departmentName);
    }

    public String getPhone() {
        return phone.get();
    }

    public StringProperty phoneProperty() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone.set(phone);
    }

    public String getEmail() {
        return email.get();
    }

    public StringProperty emailProperty() {
        return email;
    }

    public void setEmail(String email) {
        this.email.set(email);
    }
}
