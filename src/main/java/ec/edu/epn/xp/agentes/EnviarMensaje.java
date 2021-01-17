package ec.edu.epn.xp.agentes;

public class EnviarMensaje {
    int codigo; String mensaje;

    public EnviarMensaje(int COD, String mensaje){
        this.codigo = COD;
        this.mensaje = mensaje;
    }

    public EnviarMensaje(){
    }

    public void enviarMensaje(int codigo, String mensaje){
        System.out.println("Porceso enviar mensaje: " + toString());
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "EnviarMensaje{" +
                "codigo=" + codigo +
                ", mensaje='" + mensaje + '\'' +
                '}';
    }
}
