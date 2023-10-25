package dev.senzalla;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.ex01();
    }

    private void ex01() {
        new Estadual("Capa", 30.5, 10).exibir();
        new Nascional("Bota", 54.7, 10, 5).exibir();
        new Internascional("Camisa", 34, 10, 5, 5).exibir();
    }
}