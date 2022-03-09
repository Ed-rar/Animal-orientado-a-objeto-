package animal;

public class Esquilo {

	//Atributos
	private String nome;
	private float tamanho;
	private float peso;
	private boolean dormir = false;

	// construtor vazio, permite criar um objeto sem parametros em uma outra classe
	public Esquilo() {

	}

	// construtor com parâmetros para permitir dar valor valor aos atributos do
	// objeto criado
	public Esquilo(String nome, float tamanho, float peso, boolean dormir) {
		setNome(nome);
		setTamanho(tamanho);
		setPeso(peso);
		this.dormir = dormir;
	}

	
	//validação se ele está dormindo ou não 
	//'get' para metodo boolean é 'is' por padrão
	public boolean isDormindo() {
		return dormir;
	}
	
	
	// getters não tem parametro e retornam a variavel
	public String getNome() {
		return nome;
	}

	public float getTamanho() {
		return tamanho;
	}

	public float getPeso() {
		return peso;
	}

	// Setters recebem como parametro a variavel local que ira substituir o valor do
	// atributo especificado com o "this"
	private void setDormir(boolean dormir) {
		this.dormir = dormir;
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public void dormir() {
		if (!dormir) {
			this.dormir = true;

		}

	}
	
	public void acordar() {
		if(dormir) {
			this.dormir = false;
		}
	}

}
