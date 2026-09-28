package com.mycompany.question1.RunApplication;

public abstract class Console implements IConsole {

    private String consoleType;
    private String store;
    private int totalSales;

    public Console(String consoleType, String store, int totalSales) {
        this.consoleType = consoleType;
        this.store = store;
        this.totalSales = totalSales;
    }

 
    public String getConsoleType() {
        return consoleType;
    }

    
    public String getStore() {
        return store;
    }

   
    public int getTotalSales() {
        return totalSales;
    }
}

