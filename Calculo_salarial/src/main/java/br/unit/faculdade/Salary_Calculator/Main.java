package br.unit.faculdade.Salary_Calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Nome : ");
        String nome= input.next();
        
        System.out.println("Sobrenome : ");
        String sobrenome= input.next();
        
        System.out.println("Salário Mensal : ");
        double salarioMensal = input.nextDouble();
        
        Empregado e1 = new Empregado(nome,sobrenome,salarioMensal);
        System.out.println("Salário anual  :"+e1.getSalarioAnual());
        e1.AumentarSalario();
        System.out.println("Novo salário anual :"+e1.getSalarioAnual());
        
        System.out.println();
        
        System.out.println("Nome : ");
        String nome2= input.next();
        
        System.out.println("Sobrenome : ");
        String sobrenome2= input.next();
        
        System.out.println("Salário Mensal: ");
        double salarioMensal2 = input.nextDouble();
        System.out.println();
        
        Empregado e2 = new Empregado(nome2,sobrenome2,salarioMensal2);
        System.out.println("Salário anual  :"+e2.getSalarioAnual());
        e2.AumentarSalario();
        System.out.println("Novo salário anual :"+e2.getSalarioAnual());
        
      
    }
}
