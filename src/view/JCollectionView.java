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
    }
    
    public void demo() {
        String args[]=new String[]{"one", "two", "three", "four", "five", "six"};
        // Get and shuffle the list of arguments
        List<String> argList = Arrays.asList(args);
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
}

