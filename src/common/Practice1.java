/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import common.Employee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Benjamin
 */
public class Practice1 {

    public static void main(String[] args) {
        //Create four Employee objects
        Employee e1 = new Employee("Smith", "Bob", "333-333-3333");
        Employee e2 = new Employee("Doe", "John", "222-22-2222");
        Employee e3 = new Employee("Steele", "Nathan", "444-44-4444");
        Employee e4 = new Employee("King", "Kelli", "555-55-5555");

        List employeeList = new ArrayList();

        for (Object e : employeeList) {
            System.out.println(e.toString());
        }
    }

}
