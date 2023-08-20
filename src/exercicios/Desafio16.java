package exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Desafio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira um número inteiro: ");
        int numero = scanner.nextInt();
        scanner.close();

        System.out.println(Stream.iterate(1, n -> n + 1)
                .limit(numero)
                .reduce(1, (a, b) -> a * b));
    }

}
