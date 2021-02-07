package app.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Customer extends GeographicalData {


    private final StringProperty customerID;
    private final StringProperty companyName;
    private final StringProperty representative;
    private final StringProperty phone;
    private final StringProperty email;

    public Customer(String customerID, String companyName, String representative, String phone, String email,
                    String address, String city, String postalCode, String country) {
        super(address, city, postalCode, country);
        this.customerID = new SimpleStringProperty(customerID);
        this.companyName = new SimpleStringProperty(companyName);
        this.representative = new SimpleStringProperty(representative);
        this.phone = new SimpleStringProperty(phone);
        this.email = new SimpleStringProperty(email);
    }

    public Customer(){
        super("", "", "", "");
        this.customerID = new SimpleStringProperty();
        this.companyName = new SimpleStringProperty();
        this.representative = new SimpleStringProperty();
        this.phone = new SimpleStringProperty();
        this.email = new SimpleStringProperty();
    }

    public String getCustomerID() {
        return customerID.get();
    }

    public StringProperty customerIDProperty() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID.set(customerID);
    }

    public String getCompanyName() {
        return companyName.get();
    }

    public StringProperty companyNameProperty() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName.set(companyName);
    }

    public String getRepresentative() {
        return representative.get();
    }

    public StringProperty representativeProperty() {
        return representative;
    }

    public void setRepresentative(String representative) {
        this.representative.set(representative);
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
