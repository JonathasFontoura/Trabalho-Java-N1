package inimigo;

public abstract class Inimigo {

	private int pontosDeVida;
	private int defesa;
	private int defesaMagica;
	
	protected Inimigo(int pontosDeVida, int defesa, int defesaMagica) {
		
		this.pontosDeVida = pontosDeVida;
		this.defesa = defesa;
		this.defesaMagica = defesaMagica;
		
	}
	
	public int getPontosDeVida() {
		
		return this.pontosDeVida;
		
	}
	
	public void setPontosDeVida(int pontosDeVida) {
		
		this.pontosDeVida = pontosDeVida;
		
	}
	
	public int getDefesa() {
		
		return this.defesa;
		
	}
	
	public void setDefesa(int defesa) {
		
		this.defesa = defesa;
		
	}
	
	public int getDefesaMagica() {
		
		return this.defesaMagica;
		
	}
	
	public void setDefesaMagica(int defesaMagica) {
		
		this.defesaMagica = defesaMagica;
		
	}
	
	public void mostrarStatus() {
		
		System.out.println("Pontos de Vida: " + this.pontosDeVida);
		System.out.println("Defesa: " + this.defesa);
		System.out.println("Defesa Magica: " + this.defesaMagica);
		
	}
	
}
