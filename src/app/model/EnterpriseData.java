package app.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class EnterpriseData {

    private static StringProperty enterpriseName;
    private static StringProperty street;
    private static StringProperty city;
    private static StringProperty country;
    private static StringProperty postalCode;
    private static StringProperty phoneNumber;
    private static StringProperty email;
    private static StringProperty nip;
    private static StringProperty regon;

    public static void initializeEnterpriseData() {
        enterpriseName = new SimpleStringProperty();
        street = new SimpleStringProperty();
        city = new SimpleStringProperty();
        country = new SimpleStringProperty();
        postalCode = new SimpleStringProperty();
        phoneNumber = new SimpleStringProperty();
        email = new SimpleStringProperty();
        nip = new SimpleStringProperty();
        regon = new SimpleStringProperty();
    }

    public static StringProperty getEnterpriseNameProperty() {
        return enterpriseName;
    }

    public static StringProperty getStreetProperty() {
        return street;
    }

    public static StringProperty getCityProperty() {
        return city;
    }

    public static StringProperty getCountryProperty() {
        return country;
    }

    public static StringProperty getPostalCodeProperty() {
        return postalCode;
    }

    public static StringProperty getPhoneNumberProperty() {
        return phoneNumber;
    }

    public static StringProperty getEmailProperty() {
        return email;
    }

    public static StringProperty getNipProperty() {
        return nip;
    }

    public static StringProperty getRegonProperty() {
        return regon;
    }


    public static String getEnterpriseName() {
        return enterpriseName.get();
    }

    public static String getStreet() {
        return street.get();
    }

    public static String getCity() {
        return city.get();
    }

    public static String getCountry() {
        return country.get();
    }

    public static String getPostalCode() {
        return postalCode.get();
    }

    public static String getPhoneNumber() {
        return phoneNumber.get();
    }

    public static String getEmail() {
        return email.get();
    }

    public static String getNip() {
        return nip.get();
    }

    public static String getRegon() {
        return regon.get();
    }


    public static void setEnterpriseName(String enterpriseName) {
        EnterpriseData.enterpriseName.set(enterpriseName);
    }

    public static void setStreet(String street) {
        EnterpriseData.street.set(street);
    }

    public static void setCity(String city) {
        EnterpriseData.city.set(city);
    }

    public static void setCountry(String country) {
        EnterpriseData.country.set(country);
    }

    public static void setPostalCode(String postalCode) {
        EnterpriseData.postalCode.set(postalCode);
    }

    public static void setPhoneNumber(String phoneNumber) {
        EnterpriseData.phoneNumber.set(phoneNumber);
    }

    public static void setEmail(String email) {
        EnterpriseData.email.set(email);
    }

    public static void setNip(String nip) {
        EnterpriseData.nip.set(nip);
    }

    public static void setRegon(String regon) {
        EnterpriseData.regon.set(regon);
    }

    public static void setEnterpriseData(String enterpriseName, String street, String city, String country, String postalCode, String phoneNumber, String email, String nip, String regon) {
        setEnterpriseName(enterpriseName);
        setStreet(street);
        setCity(city);
        setCountry(country);
        setPostalCode(postalCode);
        setPhoneNumber(phoneNumber);
        setEmail(email);
        setNip(nip);
        setRegon(regon);
    }

    public static ObservableList<String> toArray() {
        ObservableList<String> tempList = FXCollections.observableArrayList();
        tempList.addAll(enterpriseName.get(), street.get(), city.get(), country.get(), postalCode.get(), phoneNumber.get(), email.get(), nip.get(), regon.get());
        return tempList;
    }
}
