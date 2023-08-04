package com.driver.Exception;

public class ProductionError extends RuntimeException{
    public ProductionError(String mess){
        super(mess);
    }
}
