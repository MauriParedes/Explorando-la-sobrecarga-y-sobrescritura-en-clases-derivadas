public class PedidoExpress extends Pedido {

    public PedidoExpress(int idPedido, String direccionEntrega) {
        super(idPedido, direccionEntrega, "Express");
    }

    @Override
    public void asignarRepartidor() {
        System.out.println("[Pedido Express] Asignando repartidor...");
        System.out.println("→ Repartidor más cercano con disponibilidad inmediata encontrado.");
    }

    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        asignarRepartidor(); // Llama a la lógica de verificación
        System.out.println("→ Pedido asignado a " + nombreRepartidor);
    }
}