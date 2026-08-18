public class Main {
    public static void main(String[] args) {
        Pedido[] pedidos = new Pedido[3];

        pedidos[0] = new PedidoComida(101, "Paula jaraquemada 083");
        pedidos[1] = new PedidoEncomienda(102, "Luis Matte Larrain 1168");
        pedidos[2] = new PedidoExpress(103, "Avenida Siempreviva 742");

        // Nombres para la sobrecarga
        String[] repartidores = {"Mauricio Paredes", "Valentina Arenas", "Bart Simpson"};

        //  invocacion de la sobrecarga asignando nombre a cada pedido
        for (int i = 0; i < pedidos.length; i++) {
            pedidos[i].asignarRepartidor(repartidores[i]);
        }
    }
}