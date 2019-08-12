package ar.com.mercadolibre.ejPostales;

import ar.com.mercadolibre.javaoop.Cerradura;

import java.security.spec.ECField;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Envio {
    private List<Paquete> misPaquetes;
    private Integer coste;
    private String direccion;
    private Vehiculo miVehiculoParaEnvio;

    Envio(List<Paquete> paquetes, String direccion) throws Exception{
        try{
        this.misPaquetes = paquetes;
        this.coste = calcularCosto();
        this.direccion = direccion;
        this.miVehiculoParaEnvio = Vehiculo.crearVehiculo(obtenerPeso());
        }catch (Exception e){
            throw new Exception("No se puede instanciar debido a que una de sus parametros es incorrecto");
        }
    }

    public List<Paquete> getMisPaquetes() {
        return misPaquetes;
    }

    public Integer getCoste() {
        return coste;
    }

    public String getDireccion() {
        return direccion;
    }

    public Vehiculo getMiVehiculoParaEnvio() {
        return miVehiculoParaEnvio;
    }

    public Integer calcularCosto(){
        //Integer result = 0;

        //if(misPaquetes.size() > 0 && misPaquetes.size() < 5){
          //  return COSTO_MINIMO;
        //}if else(misPaquetes.size() < 10){

        //}
        return 8;
    }

    public Integer obtenerPeso(){
        AtomicReference<Integer> sumatoria = new AtomicReference<>(0);
        misPaquetes.forEach(paquete -> sumatoria.updateAndGet(v -> v + paquete.getPeso()));

        return sumatoria.get();
    }


}
