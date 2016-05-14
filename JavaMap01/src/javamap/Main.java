/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author human
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Map<String, Double> employee = new HashMap<>();
        
        System.out.println(employee.put("Pupkin Vasya", 3000.));
        System.out.println(employee.put("Pupkin Vasya", 5000.));
        System.out.println(employee.put("Pupkin Vasya", 6000.));
        System.out.println(employee.put("Pupkin Petya", 6000.));
        
        System.out.println("Size: " + employee.size());
        
        System.out.println("Key set:");
        Set<String> keySet = employee.keySet();
        for (String name : keySet) {
            Double salary = employee.get(name);
            
            System.out.printf("%s: $%4.2f\n", name, salary);
        }
        
        double sum = .0;
        
        for (Double salary : employee.values()) {
            sum += salary;
        }
        
        System.out.printf("Total amout: $%4.2f\n", sum);
    }
    
}
