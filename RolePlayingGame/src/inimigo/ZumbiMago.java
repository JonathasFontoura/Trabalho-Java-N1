package inimigo;

public class ZumbiMago extends Inimigo{
	
private int magiaSombria;
	
	public ZumbiMago(int pontosDeVida, int defesa, int defesaMagica, int magiaSombria) {
		
		super(pontosDeVida, defesa, defesaMagica);
		this.magiaSombria = magiaSombria;
		
	}
	
	public int getMagiaSombria() {
		
		return this.magiaSombria;
		
	}
	
	public void setMagiaSombria(int magiaSombria) {
		
		this.magiaSombria = magiaSombria;
		
	}
	
	@Override
	
	public void mostrarStatus() {
		
		System.out.println("Classe: " + this.getClass().getSimpleName());
		System.out.println("Pontos de Vida: " + getPontosDeVida());
		System.out.println("Defesa: " + getDefesa());
		System.out.println("Defesa Magica: " + getDefesaMagica());
		System.out.println("Poder Magico: " + getMagiaSombria());
		
	}
	

}
