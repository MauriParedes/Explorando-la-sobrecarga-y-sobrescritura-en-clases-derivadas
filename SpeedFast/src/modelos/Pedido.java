package modelos;

import interfaces.Cancelable;
import interfaces.Despachable;

public abstract class Pedido implements Despachable, Cancelable {
    private int idPedido;
    private String direccionEntrega;
    private double distanciaKm;
    private String repartidor = "Sin asignar";
    private String estado = "Pendiente";

    // Construcctor
    public Pedido(int idPedido, String direccionEntrega, double distanciaKm) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.distanciaKm = distanciaKm;
    }

    // metodo abstracto
    public abstract int calcularTiempoEntrega();
    public abstract String getTipoEntrega();
    public abstract String getFactoresDuracion();

    // Metodos para asignar repartidor (polimorfismo y sobrecarga)
    public abstract void asignarRepartidor();

    public void asignarRepartidor(String nombre) {
        this.repartidor = nombre;
        System.out.printf("-> Repartidor '%s' asignado MANUALMENTE al Pedido #%03d%n", nombre, idPedido);
    }

    // Metodo para reservar el pedido
    public void reservar() {
        if (!"Pendiente".equals(this.estado)) {
            System.out.printf("[ERROR] No se puede reservar el Pedido #%03d porque no está en estado Pendiente (Estado actual: %s).%n", idPedido, estado);
            return;
        }
        this.estado = "Reservado";
        System.out.printf("[RESERVA] El Pedido #%03d (%s) ha sido reservado con éxito.%n", idPedido, getTipoEntrega());
    }

    // Implementacion de Despachable
    @Override
    public void despachar() {
        if ("Cancelado".equals(this.estado)) {
            System.out.printf("[ERROR] No se puede despachar el Pedido #%03d porque está Cancelado.%n", idPedido);
            return;
        }
        this.estado = "Despachado";
        System.out.printf("[DESPACHO] El Pedido #%03d (%s) ha sido despachado hacia '%s'.%n", idPedido, getTipoEntrega(), direccionEntrega);
    }

    // Implementacion de Cancelable
    @Override
    public void cancelar() {
        if ("Despachado".equals(this.estado)) {
            System.out.printf("[ERROR] No se puede cancelar el Pedido #%03d porque ya ha sido Despachado.%n", idPedido);
            return;
        }
        this.estado = "Cancelado";
        System.out.printf("[CANCELACIÓN] El Pedido #%03d (%s) ha sido cancelado.%n", idPedido, getTipoEntrega());
    }

    //metodo para mostrar datos del pedido
    public void mostrarResumen() {
        System.out.printf("%s #%03d%n", getClass().getSimpleName(), idPedido);
        System.out.println("Tipo de entrega: " + getTipoEntrega());
        System.out.println("Dirección: " + direccionEntrega);
        System.out.println("Distancia: " + (int) distanciaKm + " km");
        System.out.println("Repartidor: " + repartidor);
        System.out.println("Estado del envío: " + estado);
        System.out.println("Factores que afectan la duración: " + getFactoresDuracion());
        System.out.println("Tiempo estimado de entrega: " + calcularTiempoEntrega() + " minutos");
    }

    //Getter y Setters
    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }

    public void setDistanciaKm(double distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    public String getRepartidor() {
        return repartidor;
    }

    public void setRepartidor(String repartidor) {
        this.repartidor = repartidor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
