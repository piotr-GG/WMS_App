package app.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.time.LocalDate;

public abstract class Person extends GeographicalData {

    private final StringProperty firstName;
    private final StringProperty lastName;
    private LocalDate birthDate;
    private LocalDate hireDate;
    private final StringProperty phoneNumber;
    private final StringProperty email;

    public Person(String firstName, String lastName, LocalDate birthDate,
                  LocalDate hireDate, String phoneNumber, String email,
                  String address, String city, String postalCode, String country) {
        super(address, city, postalCode, country);
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);
        this.birthDate = birthDate;
        this.hireDate = hireDate;
        this.phoneNumber = new SimpleStringProperty(phoneNumber);
        this.email = new SimpleStringProperty(email);
    }

    public Person(){
        super();
        this.firstName = new SimpleStringProperty("");
        this.lastName = new SimpleStringProperty("");
        this.birthDate = LocalDate.now();
        this.hireDate = LocalDate.now();
        this.phoneNumber = new SimpleStringProperty("");
        this.email = new SimpleStringProperty("");
    }

    public String getFirstName() {
        return firstName.get();
    }

    public StringProperty firstNameProperty() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }

    public String getLastName() {
        return lastName.get();
    }

    public StringProperty lastNameProperty() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName.set(lastName);
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public String getPhoneNumber() {
        return phoneNumber.get();
    }

    public StringProperty phoneNumberProperty() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber.set(phoneNumber);
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
