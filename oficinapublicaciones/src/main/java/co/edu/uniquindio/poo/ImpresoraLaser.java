package co.edu.uniquindio.poo;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public class ImpresoraLaser extends Impresora {

    public ImpresoraLaser(String codigo, String nombre, String marca, LocalDate fechaAdquisicion, String modelo,
    EstadoImpresora estadoImpresora) {
        super(codigo, nombre, marca, fechaAdquisicion, modelo, estadoImpresora);
    
    }

    @Override
    public void imprimir(Publicacion publicacion) {
        JOptionPane.showMessageDialog(null,"Imprimiendo Publicacion desde la impresora laser" + publicacion.getTexto()+ publicacion.getTipoPublicacion());
        System.out.println("Imprimiendo Publicacion desde la impresora laser" + publicacion.getTexto()+ publicacion.getTipoPublicacion());
    }

    public void conectarImpresora() {
        setEstadoImpresora(EstadoImpresora.CONECTADA);
    }
    @Override
    protected void desconectarImpresora() {
        setEstadoImpresora(EstadoImpresora.DESCONECTADA);
    }
    }
    