package mundopc.modelo;

public class DispositivoEntrada {
    private String tipoDeEntrada;
    private String marca;

    @Override
    public String toString() {
        return "DispositivoEntrada{" +
                "tipoDeEntrada='" + tipoDeEntrada + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    //Constructor
    public DispositivoEntrada(String tipoDeEntrada, String marca){
        this.tipoDeEntrada = tipoDeEntrada;
        this.marca = marca;

    }
}
