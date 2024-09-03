package exercicio3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class Aluno {
    String nome;
    double nota1;
    double nota2;
    double media;

    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.media = (nota1 + nota2) / 2;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Média: " + media;
    }
}
