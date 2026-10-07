package oo.heranca;

public class Jogador {
	
	int vida = 100;
	int x=0;
	int y=0;
	
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
