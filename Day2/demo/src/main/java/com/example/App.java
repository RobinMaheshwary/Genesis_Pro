package com.example;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.opencsv.exceptions.CsvException;

public class App {
    public static void main(String[] args) {
        try {
            CarDetails car = new CarDetails();
            
            ExecutorService executorService = Executors.newFixedThreadPool(5);

            // Q1
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    car.getRowsColumn();
                }
            });

            // Q2
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    car.carTransmission();
                }
            });

            // Q3
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    car.getPrice();
                }
            });

            // Q4
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    car.modelDetails("Maruti Alto LXi");
                }
            });

            // Q5
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    car.countCarPerYear();
                }
            });

            executorService.shutdown();
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }
    }
}
