package com.gurpreetsingh_c0784329_a5;

import javax.swing.*;

public class Sample {
    private String firstName;
    private String lastName;
    private float itemCost, serviceCost, optionCost, totalCost, hours;
    private int box, days;

    public Sample(){

    }

    public Sample(float serviceCost, float optionCost, float itemCost, float hours, int days, int box){
        this.serviceCost = serviceCost;
        this.optionCost = optionCost;
        this.itemCost = itemCost;
        this.days = days;
        this.hours = hours;
        this.box = box;
    }

    public String getFirstName() {
        firstName = JOptionPane.showInputDialog(null, "Enter first name");
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        lastName = JOptionPane.showInputDialog(null, "Enter last name");
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public float getItemCost() {
        String items = JOptionPane.showInputDialog("Choose Items:\nEnter 1 for Boxes small - $2.50/per box" +
                "\n" + "Enter 2 Boxes large - $4.50/ per box\n " +
                "Enter 3 to skip");

        switch (items) {
            case "1":
                itemCost = 2.50f;
                break;
            case "2":
                itemCost = 4.50f;
                break;
            case "3":
                itemCost = 0;
                break;
        }
        if(items.equals("1") || items.equals("2")) {
            this.box = Integer.parseInt(JOptionPane.showInputDialog("Enter number of hours: "));
        }
        itemCost = itemCost*box;
        return itemCost;
    }

    public void setItemCost(float itemCost) {
        this.itemCost = itemCost;
    }

    public void getServiceCost() {
        String selectPackage = JOptionPane.showInputDialog("Choose Service Package:\n + " +
                "1 for Package A - $100/hr\n" +
                "2 for Package B - $150/hr\n" +
                "3 for skip");

        switch (selectPackage) {
            case "1":
                serviceCost = 100.0F;
                break;
            case "2":
                serviceCost = 150.0f;
                break;
            case "3":
                serviceCost = 0;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid selection");
                break;
        }
        if(selectPackage.equals("1") || selectPackage.equals("2")){
            this.hours = Integer.parseInt(JOptionPane.showInputDialog("Enter number of hours: "));
        }
        serviceCost = serviceCost * this.hours;
    }

    public void setServiceCost(float serviceCost) {
        this.serviceCost = serviceCost;
    }

    public void getOptionCost() {
        String options = JOptionPane.showInputDialog(
                "Choose options: \nEnter 1 for small storage - $8/day\n" +
                        "Enter 2 for large storage - $20.11/day\n" +
                        "Enter 3 to skip"
        );
        switch (options) {
            case "1":
                optionCost = 8;
                break;
            case "2":
                optionCost = 20.11f;
                break;
            case "3":
                optionCost = 0;
                break;
        }
        if(options.equals("1") || options.equals("2")){
            this.days = Integer.parseInt(JOptionPane.showInputDialog("Enter number of days: "));
        }
        optionCost = optionCost * this.days;
    }

    public void setOptionCost(float optionCost) {
        this.optionCost = optionCost;
    }

    public void getTotalCost() {
        this.totalCost = this.serviceCost + this.optionCost + this.itemCost;
        JOptionPane.showMessageDialog(null, "The Service Cost is: $"
                + this.serviceCost+
                "\nThe Option Cost is: $" +
                this.optionCost +
                "\nThe item cost is :$"+
                this.itemCost +
                "\nTotal amount is: $"+ totalCost
        );
    }

    public float getHours() {
        return hours;
    }

    public void setHours(float hours) {
        this.hours = hours;
    }

    public int getBox() {
        return box;
    }

    public void setBox(int box) {
        this.box = box;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public boolean verifyCredentials(){
        String userName = "gurpreet";
        String password = "gurpreet";
        boolean valid = false;
        int count = 1;
        while(count <=3){
            String inputUsername = JOptionPane.showInputDialog(null, "Enter username");
            String inputPassword = JOptionPane.showInputDialog(null, "Enter password");
            if(inputUsername.equalsIgnoreCase(userName) && inputPassword.equals(password)){
                valid = true;
                break;
            }else{
                JOptionPane.showMessageDialog(null, "Wrong Credentials");
            }
            if(count == 3){
                JOptionPane.showMessageDialog(null, "You have exceeded the limit. \nTry again after some time");
            }
            count++;
        }
        return valid;
    }
}
