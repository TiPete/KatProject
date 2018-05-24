package com.psylvain.katproject;

import java.time.LocalDate;

class Item {
    private String desc;
    private int amount;     //Original currency dollar = val/100, cents = val%100, stored val*100
    private int amountLocal; //Amount in local currency
    private LocalDate date; //date of the expense
    private int type;       //Type of item, by id
    private int project;    //Project the item is related to, by id

    //currencies
    //Photo of receipt if over a certain threshold
    //User-defined defaults for money locale]
    //Multiple pictures option
    //Attach documents (pdf, etc.)
    //Payment (company credit, out of pocket

    public String getDesc() {return desc;}
    public int getAmount() {return amount;}
    public LocalDate getDate() {return date;}

    public void setDesc(String desc) {this.desc = desc;}
    public void setAmount(int amount) {this.amount = amount;}
    public void setDate(LocalDate date) {this.date = date;}
}
