package exercicio_02l3;

public class Cliente extends Pessoa {
	private double valorDivida;
	private int anoNascim;
	public Cliente(String Nome, int Idade, String Sexo) {
		super(Nome, Idade, Sexo);
	}
	
	public double getValorDivida(){
		return valorDivida;
	}
	public void setValorDivida(double x) {
		valorDivida = x;
	}
	public int getAnoNascim(){
		return anoNascim;
	}
	public void setAnoNascim(int x) {
		anoNascim = x;
	}
	
	public String toString() {
		return "Nome: " + getNome() + "\nIdade: " + getIdade() + "\nAno de nascimento: " + getAnoNascim() + "\nSexo: " + getSexo() + "\nValor da Divida: " + getValorDivida();
	}
	
}
