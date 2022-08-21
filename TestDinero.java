public class TestDinero {

    //!!! NOTA: ESTA CLASE ES PARA TESTEAR EL CODIGO DE LA CLASE DINERO - RAMA DEVELOPMENT!!!

    public static void main(String[] args) {
//      Simulación de Movimiento de Dinero
//      1. Instancia de la clase Movimiento Dinero
        MovimientoDinero movimiento1 = new MovimientoDinero();
        MovimientoDinero movimiento2 = new MovimientoDinero("userTest",100000,"concepTest");
        MovimientoDinero movimiento3 = new MovimientoDinero("userTest2",-45000,"concepTest2");
        //\2. Leer y modificar el monto del dinero
        //2.1) Forma básica
        System.out.println("MONTO");
        System.out.println("--------------------------------------------------------");
        System.out.println();
        System.out.println("MONTO 1 OPCIÓN");
        System.out.println("--------------------------------------------------------");
        System.out.println("El monto es de: $" + movimiento2.getMonto() + " pesos");
        movimiento2.setMonto(25000);
        System.out.println("El monto modificado es de: $" + movimiento2.getMonto() + " pesos");
        System.out.println("--------------------------------------------------------");
        System.out.println();
        System.out.println("MONTO 2 OPCIÓN");
        System.out.println("--------------------------------------------------------");
        //2.2) Forma dinámica
        movimiento1.realizarMovimiento();
        movimiento1.modificacionMonto();
        System.out.println("El monto modificado es de: $" + movimiento1.getMonto() + " pesos");
        System.out.println();
        System.out.println();

        //3.Montos negativos y positivos
        System.out.println("MONTO NEGATIVOS");
        System.out.println(movimiento3.getMonto());
        System.out.println("MONTO POSITIVOS");
        System.out.println(movimiento2.getMonto());
        System.out.println();
        System.out.println();

        //4.Concepto del movimiento
        System.out.println("LEER CONCEPTO DEL MOVIMIENTO");
        System.out.println(movimiento2.getConcepto());
        System.out.println("MODIFICAR CONCEPTO DEL MOVIMIENTO");
        movimiento2.setConcepto("Concepto modificado");
        System.out.println(movimiento2.getConcepto());
        System.out.println();
        System.out.println();

        //5. Definir usuario encargado del movimiento
        System.out.println("El usuario encargado del movimiento fue: " + movimiento2.getUsuario());

    }
}
