package byteBankEncapsulado;

public class Conta{
	
	private double  saldo;
	private int     agencia = 42;
	private int     numero;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero){
		Conta.total++;
		System.out.println("O total de ");
		this.agencia = agencia;
		this.numero  = numero;
		System.out.println("Estou criando uma conta " + this.numero+ " Agencia : " + this.getAgencia());
		 
	}
	
	public void deposita(double valor){
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if (this.saldo >= valor){
			this.saldo -= valor;
			return true;
		}else{
			return false;
		}		
	}
	
	public boolean transfere(double valor, Conta contaDestino){
		
		if (this.saldo > valor){
			saca(valor);
			contaDestino.deposita(valor);
			return true;
		}else{
			return false;
		}
	}
	
	public double getSaldo(){
		return this.saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0 ){
			System.out.println("Não pode valor menor que zero");
			this.agencia = 0;
		}else{
			this.agencia = agencia;
		}
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0){
			System.out.println("Não pode valor menor que zero");
			this.numero = 0;
		}else{
			this.numero = numero;
		}
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}	
	
	public static int getTotal(){
		return Conta.total;
	}
}