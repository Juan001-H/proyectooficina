package co.edu.uniquindio.poo;

import java.time.LocalDate;

public abstract class Impresora extends EquipoElectronico implements Imprimible {
    private final String modelo;
    private EstadoImpresora estadoImpresora;

    public Impresora(String codigo, String nombre, String marca, LocalDate fechaAdquisicion, String modelo,
            EstadoImpresora estadoImpresora) {
        super(codigo, nombre, marca, fechaAdquisicion);
        this.modelo = modelo;
        this.estadoImpresora = estadoImpresora;
        
    }

    public String getModelo() {
        return modelo;
    }

    public EstadoImpresora getEstadoImpresora() {
        return estadoImpresora;
    }

    public void setEstadoImpresora(EstadoImpresora estadoImpresora) {
        this.estadoImpresora = estadoImpresora;
    }

    public abstract void conectarImpresora();

    protected abstract void desconectarImpresora();

    
}
