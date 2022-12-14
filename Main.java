
public class Main {
    public static void main(String[] args) {
        //EMPRESA
        System.out.println("------------------------------------------");
        System.out.println("CLASE EMPRESA");
        System.out.println("------------------------------------------");
        System.out.println("*Instancia Principal* - (Empresa)");
        System.out.println(" ");
        Empresa emp = new Empresa("Alpha Co","Carrera 30","3001234567","909.101.303-3");
        System.out.println("Nombre de Empresa : "+ emp.getNombre()+"\nDirección: "+emp.getDireccion()+"\nTeléfono: "+emp.getTelefono()+"\nNIT: "+emp.getNit());
        String NombreNuevo = "Alpha LLC";
        String DireccionNueva = "Avenida Caracas";
        String TelefonoNuevo= "3009876543";
        String NitNuevo = "901.202.404-4";
        emp.setNombre(NombreNuevo);
        emp.setDireccion(DireccionNueva);
        emp.setTelefono(TelefonoNuevo);
        emp.setNit(NitNuevo);
        System.out.println(" ");
        System.out.println("*Instancia Modificada* - (Empresa)");
        System.out.println(" ");
        System.out.println("Nombre de Empresa : "+ emp.getNombre()+"\nDirección: "+emp.getDireccion()+"\nTeléfono: "+emp.getTelefono()+"\nNIT: "+emp.getNit());

        //EMPLEADO
        System.out.println(" ");
        System.out.println("------------------------------------------");
        System.out.println("CLASE EMPLEADO");
        System.out.println("------------------------------------------");
        System.out.println("*Instancia Principal* - (Empleado)");
        System.out.println(" ");
        Empleado empleado1 = new Empleado("Michael","michael@gmail.com", emp , "Administrativo");
        System.out.println("Nombre del Empleado : "+ empleado1.getNombre()+"\nCorreo: "+empleado1.getEmail()+"\nNombre de la Empresa: "+ emp.getNombre() +"\nRol del Empleado: "+ empleado1.getRol());
        String NuevoNombreEmpleado = "Juan";
        String NuevoEmailEmpleado = "juan@outlook.com";
        String NuevaEmpresaEmpleado = "Alpha CO";
        String NuevoRolEmpleado = "Operativo";
        empleado1.setNombre(NuevoNombreEmpleado);
        empleado1.setEmail(NuevoEmailEmpleado);
        emp.setNombre(NuevaEmpresaEmpleado);
        empleado1.setRol(NuevoRolEmpleado);
        System.out.println(" ");
        System.out.println("*Instancia Modificada* - (Empleado)");
        System.out.println(" ");
        System.out.println("Nombre del Empleado : "+ empleado1.getNombre()+"\nCorreo: "+empleado1.getEmail()+"\nNombre de la Empresa: "+ emp.getNombre() +"\nRol del Empleado: "+ empleado1.getRol());

        //MOVIMIENTO DE DINERO
        System.out.println(" ");
        System.out.println("------------------------------------------");
        System.out.println("CLASE MOVIMIENTO DINERO");
        System.out.println("------------------------------------------");
        System.out.println("*Instancia Principal* - (Movimiento Dinero)");
        System.out.println(" ");
        MovimientoDinero movd = new MovimientoDinero(100000f,"Movimiento Test", empleado1);
        System.out.println("Nombre del Usuario : "+ empleado1.getNombre() +"\nMonto: $"+movd.getMonto()+"\nConcepto del movimiento: "+movd.getConcepto());
        String NuevoUsuario = "User2";
        float NuevoMonto = 2500000;
        String NuevoConcepto = "Ingresar dinero";
        empleado1.setNombre(NuevoUsuario);
        movd.setMonto(NuevoMonto);
        movd.setConcepto(NuevoConcepto);
        System.out.println(" ");
        System.out.println("*Instancia Modificada* - (Movimiento Dinero)");
        System.out.println(" ");
        System.out.println("Nombre del Usuario : "+ empleado1.getNombre() +"\nMonto: $"+movd.getMonto()+"\nConcepto del movimiento: "+movd.getConcepto());
    }
}
