import java.util.Scanner;

public class atividade1 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        double Numero,Numero2,Part1,Part2,Resultado;

        System.out.println("Informe 2 numeros para calcular a distância das coordenadas. Digite o ponto da coordenada 1: ");
        Numero = leia.nextDouble();
        System.out.println("Digite o ponto da coordenada 2: ");
        Numero2 = leia.nextDouble();


        Part1 = Math.pow(Numero2 - Numero, 2);
        Part2 = Math.pow(Numero2 - Numero, 2);
        Resultado = Math.sqrt (Part1 + Part2);

        System.out.println("A distancia das coordenadas é: "+ Resultado);
    }
}
