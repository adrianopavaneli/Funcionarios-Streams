package application;

import entities.Funcionarios;

import java.util.ArrayList;
import java.util.Comparator;
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

        System.out.println();
        System.out.println("Ordenação de nome por ordem Alfabética:");

//        Ordenar lista por nome
        funcionario.stream().sorted(Comparator.comparing(Funcionarios::getNome))
                .distinct()
                .limit(100)
                .forEach(System.out::println);

        System.out.println();
        System.out.println("Ordenação de nome por ordem de idade:");

//        Ordenar lista por idade
        funcionario.stream().sorted(Comparator.comparing(Funcionarios::getIdade))
                .distinct()
                .limit(100)
                .forEach(System.out::println);


        System.out.println();
        System.out.println("Média de idade dos Funcionários:");
        var mediaIdade = funcionario.stream()
                .mapToInt(Funcionarios::getIdade).average();
        System.out.println("Media de idade: " + mediaIdade.getAsDouble());
        System.out.println();
        System.out.println("Funcionario acima da media de idade:");
        funcionario.stream().filter( f -> f.getIdade() > mediaIdade.getAsDouble())
                .distinct()
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println();
        System.out.println("Funcionarios abaixo ou igual a media de idade: ");
                funcionario.stream().filter( f -> f.getIdade() <= mediaIdade.getAsDouble())
                        .distinct()
                        .collect(Collectors.toList())
                        .forEach(System.out::println);



        var maisVelho = funcionario.stream()
                .max(Comparator.comparing(Funcionarios::getIdade)).get();
        var maisJovem = funcionario.stream()
                .min(Comparator.comparing(Funcionarios::getIdade)).get();
        System.out.println();
        System.out.println("Funcionario mais velho: "+ maisVelho);
        System.out.println();
        System.out.println("Funcionario mais Jovem: "+ maisJovem);

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
        System.out.println();
        System.out.println("Imprimindo todos os funcionários!");
        var funcionarioSet = funcionario.stream().collect(Collectors.toSet());
        funcionarioSet.forEach(System.out::println);



        sc.close();
    }
}
