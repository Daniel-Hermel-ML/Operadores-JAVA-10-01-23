package com.company;
import java.util.*;

import java.util.Scanner;

package Operadores;

public class Operadores_JAVA {


    public class Atividade1 {
        public static void main(String[] args) {

            double sal;
            double sal2;
            double novsal;
            Scanner ler = new Scanner(System.in);

            System.out.print("--Informe o salário: ");
            sal = ler.nextDouble();
            System.out.print("--Informe do abono: ");
            sal2 = ler.nextDouble();

            novsal = sal + sal2;

            System.out.println("--Novo salário: " + novsal);
        }
    }

    public class Atividade2 {
        public static void main(String[] args) {

            float not1;
            float not2;
            float not3;
            float not4;
            float media;
            Scanner ler = new Scanner(System.in);


            System.out.print("--Informe a nota 1: ");
            not1 = ler.nextFloat();
            System.out.print("--Informe a nota 2: ");
            not2 = ler.nextFloat();
            System.out.print("--Informe a nota 3: ");
            not3 = ler.nextFloat();
            System.out.print("--Informe a nota 4: ");
            not4 = ler.nextFloat();

            media = (not1 + not2 + not3 + not4) / 4;

            System.out.println("--A média final é: " + media);
        }
    }

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

            System.out.println("--O salário Líquido é: " + salLiq);
        }

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

                System.out.println("--A diferência é: " + dif);
            }
        }
    }
}