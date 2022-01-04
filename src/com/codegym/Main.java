package com.codegym;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("Nhập chỉ số cân nặng:");
        weight = sc.nextDouble();
        System.out.println("Nhập chỉ số chiều cao:");
        height = sc.nextDouble();
        bmi = weight / Math.pow(height,2);
        String status = "";
        if(bmi < 18.5){
            status = "Underweight";
        }else if(bmi < 25){
            status = "Normal";
        }else if(bmi < 30){
            status = "Overweight";
        }else {
            status = "Obese";
        }
        System.out.printf("You are : %s",status);
    }
}
