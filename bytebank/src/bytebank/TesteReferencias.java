package bytebank;

public class TesteReferencias {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		primeiraConta.titular = "Fernanda Siqueira";
		
		System.out.println("saldo da primeira: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		
		segundaConta.saldo += 100;
		
		System.out.println(primeiraConta.saldo);
		System.out.println(segundaConta.saldo);
		System.out.println(segundaConta.titular);
		
		if (primeiraConta == segundaConta) {
			System.out.println("São a mesmíssima conta!");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
	
}
