package com.psylvain.katproject;

class Type {
    int id;     //invisible to user, tells which type of expense each item is
    String desc;

    //flights, other transports, meals (three different types?), parking
    //fuel, mileage, lodging, tolls, tips

    int getId() {return id;}
    String getDesc() {return desc;}

    void setId(int id) {this.id = id;}
    void setDesc(String desc) {this.desc = desc;}

}
