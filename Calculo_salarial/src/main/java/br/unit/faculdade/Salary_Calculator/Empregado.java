package br.unit.faculdade.Salary_Calculator;

public class Empregado {

    private String nome;
    private String sobrenome;
    private double salario_mensal;

    public Empregado(String nome, String sobrenome, double salario_mensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario_mensal = salario_mensal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    public void setSalarioMensal(double salario_mensal) {
        this.salario_mensal = salario_mensal;
    }
    
    public double getSalarioMensal() {
        return salario_mensal;
    } 

    public double getSalarioAnual() {
       return salario_mensal*12;
    }

    public void AumentarSalario() {
        salario_mensal *=1.10;
    }
}
