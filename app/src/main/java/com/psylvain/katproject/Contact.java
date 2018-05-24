package com.psylvain.katproject;

import java.util.ArrayList;

class Contact{
    private String name;    //Only field that can't be empty
    private String pos;     //position of the contact
    private ArrayList<String> notes;    //personal notes about the contact
    private String email;   //email address
    private ArrayList<String[][]> plist; //phone numbers list, 0 = phone number, 1 = description

    public String getName() {return name;}
    public String getPos() {return pos;}
    public ArrayList<String> getNotes() {return notes;}
    public String getEmail() {return email;}
    public ArrayList<String[][]> getPlist() {return plist;}

    public void setName(String name) {this.name = name;}
    public void setPos(String pos) {this.pos = pos;}
    public void setNotes(ArrayList<String> notes) {this.notes = notes;}
    public void setEmail(String email) {this.email = email;}
    public void setPlist(ArrayList<String[][]> plist) {this.plist = plist;}

    public void addNote(String n) {notes.add(n);}
    public void delNote(int i) {notes.remove(i);}
    public void clearNotes() {notes.clear();}

    public void addPhone(String p, String d) {String[][] n = {{p,d}}; plist.add(n);}
    public void delPhone(int i) {plist.remove(i);}
}
