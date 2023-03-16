package exercicio_02l3;

public class Empregado extends Pessoa {
	
	public Empregado(String Nome, int Idade, String Sexo) {
		super(Nome, Idade, Sexo);
	}

	private double salario;
	private String matricula;
	
	public double getSalario(){
		return salario;
	}
	public void setSalario(double x) {
		salario = x;
	}
	public String getMatricula(){
		return matricula;
	}
	public void setMatricula(String x) {
		matricula = x;
	}
	
	public double valorINSS(double salario) {
		return salario-(salario*0.11);
	}
}
