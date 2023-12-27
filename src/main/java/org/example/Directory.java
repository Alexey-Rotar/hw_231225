package org.example;

import java.util.List;
import java.util.ArrayList;

public class Directory{
    private final List<Employee> empList = new ArrayList<>();

    /**
     * Метод добавлния сотрудников
     * @param id табельный номер
     * @param phone номер телефона
     * @param name имя сотрудника
     * @param exp стаж
     */
    public void addEmployee(int id, String phone, String name, int exp){
        empList.add(new Employee(id, phone, name, exp));
    }

    /**
     * Метод поиска сотрудника по стажу
     * @param exp стаж
     * @return список найденных сотрудников
     */
    public List<Employee> findByExp(int exp){
        List<Employee> list = new ArrayList<>();
        for (Employee e: empList) {
            if (e.getExp() == exp)
                list.add(e);
        }
        return list;
    }

    /**
     * Метод поиска телефона по имени сотрудника
     * @param name имя сотрудника
     * @return список найденных номеров телефонов
     */
    public List<String> findPhoneByName(String name){
        List<String> list = new ArrayList<>();
        for (Employee e: empList) {
            if (e.getName().equals(name))
                list.add(e.getPhone());
        }
        return list;
    }

    /**
     * Метод поиска сотрудника по табельному номеру
     * @param id табельный номер
     * @return сотрудник (тип Employee)
     */
    public Employee findById(int id){
        for (Employee e: empList) {
            if (e.getId() == id)
                return e;
        }
        return null;
    }

    /**
     * Метод вывода списка в консоль
     * @param list список
     * @param <T> обобщенный тип списка
     */
    public <T> void print(List<T> list){
        for (T e: list) {
            System.out.println(e);
        }
        System.out.println();
    }

}