package Classes;

public class Aeronave {
    private String modelo;
    private String numeroSerie;

    @Override
    public String toString() {
        String texto = " ";
        texto += "Modelo da aeronave: " + modelo;
        texto += " - Serie da aeronave: " + numeroSerie;
        return texto;
    }
    
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getNumeroSerie() {
        return numeroSerie;
    }
    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }
}
