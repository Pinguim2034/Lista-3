	package exercicio_01l3;

public class Cachorro extends Animal{
	private String raça;
	
	public Cachorro(String Nome) {
	super(Nome);	
	}
	
	
	public String getRaça(){
		return raça;
	}
	public void setRaça(String x) {
		raça = x;
	}
	
	@Override
	public String toString() {
		return "Nome: " + getNome() + "\n" + "Peso: " + getPeso() + "\n" + "Raça: " + getRaça();
	}
}