package com.task4.weak_conection.impl;

import com.task4.weak_conection.Status;

public class StatusWorker implements Status {
    @Override
    public void getStatus() {
        System.out.println("Worker");
    }
}
