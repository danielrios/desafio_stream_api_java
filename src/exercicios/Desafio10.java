package exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Desafio10 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        System.out.println(numeros.stream()
                .collect(Collectors
                        .groupingBy(i -> (i % 3 == 0 || i % 5 == 0) && i % 2 != 0)));
    }

}
