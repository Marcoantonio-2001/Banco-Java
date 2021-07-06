import java.util.Scanner;

public class TestaConta {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Conta conta = new Conta("Marco", "Mercado Pago", 1911, "13/03/2020", 1750.0);

        System.out.println("Bem vindo " + conta.returnNome() + "\nnome da agencia: " + conta.returnAgencia()
                + "\no seus numeros são: " + conta.returnNumero() + "\nsua data de cadastro é: "
                + conta.returnData_Abertura() + "\no seu saldo é de: " + conta.returnSaldo());

        conta.saque(700.0);
        System.out.println("Seu novo saldo é de: " + conta.returnSaldo());

        conta.deposito(550.0);
        System.out.println("Seu novo saldo depositado é de: " + conta.returnSaldo());

        conta.calcularendimento();
    }

}