import java.util.Scanner;

public class atividade4 {
    public static void main(String[] args) {

        double Raio;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor do raio para ser calculada a área do circulo: ");
        Raio = ler.nextDouble();
        Raio = Math.pow(Raio,2);

        System.out.println("A area do circulo é: " + (3.14 * Raio));

        System.out.println("Digite o valor do raio para calcular a circunferencia do circulo: ");
        Raio = ler.nextDouble();

        System.out.println("A circunferencia é de " + (2 * 3.14) * Raio);

        //Calcular a hipotenusa de um triângulo retângulo, onde o usuário fornece o CATETO1 e CATETO2

        double CatetoAdjacente, CatetoOposto,SomaCatetos;

        System.out.println("Informe o valor do cateto adjacente para calcular a hipotenusa do triangulo: ");
        CatetoAdjacente = ler.nextDouble();
        System.out.println("Agora informe o valor do cateto oposto: ");
        CatetoOposto = ler.nextDouble();

        SomaCatetos = Math.pow(CatetoAdjacente,2) +  Math.pow(CatetoOposto,2);

        System.out.println("O valor da hipotenusa é " + Math.sqrt(SomaCatetos));

        // Calcular o perímetro de um retângulo:

        double ValorUm,ValorDois;

        System.out.println("Para calcular o perímetro de um retângulo, informe o primeiro valor: ");
        ValorUm = ler.nextDouble();
        System.out.println("Informe o segundo valor:" );
        ValorDois = ler.nextDouble();

        System.out.println("O perímetro do retangulo é " + 2*(ValorUm + ValorDois));

        //Calcular a área de um triângulo, sendo fornecido pelo usuário a BASE e a ALTURA do triângulo

        float Base, Altura;

        System.out.println("Digite a altura de um triangulo, para calcular sua área: ");
        Altura = ler.nextFloat();
        System.out.println("Digite a base do triangulo: ");
        Base = ler.nextFloat();

        System.out.println("A area do triangulo é " +  (Base * Altura) / 2);
    }
}
