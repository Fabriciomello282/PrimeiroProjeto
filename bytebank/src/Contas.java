
public class Contas {
	public static void main(String[]args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.titular = "Fabrício de Mello Porto Alegre";
		primeiraConta.agencia = 55555;
		primeiraConta.numero = 25874-2;
		primeiraConta.saldo = 500;
		
		System.out.println(primeiraConta.titular);
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		System.out.println(primeiraConta.saldo);
		System.out.println();
		System.out.println();
		System.out.println();
		
		Conta segundaConta = new Conta();
		segundaConta.titular = "Mariana Gabriela de Lima Lobão";
		segundaConta.agencia = 4441;
		segundaConta.numero = 25145-2;
		segundaConta.saldo = 688;
		
		System.out.println(segundaConta.titular);
		System.out.println(segundaConta.agencia);
		System.out.println(segundaConta.numero);
		System.out.println(segundaConta.saldo);
		
		
		
	}

}
