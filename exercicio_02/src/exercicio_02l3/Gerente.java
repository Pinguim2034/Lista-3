package exercicio_02l3;

public class Gerente extends Empregado {
	
	public Gerente(String Nome, int Idade, String Sexo) {
		super(Nome, Idade, Sexo);
	}

	private String nomeGerencia;
	
	public String getNomeGerencia(){
		return nomeGerencia;
	}
	public void setNomeGerencia(String x) {
		nomeGerencia = x;
	}
	
	public String toString() {
		return "Nome: " + getNome() + "\nIdade: " + getIdade() + "\nSexo: " + getSexo() + "\nSalário: " + getSalario() + "\nMatrícula: " + getMatricula() + "\nNome da gerencia: " + getNomeGerencia();
	}

}
