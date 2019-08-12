package ar.com.mercadolibre.javaoop;

public class Cerradura {
    public Integer clave = 1234;
    private boolean cerrada = true;
    //Defino un constructor
    public Cerradura(Integer clave){

        this.clave = clave;
    }
    public Cerradura(){

    }

    public boolean estaCerrada() {
        return cerrada;
    }

    public void abrir(Integer  clave) {
        if(clave != null){
            if(clave.equals(this.clave)){
                this.cerrada = false;
            }
        }

    }
}
