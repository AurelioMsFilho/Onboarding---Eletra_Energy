import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListaLambda {
    public static void main(String[] args) {
//        Lista de nomes
        List<String> nomes = List.of("Aurélio", "Michele", "Joana","miranda");


        // Java 8: uso de lambdas e streams
        List<String> nomesFiltrados = nomes.stream()
                .filter(nome -> nome.startsWith("A")) //Expressão Lambda
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(nomesFiltrados);
    }
}
