package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato1 = new Gato("gato1", "preto", 2);
        Gato gato2 = new Gato("gato2", "preto", 3);
        System.out.println(gato1.equals(gato2));
    }
}
