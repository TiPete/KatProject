package com.psylvain.katproject;

import java.util.ArrayList;

class Project {
    int id;         //invisible to user, used to tell which project each item belongs to
    String name;    //name of the project
    String desc;    //short description of the project
    String adress;  //adress of the customer
    ArrayList<Contact> contact;

    //Total amount, amount paid by company, amount claimed by employee

    public int getId() {return id;}
    public String getName() {return name;}
    public String getDesc() {return desc;}
    public String getAdress() {return adress;}
    public ArrayList<Contact> getContact() {return contact;}

    public void setId(int id) {this.id = id;}
    public void setName(String name) {this.name = name;}
    public void setDesc(String desc) {this.desc = desc;}
    public void setAdress(String adress) {this.adress = adress;}
    public void setContact(ArrayList<Contact> contact) {this.contact = contact;}

    public void addContact(Contact c) {contact.add(c);}
    public void delContact(int i) {contact.remove(i);}
}

