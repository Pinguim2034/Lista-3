package exercicio_01l3;

public class Peixe extends Animal {
	private String tipoHabitat;
	
	public Peixe(String Nome) {
		super(Nome);
	}
	
	public String getTipoHabtitat(){
		return tipoHabitat;
	}
	public void setTipoHabitat(String x) {
		tipoHabitat = x;
	}
	@Override
	public String toString() {
		return "Nome: " + getNome() + "\n" + "Peso: " + getPeso() + "\n" + "Tipo de Habitat: " + getTipoHabtitat();
	}
}
