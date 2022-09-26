public class Vehiculo {
    private String placa;
    private char tipo;

    public Vehiculo(String placa, char tipo) {
        this.placa = placa;
        this.tipo = tipo;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
