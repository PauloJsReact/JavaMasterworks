package oo.heranca;


public class Jogo {

	public static void main(String[] args) {
		Heroi j1 = new Heroi();
		j1.mover(Movimento.FRENTE);
		j1.mover(Movimento.CIMA);
		
		Monstro j2 =new Monstro();
		j2.x =0;
		j2.y= 1;
		
		j1.atacar(j2);
		j1.atacar(j2);
		
	Tela tela = new Tela();
	
	tela.Tabuleiro(j1.x, j1.y,j1.vida,j2.x,j2.y,j2.vida);	
		
		
		
		
	}
	
}
