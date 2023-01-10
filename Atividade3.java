package com.company;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        float salB;
        float adicN;
        float horE;
        float desc;
        float salLiq;
        Scanner ler = new Scanner(System.in);


        System.out.print("--Informe o salário bruto: ");
        salB = ler.nextFloat();
        System.out.print("--Informe o adicional noturno: ");
        adicN = ler.nextFloat();
        System.out.print("--Informe as horas extras: ");
        horE = ler.nextFloat();
        System.out.print("--Informe o desconto: ");
        desc = ler.nextFloat();

        salLiq = (salB + adicN + (horE * 5)) - desc;

        System.out.println("--O salário Líquido é: "+salLiq);
    }
}
