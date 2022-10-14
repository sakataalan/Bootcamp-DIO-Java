package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato("Potinho", "preto", 2);
        Gato gato2 = new Gato("Potinho", "preto", 3);
        System.out.println(gato.equals(gato2));
    }
}
