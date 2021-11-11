import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // System.out.println("Insira os 3 lados do triângulo: ");
        // int ladoA = teclado.nextInt();

        // int ladoB = teclado.nextInt();

        // int ladoC = teclado.nextInt();

        // String resultado = verificarTriangulo(ladoA, ladoB, ladoC);
        // System.out.println(resultado);

        // ---------------------------------------------------------------------------------------------
        
        // System.out.println("Insira um ano: ");
        // int ano = teclado.nextInt();

        // String resultado = verificarBissexto(ano);
        // System.out.println(resultado);

        // ---------------------------------------------------------------------------------------------

        // System.out.println("Responda as pergunta com 1 para sim, e 0 para não.");
        // System.out.println("Você telefonou para a vitima?");
        // int pergunta1 = teclado.nextInt();
        // System.out.println("Você esteve com a vítima?");
        // int pergunta2 = teclado.nextInt();
        // System.out.println("Você mora com a vítima?");
        // int pergunta3 = teclado.nextInt();
        // System.out.println("Você devia para a vítima?");
        // int pergunta4 = teclado.nextInt();
        // System.out.println("Você trabalhou com a vítima?");
        // int pergunta5 = teclado.nextInt();

        // int resultado = detetive(pergunta1, pergunta2, pergunta3, pergunta4, pergunta5);
        // if(resultado == 0 || resultado == 1){
        //     System.out.println("Inocente");
        // } else if(resultado == 2){
        //     System.out.println("Suspeita");
        // } else if(resultado == 3 || resultado == 4){
        //     System.out.println("Cúmplice");
        // } else{
        //     System.out.println("Assassino");
        // }

        // ---------------------------------------------------------------------------------------------

        // System.out.println("Quantos litros você precisa?");
        // double quantidade = teclado.nextDouble();
        // System.out.println("Qual combustível você precisa?");
        // String tipo = teclado.next();

        // double resultado = combustivel(quantidade, tipo);
        // System.out.println(resultado);

        }


    

    public static String verificarTriangulo(int lado1, int lado2, int lado3) {
        if(lado1 == lado2 && lado2 == lado3){
            String a = "Equilátero";
            return a;
        }else if(lado1 == lado2 || lado2 == lado3){
            String a = "Isósceles";
            return a;
        }else {
            String a = "Escaleno";
            return a;
        }
    }

    public static String verificarBissexto(int ano) {
        if(ano % 4 == 0 && ano % 100 != 0){
            String a = "É um ano bissexto";
            return a;
        }else if(ano % 4 == 0 && ano % 100 == 0 && ano % 400 == 0){
            String a = "É um ano bissexto";
            return a;
        }else {
            String a = "Não é um ano bissexto";
            return a;
        }
    }

    public static int detetive(int telefonou, int esteve, int mora, int devia, int trabalhou) {
        int contador = 0;
        if(telefonou == 1){
            contador++;
        }
        if(esteve == 1){
            contador++;
        }
        if(mora == 1){
            contador++;
        }
        if(devia == 1){
            contador++;
        }
        if(trabalhou == 1){
            contador++;
        }

        return contador;
    }

    public static double combustivel(double quantidade, String tipo) {
        String gas = "g";
        String alc = "a";
        int valor = 1;


        if(tipo.equals(gas) && quantidade <= 20){
            double resultado = quantidade * valor;
            double desconto = resultado * 0.04;
            double valorFinal = resultado - desconto;

            return valorFinal;
        } else if(tipo.equals(gas)){
            double resultado = quantidade * valor;
            double desconto = resultado * 0.06;
            double valorFinal = resultado - desconto;

            return valorFinal;
        }

        if(tipo.equals(alc) && quantidade <= 20){
            double resultado = quantidade * valor;
            double desconto = resultado * 0.03;
            double valorFinal = resultado - desconto;

            return valorFinal;
        } else if(tipo.equals(alc)){
            double resultado = quantidade * valor;
            double desconto = resultado * 0.05;
            double valorFinal = resultado - desconto;

            return valorFinal;
        } else{
            return (Double) null;
        }
        
    } 
}
