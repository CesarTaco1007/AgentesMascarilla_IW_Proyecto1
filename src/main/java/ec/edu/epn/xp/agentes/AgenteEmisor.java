package ec.edu.epn.xp.agentes;

public class AgenteEmisor {
    int codigo; String nombreAgente;

    public AgenteEmisor(int COD, String nombre){
        this.codigo = COD;
        this.nombreAgente = nombre;
    }

    public AgenteEmisor(){
    }

    public void comportamiento(){
        System.out.println(toString());

        int codigo = 100;
        String temp = "37.5";
        String mensaje = "Prueba";

        EnviarMensaje sms = new EnviarMensaje();

        sms.setCodigo(codigo);
        sms.setMensaje(mensaje);

        Temperatura t = new Temperatura();

        t.setValorTemperatura(temp);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreAgente() {
        return nombreAgente;
    }

    public void setNombreAgente(String nombreAgente) {
        this.nombreAgente = nombreAgente;
    }

    @Override
    public String toString() {
        return "AgenteEmisor{" +
                "codigo=" + codigo +
                ", nombreAgente='" + nombreAgente + '\'' +
                '}';
    }
}
