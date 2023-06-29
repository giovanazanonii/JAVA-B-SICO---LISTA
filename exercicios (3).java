import java.util.Scanner;

public class exercicios {
    public static void main(String[] args) {

                //Exercicio 1
                Scanner ler = new Scanner(System.in);
                int num1,num2,soma;

                System.out.println("Informe um numero inteiro: ");
                num1 = ler.nextInt();
                System.out.println("Informe outro numero inteiro: ");
                num2 = ler.nextInt();

                soma = num1+num2;

                System.out.println("A soma dos valores é: "+ soma);

                //Exercicio 2

                Double raio,calculo,areaCirculo;

                System.out.println("Informe o raio do circulo: ");
                raio = ler.nextDouble();

                areaCirculo = (3.14*raio);
                calculo=Math.pow(areaCirculo,2);

                System.out.println("A área do circulo é: "+calculo);


                //Exercicio 3

                Double base,altura,areaTriangulo;

                System.out.println("Informe a base do triangulo: ");
                base = ler.nextDouble();
                System.out.println("Informe a altura do triangulo: ");
                altura = ler.nextDouble();

                areaTriangulo = (base*altura)/2;
                System.out.println("A area do triangulo é: "+areaTriangulo);


                //Exercicio 4

                Double Celcius,Fahrenheit;

                System.out.println("Digite a temperatura em Celcius: ");
                Celcius = ler.nextDouble();

                Fahrenheit = (Celcius * 1.8)+32;

                System.out.println("A temperatura em Fahrenheit é: "+Fahrenheit);


                //Exercicio 5
                int Horas;
                Double ValorHora,SalarDiario;

                System.out.println("Digite a quantidade de horas trabalhadas em um dia: ");
                Horas = ler.nextInt();
                System.out.println("Digite o valor da sua hora de trabalho: ");
                ValorHora = ler.nextDouble();

                SalarDiario= Horas*ValorHora;
                System.out.println("Meu salario diario é: "+SalarDiario);

                //Exercicio 6
                int dias,horas,minutos,segundos,segundoDia,SegundosHoras,segundosminutos;

                System.out.println("Quantidade de dias: ");
                dias = ler.nextInt();
                System.out.println("Quantidade de horas: ");
                horas = ler.nextInt();
                System.out.println("Quantidade de minutos: ");
                minutos = ler.nextInt();
                System.out.println("Quantidade de segundos: ");
                segundos = ler.nextInt();

                segundoDia= (dias*86400);
                SegundosHoras =(horas*3600);
                segundosminutos=(minutos*60);

                soma= (segundoDia+SegundosHoras+segundosminutos+segundos);
                System.out.println("O total de segundos é: "+soma);

                //Exercicio 7
                int numero1,numero2,multiplicação;

                System.out.println("Informe numero 1: ");
                numero1=ler.nextInt();
                System.out.println("Informe numero 2: ");
                numero2 = ler.nextInt();

                multiplicação = numero1*numero2;
                System.out.println("A multiplicaçao dos dois numeros é: "+ multiplicação);

                //Exercicio 8
                double valorProduto,desconto;

                System.out.println("Informe o valor do produto: ");
                valorProduto = ler.nextDouble();

                desconto = (valorProduto*10)/100;
                System.out.println("O valor do produto com desconto é: " + (valorProduto - desconto));


                //Exercicio 9
                int litros;
                double pagar;

                System.out.println("Informe a quantidade de combustivel abastecido: ");
                litros = ler.nextInt();

                pagar = litros* 5.47;
                System.out.println("O total a pagar é: "+ pagar);

                //Exercicio 10

                int diasAluguel;
                Double valor,aluguel;

                System.out.println("Informe a quantidade de dias que o carro ficou alugado: ");
                diasAluguel = ler.nextInt();
                System.out.println("Valor da diaria: ");
                valor = ler.nextDouble();

                aluguel = diasAluguel*valor;
                System.out.println("O valor a pagar do aluguel é: "+aluguel);

                //Exercicio 11

                Double Numero,quadrado;

                System.out.println("Informe um numero inteiro: ");
                Numero = ler.nextDouble();

                quadrado = Math.pow(Numero,2);
                System.out.println("O valor do quadrado do numero digitado é: "+quadrado);

                //Exercicio 12

                Double Produto,acrescimo;

                System.out.println("Valor de um produto: ");
                Produto = ler.nextDouble();

                acrescimo = (((Produto*15)/100)+Produto);
                System.out.println("O valor do produto com acrescimo é: "+acrescimo);

                //Exercicio 13

                Double Produt,Total;
                int quantidade;

                System.out.println("Informe o valor do produto: ");
                Produt = ler.nextDouble();
                System.out.println("Informe a quantidade comprada: ");
                quantidade = ler.nextInt();

                Total = Produt*quantidade;
                System.out.println("O total da compra é: "+Total);

                //Exercicio 14

                Double num,cubo;
                System.out.println("Digite um valor inteiro: ");
                num = ler.nextDouble();

                cubo= Math.pow(num,3);
                System.out.println("O cubo do valor digitado é: "+cubo);

                //Exercicio 15

                Double altu,peso,IMC;
                System.out.println("Informe sua altura: ");
                altu = ler.nextDouble();
                System.out.println("Informe seu peso: ");
                peso = ler.nextDouble();

                IMC= peso/(altura*altura);
                System.out.println("Seu indice de massa corporal é: "+IMC);

                //Exercicio 16

                Double val,porcentagem,totalDesconto;

                System.out.println("Informe o valor do produto: ");
                val = ler.nextDouble();
                System.out.println("Informe a porcentagem de desconto: ");
                porcentagem = ler.nextDouble();

                totalDesconto = ((val*porcentagem)/100);
                System.out.println("O valor do produto com desconto é: "+(val - totalDesconto));

                //Exercicio 17
                Double product,parcelas,k;

                System.out.println("Valor produto: ");
                product = ler.nextDouble();
                System.out.println("Quantidade que deseja parcelar o produto: ");
                parcelas =ler.nextDouble();

                k = product/parcelas;
                System.out.println("O valor de cada parcela é: "+k);

                //Exercicio 18

                int idade,ano,anoNasc;
                System.out.println("Informe sua idade: ");
                idade = ler.nextInt();
                System.out.println("Informe o ano que estamos: ");
                ano = ler.nextInt();

                anoNasc = ano-idade;
                System.out.println("O ano que voce nasceu foi: "+anoNasc);


                //Exercicio 19

                int idad,meses;

                System.out.println("Informe sua idade: ");
                idad = ler.nextInt();

                meses= ano*12;

                System.out.println("Sua idade em meses é: "+meses);


                //Exercicio 20
                Double Areaquadrado,ladoquadrado;

                System.out.println("Digite o lado do quadrado: ");
                ladoquadrado=ler.nextDouble();
                Areaquadrado= Math.pow(ladoquadrado,2);
                System.out.println("A area do quadrado é: "+Areaquadrado);

                //Exercicio 21
                Double alt,pes,indice;

                System.out.println("Informe sua altura: ");
                alt = ler.nextDouble();
                System.out.println("informe seu peso: ");
                pes = ler.nextDouble();

                indice = pes/(alt * alt);
                System.out.println("Seu indice de massa corporal é: "+indice);


                //Exercicio 22
                Double nume,nume2;
                System.out.println("Informe um numero: ");
                nume = ler.nextDouble();
                System.out.println("Informe outro numero: ");
                nume2 = ler.nextDouble();

                if(nume>nume2){
                    System.out.println("O maior numero é o numero 1!!");
                }
                else{
                    System.out.println("O maior numero é o numero 2!!!");
                }

                //Exercicio 23
                System.out.println("****************************");

                System.out.println("A raiz quadrada de 9 é: "+Math.sqrt(9));

                System.out.println("****************************");

                System.out.println("O numero 5 elevado ao quadrado é: "+Math.pow(5,2));

                //Exercicio 24 - TABUADA
                int numTabuada;
                System.out.println("Informe um numero que queira adquirir a tabuada:");
                numTabuada = ler.nextInt();
                System.out.println("1 X "+numTabuada+"= "+numTabuada*1);
                System.out.println("2 X "+numTabuada+"= "+numTabuada*2);
                System.out.println("3 X "+numTabuada+"= "+numTabuada*3);
                System.out.println("4 X "+numTabuada+"= "+numTabuada*4);
                System.out.println("5 X "+numTabuada+"= "+numTabuada*5);
                System.out.println("6 X "+numTabuada+"= "+numTabuada*6);
                System.out.println("7 X "+numTabuada+"= "+numTabuada*7);
                System.out.println("8 X "+numTabuada+"= "+numTabuada*8);
                System.out.println("9 X "+numTabuada+"= "+numTabuada*9);
                System.out.println("10 X "+numTabuada+"= "+numTabuada*10);


                //Exercicio 25
                Double dolar,real;
                System.out.println("Digite o valor em dolar para converter em real: ");
                dolar = ler.nextDouble();
                real = 4.84*dolar;
                System.out.println("O valor em real é: "+real);
            }
        }
