 public class PedidoComida extends Pedido {

    public PedidoComida(int idPedido, String direccionEntrega) {
       super(idPedido, direccionEntrega, "Comida");
    }
    @Override
    public void asignarRepartidor() {
        System.out.println("[Pedido Comida] Asignando repartidor...");
        System.out.println("→ Verificando mochila térmica... OK");
    }

    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        asignarRepartidor(); // Llama a la lógica de verificación
        System.out.println("→ Pedido asignado a " + nombreRepartidor);
    }
}