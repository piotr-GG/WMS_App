package app.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.ObservableList;

import java.time.LocalDate;

public class Shipment extends GeographicalData{
    private IntegerProperty shipmentID;
    private Shipper shipper;
    private Customer customer;
    private IntegerProperty palletsCount;
    private StringProperty shippedName;
    private LocalDate shippedDate;
    private ObservableList<ShipmentDetails> shipmentDetails;
    private ShipmentStatus shipmentStatus;

    public Shipment(int shipmentID, Shipper shipper, Customer customer, int palletsCount, String shippedAddress, String shippedName, String shippedCity, String shippedPostalCode, String shippedCountry, LocalDate shippedDate, ObservableList<ShipmentDetails> shipmentDetails, String shipmentStatus){
        super(shippedAddress, shippedCity, shippedPostalCode, shippedCountry);
        this.shipmentID = new SimpleIntegerProperty(shipmentID);
        this.shipper = shipper;
        this.customer = customer;
        this.palletsCount = new SimpleIntegerProperty(palletsCount);
        this.shippedName = new SimpleStringProperty(shippedName);
        this.shippedDate = shippedDate;
        this.shipmentDetails = shipmentDetails;
        this.shipmentStatus = Enum.valueOf(ShipmentStatus.class, shipmentStatus);
    }

    /*
     * Getters - properties
     */

    public IntegerProperty getShipmentIDProperty(){
        return this.shipmentID;
    }

    public IntegerProperty getPalletsCountProperty(){
        return this.palletsCount;
    }

    public StringProperty getShippedNameProperty(){
        return this.shippedName;
    }



    /*
     * Getters - values
     */

    public int getShipmentID(){
        return this.shipmentID.get();
    }

    public int getPalletsCount(){
        return this.palletsCount.get();
    }

    public Shipper getShipper(){
        return this.shipper;
    }

    public Customer getCustomer(){
        return this.customer;
    }

    public String getShippedName(){
        return this.shippedName.get();
    }

    public LocalDate getShippedDate(){
        return this.shippedDate;
    }

    public ObservableList<ShipmentDetails> getShipmentDetails(){
        return this.shipmentDetails;
    }

    public ShipmentStatus getShipmentStatus(){
        return this.shipmentStatus;
    }
    /*
     * Setters
     */

    public void setShipmentID(int shipmentID){
        this.shipmentID.set(shipmentID);
    }

    public void setPalletsCount(int palletsCount){
        this.palletsCount.set(palletsCount);
    }

    public void setShipper(Shipper shipper){
        this.shipper = shipper;
    }

    public void setCustomer(Customer customer){
        this.customer = customer;
    }

    public void setShippedName(String shippedName){
        this.shippedName.set(shippedName);
    }

    public void setShippedDate(LocalDate shippedDate){
        this.shippedDate = shippedDate;
    }
    public void setShipmentDetails (ObservableList<ShipmentDetails> shipmentDetails){
        this.shipmentDetails = shipmentDetails;
    }

    public void setShipmentStatus(String shipmentStatus){
        this.shipmentStatus = Enum.valueOf(ShipmentStatus.class, shipmentStatus);
    }
    public enum ShipmentStatus{
        Awaits_Shipment("Oczekuje na wysyłkę"), Shipped("Wysłana"), Arrived("Odebrana");

        private String polishVersion;

        private ShipmentStatus(String polishVersion){ this.polishVersion = polishVersion;}

        public String getPolishVersion(){ return this.polishVersion; }

        public static String[] polishValues(){
            ShipmentStatus[] values = ShipmentStatus.values();
            String[] polishValues = new String[values.length];
            for(int i = 0; i < values.length; i++){
                polishValues[i] = values[i].getPolishVersion();
            }
            return polishValues;
        }

    }
}
