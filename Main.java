public class Main {
    public static void main(String[] args) {
        // Prueba en Main para la clase Empresa.
        Empresa emp = new Empresa("Alpha Co","Carrera 30","3001234567","909.101.303-3");
        System.out.println(emp.getNombre_empresa()+", "+emp.getDireccion()+", "+emp.getTelefono()+", "+emp.getNit());
        String NombreNuevo = "Alpha LLC";
        String DireccionNueva = "Avenida Caracas";
        String TelefonoNuevo= "3009876543";
        String NitNuevo = "901.202.404-4";
        emp.setNombre_empresa(NombreNuevo);
        emp.setDireccion(DireccionNueva);
        emp.setTelefono(TelefonoNuevo);
        emp.setNit(NitNuevo);
        System.out.println(emp.getNombre_empresa()+", "+emp.getDireccion()+", "+emp.getTelefono()+", "+emp.getNit());

        // Prueba en Main para la clase MovimientoDinero
        MovimientoDinero mov = new MovimientoDinero("User1",1.0f,"Retirar dinero");
        System.out.println(mov.getUsuario()+", "+mov.getMonto()+", "+mov.getConcepto());
        String NuevoUsuario = "User2";
        float NuevoMonto = 2.0f;
        String NuevoConcepto = "Ingresar dinero";
        mov.setUsuario(NuevoUsuario);
        mov.setMonto(NuevoMonto);
        mov.setConcepto(NuevoConcepto);
        System.out.println(mov.getUsuario()+", "+mov.getMonto()+", "+mov.getConcepto());

        // Prueba en Main para la clase Empleado
        Empleado empl = new Empleado("Pepe","pepe@gmail.com","Google","Junior Developer");
        System.out.println(empl.getNombre_empleado()+", "+empl.getEmail_empleado()+", "+empl.getEmpresa_empleado()+", "+empl.getRol_empleado());
        String NuevoNombreEmpleado = "Juan";
        String NuevoEmailEmpleado = "pepe@outlook.com";
        String NuevaEmpresaEmpleado = "Microsoft";
        String NuevoRolEmpleado = "Senior Developer";
        empl.setNombre_empleado(NuevoNombreEmpleado);
        empl.setEmail_empleado(NuevoEmailEmpleado);
        empl.setEmpresa_empleado(NuevaEmpresaEmpleado);
        empl.setRol_empleado(NuevoRolEmpleado);
        System.out.println(empl.getNombre_empleado()+", "+empl.getEmail_empleado()+", "+empl.getEmpresa_empleado()+", "+empl.getRol_empleado());

        //MovimientoDinero mov = new MovimientoDinero(); // En esta línea estoy probando el metodo realizarMovimiento de clase MovimientoDinero
        //mov.realizarMovimiento();
    }
}
