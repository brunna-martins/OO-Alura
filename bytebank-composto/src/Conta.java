public class Conta {
	// toda conta tem 4 atributos
	double saldo;
	int agencia;
	int numero;
	Cliente titular;
	// uma classe conta cria objetos ou instâncias do tipo Conta
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			System.out.println("Saldo insuficiente!");
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			System.out.println("Transferência concluída!");
			return true;
		} else {
			System.out.println("Saldo insuficiente!");
			return false;
		}
	}
	
}
