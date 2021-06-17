package project.nivel_dioxido_carbono.CreateGrafico.Model;

public class NiveisDeDioxidoDeCarbono {

	private String cidade;
	private Long ano;
	private double aumento;

	public NiveisDeDioxidoDeCarbono(String cidade, Long ano, double aumento) {
		super();
		this.cidade = cidade;
		this.ano = ano;
		this.aumento = aumento;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public Long getAno() {
		return ano;
	}

	public void setAno(Long ano) {
		this.ano = ano;
	}

	public double getAumento() {
		return aumento;
	}

	public void setAumento(double aumento) {
		this.aumento = aumento;
	}

}
