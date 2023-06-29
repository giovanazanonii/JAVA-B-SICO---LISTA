import java.util.Scanner;

//LISTA 2

public class exercicios {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        //Exercicio 1
        String Nome, NomeCidade;

        System.out.println("Informe seu nome: ");
        Nome = ler.nextLine();
        System.out.println("Informe a sua cidade: ");
        NomeCidade = ler.nextLine();

        System.out.println("Olá "+Nome +",você mora na cidade de "+NomeCidade);


        //Exercicio 2
        System.out.println("Informe seu nome: ");
        Nome = ler.nextLine();

        System.out.println("Seja bem vindo(a) "+Nome+"!!");


        //Exercicio 3
        int Idade;

        System.out.println("Informe sua idade: ");
        Idade = ler.nextInt();
        System.out.println("Sua idade é: "+Idade);

        //Exercicio 4
        int num;

        System.out.println("Digite um numero inteiro: ");
        num = ler.nextInt();
        System.out.println("O número digitado foi: "+num);


        //Exercicio 5
        double decimal;

        System.out.println("Informe um numero decimal: ");
        decimal = ler.nextDouble();
        System.out.println("O número digitado foi: "+ decimal);


        //Exercicio 6
        int num1,num2;

        System.out.println("Informe um numero inteiro: ");
        num1 = ler.nextInt();
        System.out.println("Informe outro numero inteiro: ");
        num2 = ler.nextInt();
        System.out.println("Os numeros digitados foram: "+num1+" e "+num2);


        //Exercicio 7
        String NomeEx6,CidadeEx6;
        int IdadeEx6;

        System.out.println("Digite seu nome: ");
        NomeEx6 = ler.next();
        System.out.println("Digite sua idade: ");
        IdadeEx6 = ler.nextInt();
        System.out.println("Digite sua cidade: ");
        CidadeEx6 = ler.next();
        System.out.println("Seu nome: "+NomeEx6+" sua idade: "+IdadeEx6+" sua cidade: "+ CidadeEx6);


        //Exercicio 8
        System.out.println("Informe um numero inteiro: ");
        num1 = ler.nextInt();
        System.out.println("Informe um numero decimal: ");
        decimal = ler.nextDouble();
        System.out.println("Numero inteiro digitado: "+num1+" Numero decimal digitado: "+decimal);


        //Exercicio 9
        String NomeRua,NomePessoal,CidadeEx9,Estado;
        int NumeroResid,cep,cpf,telefone;

        System.out.println("Informe seu nome: ");
        NomePessoal = ler.next().toUpperCase();
        System.out.println("Informe o nome da sua rua: ");
        NomeRua = ler.next().toUpperCase();
        System.out.println("Informe numero da residencia: ");
        NumeroResid = ler.nextInt();
        System.out.println("Informe o seu CEP: ");
        cep = ler.nextInt();
        System.out.println("Digite sua cidade: ");
        CidadeEx9 = ler.next();
        System.out.println("Digite seu estado: ");
        Estado = ler.next();
        System.out.println("Digite seu CPF: ");
        cpf = ler.nextInt();
        System.out.println("Informe o telefone celular: ");
        telefone = ler.nextInt();

        System.out.println("NOME: "+NomePessoal);
        System.out.println("ENDEREÇO: "+NomeRua + ",NÚMERO: "+NumeroResid+" CEP: "+cep);
        System.out.println("CIDADE: "+CidadeEx9);
        System.out.println("ESTADO: "+Estado);
        System.out.println("CPF: "+cpf);
        System.out.println("TEL.CELULAR: "+telefone);


        //Exercicio 10
        int Numero1,Numero2,x;

        System.out.println("Número 1: ");
        Numero1 = ler.nextInt();
        System.out.println("Número 2: ");
        Numero2 = ler.nextInt();

        x=Numero1;
        Numero1=Numero2;
        Numero2=x;

        System.out.println("Numero 1: "+Numero1);
        System.out.println("Numero 2: "+Numero2);

        ler.nextLine();
    }
}
