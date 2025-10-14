package punto;

public class Punto {
    private int x, y;

    //constructor
    public Punto(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y; 
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public double distancia(Punto p){
        return Math.sqrt(Math.pow((p.getX()-this.x),2) + Math.pow((p.getY()-this.y),2));
    }


}
