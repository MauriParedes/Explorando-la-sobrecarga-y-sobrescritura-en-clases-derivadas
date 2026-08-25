public class PedidoExpress extends Pedido {

    public PedidoExpress(int idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    @Override
    public int calcularTiempoEntrega() {
        int tiempoBase = 10;
        if (getDistanciaKm() > 5) {
            tiempoBase += 5;
        }
        return tiempoBase;
    }

    @Override
    public String getTipoEntrega() {
        return "Envío Express";
    }

    @Override
    public String getFactoresDuracion() {
        return "Tiempo base de envío rápido (10 min) + recargo de 5 min si la distancia supera los 5 km";
    }
}