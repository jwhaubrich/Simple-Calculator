package joeco.utils;

import joeco.operations.Strategy;

public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    public Strategy getStrategy() {
        return strategy;
    }

    public int executeStrategy(int a, int b){
        return strategy.performOperation(a,b);
    }
}
