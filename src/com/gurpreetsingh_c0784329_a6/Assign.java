package com.gurpreetsingh_c0784329_a6;

import com.gurpreetsingh_c0784329_a5.Sample;

public class Assign {
    public static void main(String[] args){
        Sample sample = new Sample();
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
