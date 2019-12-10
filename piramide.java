import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class piramide {

	public static void main(String[] args) {
				
		int bolinhas = 500;
		int distancia = 35;
		
		int dadosCompletos[][] = new int[bolinhas][distancia];
		
		Random decisao = new Random();
		
		for (int i = 0; i < bolinhas; i++) {
			int posicionador = 35;
			for (int j = 0; j < distancia; j++) {
				if(decisao.nextBoolean()) {
					posicionador++;
					dadosCompletos[i][j] = posicionador;
					
				}else {
					posicionador--;
					dadosCompletos[i][j] = posicionador;
				}									
			}
		}

	
		int escala[] = new int[bolinhas];
		
						
		for (int i = 0; i < dadosCompletos.length; i++) {
			//int aux = dadosCompletos[i][34]; 
			escala[dadosCompletos[i][34]] += 1;
		
		}
		
		for (int coluna : escala) {
			if(coluna > 0) System.out.print(coluna + ";");
		}
		
	}

}
