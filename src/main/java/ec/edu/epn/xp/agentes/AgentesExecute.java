package ec.edu.epn.xp.agentes;

public class AgentesExecute {
    public static void main(String[] args) {
        int codigoEmisor=100, codigoReceptor=200;
        boolean flag;
        String tempEmisor="37", tempReceptor="37", mensajeEmisor="Prueba1", mensajeReceptor="Prueba2";

        System.out.println("=========Mask Detect Simulation=========");

        EnviarMensaje sms = new EnviarMensaje();
        AgenteEmisor ae = new AgenteEmisor();
        AgenteReceptor ar = new AgenteReceptor();
        Temperatura t = new Temperatura();
        Imagen img = new Imagen();

        ae.setNombreAgente("Emisor");
        ae.setCodigo(codigoEmisor);
        ar.setNombreAgente("Receptor");
        ar.setCodigo(codigoReceptor);

        img.setEtiqueta("CON MASCARILLA");
        img.setFuente("E:\\andre\\Pictures\\Saved Pictures\\thumb-1920-593278.jpg");

        flag = img.getEtiqueta().equalsIgnoreCase("CON MASCARILLA");

        //CHANGE TEMP VALUE
        t.setValorTemperatura("37");

        ae.comportamiento();
        ar.comportamiento();

        ar.toString();
        ae.toString();

        System.out.println("===========FIRST CHANGE===========");
        if (ae.codigo == 100 && ar.codigo == 200 && flag){

            System.out.println("Esta puesto mascarilla");
            if (t.getValorTemperatura().equalsIgnoreCase("37.5")){
                System.out.println("Su temperatura es: "+t.getValorTemperatura());
                System.out.println("PUEDE PASAR ----> Recibi la imagen "+img.getFuente());
            }else{
                System.out.println("Su Temperatura no es apta para el ingreso");
                System.out.println("NO PUEDE PASAR ----> TEMPERATURA MUY ALTA");
            }
        }else{
            System.out.println("NO Esta puesto mascarilla");
            if (!t.getValorTemperatura().equalsIgnoreCase("37.5")){
                System.out.println("Su temperatura es: "+t.getValorTemperatura());
            }
            System.out.println("NO PUEDE PASAR ----> Recibi la imagen "+img.getFuente());
        }

        System.out.println("Finaliza proceso de Agente Receptor");
    }
}
