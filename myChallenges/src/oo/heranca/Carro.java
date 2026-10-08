package oo.heranca;

public class Carro {
		int distancia = 0;
		int velocidadeContador;
		private int velocidade = 0;
	
	public boolean setVelocidade(int novaVelocidade) {
		this.velocidade = novaVelocidade;
		return true;
	}
		
	 boolean controleVelocidade (Acelerador acelerar ) {
		 if(this.velocidade <= 0 && distancia >= 0) {
			 switch(acelerar) {
			 	case ACELERAR: distancia +=5;
			 			       velocidadeContador+=5;
			 		break;
			 	case PARAR: distancia -=10;
			 				velocidadeContador+=10;
			 		break;
			 }
		 }else if (this.velocidade >=0 && distancia >= 0) {
			 switch(acelerar) {
			 	case ACELERAR: distancia +=20;
			 					velocidadeContador+=20;
			 		break;
			 	case PARAR: distancia -=20;
			 				velocidadeContador+=20;
			 		break;
			 }
		}
		
		// System.out.println(this.velocidade);
		 return true;
	 }
}
