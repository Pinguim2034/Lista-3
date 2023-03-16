package exercicio_02l3;

public class Exercicio_02l3 {
	public static void main(String[] args) {
		Gerente g1 = new Gerente("Cleiton", 48, "Masculino");
		Vendedor v1 = new Vendedor("José", 30, "Masculino");
		Cliente c1 = new Cliente("Lúcia", 50, "Feminino");
		g1.setNomeGerencia("Cleiton co.");
		g1.setSalario(1500);
		g1.setMatricula("22.1.8024");
		v1.setValorVendas(50350.5);
		v1.setQntVendas(64);
		v1.setSalario(1200);
		c1.setValorDivida(1200);
		c1.setAnoNascim(1972);
		System.out.println(g1.toString() + "\n\n");
		System.out.println(v1.toString() + "\n\n");
		System.out.println(c1.toString() + "\n\n");
	}
}
