package app.model;

import javafx.beans.property.*;
import javafx.scene.image.Image;

public class Category {

    private final IntegerProperty categoryID;
    private final StringProperty categoryName;
    private final StringProperty description;
    private final ObjectProperty<Image> categoryPhoto;


    public Category(int categoryID, String categoryName, String description, Image categoryPhoto){
        this.categoryID = new SimpleIntegerProperty(categoryID);
        this.categoryName = new SimpleStringProperty(categoryName);
        this.description = new SimpleStringProperty(description);
        this.categoryPhoto = new SimpleObjectProperty<>(categoryPhoto);
    }

    public Category(String categoryName){
        this.categoryName = new SimpleStringProperty(categoryName);
        this.categoryID = new SimpleIntegerProperty();
        this.description = new SimpleStringProperty();
        this.categoryPhoto = new SimpleObjectProperty<>();
    }

    public int getCategoryID() {
        return categoryID.get();
    }

    public IntegerProperty categoryIDProperty() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID.set(categoryID);
    }

    public String getCategoryName() {
        return categoryName.get();
    }

    public StringProperty categoryNameProperty() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName.set(categoryName);
    }

    public String getDescription() {
        return description.get();
    }

    public StringProperty descriptionProperty() {
        return description;
    }

    public void setDescription(String description) {
        this.description.set(description);
    }

    public Object getCategoryPhoto() {
        return categoryPhoto.get();
    }

    public ObjectProperty categoryPhotoProperty() {
        return categoryPhoto;
    }

    public void setCategoryPhoto(Object categoryPhoto) {
        this.categoryPhoto.set(categoryPhoto);
    }

}
