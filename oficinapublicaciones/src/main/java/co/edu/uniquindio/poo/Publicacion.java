package co.edu.uniquindio.poo;

public class Publicacion {
    private String texto;
    private String titulo;
    private String estadp;
    private TipoPublicacion tipoPublicacion;
    public Publicacion(String texto, String titulo, String estadp, TipoPublicacion tipoPublicacion) {
        this.texto = texto;
        this.titulo = titulo;
        this.estadp = estadp;
        this.tipoPublicacion = tipoPublicacion;
    }
    
    @Override
    public String toString() {
        return "Publicacion [texto=" + texto + ", titulo=" + titulo + ", estadp=" + estadp + ", tipoPublicacion="
                + tipoPublicacion + "]";
    }

    public String getTexto() {
        return texto;
    }
    public void setTexto(String texto) {
        this.texto = texto;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getEstadp() {
        return estadp;
    }
    public void setEstadp(String estadp) {
        this.estadp = estadp;
    }
    public TipoPublicacion getTipoPublicacion() {
        return tipoPublicacion;
    }
    public void setTipoPublicacion(TipoPublicacion tipoPublicacion) {
        this.tipoPublicacion = tipoPublicacion;
    }

    
}
