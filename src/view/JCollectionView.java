/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Nathan
 */
import java.util.*;

public class JCollectionView {
//    import java.util.*;
//public class Ran {
    public JCollectionView(){
        this.demo();
        this.setdemo();
        this.mapdemo();
        //this.treedemo();
        //this.queuedemo();
    }

//demo source (slightly adjustged) from here
//https://docs.oracle.com/javase/tutorial/collections/interfaces/QandE/answers.html    
    public void demo() {
        String args[]=new String[]{"one", "two", "three", "four", "five", "six"};
        // Get and shuffle the list of arguments
        List<String> argList = Arrays.asList(args);
        //Made use of Collections.suffle
        Collections.shuffle(argList);

        // Print out the elements using JDK 8 Streams
        argList.stream()
        .forEach(e->System.out.format("%s ",e));
        System.out.println();
        // Print out the elements using for-each
        for (String arg: argList) {
            System.out.format("%s ", arg);
        }

        System.out.println();
        
        
    }

    private void setdemo() {
        int numbers[] = {11, 11, 22, 22, 8, 5, 5};
        Set<Integer> mySet = new HashSet<>();
        try {
            for (int i=0; i<6; i++){
                mySet.add(numbers[i]);
            }
            System.out.println("In my demo I included 3 duplicate numbers, 11, 22, and 5."
                    + "\nYou'll see below the set only contains each number once.");
            System.out.println(mySet);
        }
        catch (Exception e) {}
    }

    private void mapdemo() {
      Map m1 = new HashMap(); 
      m1.put("Zara", "8");
      m1.put("Mahnaz", "31");
      m1.put("Ayan", "12");
      m1.put("Daisy", "14");

      System.out.println();
      System.out.println(" Map Elements");
      System.out.print("\t" + m1);
    }

    private void treedemo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void queuedemo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

