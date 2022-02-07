package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner= new Scanner(System.in);
        System.out.print("USD:");
        double usd,vnd,tigia;
        usd=scanner.nextDouble();
        System.out.print("Ti gia:");
        tigia=scanner.nextDouble();
        vnd=usd*tigia;
        System.out.println("VND:"+vnd);
    }
}
