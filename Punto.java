package Ejercicio5_13;

public class Punto {
    private int x;
    private int y;
    public Punto(){
        x = 0;
        y = 0;
    }
    public Punto(int ptox, int ptoy ) throws NumberException{
        this.setX(ptox);
        this.setY(ptoy);
    }

    private void compruebaNum(int ptox) throws NumberException{
        try{
            if( ptox < 0 ) throw new NumberException("Las coordenadas positivas");
        }catch (Exception e){
            throw new NumberException(e.getMessage());
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) throws NumberException{
        compruebaNum(x);
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) throws NumberException{
        compruebaNum(y);
        this.y = y;
    }

    @Override
    public String toString() {
        return "Punto{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
