package org.example;

public class Data{
    private final Directory d = new Directory();

    public Directory getDir(){
        d.addEmployee(1, "+73422548965", "Irina", 12);
        d.addEmployee(2, "+73421234589", "Maria", 13);
        d.addEmployee(4, "+79006469415", "Leonid", 7);
        d.addEmployee(7, "+78124561111", "Irina", 5);
        d.addEmployee(8, "+73431244877", "Sergey", 8);
        d.addEmployee(9, "+76022113685", "Alexey", 8);
        d.addEmployee(11, "+79031232457", "Stepan", 1);
        return d;
    }
}
