public class cupo {
    private String numero;
    private boolean isOcupado;

    public cupo(String numero, boolean isOcupado) {
        this.numero = numero;
        this.isOcupado = isOcupado;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public boolean isOcupado() {
        return isOcupado;
    }

    public void setOcupado(boolean ocupado) {
        isOcupado = ocupado;
    }
}
