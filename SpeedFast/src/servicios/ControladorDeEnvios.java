package servicios;

import interfaces.Rastreable;
import modelos.Pedido;

import java.util.ArrayList;
import java.util.List;

public class ControladorDeEnvios implements Rastreable {
    private List<Pedido> historialEntregas = new ArrayList<>();

    public void registrarPedido(Pedido pedido) {
        historialEntregas.add(pedido);
    }

    @Override
    public void verHistorial() {
        System.out.println("=================================================================================");
        System.out.println("                         HISTORIAL DE ENTREGAS REALIZADAS                        ");
        System.out.println("=================================================================================");
        if (historialEntregas.isEmpty()) {
            System.out.println("No se han registrado pedidos en el historial.");
        } else {
            for (Pedido pedido : historialEntregas) {
                System.out.printf("- Pedido #%03d [%-16s] | Estado: %-11s | Repartidor: %-30s | Dirección: %-25s | Tiempo: %2d min%n",
                    pedido.getIdPedido(),
                    pedido.getClass().getSimpleName(),
                    pedido.getEstado(),
                    pedido.getRepartidor(),
                    pedido.getDireccionEntrega(),
                    pedido.calcularTiempoEntrega()
                );
            }
        }
        System.out.println("=================================================================================");
    }
}
