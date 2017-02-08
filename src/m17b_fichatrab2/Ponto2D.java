package m17b_fichatrab2;

/**
 * @version 0.2
 * versão concepida por
 * @author Hugo Pereira
 * 
 */
public class Ponto2D {
    private int x;
    private int y;
    
    // Faltam construtor, getters e setters.
    public Ponto2D(){
        x = 0;
        y = 0;  
    }
    /**
     * 
     * @param x
     * @param y 
     */
    public Ponto2D(int x, int y){
        this.x = x;
        this.y = y;        
    }
    /**
     * 
     * @return 
     */
    public int getX(){
        return x;
    }
    /**
     * 
     * @return 
     */
    public int getY(){
        return y;
    }
    /**
     * 
     * @param y 
     */
    public void setY(int y){
        this.y=y;
    }
    /**
     * 
     * @param x 
     */
    public void setX(int x){
        this.x=x;
    }
    /**
     * 
     * @param a
     * @return 
     */
    public double distancia(Ponto2D a){
        
        int totalX=0;
        int totalY=0;
        double distancia=0.0;
        if(x<a.getX()){totalY=a.getY()-y;}
        else{totalY=y-a.getY();}
        
        if(x<a.getX()){totalX=a.getX()-x;}
        else{totalX=x-a.getX();}
        //pelo teorema de pitagoras
        return Math.sqrt((totalY*totalY)+(totalX*totalX));
    }
    public String toString(){
        return "X:"+x+"   Y:"+y;
    }
    
}
