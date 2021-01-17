package ec.edu.epn.xp.agentes;

public class Imagen {
    private String etiqueta, fuente;

    public Imagen(String nombre, String url) {
        this.etiqueta = nombre;
        this.fuente = url;
    }

    public Imagen() { }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public String getFuente() {
        return fuente;
    }

    public void setFuente(String fuente) {
        this.fuente = fuente;
    }
}
