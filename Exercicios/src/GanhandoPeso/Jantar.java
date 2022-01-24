package GanhandoPeso;

public class Jantar {

    public static void main(String[] args) {

        Comida c1 = new Comida("Arroz", 0.180);
        Comida c2 = new Comida("Feijão", 0.300);

        Pessoa p = new Pessoa("João", 99.8);

        p.comer(c1);

        System.out.println(p.peso);

    }
}