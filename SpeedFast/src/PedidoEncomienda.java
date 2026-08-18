public class PedidoEncomienda extends Pedido {

    public PedidoEncomienda(int idPedido, String direccionEntrega) {
        super(idPedido , direccionEntrega , "Encomienda");
    }
    @Override
    public void asignarRepartidor() {
        System.out.println("PedidosComida asignando repartidor...");
        System.out.println("→ Validando peso y embalaje... OK");
    }
    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        asignarRepartidor();
        System.out.println("→ Pedido asignado a " + nombreRepartidor);
    }
}
