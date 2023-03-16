package exercicio_02l3;

public class Vendedor extends Empregado{
	
	public Vendedor(String Nome, int Idade, String Sexo) {
		super(Nome, Idade, Sexo);
	}

	private double valorVendas;
	private int qntVendas;
	
	public double getValorVendas(){
		return valorVendas;
	}
	public void setValorVendas(double x) {
		valorVendas = x;
	}
	public int getQntVendas(){
		return qntVendas;
	}
	public void setQntVendas(int x) {
		qntVendas = x;
	}
	
	public String toString() {
		return "Nome: " + getNome() + "\nIdade: " + getIdade() + "\nSexo: " + getSexo() + "\nSalário: " + getSalario() + "\nValor das vendas:" + getValorVendas() + "\nQuantidade de vendas:" + getQntVendas();
	}
}
