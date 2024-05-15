package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.Arrays;

public class OficinaPublicaciones {
    private final String nombre;
    private CentroImpresion centroImpresion;
    private EquipoElectronico[]listaEquiposElectronicos;
    private ArrayList<Publicacion> solicitudes;

    public OficinaPublicaciones(String nombre) {
        this.nombre = nombre;
        this.centroImpresion = new CentroImpresion(nombre);
        this.listaEquiposElectronicos =  new EquipoElectronico[5];
        this.solicitudes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    @Override
    public String toString() {
        return "OficinaPublicaciones [nombre=" + nombre + ", centroImpresion=" + centroImpresion
                + ", listaEquiposElectronicos=" + Arrays.toString(listaEquiposElectronicos) + ", solicitudes="
                + solicitudes + "]";
    }
    public CentroImpresion getCentroImpresion() {
        return centroImpresion;
    }
    public void setCentroImpresion(CentroImpresion centroImpresion) {
        this.centroImpresion = centroImpresion;
    }
    public EquipoElectronico[] getListaEquiposElectronicos() {
        return listaEquiposElectronicos;
    }
    public void setListaEquiposElectronicos(EquipoElectronico[] listaEquiposElectronicos) {
        this.listaEquiposElectronicos = listaEquiposElectronicos;
    }
    public ArrayList<Publicacion> getSolicitudes() {
        return solicitudes;
    }
    public void setSolicitudes(ArrayList<Publicacion> solicitudes) {
        this.solicitudes = solicitudes;
    }

    public void imprimirPublicacion(Publicacion publicacion){
        
    }

    public void agregarDispositivo(Camara camara) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'agregarDispositivo'");
    }

    public void agregarPublicacion(Publicacion publicacion_1) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'agregarPublicacion'");
    }

    public void agregarDispositivo(ImpresoraLaser impresoraLaser) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'agregarDispositivo'");
    }

    public void agregarDispositivo(ImpresoraCartucho impresoraCartucho) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'agregarDispositivo'");
    }

    public void agregarDispositivo(Computadora computador) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'agregarDispositivo'");
    }
    
}
