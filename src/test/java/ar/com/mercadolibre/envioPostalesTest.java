package ar.com.mercadolibre;

import ar.com.mercadolibre.ejPostales.Envio;
import ar.com.mercadolibre.ejPostales.Paquete;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;

public class envioPostalesTest {

    Envio miEnvio;

    @Mock
    private Envio paquete1; //Generamos un paquete trucho

    @Mock
    private ArrayList<Paquete> mockPaquetes;

    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    public void testMyTest() {
        Mockito.when(mockPaquetes.size()).thenReturn(5);

        String result = mockPaquetes.;

        assertEquals("Should have the correct string", "Hello world", result);

        verify(mockPaquetes).get(0);
    }

    //@Before
    //public void setup(){
    //    miEnvio = new Envio();
    //}

    @Test
    public void envioNoEsNull(){
        //Se esta probando que cuando se crea un envio no sea NULL, poreso no se hace en el @Before
        Assertions.assertThat(miEnvio).isNotNull();
    }

    @Test
    public void envioInicializacionDefault(){
        Assertions.assertThat(miEnvio.obtenerPeso()).isEqualTo(0);

    }

}
