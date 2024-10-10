package mundopc;

import mundopc.modelo.Computadora;
import mundopc.modelo.Monitor;
import mundopc.modelo.Raton;
import mundopc.modelo.Teclado;
import mundopc.servicio.Orden;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class VentaComputadoraApp {
    public static void main(String[] args) {
     // Crear Objetos
        Raton ratonLenovo = new Raton("bluetooht", "Lenovo");
        //System.out.println(ratonLenovo);
        Teclado tecladoLenovo = new Teclado("bluetooth", " Lenovo");
       // System.out.println(tecladoLenovo);
        Monitor monitorLenovo = new Monitor("Lenovo", 27);
       // System.out.println(monitorLenovo);

        // Creamos un objeto de tipo Computadora
        Computadora computadoraLenovo = new Computadora("Computadora Lenovo", monitorLenovo, tecladoLenovo, ratonLenovo);
        System.out.println(computadoraLenovo);

        //Objeto computadora
        Monitor monitorDell = new Monitor("Dell", 19);
        Teclado tecladoDell = new Teclado("usb", "Dell");
        Raton ratonDell = new Raton("usb", "Dell");
        Computadora computadoraDell = new Computadora("Computadora Dell", monitorDell, tecladoDell, ratonDell);

        //Creamos una orden
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraLenovo);
        orden1.agregarComputadora(computadoraDell);
        orden1.mostrarOrden();
        // Objeto Computadora Mac
        Monitor monitorMac = new Monitor("Mac", 22);
        Teclado tecladoMac = new Teclado("Bluetooth", "Mac");
        Raton ratonMac = new Raton("Bluetooth", "Mac");
        Computadora computadoraIMac = new Computadora("iMac", monitorMac, tecladoMac, ratonMac);

        Orden orden2 = new Orden();
        orden2.agregarComputadora(computadoraLenovo);
        orden2.agregarComputadora(computadoraDell);
        orden2.agregarComputadora(computadoraIMac);
        System.out.println();
        orden2.mostrarOrden();

    }
}