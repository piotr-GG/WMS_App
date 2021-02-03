package com.wms;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Main {

    public static void main(String[] args) {
	    IntegerProperty testValue = new SimpleIntegerProperty(2);
	    System.out.println(String.format("Wartość wynosi: %d", testValue.get()));
    }
}
