package arquivos.poo.teste;

import arquivos.poo.dominio.ContaBancaria;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria dados = new ContaBancaria();
        ContaBancaria deposito = new ContaBancaria();
        ContaBancaria saque =  new ContaBancaria();
        ContaBancaria status =  new ContaBancaria();

        dados.titular = "Ezequiel";
        dados.saldo = 1600;
        dados.MostrarDados();

        deposito.titular = "Ezequiel";
        deposito.saldo = 1600;
        deposito.RealizarDeposito(deposito, dados);

        saque.titular = "Ezequiel";
        saque.saldo = 1600;
        saque.RealizarSaque(saque, dados);

        status.titular = "Ezequiel";
        status.saldo = 1600;
        status.StatusDaConta(dados);
    }
}
