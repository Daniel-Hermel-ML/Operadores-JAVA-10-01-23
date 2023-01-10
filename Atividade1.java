package Operadores;

import java.util.*;

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

        System.out.println("--Novo salário: "+novsal);
    }
}
