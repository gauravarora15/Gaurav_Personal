package concurrency.callables;

import netscape.javascript.JSObject;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        for(int i = 0; i < 10; i++){
            GreetingReturner greetingReturner = new GreetingReturner(i);
            Future<ReturnWrapper> returnWrapperFuture = executorService.submit(greetingReturner);
            System.out.println("ID : " + returnWrapperFuture.get().id);
            System.out.println("Name : " + returnWrapperFuture.get().name);
        }
    }
}
