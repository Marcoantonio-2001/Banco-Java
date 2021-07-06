public class Conta {
    private String nome;
    private String agencia;
    private int numero;
    private String data_abertura;
    private Double saldo;

    public Conta(String nome, String agencia, int numero, String data_abertura, Double saldo) {
        this.nome = nome;
        this.agencia = agencia;
        this.numero = numero;
        this.data_abertura = data_abertura;
        this.saldo = saldo;
    }

    public String returnAgencia() {
        return this.agencia;
    }

    public String returnData_Abertura() {
        return this.data_abertura;
    }

    public String returnNome() {
        return this.nome;
    }

    public int returnNumero() {
        return this.numero;
    }

    public Double returnSaldo() {
        return this.saldo;
    }

    public Double saque(Double valor) {
        this.saldo = this.saldo - valor;
        return valor;
    }

    public Double deposito(Double valor) {
        this.saldo = this.saldo + valor;
        return valor;
    }

    public void calcularendimento() {
        System.out.println("No nosso banco rende 5% ao mês!");
        Double valorPercentual = this.saldo * (5.0 / 100);
        Double valorRendido = valorPercentual + this.saldo;
        System.out.println("No proximo mês seu dinheiro irá render: " + valorPercentual + " Reais"
                + " Ficando um total de: " + valorRendido);
    }
}