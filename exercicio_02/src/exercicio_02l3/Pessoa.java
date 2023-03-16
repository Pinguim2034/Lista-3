package exercicio_02l3;

public class Pessoa {
	private String nome;
	private int idade;
	private String sexo;
	
	public Pessoa(String Nome, int Idade, String Sexo) {
		setNome(Nome);
		setIdade(Idade);
		setSexo(Sexo);
	}
	
	public String getNome(){
		return nome;
	}
	public int getIdade(){
		return idade;
	}
	public String getSexo(){
		return sexo;
	}
	public void setNome(String x) {
		nome = x;
	}
	public void setIdade(int x) {
		idade = x;
	}
	public void setSexo(String x){
		sexo = x;
	}
}
