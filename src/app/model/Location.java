package app.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.ObservableList;
import org.jetbrains.annotations.NotNull;

public class Location {
    private final StringProperty locationID;
    private final IntegerProperty acceptableLoad;
    private final IntegerProperty acceptableVolume;
    private ObservableList<Product> productsStored;


    public Location(String locationID, int acceptableLoad, int acceptableVolume, ObservableList<Product> productsStored){
        this.locationID = new SimpleStringProperty(locationID);
        this.acceptableLoad = new SimpleIntegerProperty(acceptableLoad);
        this.acceptableVolume = new SimpleIntegerProperty(acceptableVolume);
        this.productsStored = productsStored;
    }

    /**
     *Getters - properties
     */

    public StringProperty getLocationIDProperty(){
        return this.locationID;
    }

    public IntegerProperty getAcceptableLoadProperty(){
        return this.acceptableLoad;
    }

    public IntegerProperty getAcceptableVolumeProperty(){
        return this.acceptableVolume;
    }

    public ObservableList<Product> getProductsStored(){
        return this.productsStored;
    }

    /**
     * Getters - values
     */

    public String getLocationID(){
        return this.locationID.get();
    }

    public int getAcceptableLoad(){
        return this.acceptableLoad.get();
    }

    public int getAcceptableVolume(){
        return this.acceptableVolume.get();
    }

    /**
     * Setters - values
     */

    public void setLocationID(String locationID){
        this.locationID.set(locationID);
    }

    public void setAcceptableLoad(int acceptableLoad){
        this.acceptableLoad.set(acceptableLoad);
    }

    public void setAcceptableVolume(int acceptableVolume){
        this.acceptableVolume.set(acceptableVolume);
    }

    public void setProductsStored(ObservableList<Product> productsStored){
        this.productsStored = productsStored;
    }

    public boolean areLocationsEqual(@NotNull Location otherLocation){
        if(!this.getLocationID().equals(otherLocation.getLocationID())) return false;
        if(this.getAcceptableLoad() != otherLocation.getAcceptableLoad()) return false;
        if(this.getAcceptableVolume() != otherLocation.getAcceptableVolume()) return false;

        return true;
    }
}
