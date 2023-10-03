public class Moto extends Veiculo {

    @Override
    public double calcularCustoViagem(double distancia) {
        return 0.15 * distancia;
    }
}
