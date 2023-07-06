public class atividade2 {
    public static void main(String[] args) {

        double Numero = 1.5,Numero2 = 5.4,Angulo = 60;

        System.out.println("Arredondar um número para cima:" + Math.round(Numero));
        System.out.println("Arredondar um número para baixo: " + Math.floor(Numero));
        System.out.println("Gerar um número aleatório entre 0 e 1: " + Math.random());
        System.out.println("Calcular o valor absoluto de um número: " + Math.abs(Numero));
        System.out.println("Calcular o máximo entre dois números: " + Math.max(Numero, Numero2));
        System.out.println("Calcular o mínimo entre dois números: " + Math.min(Numero,Numero2));
        System.out.println("Calcular o seno de um ângulo em radianos: " + Math.asin(Math.toRadians(Angulo)));
        System.out.println("Calcular o cosseno de um ângulo em radianos: " + Math.acos(Math.toRadians(Angulo)));

    }
}
