package org.example;

public class Main
{
    public static void main(String[] args) {
        Directory dir = new Data().getDir();

        // поиск сотрудника по стажу
        dir.print(dir.findByExp(8));

        // поискт номера телефона сотрудника по имени
        dir.print(dir.findPhoneByName("Irina"));

        // поиск сотрудника по табельному номеру
        System.out.println(dir.findById(2));
    }
}