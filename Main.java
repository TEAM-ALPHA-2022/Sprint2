import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        // Empresa
            System.out.println("------------------------------------------");
            System.out.println("CLASE EMPRESA");
            System.out.println("------------------------------------------");
            System.out.println("*Instancia Principal* - (Empresa)");
            System.out.println("");
        Empresa emp = new Empresa("Alpha Co","Carrera 30","3001234567","909.101.303-3");
        System.out.println("Nombre de Empresa : "+ emp.getNombre_empresa()+"\nDirección: "+emp.getDireccion()+"\nTeléfono: "+emp.getTelefono()+"\nNIT: "+emp.getNit());
        String NombreNuevo = "Alpha LLC";
        String DireccionNueva = "Avenida Caracas";
        String TelefonoNuevo= "3009876543";
        String NitNuevo = "901.202.404-4";
        emp.setNombre_empresa(NombreNuevo);
        emp.setDireccion(DireccionNueva);
        emp.setTelefono(TelefonoNuevo);
        emp.setNit(NitNuevo);
            System.out.println("");
            System.out.println("*Instancia Modificada* - (Empresa)");
            System.out.println("");
        System.out.println("Nombre de Empresa : "+ emp.getNombre_empresa()+"\nDirección: "+emp.getDireccion()+"\nTeléfono: "+emp.getTelefono()+"\nNIT: "+emp.getNit());

        // Empleado
            System.out.println("");
            System.out.println("------------------------------------------");
            System.out.println("CLASE EMPLEADO");
            System.out.println("------------------------------------------");
            System.out.println("*Instancia Principal* - (Empleado)");
            System.out.println("");
            Empleado empl = new Empleado("Pepe","pepe@gmail.com","Google","Junior Developer");
            System.out.println("Nombre del Empleado : "+ empl.getNombre_empleado()+"\nCorreo: "+empl.getEmail_empleado()+"\nNombre de la Empresa: "+empl.getEmpresa_empleado()+"\nRol del Empleado: "+empl.getRol_empleado());
            String NuevoNombreEmpleado = "Juan";
            String NuevoEmailEmpleado = "pepe@outlook.com";
            String NuevaEmpresaEmpleado = "Microsoft";
            String NuevoRolEmpleado = "Senior Developer";
            empl.setNombre_empleado(NuevoNombreEmpleado);
            empl.setEmail_empleado(NuevoEmailEmpleado);
            empl.setEmpresa_empleado(NuevaEmpresaEmpleado);
            empl.setRol_empleado(NuevoRolEmpleado);
            System.out.println("");
            System.out.println("*Instancia Modificada* - (Empleado)");
            System.out.println("");
            System.out.println("Nombre del Empleado : "+ empl.getNombre_empleado()+"\nCorreo: "+empl.getEmail_empleado()+"\nNombre de la Empresa: "+empl.getEmpresa_empleado()+"\nRol del Empleado: "+empl.getRol_empleado());

        // MovimientoDinero
            System.out.println("");
            System.out.println("------------------------------------------");
            System.out.println("CLASE MOVIMIENTO DINERO");
            System.out.println("------------------------------------------");
            System.out.println("*Instancia Principal* - (Movimiento Dinero)");
            System.out.println("");
        MovimientoDinero mov = new MovimientoDinero("User1",1000000,"Retirar dinero");
        System.out.println("Nombre del Usuario : "+ mov.getUsuario()+"\nMonto: $"+mov.getMonto()+"\nConcepto del movimiento: "+mov.getConcepto());
        String NuevoUsuario = "User2";
        float NuevoMonto = 2500000;
        String NuevoConcepto = "Ingresar dinero";
        mov.setUsuario(NuevoUsuario);
        mov.setMonto(NuevoMonto);
        mov.setConcepto(NuevoConcepto);
            System.out.println("");
            System.out.println("*Instancia Modificada* - (Movimiento Dinero)");
            System.out.println("");
        System.out.println("Nombre del Usuario : "+ mov.getUsuario()+"\nMonto: $"+mov.getMonto()+"\nConcepto del movimiento: "+mov.getConcepto());


    }
}
