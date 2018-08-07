package com.hand.infra.config;

public class Logging {

    public void beforeAdvice(){
        System.out.println("BeforeInsertFilmEvent");
    }

    public void afterAdvice(){
        System.out.println("AfterInsertFilmEvent");
    }

    public void afterReturningAdvice(Object retVal){
        System.out.println("Returning:" + retVal.toString() );
    }

    public void AfterThrowingAdvice(IllegalArgumentException ex){
        System.out.println("There has been an exception: " + ex.toString());
    }
}
