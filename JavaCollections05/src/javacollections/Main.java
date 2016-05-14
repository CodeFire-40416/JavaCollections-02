/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author human
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<Worker> employee = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            employee.add(new Worker(1, "Pupkin, Vasya", 3000.));
            employee.add(new Worker(2, "Pupkin, Mitya", 3000.));
            employee.add(new Worker(3, "Pupkin, Kosya", 3000.));
            employee.add(new Worker(4, "Pupkin, Pasha", 3000.));
            employee.add(new Worker(5, "Pupkin, Petya", 3000.));
        }
        
        Collections.sort(employee, new Comparator<Worker>() {
            @Override
            public int compare(Worker o1, Worker o2) {
                if (o1.getId() < o2.getId()) {
                    return -1;
                } else if (o1.getId() > o2.getId()) {
                    return +1;
                }
                
                return 0;
            }
        });
        

        System.out.println(employee.size());

        for (Worker worker : employee) {
            System.out.println(worker);
        }
    }

}
