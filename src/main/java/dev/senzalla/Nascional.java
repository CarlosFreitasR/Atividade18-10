package dev.senzalla;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Nascional extends Produto {
    private double taxa;

    public Nascional(String descricao, double valor, double imposto, double taxa) {
        super(descricao, valor, imposto);
        setTaxa(taxa);
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa / 100;
    }

    @Override
    protected double calcularValor() {
        return getValor() + getValor() * (getImposto() + getTaxa());
    }

    @Override
    protected void exibir() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return String.format("Produto Nacional: {\n" +
                        "\tdescricao: %s,\n" +
                        "\tvalor: %.2f,\n" +
                        "\timposto: %.2f%%,\n" +
                        "\ttaxa: %.2f%%,\n" +
                        "\ttotal: %.2f\n" +
                        "}",
                getDescricao(),
                calcularValor(),
                getImposto(),
                getTaxa(),
                calcularValor());

    }
}
