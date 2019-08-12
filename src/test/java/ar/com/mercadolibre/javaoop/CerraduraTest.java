package ar.com.mercadolibre.javaoop;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class CerraduraTest {

    //Escribir metodo "public" que no devuelva nada
    //Para que esto realmente sea una prueba tengo que usar la anotacion @Test
    //Antes de dar "build" se tiene que agregar un plugin en el POM para que corra con la JDK11
    @Test
    public void crearCerradura(){
        //Creo el objeto
        Cerradura objetoCerradura = new Cerradura();
        //Verifico que el no sea null
        Assertions.assertThat(objetoCerradura).isNotNull();


    }
    @Test
    public void crearCerraduraConClave(){

       Cerradura objetoCerradura = new Cerradura(1234);
       Assertions.assertThat(objetoCerradura).isNotNull();

    }
    @Test
    public void crearCerraduraConClaveNumericaYLaGuarde(){
        Cerradura objetoCerradura = new Cerradura(1235);
        Assertions.assertThat(objetoCerradura).isNotNull();
        Assertions.assertThat(objetoCerradura.clave).isEqualTo(1235);
    }
    @Test
    public void unaCerraduraSeCreaCerrada(){

        Cerradura objetoCerradura = new Cerradura();
        Assertions.assertThat(objetoCerradura.estaCerrada()).isTrue();
    }
    @Test
    public void abrirCerraduraConClave(){
        //  1.Creo una cerradura
        Cerradura objetoCerradura = new Cerradura(1235);
        //  2.Veo que este cerrada
        Assertions.assertThat(objetoCerradura.estaCerrada()).isTrue();
        //  3.La intento abrir
        objetoCerradura.abrir(1235);
        //  4.Veo que no este cerrada
        Assertions.assertThat(objetoCerradura.estaCerrada()).isFalse();
    }
    @Test
    public void abrirCerraduraSinClave(){
        //  1.Creo una cerradura
        Cerradura objetoCerradura = new Cerradura(1235);
        //  2.Veo que este cerrada
        Assertions.assertThat(objetoCerradura.estaCerrada()).isTrue();
        //  3.La intento abrir
        objetoCerradura.abrir(1235);
        //  4.Veo que no este cerrada
        Assertions.assertThat(objetoCerradura.estaCerrada()).isFalse();
    }
    @Test
    public void abrirCerraduraConClaveIncorrecta(){
        //  1.Creo una cerradura
        Cerradura objetoCerradura = new Cerradura(1235);
        //  2.Veo que este cerrada
        Assertions.assertThat(objetoCerradura.estaCerrada()).isTrue();
        //  3.La intento abrir
        objetoCerradura.abrir(1234);
        //  4.Veo que no este cerrada
        Assertions.assertThat(objetoCerradura.estaCerrada()).isFalse();
    }


}
