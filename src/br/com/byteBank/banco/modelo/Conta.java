package br.com.byteBank.banco.modelo;

public abstract class Conta extends Object implements Tributavel {

    private double saldo;
    private int agencia;
    private int numero;
    private Titular titular;
    private static int total = 0;

    public Conta(int agencia, int numero){
        Conta.total++;
        System.out.println("O total de contas é " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 100;
        System.out.println("Estou criando uma conta " + this.numero);
    }

    public abstract void deposita(double valor);

    public void saca(double valor) throws SaldoUnsuficienteException2{
        if(this.saldo <= valor) {
        	throw new SaldoUnsuficienteException("Saldo insuficiente, seu saldo é " + this.saldo);
        } 
        else {
        	if(this.saldo < saldo) {
        		throw new SaldoUnsuficienteException2("Saldo insuficiente, seu saldo é " + this.saldo);
        	}else {

            	this.saldo -= valor;
        	}
        }
    }
    
    @Override
    public boolean equals(Object ref) {
    	Conta Outra = (Conta)ref;
    	if(this.agencia != Outra.agencia) {
    		return false;
    	}
    	
    	if(this.numero != Outra.numero) {
    		return false;
    	}
    	
    	return true;
    }

    public void transfere(double valor, Conta destino) throws SaldoUnsuficienteException2{
       this.saca(valor);
       destino.deposita(valor);
       
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        if(numero <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia){
       if(agencia <= 0) {
           System.out.println("Nao pode valor menor igual a 0");
           return;
       }
       this.agencia = agencia;
    }

    public void setTitular(Titular titular){
        this.titular = titular;
    }

    public Titular getTitular(){
        return this.titular;
    }

    public static int getTotal(){
        return Conta.total;
    }

}