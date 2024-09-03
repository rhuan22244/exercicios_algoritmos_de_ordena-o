package exercicio3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<>();

        // Cadastro de 8 alunos
        for (int i = 0; i < 8; i++) {
            System.out.println("Digite o nome do aluno " + (i + 1) + ":");
            String nome = scanner.nextLine();
            System.out.println("Digite a nota 1 do aluno " + (i + 1) + ":");
            double nota1 = scanner.nextDouble();
            System.out.println("Digite a nota 2 do aluno " + (i + 1) + ":");
            double nota2 = scanner.nextDouble();
            scanner.nextLine();  // Limpar buffer
            alunos.add(new Aluno(nome, nota1, nota2));
        }

        // Ordenação por média crescente
        alunos.sort(Comparator.comparingDouble(a -> a.media));
        System.out.println("\nAlunos em ordem crescente de média:");
        alunos.forEach(System.out::println);

        // Listar alunos aprovados (média >= 7) em ordem alfabética
        System.out.println("\nAlunos aprovados (média >= 7) em ordem alfabética:");
        alunos.stream()
                .filter(a -> a.media >= 7)
                .sorted(Comparator.comparing(a -> a.nome))
                .forEach(System.out::println);

        // Listar alunos reprovados (média < 7) em ordem alfabética
        System.out.println("\nAlunos reprovados (média < 7) em ordem alfabética:");
        alunos.stream()
                .filter(a -> a.media < 7)
                .sorted(Comparator.comparing(a -> a.nome))
                .forEach(System.out::println);
    }
}
