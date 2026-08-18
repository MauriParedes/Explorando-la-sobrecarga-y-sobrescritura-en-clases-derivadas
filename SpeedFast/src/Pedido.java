public class Pedido {
    private int idPedido;
    private String direccionEntrega;
    private String tipoPedido;

    // Construcctor
    public Pedido(int idPedido, String direccionEntrega, String tipoPedido) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.tipoPedido = tipoPedido;
    }
    //metodo sobrecribible
    public void asignarRepartidor(){
        System.out.println("Asignado a repartidor a la direccion :" + direccionEntrega);
    }
    //metodo sobrecargado
    public void asignarRepartidor(String nombreRepartidor){
        System.out.println("Asignado a repartidor:" +  nombreRepartidor + "para el pedido #" + idPedido);
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

    public String getTipoPedido() {
        return tipoPedido;
    }

    public void setTipoPedido(String tipoPedido) {
        this.tipoPedido = tipoPedido;
    }
}
