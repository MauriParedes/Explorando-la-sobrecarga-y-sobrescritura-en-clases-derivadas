public class PedidoEncomienda extends Pedido {

    public PedidoEncomienda(int idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    @Override
    public int calcularTiempoEntrega() {
        return (int) (20 + (1.5 * getDistanciaKm()));
    }

    @Override
    public String getTipoEntrega() {
        return "Envío de Encomienda";
    }

    @Override
    public String getFactoresDuracion() {
        return "Tiempo base de despacho (20 min) + 1.5 min por kilómetro de distancia (redondeado)";
    }
}