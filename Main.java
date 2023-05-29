import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, quantidade;
        Cliente[] cliente = new Cliente[5];

        System.out.print("a");
        for (i = 0; i<cliente.length; i++){
            System.out.print("Nome do cliente: "); String nome = sc.nextLine();
            cliente[i] = new Cliente(nome);
        }
    }
}