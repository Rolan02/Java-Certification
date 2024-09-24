/**
 * las importaciones de la libreria Java.lang no son necesarias ya que son automaticas.
 */
public class Main {
    static {
        System.out.println("step 1");
    }
    {
        System.out.println("step 2");
    }

    /**
     *
      * @param args recibe parametros en un array [] tambien puede decibir en forma de ...
      */
    public static void main(String... args) {
        new Main();
        System.out.println("Hola");

        //numeros binarios
        int x = 0b10;
        System.out.println(x);
        //numeros hexadecimales
        int h = 0x10;
        System.out.println(h);
    }
}