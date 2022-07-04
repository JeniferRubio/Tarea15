package Tarea15;
public class Alumno extends Persona
{
    protected int codigo;

    public Alumno(String nombre,String apellido,int dni, Integer fechaNacimiento, Integer anActual, int codigo )
    {
       super(nombre,apellido,dni,fechaNacimiento,anActual);
       this.codigo=codigo;

    }
    public void setCodigo(int codigo)
   {
      this.codigo=codigo;  
   }
   public int getCodigo()
   {
    return codigo;
   }

   public void listarAlumno()
   {
   System.out.println("\nnombresAlumno: "+this.getNombre()+ 
   "\nApellidos: " +this.getApellido()+
   "\nDni:  "+this.getDni()+
   "\nAnio De Nac.: "+this.getFechaNacimiento()+
   "\nCOdigo:" +this.getCodigo()+
   "\nEdad: "+this.calcularEdad());
   }
 
 @Override
 public  Integer calcularEdad()
 {
   
   return this.anActual - this.fechaNacimiento;
 

   
 }
}
