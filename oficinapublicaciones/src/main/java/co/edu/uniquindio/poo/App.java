package co.edu.uniquindio.poo;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
    CentroImpresion centroImpresion = new CentroImpresion("Canaima ");
    OficinaPublicaciones oficinaPublicacion = new OficinaPublicaciones("Oficicina UQ");
    Computadora computador = new Computadora("1001", "compu", "asus", LocalDate.now(), 1200000);
    Camara camara = new Camara("1002", "camara", "Samsung", LocalDate.now(), 1080);
    ImpresoraLaser impresoraLaser = new ImpresoraLaser("1003", "impresora Laser", "samsung", LocalDate.now(), null, EstadoImpresora.DESCONECTADA);
    ImpresoraCartucho impresoraCartucho = new ImpresoraCartucho("1004", "impresora cartucho", "samsung", LocalDate.now(), null, EstadoImpresora.DESCONECTADA);
        Publicacion publicacion_1 = new Publicacion("Inteligencia Artificial", "La inteligencia artificial (IA), en el contexto de las ciencias de la computación, es una disciplina y un conjunto de capacidades cognoscitivas e intelectuales expresadas por sistemas informáticos o combinaciones de algoritmos cuyo propósito es la creación de máquinas que imiten la inteligencia humana para realizar tareas, y que pueden mejorar conforme recopilen información1. Desde su surgimiento poco después de la Segunda Guerra Mundial, la IA ha evolucionado y abarca una amplia variedad de subcampos. Estos van desde áreas de propósito general, aprendizaje y percepción, hasta otras más específicas como el reconocimiento de voz, el juego de ajedrez, la demostración de teoremas matemáticos, la escritura de poesía y el diagnóstico de enfermedades", null, TipoPublicacion.INFORME);
        Publicacion foto_camara = new Publicacion("Paisaje", "Una hemosa foto de peñas blancas", null, TipoPublicacion.FOTOS);

        oficinaPublicacion.agregarDispositivo(computador);
        oficinaPublicacion.agregarDispositivo(camara);
        oficinaPublicacion.agregarDispositivo(impresoraLaser);
        oficinaPublicacion.agregarDispositivo(impresoraCartucho);
        oficinaPublicacion.agregarPublicacion(publicacion_1);

        centroImpresion.agregarPublicacion(publicacion_1);
        centroImpresion.conectarImpresora(impresoraCartucho);
        centroImpresion.conectarImpresora(impresoraLaser);

        camara.imprimir(foto_camara);
        impresoraCartucho.imprimir(publicacion_1);
        impresoraLaser.imprimir(publicacion_1);
}
}