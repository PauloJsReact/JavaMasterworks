package oo.heranca;

public class Jogador {
	
	int vida = 100;
	int x=0;
	int y=0;
	
	
	
	
	
	boolean atacar(Jogador oponente) {
		int deltax = Math.abs(x-oponente.x);
		int deltay =Math.abs(y - oponente.y);
		if (deltax == 0 && deltay ==1) {
			oponente.vida -=10;
			return true;
		}else if (deltax == 1 && deltay ==0) {
			oponente.vida -=10;
			return true;
		}else {
			return false;	
		}
		
	}
	 boolean mover(Movimento movimento) {
		switch (movimento) {
			case FRENTE: x++;
				break;
			case ATRAS :x--;
				break;
			case CIMA: y++;
				break;
			case BAIXO: y--;
				break;
		default:
			break;
		
		}
		
		return true; 
	}
}
