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
