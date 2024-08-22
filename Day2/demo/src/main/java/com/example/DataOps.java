package com.example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

class CarDetails {
    private static final String Path = "D:\\JAVA training\\Genesis_Pro\\Day2\\demo\\data\\CAR_DETAILS_DATA.csv";
    private List<String[]> carData;

    public CarDetails() throws IOException, CsvException {
        carData = loadCSVData(Path);
    }

    private List<String[]> loadCSVData(String CSV_FILE_PATH) throws IOException, CsvException {
        List<String[]> data = null;
        try {
            CSVReader reader = new CSVReader(new FileReader(CSV_FILE_PATH));
            data = reader.readAll();
            reader.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + CSV_FILE_PATH);
            throw e; // rethrow the exception if needed
        }
        return data;
    }

    public void getRowsColumn() {
        System.out.println("Rows :" + (carData.size() - 1));
        System.out.println("Column :" + carData.get(0).length);
    }

    public void carTransmission() {
        int manual = 0;
        int automatic = 0;
        for (int i = 1; i < carData.size(); i++) {
            String[] car = carData.get(i);
            String transmission = car[6];
            if (transmission.equalsIgnoreCase("Manual")) {
                manual++;
            } else if (transmission.equalsIgnoreCase("Automatic")) {
                automatic++;
            }
        }
        System.out.println("Manual Count :" + manual);
        System.out.println("Automatic Count :" + automatic);
    }

    public void getPrice() {
        double min = Double.MAX_VALUE;
        double max = 0;
        double total = 0;
        for (int i = 1; i < carData.size(); i++) {
            String[] car = carData.get(i);
            double price = Double.parseDouble(car[2]);
            total = total + price;
            if (price < min) min = price;
            if (price > max) max = price;
        }
        double average = total / (carData.size() - 1);
        System.out.println("Min price :" + min);
        System.out.println("Max :" + max);
        System.out.println("Average :" + average);
    }

    public void modelDetails(String modelName) {
        for (int i = 1; i < carData.size(); i++) {
            String[] car = carData.get(i);
            if (car[0].equalsIgnoreCase(modelName)) {
                System.out.println(Arrays.toString(car));
                return;
            }
        }
        System.out.println("Car not found");
    }

    public void countCarPerYear() {
        Map<String, Integer> yearCount = new HashMap<>();
        for (int i = 1; i < carData.size(); i++) {
            String[] car = carData.get(i);
            String year = car[1];
            yearCount.put(year, yearCount.getOrDefault(year, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : yearCount.entrySet()) {
            System.out.println("Year :" + entry.getKey() + " Count :" + entry.getValue());
        }
    }
}
