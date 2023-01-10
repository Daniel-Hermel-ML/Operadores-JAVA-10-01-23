package Operadores;

import java.util.*;

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

        System.out.println("--A média final é: "+media);
    }


}