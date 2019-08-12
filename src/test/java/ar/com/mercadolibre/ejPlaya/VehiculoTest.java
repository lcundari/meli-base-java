package ar.com.mercadolibre.ejPlaya;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class VehiculoTest {

//    @Test
 //   public void crearVehiculo(){
        //  1.Se crea el vehiculo
//        Vehiculo miVehiculoTest = new Vehiculo();
        //  2.Verifico que no sea null el objeto que se creo
//        Assertions.assertThat(miVehiculoTest).isNotNull();
 //   }

    @Test
    public void crearUtilitarioConCarga() throws Exception {
        //  1.Se crea el utilitario
        Utilitario miUtilitario = new Utilitario(1);
         // 2.Verifico que no sea null el objeto que se creo
        Assertions.assertThat(miUtilitario).isNotNull();
    }

    @Test
    public void crearAutoConCarga() throws Exception {
        //  1.Se crea el utilitario
        Auto miAuto = new Auto(1);
        // 2.Verifico que no sea null el objeto que se creo
        Assertions.assertThat(miAuto).isNotNull();
    }

    @Test
    public void crearCamionConCarga() throws Exception {
        //  1.Se crea el utilitario
        Camion miCamion = new Camion(1);
        // 2.Verifico que no sea null el objeto que se creo
        Assertions.assertThat(miCamion).isNotNull();
    }

    @Test(expected = Exception.class)
    public void crearUnAutoConCargaNegativa() throws Exception {
         Auto auto = new Auto(-5);
    }

    @Test
    public void crearCamionetaConCarga() throws Exception {
        //  1.Se crea el utilitario
        Camioneta miCamioneta = new Camioneta(1);
        // 2.Verifico que no sea null el objeto que se creo
        Assertions.assertThat(miCamioneta).isNotNull();
    }

}
