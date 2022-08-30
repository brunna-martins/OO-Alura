package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta(); // criei ou instanciei um objeto do tipo Conta, j� colocou na mem�ria
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("Primeira conta tem " + primeiraConta.saldo);
		System.out.println("Segunda conta tem " + segundaConta.saldo);
		
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		
		System.out.println(segundaConta.agencia);
		
		segundaConta.agencia = 146;
		System.out.println("a segunda ag�ncia est� na ag�ncia " + segundaConta.agencia);
		
		if (primeiraConta == segundaConta) {
			System.out.println("mesma conta");
		} else {
			System.out.println("contas diferentes");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
	
}
