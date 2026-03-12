package Fundamentos.lambda;
import java.util.Arrays;
import java.util.stream.IntStream;

public class InStreamOperations {
    public static void main(String[] args) {
        int[] valores = {3, 10, 6, 1, 4, 8, 2, 5, 9,7};

        //Exibir valores Originais
        System.out.print("Original Values");
        IntStream.of(valores).forEach(valor -> System.out.printf("%d ", valores));

        System.out.printf("Min: %d%n", IntStream.of(valores).min().getAsInt());
    }
}
