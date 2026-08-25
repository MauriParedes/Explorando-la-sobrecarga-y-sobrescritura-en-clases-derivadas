public class Main {
    public static void main(String[] args) {
        //
        Pedido p1 = new PedidoComida(1, "Paula jaraquemada 083", 12);
        Pedido p2 = new PedidoEncomienda(2, "Luis Matte Larrain 1168", 20);
        Pedido p3 = new PedidoExpress(3, "Avenida Siempreviva 742", 5);

        // Arreglo polimórfico para recorrer y mostrar resumen
        Pedido[] pedidos = {p1, p2, p3};

        for (Pedido pedido : pedidos) {
            pedido.mostrarResumen();
            System.out.println(); // Línea en blanco para separar los datos
        }

        // comparativa de tiempos estimados
        System.out.println("=========================================================");
        System.out.println("  COMPARATIVA DE TIEMPOS ESTIMADOS DE ENTREGA (MINUTOS) ");
        System.out.println("=========================================================");
        for (Pedido pedido : pedidos) {
            int tiempo = pedido.calcularTiempoEntrega();
            System.out.printf("- Pedido #%03d [%-16s] -> Distancia: %2d km | Tiempo Estimado: %2d min (%s)%n", 
                pedido.getIdPedido(),
                pedido.getClass().getSimpleName(),
                (int) pedido.getDistanciaKm(),
                tiempo,
                pedido.getTipoEntrega()
            );
        }
        System.out.println("=========================================================");
    }
}