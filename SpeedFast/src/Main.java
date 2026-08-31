import modelos.Pedido;
import modelos.PedidoComida;
import modelos.PedidoEncomienda;
import modelos.PedidoExpress;
import servicios.ControladorDeEnvios;

public class Main {
    public static void main(String[] args) {
        System.out.println("=================================================================================");
        System.out.println("                 INICIANDO SIMULACIÓN DEL SISTEMA DE REPARTO                     ");
        System.out.println("=================================================================================");
        System.out.println();

        // 1. Creación de Pedidos
        System.out.println(">>> [1] CREACIÓN DE PEDIDOS");
        Pedido comida = new PedidoComida(101, "Av. Paula Jaraquemada 083", 12.0);
        Pedido encomienda = new PedidoEncomienda(102, "Luis Matte Larraín 1168", 20.0);
        Pedido express = new PedidoExpress(103, "Avenida Siempreviva 742", 4.5);
        Pedido expressLargo = new PedidoExpress(104, "Gran Avenida 4500", 8.0);

        System.out.println("Pedidos creados exitosamente.");
        System.out.println();

        // 2. Registro de pedidos en el Controlador de Envíos
        System.out.println(">>> [2] INICIALIZACIÓN DEL CONTROLADOR DE ENVÍOS");
        ControladorDeEnvios controlador = new ControladorDeEnvios();
        controlador.registrarPedido(comida);
        controlador.registrarPedido(encomienda);
        controlador.registrarPedido(express);
        controlador.registrarPedido(expressLargo);
        System.out.println("Pedidos registrados en el historial de seguimiento.");
        System.out.println();

        // 3. Asignación de Repartidores (Automática y Manual)
        System.out.println(">>> [3] ASIGNACIÓN DE REPARTIDORES");
        
        // Automáticas
        System.out.println("--- Asignaciones Automáticas (Polimorfismo / Sobrescritura) ---");
        comida.asignarRepartidor();
        express.asignarRepartidor();
        
        // Manuales
        System.out.println("--- Asignaciones Manuales (Sobrecarga de Métodos) ---");
        encomienda.asignarRepartidor("Carlos Gómez (Camión Express)");
        expressLargo.asignarRepartidor("Sofía Martínez (Bicicleta Eléctrica)");
        System.out.println();

        // 4. Mostrar Resúmenes e Información Detallada (Abstracción)
        System.out.println(">>> [4] RESUMEN DE LOS PEDIDOS REGISTRADOS");
        System.out.println("---------------------------------------------------------------------------------");
        comida.mostrarResumen();
        System.out.println("---------------------------------------------------------------------------------");
        encomienda.mostrarResumen();
        System.out.println("---------------------------------------------------------------------------------");
        express.mostrarResumen();
        System.out.println("---------------------------------------------------------------------------------");
        expressLargo.mostrarResumen();
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println();

        // 5. Interacciones Funcionales: Reserva, Despacho y Cancelación (Interfaces y Lógica de Negocio)
        System.out.println(">>> [5] GESTIÓN DE ENVÍOS (RESERVA, DESPACHO Y CANCELACIÓN)");
        
        System.out.println("--- Procesando Reservas ---");
        expressLargo.reservar();
        
        System.out.println("\n--- Procesando Envíos ---");
        comida.despachar();
        express.despachar();
        
        System.out.println("\n--- Procesando Cancelaciones ---");
        encomienda.cancelar();
        
        System.out.println("\n--- Intentos de Operaciones Inválidas ---");
        // Intentar cancelar un pedido ya despachado
        comida.cancelar();
        // Intentar despachar un pedido ya cancelado
        encomienda.despachar();
        // Intentar reservar un pedido ya despachado
        comida.reservar();
        // Intentar reservar un pedido ya cancelado
        encomienda.reservar();
        System.out.println();

        // 6. Visualización de Historial (Interfaz Rastreable)
        System.out.println(">>> [6] CONSULTA DEL HISTORIAL GENERAL");
        controlador.verHistorial();
        System.out.println();
        
        System.out.println("=================================================================================");
        System.out.println("                 SIMULACIÓN CONCLUIDA CON ÉXITO                                  ");
        System.out.println("=================================================================================");
    }
}