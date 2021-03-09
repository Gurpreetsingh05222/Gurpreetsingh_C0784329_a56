package com.gurpreetsingh_c0784329_a5;

public class Assignment6 {
    public static void main(String[] args){
        Assignment5 sample = new Assignment5();
        boolean verified = sample.verifyCredentials();
        if(verified){
            sample.getFirstName();
            sample.getLastName();
            sample.getServiceCost();
            sample.getOptionCost();
            sample.getItemCost();
            sample.getTotalCost();
        }
    }
}
