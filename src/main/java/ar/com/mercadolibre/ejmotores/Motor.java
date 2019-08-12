package ar.com.mercadolibre.ejmotores;

public class Motor {

    private Integer temp = 0;
    private Integer pot = 0;

    public Motor(){

    }
    public Integer getTemp() {
        return temp;
    }

    public Integer getPot() {
        return pot;
    }

    public void Acelerar(Integer velocidad){
        this.pot =+ velocidad;
        this.temp =+ velocidad;

    }
    public void Frenar(Integer velocidad){
        this.pot =- velocidad;
        this.temp =- velocidad;
    }
}
