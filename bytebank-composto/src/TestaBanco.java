
public class TestaBanco {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.nome = "Brunna Martins";
		cliente.cpf = "333.333.333-33";
		cliente.profissão = "universiotárie";
		
		Conta conta = new Conta();
		conta.deposita(1000);
		
		conta.titular = cliente;
		System.out.println(conta.titular.nome);
	}
	
}
