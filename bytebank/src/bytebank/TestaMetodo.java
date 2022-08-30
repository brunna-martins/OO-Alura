package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		
		conta.saldo = 100;
		conta.deposita(50);
		System.out.println(conta.saldo);
		
		boolean conseguiuSacar = conta.saca(130);
		System.out.println(conta.saldo);
		System.out.println(conseguiuSacar);
		
		Conta contaNova = new Conta();
		contaNova.deposita(1500);
		
		boolean sucessoTransferencia = contaNova.transfere(1400, conta);
		System.out.println(contaNova.saldo);
		System.out.println(conta.saldo);
		System.out.println(sucessoTransferencia);
		
		conta.titular = "Natália Freitas";
		System.out.println(conta.titular);
	}
	
}
