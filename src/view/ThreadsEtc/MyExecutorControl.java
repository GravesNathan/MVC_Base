/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.ThreadsEtc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author NathanG
 */
public class MyExecutorControl {
    
    MyExecutorControl (){
        goToWork();
    }
    
    void goToWork(){
        //Create local executor object of pool size 3
        ExecutorService executor = Executors.newFixedThreadPool(3);
        //Continue here, comparing to ExecutorServiceTest
        //and using this http://tutorials.jenkov.com/java-util-concurrent/executorservice.html
        //I want to make use of the submit(Callable) instead of runnable to get a returned value
        //Of course this requires a callable implementation vs runnable (or so I think)
    }
    
    void doSomething(){
        
    }
}
