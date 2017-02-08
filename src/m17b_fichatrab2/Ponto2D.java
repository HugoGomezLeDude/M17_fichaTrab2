package m17b_fichatrab2;

/**
 * @version 0.2
 * versão concebida por
 * @author a15763
 * 
 */
public class Ponto2D {
    /**
     * coordenadas
    */
    
    /**
     * coordenada x do ponto
     */  
    private int x;
    /**
     * coordenada y do ponto
     */

    private int y;
  
    /**
     * serve para casos onde os parametros estão vazios
     */
    public Ponto2D(){
        x = 0;
        y = 0;  
    }
    /**
     * parametros do construtor
     * @param x
     * @param y 
     */
    public Ponto2D(int x, int y){
        this.x = x;
        this.y = y;        
    }
    /**
     * vai devolver o x
     * @return x
     */
    public int getX(){
        return x;
    }
    /**
     * vai devolver o y
     * @return y
     */
    public int getY(){
        return y;
    }
    /**
     * vai permitir a modificação da coordenada y 
     * parametros do metodo setY()
     * @param y 
     */
    public void setY(int y){
        this.y=y;
    }
    /**
     * vai permitir a modificação da coordenada x
     * parametros do metodo setX()
     * @param x 
     */
    public void setX(int x){
        this.x=x;
    }
    /**
     * O metodo vai receber outro ponto do main para calcular a distancia
     * parametros do metodo distancia()
     * @param a
     * @return 
     */
    public double distancia(Ponto2D a){
        
        int totalX=0;
        int totalY=0;
        double distancia=0;
        
        totalX=Math.abs(x-a.getX());
        totalY=Math.abs(y-a.getY());
        
        /**
         * pelo teorema de pitagoras
         */
        return Math.sqrt((totalY*totalY)+(totalX*totalX));
    }
    /**
     * O metodo vai permitir descrever o ponto
     * @return X:x   Y: y
     */
    @Override
    public String toString(){
        return "X:"+x+"   Y:"+y;
    }
    
}
