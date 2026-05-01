package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double somaConsumo = 0;

        Scanner sc = new Scanner(System.in);

        Veiculo[] frota = new Veiculo[5];

        for (int i = 0; i < frota.length; i++){
            System.out.println("\nVeiculo "+ (i + 1));

            String placa;
            do{
                System.out.println("Placa: ");
                placa = sc.nextLine();

            }while (placa.isEmpty());

            double tanque;
            do{
                System.out.println("Capacidade do tanque: ");
                tanque = sc.nextDouble();

            }while (tanque <= 0);

            double consumo;
            do{
                System.out.println("Consumo médio: ");
                consumo = sc.nextDouble();

            }while(consumo <=0);

            System.out.println("Quantidade de eixos: ");
            int eixos = sc.nextInt();

            System.out.println("Cargas em Toneladas: ");
            double carga = sc.nextDouble();

            sc.nextLine();

            Caminhao caminhao = new Caminhao(placa, tanque,consumo,eixos);

            frota[i] = caminhao;

            double autonomia1 = caminhao.calcularAutonomia();

            double autonomia2 = caminhao.calcularAutonomia();

            System.out.println("Autonomia padrão: " + autonomia1);
            caminhao.verificarAutonomia(autonomia1);

            System.out.println("Autonomia com carga: " + autonomia2);
            caminhao.verificarAutonomia(autonomia2);

            System.out.println("\nTipos de manutenção: ");
            System.out.println("1 - Oléo");
            System.out.println("2 - Pneus");
            System.out.println("3 - Revisão");

            System.out.println("Escolha: ");
            int opcao = sc.nextInt();

            sc.nextLine();

            caminhao.tipoManutencao(opcao);

            somaConsumo += consumo;
        }

        double media = somaConsumo / frota.length;

        System.out.println("Média de consumo com frota: "+media);

    }
}
