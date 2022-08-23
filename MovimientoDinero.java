import java.util.Scanner;

public class MovimientoDinero {
    private float monto;
    public String usuario, concepto;
    Scanner myObj = new Scanner(System.in);
    public MovimientoDinero(){

    }

    public MovimientoDinero(String usuario, float monto, String concepto) {
        this.monto = monto;
        this.concepto = concepto;
        this.usuario = usuario;
    }

    //NO UTILIZAR EN EL MAIN
    public void realizarMovimiento(){
        System.out.println("Ingrese su usuario:");
        usuario = myObj.nextLine();
        System.out.println("Ingrese el monto:");
        monto = Float.parseFloat(myObj.nextLine());
        System.out.println("Ingrese el concepto del movimiento del monto:");
        concepto = myObj.nextLine();
    }

    //NO UTILIZAR EN EL MAIN
    public void modificacionMonto(){
        System.out.println("Su monton actual es de $" + monto + " pesos, escriba el número 1='ADICIONAR' o 2='RETIRAR' para continuar con el movimiento del monto:");
        int movimiento = myObj.nextInt();
        if (movimiento == 1 ){
            System.out.println("Ingrese el monto a ADICIONAR a su monto actual:");
            float monto2 = myObj.nextFloat();
            monto = monto + monto2;
        } else if (movimiento == 2) {
            System.out.println("Ingrese el monto a RETIRAR de su monto actual:");
            float monto2 = myObj.nextFloat();
            monto = monto - monto2;
        } else {
            System.out.println("ERROR: Selecciono mal la opción para realizar la operación");
        }
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

}
