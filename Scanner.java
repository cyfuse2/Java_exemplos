import java.util.Scanner; //objeto de leitura

public class exemplo {
    public static void main(String[] args) {
    Scanner entrada=new Scanner(System.in);
    System.out.println("insira o nome, idade e renda");
    String nome=entrada.nextLine(); //reserva uma linha de texto e deixa reservado/separado
    int idade=entrada.nextInt(); //reserva uma linha de numero inteiro e deixa reservado
    double renda=entrada.nextDouble(); //reserva uma linha de numero decimal com mais bits e deixa reservado
    System.out.printf("Olá %s com idade de %d.\nRenda de %.2f\n",nome,idade,renda);
    }
}
