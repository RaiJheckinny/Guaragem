package Guaragem;

public abstract class Veiculo {
    private String marca;
    private Integer ano;
    private String tipoVeiculo;
    private String placa;
    private Integer velocidade;

    public Veiculo(String marca, Integer ano,String tipoVeiculo,String placa){
        this.marca = marca;
        this.ano = ano;
        this.tipoVeiculo = tipoVeiculo;
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public Integer getAno() {
        return ano;
    }

    public Integer getVelocidade() {
        return velocidade;
    }

    public String getTipoVeiculo() {
        return tipoVeiculo;
    }
}
