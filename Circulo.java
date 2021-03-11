package Ejercicio5_13;

public class Circulo {
    private Punto punto;
    private int diametro;
    private String color;

    public Circulo( Punto punto, String color, int diametro) throws NumberException{
        this.punto = punto;
        this.setDiametro(diametro);
        this.color = color;
    }
    private void comprobarDiam(int diametro) throws NumberException{
        try{
            if( diametro < 0 ) throw new NumberException("Las coordenadas positivas");
        }catch (Exception e){
            throw new NumberException(e.getMessage());
        }
    }

    public Punto getPunto() {
        return punto;
    }

    public void setPunto(Punto punto) {
        this.punto = punto;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) throws NumberException{
        comprobarDiam(diametro);
        this.diametro = diametro;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
