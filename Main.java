public class Main {
    public static void main(String[] arg){
        Empresa empresa=new Empresa("Hospital Departamental de Villacicencio","Calle 37A#28-11",663347,89200501);
        System.out.println(empresa.getNombre_empresa());
        System.out.println(empresa.getDireccion());
        System.out.println(empresa.getTelefono());
        System.out.println(empresa.getNit());
        empresa.setNombre_empresa("Paola");
        empresa.setDireccion("Calle 7b # 43-77");
        empresa.setTelefono(32078762);
        empresa.setNit(1121958797);
    }
}
