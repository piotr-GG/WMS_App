package app.model;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;

import java.time.LocalDate;

public class ShippingInfo {

    private Shipment shipment;
    private LocalDate arrivalDate;
    private IntegerProperty distanceCovered;
    private DoubleProperty shipmentDuration;

    public ShippingInfo(Shipment shipment, LocalDate arrivalDate, int distanceCovered, double shipmentDuration){
        this.shipment = shipment;
        this.arrivalDate = arrivalDate;
        this.distanceCovered = new SimpleIntegerProperty(distanceCovered);
        this.shipmentDuration = new SimpleDoubleProperty(shipmentDuration);
    }

    public Shipment getShipment(){
        return this.shipment;
    }

    public LocalDate getArrivalDate(){
        return this.arrivalDate;
    }

    public IntegerProperty getDistanceCoveredProperty(){
        return this.distanceCovered;
    }

    public DoubleProperty getShipmentDurationProperty(){
        return this.shipmentDuration;
    }

    public int getDistanceCovered(){
        return this.distanceCovered.get();
    }

    public double getShipmentDuration(){
        return this.shipmentDuration.get();
    }

    public void setShipment(Shipment shipment){
        this.shipment = shipment;
    }

    public void setArrivalDate(LocalDate arrivalDate){
        this.arrivalDate = arrivalDate;
    }

    public void setDistanceCovered(int distanceCovered){
        this.distanceCovered.set(distanceCovered);
    }

    public void setShipmentDuration(double shipmentDuration){
        this.shipmentDuration.set(shipmentDuration);
    }


}
