package dev.senzalla;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Produto {
    private String descricao;
    private double valor;
    private double imposto;

    public Produto(String descricao, double valor, double imposto) {
        this.descricao = descricao;
        this.valor = valor;
        setImposto(imposto);
    }

    public void setImposto(double imposto) {
        this.imposto = imposto / 100;
    }

    protected abstract double calcularValor();

    protected abstract void exibir();

    @Override
    public String toString() {
        return "Produto{" +
                "descricao='" + descricao + '\'' +
                ", valor=" + valor +
                ", imposto=" + imposto +
                '}';
    }
}
