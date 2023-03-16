package exercicio_01l3;

public class Animal {
	private String nome;
	private double peso;
	
	public Animal(String Nome) {
		setNome(Nome);
	}
	
	public String getNome(){
		return nome;
	}
	public void setNome(String x) {
		nome = x;
	}
	public double getPeso(){
		return peso;
	}
	public void setPeso(double x) {
		peso = x;
	}
}
