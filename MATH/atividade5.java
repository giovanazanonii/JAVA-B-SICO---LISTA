import java.util.Scanner;

public class atividade5 {
    public static void main(String[] args) {

        double CatetoOposto,Hipotenusa;
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o valor do cateto oposto, e da hipotenusa, para que seja calculado o cateto adjacente!!");
        System.out.println("Digite o valor do cateto oposto: ");
        CatetoOposto= ler.nextDouble();
        System.out.println("Digite a hipotenusa: ");
        Hipotenusa = ler.nextDouble();

        System.out.println("O valor do cateto adjacente é: " + Math.sqrt(Math.pow(Hipotenusa,2 ) - Math.pow(CatetoOposto, 2)));
    }
}
