abstract class Ciclista {
    private int identificador;
    private String nombre;
    private int tiempoAcumulado;

    public Ciclista (int identificador, String nombre){
        this.identificador = identificador;
        this.nombre = nombre;
        this.tiempoAcumulado = 0;
    }

    public int getIdentificador(){
        return identificador;
    }
    public void setIdetificador(int identificador){
        this.identificador = identificador;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    public int getTiempoAcumulado(){
        return tiempoAcumulado;
    }
    public void setTiempoAcumulado(int tiempoAcumulado){
        this.tiempoAcumulado = tiempoAcumulado;
    }

    public void imprimirDatos(){
        System.out.println("Identificador: " + identificador);
        System.out.println("Nombre: " + nombre);
        System.out.println("Tiempo Acumulado: " + tiempoAcumulado + "minutos");
    }

    public abstract String imprimirTipo();
}
