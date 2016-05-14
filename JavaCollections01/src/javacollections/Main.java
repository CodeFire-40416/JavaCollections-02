/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollections;

import java.util.HashSet;
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

        Set<String> numbers = new HashSet<>();

        for (int i = 0; i < 3; i++) {
            numbers.add("One");
            numbers.add("Two");
            numbers.add("Three");
            numbers.add("Four");
            numbers.add("Five");
        }

        System.out.println(numbers.size());
        
        for (String numb : numbers) {
            System.out.println(numb);
        }
    }

}
