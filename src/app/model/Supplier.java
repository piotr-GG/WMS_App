package app.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Supplier extends GeographicalData {
    private final IntegerProperty supplierID;
    private final StringProperty companyName;
    private final StringProperty representative;
    private final StringProperty phoneNumber;
    private final StringProperty other;

    public Supplier(int supplierID, String companyName, String representativeName, String address, String city, String postalCode, String country, String phoneNumber, String other)
    {
        super(address, city, postalCode, country);
        this.supplierID = new SimpleIntegerProperty(supplierID);
        this.companyName = new SimpleStringProperty(companyName);
        this.representative = new SimpleStringProperty(representativeName);
        this.phoneNumber = new SimpleStringProperty(phoneNumber);
        this.other = new SimpleStringProperty(other);

    }

    public Supplier(){
        super("", "", "", "");
        this.supplierID = new SimpleIntegerProperty();
        this.companyName = new SimpleStringProperty();
        this.representative = new SimpleStringProperty();
        this.phoneNumber = new SimpleStringProperty();
        this.other = new SimpleStringProperty();
    }
    /**
     * Getters - properties
     */
    public IntegerProperty getSupplierIDProperty() {
        return supplierID;
    }

    public StringProperty getCompanyNameProperty() {
        return companyName;
    }

    public StringProperty getRepresentativeProperty() {
        return representative;
    }

    public StringProperty getPhoneNumberProperty() {
        return phoneNumber;
    }

    public StringProperty getOtherProperty() {
        return other;
    }


    /**
     * Getters - values
     */

    public int getSupplierID() {
        return supplierID.get();
    }

    public String getCompanyName() {
        return companyName.get();
    }

    public String getRepresentative() {
        return representative.get();
    }

}
