package org.example;

public class Veiculo {
    private String placa;
    private double tanqueCapacidade;
    private double consumoMedio;

    public Veiculo(String placa, double tanqueCapacidade, double consumoMedio) {
        this.placa = placa;
        this.tanqueCapacidade = tanqueCapacidade;
        this.consumoMedio = consumoMedio;
    }

    public Veiculo(){}

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getTanqueCapacidade() {
        return tanqueCapacidade;
    }

    public void setTanqueCapacidade(double tanqueCapacidade) {
        if (tanqueCapacidade > 0) {
            this.tanqueCapacidade = tanqueCapacidade;
        } else {
            System.out.println("Valor inválido para tanque!");
        }
    }

    public double getConsumoMedio() {
        return consumoMedio;
    }

    public void setConsumoMedio(double consumoMedio) {
        if (consumoMedio > 0) {
            this.consumoMedio = consumoMedio;
        } else {
            System.out.println("Valor inválido para consumo!");
        }
    }

    public double calcularAutonomia(){
        return getTanqueCapacidade() * getConsumoMedio();
    }

    public double calcularAutonomia(double cargaTon){

        double consumoAjustado = getConsumoMedio() - (cargaTon * 0.5);

        return getTanqueCapacidade() * consumoAjustado;
    }

    public void verificarAutonomia(double autonomia){
        if(autonomia < 100){
            System.out.println("Alerta: Abastecimento necessário");
        }else{
            System.out.println("Autonomia Ok!");
        }
    }


    public void tipoManutencao(int opcao){

        switch(opcao){

            case 1:
                System.out.println("Manutenção: Oléo");
                break;
            case 2:
                System.out.println("Manutenção: Pneu");
                break;
            case 3:
                System.out.println("Manutenção: Revisão");
                break;
            default:
                System.out.println("Opção invalida!");
        }
    }
}

