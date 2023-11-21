    import java.util.Scanner;
    import java.util.ArrayList;
    public class App {
    public static void main(String[] args){
        int escolha = 0;
        Scanner entrada = new Scanner(System.in);
        ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
        escolha = entrada.nextInt();
        while(escolha != 4){
            System.out.println("MENU\n 1.CADASTRAR CLIENTE\n 2.CADASTRAR PRODUTO\n 3.REALIZAR COMPRA \n4.SAIR");
            if(escolha == 1){
                Cliente cliente1 = new Cliente();
                System.out.println("Digite o nome do Cliente: ");
                cliente1.nome = entrada.nextLine();
                System.out.println("Digite o endereço do cliente: ");
                cliente1.endereco = entrada.nextLine();
                System.out.println("Digite o telefone do cliente: ");
                cliente1.telefone = entrada.nextLine();
                System.out.println("Digite o email do Cliente: ");
                cliente1.email = entrada.nextLine();
                System.out.println("Digite o CPF do cliente: ");
                cliente1.cpf = entrada.nextLine();

            }
        }
        entrada.close();
    }
}
