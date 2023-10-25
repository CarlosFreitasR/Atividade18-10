package dev.senzalla;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Estadual extends Produto {

    public Estadual(String descricao, double valor, double imposto) {
        super(descricao, valor, imposto);
    }

    @Override
    protected double calcularValor() {
        return getValor() + getValor() * getImposto();
    }

    @Override
    protected void exibir() {
        System.out.println(toString());
    }

    @Override
    public String toString() {

        return String.format("Produto Estadual: {\n" +
                        "\tdescricao: %s,\n" +
                        "\tvalor: %.2f,\n" +
                        "\timposto: %.2f%%,\n" +
                        "\ttotal: %.2f\n" +
                        "}",
                getDescricao(),
                calcularValor(),
                getImposto(),
                calcularValor());
    }
}
