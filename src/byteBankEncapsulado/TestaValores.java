package byteBankEncapsulado;

public class TestaValores {
	
	public static void main(String args[]){
		
		Conta conta = new Conta(1,3);
		
		//Conta inconsistente
		conta.setAgencia(0);
		conta.setNumero(-1);
		
		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(1337,24226);
		System.out.println(conta2.getAgencia());
		
		System.out.println (Conta.getTotal());
	}

}
