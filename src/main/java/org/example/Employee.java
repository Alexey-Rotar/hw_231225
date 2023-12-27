package org.example;

public class Employee{
    private final int id;
    private final String phone;
    private final String name;
    private final int exp;

    public Employee(int id, String phone, String name, int exp){
        this.id = id;
        this.phone = phone;
        this.name = name;
        this.exp = exp;
    }

    public int getId(){
        return id;
    }

    public String getPhone(){
        return phone;
    }

    public String getName(){
        return name;
    }

    public int getExp(){
        return exp;
    }

    @Override
    public String toString() {
        return id + ": " + name + " (phone: " + phone + ", exp.: " + exp + ")";
    }
}
