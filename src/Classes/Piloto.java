package Classes;

public class Piloto extends Pessoa {
    private String breve;
    private Aeronave aero;

    public Aeronave getAero() {
        return aero;
    }

    public void setAero(Aeronave aero) {
        this.aero = aero;
    }

    @Override
    public String toString() {
        String texto = " ";
        texto += "Nome do piloto: " + nome;
        texto += " - CPF do piloto: " + cpf;
        return texto;
    }

    public String getBreve() {
        return breve;
    }

    public void setBreve(String breve) {
        this.breve = breve;
    }
}
