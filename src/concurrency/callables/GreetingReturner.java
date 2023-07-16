package concurrency.callables;

import java.util.concurrent.Callable;

public class GreetingReturner implements Callable<ReturnWrapper> {
    public int i;
    public GreetingReturner(int i){
        this.i = i;
    }
    @Override
    public ReturnWrapper call() throws Exception {
        ReturnWrapper returnWrapper = new ReturnWrapper();
        returnWrapper.id = this.i;
        returnWrapper.name = Thread.currentThread().getName() + " : " + this.i;
        return returnWrapper;
    }
}
