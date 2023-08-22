package Modulo2.Banco;

public class Conta {
    private double saldo;
    private int agencia;
    private int conta;
    private Cliente Titular;

    public Conta(double saldo, int agencia, int conta, Cliente titular) {
        this.saldo = saldo;
        this.agencia = agencia;
        this.conta = conta;
        Titular = titular;
    }

    public void deposita(double valor){
        this.saldo = this.saldo + valor;
    }

    public boolean saca(double valor){
        if(this.saldo >= valor){
            this.saldo = this.saldo - valor;
            return true;
        } else {
            return false;
        }
    }
    public boolean transfere(double valor, Conta contaDestino){
        if(this.saldo >= valor){
            this.saldo = this.saldo - valor;
            contaDestino.deposita(valor);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getTitular().getNome() + ", " + this.saldo +", "+ this.agencia +", "+ this.conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public Cliente getTitular() {
        return Titular;
    }

    public void setTitular(Cliente titular) {
        Titular = titular;
    }
}
