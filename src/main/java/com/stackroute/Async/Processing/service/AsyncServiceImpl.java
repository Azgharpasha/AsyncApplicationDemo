package com.stackroute.Async.Processing.service;

import org.springframework.stereotype.Service;

/*
 * This class is implementing the AsyncService interface. This class has to be annotated with
 * @Service annotation.
 * @Service indicates annotated class is a service
 * which hold business logic in the Service layer
 *
 * */
@Service
public class AsyncServiceImpl implements AsyncService {
    @Override
    public void performAsyncTask() {
    	 try {
             // Simulate a task that takes 4 seconds
             Thread.sleep(4000);
         } catch (InterruptedException e) {
             Thread.currentThread().interrupt();
         }

         // After time-consuming task, print "Async task completed."
         System.out.println("Async task completed.");
    }

}