package exercicio2;

import java.util.Scanner;

public class Main {

    // Bubble Sort: Ordenar por salário crescente
    public static void bubbleSortSalarioCrescente(Funcionario[] funcionarios) {
        int n = funcionarios.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (funcionarios[j].salario > funcionarios[j + 1].salario) {
                    Funcionario temp = funcionarios[j];
                    funcionarios[j] = funcionarios[j + 1];
                    funcionarios[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort: Ordenar por salário decrescente
    public static void selectionSortSalarioDecrescente(Funcionario[] funcionarios) {
        int n = funcionarios.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (funcionarios[j].salario > funcionarios[maxIndex].salario) {
                    maxIndex = j;
                }
            }
            Funcionario temp = funcionarios[maxIndex];
            funcionarios[maxIndex] = funcionarios[i];
            funcionarios[i] = temp;
        }
    }

    // Insertion Sort: Ordenar por nome
    public static void insertionSortNome(Funcionario[] funcionarios) {
        int n = funcionarios.length;
        for (int i = 1; i < n; ++i) {
            Funcionario key = funcionarios[i];
            int j = i - 1;

            // Comparando nomes
            while (j >= 0 && funcionarios[j].nome.compareTo(key.nome) > 0) {
                funcionarios[j + 1] = funcionarios[j];
                j = j - 1;
            }
            funcionarios[j + 1] = key;
        }
    }

    // Método para imprimir a lista de funcionários
    public static void listarFuncionarios(Funcionario[] funcionarios) {
        for (Funcionario f : funcionarios) {
            System.out.println("Nome: " + f.nome + ", Salário: " + f.salario);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Funcionario[] funcionarios = new Funcionario[5];

        // Cadastro de funcionários
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o nome do funcionário " + (i + 1) + ":");
            String nome = scanner.nextLine();
            System.out.println("Digite o salário do funcionário " + (i + 1) + ":");
            double salario = scanner.nextDouble();
            scanner.nextLine(); // Limpar o buffer
            funcionarios[i] = new Funcionario(nome, salario);
        }

        System.out.println("\nFuncionários em ordem crescente de salário (Bubble Sort):");
        bubbleSortSalarioCrescente(funcionarios);
        listarFuncionarios(funcionarios);

        System.out.println("Funcionários em ordem decrescente de salário (Selection Sort):");
        selectionSortSalarioDecrescente(funcionarios);
        listarFuncionarios(funcionarios);

        System.out.println("Funcionários em ordem alfabética (Insertion Sort):");
        insertionSortNome(funcionarios);
        listarFuncionarios(funcionarios);

        scanner.close();
    }
}


