package ec.edu.epn.xp.agentes;

import java.util.Random;

public class AgenteReceptor {
    int codigo; String nombreAgente;

    public AgenteReceptor(int COD, String nombre){
        this.codigo = COD;
        this.nombreAgente = nombre;
    }

    public AgenteReceptor(){

    }

    public void comportamiento(){

        int codigo = 200;
        String temp = "37.5";
        String mensaje = "Prueba2";

        EnviarMensaje sms = new EnviarMensaje();

        sms.setCodigo(codigo);
        sms.setMensaje(mensaje);

        Temperatura t = new Temperatura();

        t.setValorTemperatura(temp);

        System.out.println(toString());

    }

    public boolean datoQuemado(){
        Random rd = new Random(); // creating Random object
        //return rd.nextBoolean();
        return true;
    }

    public boolean datoQuemadoF(){
        Random rd = new Random(); // creating Random object
        //return rd.nextBoolean();
        return false;
    }

    public double datoQuemadoTemperatura(){
        Random rd = new Random(); // creating Random object
        //return 34 + (40-34)*rd.nextDouble();
        return 37.5;
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
        return "AgenteReceptor{" +
                "codigo=" + codigo +
                ", nombreAgente='" + nombreAgente + '\'' +
                '}';
    }
}
