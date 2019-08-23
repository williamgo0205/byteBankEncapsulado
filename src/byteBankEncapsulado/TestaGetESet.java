package byteBankEncapsulado;

public class TestaGetESet {
	
	public static void main(String args[]){
		
		Conta   conta   = new Conta(1,2);
		Cliente cliente = new Cliente();
		
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		cliente.setNome("Paulo Silveira");
		conta.setTitular(cliente);
		
		System.out.println(conta.getTitular().getNome());
		conta.getTitular().setProfissao("Programador");
		System.out.println(conta.getTitular().getProfissao());
		
	}

}
