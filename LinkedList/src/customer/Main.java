/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer;

import java.util.ArrayList;

/**
 *
 * @author brianyoo
 */
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Tim", 54.96);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.18);
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());
        
        
        ArrayList<Integer> intList = new ArrayList<Integer>();
        
        intList.add(1);
        intList.add(2);
        intList.add(3);
        
        for(int i=0; i<intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }
        
        intList.add(1,2);
        
        for(int i=0; i<intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }
    }
}
