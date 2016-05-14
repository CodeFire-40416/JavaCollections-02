/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollections;

import java.util.LinkedHashSet;
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

        Set<Worker> employee = new LinkedHashSet<>();

        for (int i = 0; i < 3; i++) {
            employee.add(new Worker(1, "Pupkin, Vasya", 3000.));
            employee.add(new Worker(2, "Pupkin, Mitya", 3000.));
            employee.add(new Worker(3, "Pupkin, Kosya", 3000.));
            employee.add(new Worker(4, "Pupkin, Pasha", 3000.));
            employee.add(new Worker(5, "Pupkin, Petya", 3000.));
        }

        System.out.println(employee.size());

        for (Worker worker : employee) {
            System.out.println(worker);
        }
    }

}
