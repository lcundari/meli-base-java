package ar.com.mercadolibre.ejPlaya;

public abstract class Vehiculo {
    private Integer carga = 0;
    private Integer cargaMaxima;

    public Vehiculo(Integer cargaMaxima) throws Exception {
        if(cargaMaxima >= 0){
            this.cargaMaxima = cargaMaxima;
        } else {
            throw new Exception();
        }


    }



}
