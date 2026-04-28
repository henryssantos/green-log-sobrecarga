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

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public double getTanqueCapacidade() {
        return tanqueCapacidade;
    }

    public void setTanqueCapacidade(double tanqueCapacidade) {
        if(tanqueCapacidade > 0){
            this.tanqueCapacidade = tanqueCapacidade;
        } else {
            System.out.println("Valor invalido para tanque!");
        }
    }

    public double getConsumoMedio() {
        return consumoMedio;
    }

    public void setConsumoMedio(double consumoMedio) {
        if(consumoMedio > 0){
            this.consumoMedio = consumoMedio;
        }else{
            System.out.println("Valor invalido para consumo!");
        }
    }


}
