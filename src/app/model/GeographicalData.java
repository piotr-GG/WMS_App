package app.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public abstract class GeographicalData {

    private final StringProperty address;
    private final StringProperty city;
    private final StringProperty postalCode;
    private final StringProperty country;

    public final String getAddress() {
        return address.get();
    }

    public final StringProperty addressProperty() {
        return address;
    }

    public final void setAddress(String address) {
        this.address.set(address);
    }

    public final String getCity(){
        return city.get();
    }

    public final StringProperty getCityProperty(){
        return city;
    }

    public final void setCity(String city){
        this.city.set(city);
    }

    public final String getPostalCode(){
        return postalCode.get();
    }

    public final StringProperty getPostalCodeProperty(){
        return postalCode;
    }

    public final void setPostalCode(String postalCode){
        this.postalCode.set(postalCode);
    }

    public final String getCountry(){
        return country.get();
    }

    public final StringProperty getCountryProperty(){
        return country;
    }

    public final void setCountry(String country){
        this.country.set(country);
    }

    public GeographicalData(String address, String city, String postalCode, String country){
        this.address = new SimpleStringProperty(address);
        this.city = new SimpleStringProperty(city);
        this.postalCode = new SimpleStringProperty(postalCode);
        this.country = new SimpleStringProperty(country);
    }

    public GeographicalData(){
        this.address = new SimpleStringProperty("");
        this.city = new SimpleStringProperty("");
        this.postalCode = new SimpleStringProperty("");
        this.country = new SimpleStringProperty("");
    }


}
