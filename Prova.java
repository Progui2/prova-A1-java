import java.util.Scanner;
public class Prova{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a placa do veículo::");
        String placa = scanner.next();
        System.out.println("Informe o valor do combustivel:");
        double combustivel = scanner.nextInt();
        System.out.println("Informe a quantidade de quilômetros rodados a 60KM/H:");
        double quilometro60 = scanner.nextInt();
        System.out.println("Informe a quantidade de quilômetros rodados a 80KM/H:");
        double quilometro80 = scanner.nextInt();
        System.out.println("Informe a quantidade de quilômetros rodados a 100KM/H:");
        double quilometro100 = scanner.nextInt();
        System.out.println("Informe a quantidade de quilômetros rodados a 120KM/H:");
        double quilometro120 = scanner.nextInt();
        System.out.println("Informe a quantidade de quilômetros rodados a 140KM/H:");
        double quilometro140 = scanner.nextInt();

        double quantidade60 = (quilometro60 / 30.7);
        double quantidade80 = (quilometro80 / 26.8);
        double quantidade100 = (quilometro100 / 22.4);
        double quantidade120 = (quilometro120 / 18.1);
        double quantidade140 = (quilometro140 / 14.5);

        double totalCombustivel = (quantidade60 + quantidade80 + quantidade100 + quantidade120 + quantidade140 );

        double distanciaTotal = (quilometro60 + quilometro80 + quilometro100 + quilometro120 + quilometro140 );

        double velocidadeMedia = ((quilometro60 * 60 ) + (quilometro80 * 80) + (quilometro100 * 100) + (quilometro120 * 120) + (quilometro140 * 140))/ distanciaTotal;

        double valorTotal = (totalCombustivel * combustivel);

        System.out.println("Placa do veiculo:" + placa);

        System.out.printf("valor total da viagem: %.2f \n " , valorTotal);

        System.out.printf("Velocidade media ponderada: %.4f \n " , velocidadeMedia);

        System.out.printf("Quantidade total de combustível: %.4f litros \n" , totalCombustivel);

        scanner.close();



         

    }
}