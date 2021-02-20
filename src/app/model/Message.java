package app.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.time.LocalDate;

public class Message {

    private final IntegerProperty messageID;
    private User user;
    private final StringProperty title;
    private final StringProperty content;
    private LocalDate date;

    private static int nextID = 1;

    /**
     * Default constructor for Message class
     * @param messageID
     * @param user
     * @param title
     * @param content
     * @param date
     */
    public Message(int messageID, User user, String title, String content, LocalDate date){
        this.messageID = new SimpleIntegerProperty(messageID);
        this.user = user;
        this.title = new SimpleStringProperty(title);
        this.content = new SimpleStringProperty(content);
        this.date = date;

        //Increment nextID

        if(nextID > messageID){

        } else{
            nextID = messageID + 1;
        }
    }




    /**
     * Getters - properties
     */

    public IntegerProperty getMessageIDProperty(){
        return messageID;
    }

    public User getUser(){
        return user;
    }

    public StringProperty getTitleProperty(){
        return title;
    }

    public StringProperty getContentProperty(){
        return content;
    }

    public LocalDate getDate(){
        return date;
    }

    /**
     * Getters - values
     */
    public int getMessageID(){
        return messageID.get();
    }

    public String getTitle(){
        return title.get();
    }

    public String getContent(){
        return content.get();
    }

    /**
     * Setters - values
     */

    public void setMessageID(int messageID){
        this.messageID.set(messageID);
    }

    public void setUser(User user){
        this.user = user;
    }

    public void setTitle(String title){
        this.title.set(title);
    }

    public void setContent(String content){
        this.content.set(content);
    }

    public void setDate(LocalDate date){
        this.date = date;
    }

    /**
     * Getter for static field 'nextID'
     * @return
     */
    public static int getNextID(){
        return nextID;
    }
}
