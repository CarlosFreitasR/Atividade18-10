package dev.senzalla;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Internascional extends Produto {
    private double taxa;
    private double taxaImportacao;

    public Internascional(String descricao, double valor, double imposto, double taxa, double taxaImportacao) {
        super(descricao, valor, imposto);
        setTaxa(taxa);
        setTaxaImportacao(taxaImportacao);
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa / 100;
    }

    public void setTaxaImportacao(double taxaImportacao) {
        this.taxaImportacao = taxaImportacao / 100;
    }

    @Override
    protected double calcularValor() {
        return getValor() + getValor() * (getImposto() + taxa + taxaImportacao);
    }

    @Override
    protected void exibir() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return String.format("Produto Internacional: {\n" +
                        "\tdescricao: %s,\n" +
                        "\tvalor: %.2f,\n" +
                        "\timposto: %.2f%%,\n" +
                        "\ttaxa: %.2f%%,\n" +
                        "\ttaxa imposto: %.2f%%,\n" +
                        "\ttotal: %.2f\n" +
                        "}",
                getDescricao(),
                getValor(),
                getImposto(),
                getTaxa(),
                getTaxaImportacao(),
                calcularValor());
    }
}
