package app.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

import java.time.LocalDate;

public class Employee extends Person {

    private final IntegerProperty employeeID;
    private Position position;
    private Department department;
//    TODO: Make db query for next available ID instead of static variable
    private static int nextID;

    public Employee(int employeeID, String firstName, String lastName, LocalDate birthDate, LocalDate hireDate, String address, String city, String postalCode, String country, String phoneNumber, String email, String position, Department department ) {
        super(firstName, lastName, birthDate, hireDate, address, city, postalCode, country, phoneNumber, email);  //invoke constructor from parent class
        this.employeeID = new SimpleIntegerProperty(employeeID);

        try {
            this.position = Enum.valueOf(Position.class, position);
        } catch (IllegalArgumentException e) {
            System.err.println("Wystąpił błąd przypisania stanowiska do pracownika!");
        }

        if (nextID > employeeID) {
            nextID++;
        } else {
            nextID = employeeID + 1;
        }

        this.department = department;
    }

    public int getEmployeeID() {
        return employeeID.get();
    }

    public IntegerProperty employeeIDProperty() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID.set(employeeID);
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public static int getNextID() {
        return nextID;
    }

    public boolean equals(Employee other){
        if(this.getEmployeeID() != other.getEmployeeID()) return false;
        if(!(this.getFirstName().equals(other.getFirstName()))) return false;
        if(!(this.getLastName().equals(other.getLastName()))) return false;
        if(!(this.getBirthDate().isEqual(other.getBirthDate()))) return false;
        if(!(this.getHireDate().isEqual(other.getHireDate()))) return false;
        if(!(this.getAddress().equals(other.getAddress()))) return false;
        if(!(this.getCountry().equals(other.getCountry()))) return false;
        if(!(this.getCity().equals(other.getCity()))) return false;
        if(!(this.getPhoneNumber().equals(other.getPhoneNumber()))) return false;
        if(!(this.getEmail().equals(other.getEmail()))) return false;
        if(!(this.getPosition().equals(other.getPosition()))) return false;
        if(!(this.getPostalCode().equals(other.getPostalCode()))) return false;

        return true;
    }
    public enum Position{
        Admin("Administrator", "Administrator"), OfficeEmployee("Office employee",
                "Pracownik biurowy"), Accountant("Accountant", "Księgowy"),
        SalesManager("Sales representative", "Przedstawiciel handlowy"),
        WarehouseEmployee("Warehouse employee", "Magazynier");

        public String getEnglishVersion() {
            return englishVersion;
        }

        public String getPolishVersion() {
            return polishVersion;
        }

        private final String englishVersion;
        private final String polishVersion;

        private Position(String englishVersion, String polishVersion){
            this.englishVersion = englishVersion;
            this.polishVersion = polishVersion;
        };

        public String[] valuesEnglish(){
            Position[] values = Position.values();
            String[] englishValues = new String[values.length];
            for(int i = 0; i < values.length; i++){
                englishValues[i] = values[i].getEnglishVersion();
            }
            return englishValues;
        }

        public String[] valuesPolish(){
            Position[] values = Position.values();
            String[] polishValues = new String[values.length];
            for(int i = 0; i < values.length; i++){
                polishValues[i] = values[i].getPolishVersion();
            }
            return polishValues;
        }
    }
}
