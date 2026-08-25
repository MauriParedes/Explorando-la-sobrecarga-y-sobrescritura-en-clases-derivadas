public abstract class Pedido {
    private int idPedido;
    private String direccionEntrega;
    private double distanciaKm;

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

   //metodo para mostrar datos del pedido
    public void mostrarResumen() {
        System.out.printf("%s #%03d%n", getClass().getSimpleName(), idPedido);
        System.out.println("Tipo de entrega: " + getTipoEntrega());
        System.out.println("Dirección: " + direccionEntrega);
        System.out.println("Distancia: " + (int) distanciaKm + " km");
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
}
