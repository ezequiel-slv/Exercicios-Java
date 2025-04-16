package arquivos.poo.dominio;

public class ContaBancaria {
    public String titular;
    public int saldo;

    public void MostrarDados(){

        System.out.println("-----");
        System.out.println("Dados da conta");
        System.out.println(this.titular);
        System.out.println(this.saldo);
    }

    public void RealizarDeposito(ContaBancaria deposito, ContaBancaria dados){
        System.out.println("-----");
      int conta = deposito.saldo;
        System.out.println("Deposito adicionado a conta: " + dados.titular + "  R$"+ (conta + 100));
    }

    public void RealizarSaque(ContaBancaria dados, ContaBancaria saque){
        System.out.println("-----");
        int contaSaque = saque.saldo;
        if (dados.saldo > 0){
            System.out.println("Saque realizado da conta: " + dados.titular + "  R$"+ (contaSaque - 100));
        }

    }

    public void StatusDaConta(ContaBancaria dados){
        System.out.println("-----");
        int status = dados.saldo;
        if (status > 0){
             System.out.println("Conta com saldo");
        }else {
             System.out.println("Conta sem saldo");
        }

    }
}
