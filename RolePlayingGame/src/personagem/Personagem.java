package personagem;

public class Personagem {
	
	private int pontosDeVida;
	private int defesa;
	private int defesaMagica;
	private String nome;
	
	public Personagem(String nome, int pontosDeVida, int defesa, int defesaMagica) {
		
		this.nome = nome;
		this.pontosDeVida = pontosDeVida;
		this.defesa = defesa;
		this.defesaMagica = defesaMagica;
		
	}
	
	public String getNome() {
		
		return this.nome;
		
	}
	
	public void setPontosdeVida(int pontosDeVida) {
		
		this.pontosDeVida = pontosDeVida;
		
	}
	
	public int getPontosDeVida() {
		
		return this.pontosDeVida;
		
	}
	
	public void setDefesa(int defesa) {
		
		this.defesa = defesa;
		
	}
	
	public int getDefesa() {
		
		return this.defesa;
		
	}
	
	public void setDefesaMagica(int defesaMagica) {
		
		this.defesaMagica = defesaMagica;
		
	}
	
	public int getDefesaMagica() {
		
		return this.defesaMagica;
		
	}
	
	public void mostrarStatus() {
		
		System.out.println("Nome: " + this.nome);
		System.out.println("Pontos de Vida: " + this.pontosDeVida);
		System.out.println("Defesa: " + this.defesa);
		System.out.println("Defesa Magica: " + this.defesaMagica);
		
	}

}
