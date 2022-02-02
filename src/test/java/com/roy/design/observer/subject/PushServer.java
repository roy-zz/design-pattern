package com.roy.design.observer.subject;

public class PushServer extends Server {
    public PushServer(String name) {
        super(name);
    }

    @Override
    public void useServer() {
        cpuUsage = cpuUsage + 15;
        memoryUsage = memoryUsage + 10;
        if (cpuUsage > 30 || memoryUsage > 50) {
            notify(cpuUsage, memoryUsage);
        }
    }

}
