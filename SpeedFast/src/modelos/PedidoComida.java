package modelos;

public class PedidoComida extends Pedido {

    public PedidoComida(int idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    @Override
    public int calcularTiempoEntrega() {
        return (int) (15 + (2 * getDistanciaKm()));
    }

    @Override
    public String getTipoEntrega() {
        return "Comida a domicilio";
    }

    @Override
    public String getFactoresDuracion() {
        return "Tiempo base de preparación (15 min) + 2 min por cada kilómetro de distancia";
    }

    @Override
    public void asignarRepartidor() {
        setRepartidor("Repartidor Motorizado (Comida Rápida)");
        System.out.printf("-> Repartidor '%s' asignado AUTOMÁTICAMENTE a PedidoComida #%03d%n", getRepartidor(), getIdPedido());
    }
}
