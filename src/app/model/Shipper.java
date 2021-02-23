package app.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Shipper {

    private IntegerProperty shipperID;
    private StringProperty companyName;
    private StringProperty phone;
    private StringProperty email;

    /**
     * Default constructor for class Shipper
     * @param shipperID
     * @param companyName
     * @param phone
     * @param email
     */
    public Shipper(int shipperID, String companyName, String phone, String email){
        this.shipperID = new SimpleIntegerProperty(shipperID);
        this.companyName = new SimpleStringProperty(companyName);
        this.phone = new SimpleStringProperty(phone);
        this.email = new SimpleStringProperty(email);
    }

    /**
     * Getters - properties
     *
     */
    public IntegerProperty getShipperIDProperty() {
        return shipperID;
    }

    public StringProperty getCompanyNameProperty() {
        return companyName;
    }

    public StringProperty getPhoneProperty() {
        return phone;
    }

    public StringProperty getEmailProperty() {
        return email;
    }

    /**
     * Getters - values
     */

    public int getShipperID() {
        return shipperID.get();
    }

    public String getCompanyName() {
        return companyName.get();
    }

    public String getPhone() {
        return phone.get();
    }

    public String getEmail() {
        return email.get();
    }

    /**
     * Setters - values
     */

    public void setShipperID(int shipperID){
        this.shipperID.set(shipperID);
    }

    public void setCompanyName(String companyName){
        this.companyName.set(companyName);
    }

    public void setPhone(String phone){
        this.phone.set(phone);
    }

    public void setEmail(String email){
        this.email.set(email);
    }

}
