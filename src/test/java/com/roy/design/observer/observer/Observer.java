package com.roy.design.observer.observer;

public interface Observer {
    void update(String serverName, int cpuUsage, int memoryUsage);
}
