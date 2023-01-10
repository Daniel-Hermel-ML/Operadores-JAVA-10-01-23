package com.company;

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        float num1;
        float num2;
        float num3;
        float num4;
        float dif;
        Scanner ler = new Scanner(System.in);


        System.out.print("--Informe o primeiro número: ");
        num1 = ler.nextFloat();
        System.out.print("--Informe o segundo número: ");
        num2 = ler.nextFloat();
        System.out.print("--Informe o terceiro número: ");
        num3 = ler.nextFloat();
        System.out.print("--Informe o quarto número: ");
        num4 = ler.nextFloat();

        dif = (num1 * num2) - (num3 * num4);

        System.out.println("--A diferência é: "+dif);
    }
}
