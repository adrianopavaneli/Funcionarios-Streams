package application;

import entities.Funcionarios;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        var funcionario = new ArrayList<Funcionarios>();
        System.out.println("Digite o número de funcionários à cadastrar?");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            sc.nextLine();
            System.out.println("Digite o nome do funcionário: ");
            String nome = sc.nextLine();
            System.out.println("Digite o telefone do funcionário: ");
            String telefone = sc.nextLine();
            System.out.println("Digite a idade do funcionário: ");
            int idade = sc.nextInt();
            funcionario.add(new Funcionarios(i, nome, telefone, idade));

        }
        sc.nextLine();
        System.out.println("Digite uma parte do nome do funcionario a localizar? ");
        String localiza = sc.nextLine();
        System.out.println("Imprimir todos os nomes que contem uma palavra: " + localiza);
        funcionario.stream()
                .filter(f -> f.getNome().toLowerCase().contains(localiza))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        var somaDasIdades = funcionario.stream().mapToInt(Funcionarios::getIdade).sum();
        System.out.println();

        System.out.println("Soma das Idades: " + somaDasIdades);

        System.out.println("Imprimindo todos os funcionários!");
        var funcionarioSet = funcionario.stream().collect(Collectors.toSet());
        funcionarioSet.forEach(System.out::println);



        sc.close();
    }
}
