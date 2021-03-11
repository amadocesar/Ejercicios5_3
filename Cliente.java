package Ejercicio5_11;

public class Cliente {
    private String nombre;
    private String DNI;
    private String telefono;
    private final static String[] LETRASDNI = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B",  "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

    public Cliente (String nombre, String DNI, String tlf) throws DNIException{
        this.nombre = nombre;
        this.setDNI(DNI);
        this.telefono = tlf;
    }

    public void ConfirmaDNI(String DNI) throws DNIException{
        try{
            String letra = DNI.substring(DNI.length()-1);
            String numerosStr = DNI.substring(0, DNI.length()-1);
            int numero = Integer.parseInt(numerosStr);
            int posicion = numero % 23;
            if (!letra.toUpperCase().equals(Cliente.LETRASDNI[posicion])) {
                throw new Exception("Letra incorrecta");
            }
        } catch (Exception e){
            throw new DNIException(e.getMessage());
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) throws DNIException {
        ConfirmaDNI(DNI);
        this.DNI = DNI;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono( String telefono) {
        this.telefono = telefono;
    }
}
