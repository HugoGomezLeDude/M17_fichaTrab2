package m17b_fichatrab2;
/**
 * isto serve para calcular a distancia de 2 pontos escolhidos
 * autor original
 * @author professor João Barbosa
 */
public class Main {

    
    public static void main(String[] args) {
        // Ficha de Trabalho #2
        /**
         * p1 e p2 são 2 pontos diferentes 
         */
        Ponto2D p1 = new Ponto2D(5,7);
        Ponto2D p2 = new Ponto2D(2,8);
        /**
         * o conjunto de funções seguintes vão mostrar as coordenadas dos pontos
         */
        System.out.println(p1);
        System.out.println(p2);
        
        /**
         * vai mostrar a distancia do ponto p2 do ponto p1
         */
        System.out.println(p2.distancia(p1));
    }
    
}
