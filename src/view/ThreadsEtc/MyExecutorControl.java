/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.ThreadsEtc;


import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NathanG
 */
public class MyExecutorControl {
    
    public MyExecutorControl (){
        try {
            goToWork();
        } catch (InterruptedException | ExecutionException ex) {
            Logger.getLogger(MyExecutorControl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    void goToWork() throws InterruptedException, ExecutionException{
        //Create local executor object of pool size 3
        ExecutorService executor = Executors.newFixedThreadPool(3);
        //Continue here, comparing to ExecutorServiceTest
        //and using this http://tutorials.jenkov.com/java-util-concurrent/executorservice.html
        //I want to make use of the submit(Callable) instead of runnable to get a returned value
        //Of course this requires a callable implementation vs runnable (or so I think)
        Future<Integer> future;
        MyCallable callInstance;
        future = executor.submit(callInstance = new MyCallable());
        System.out.print("My callable returned " + future.get());
        //MyCallable callInstance = new MyCallable();
    }
    

}
