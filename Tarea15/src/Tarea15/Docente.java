package Tarea15;
public class Docente extends Persona
{    private String grado;
     private String titulo;

    public Docente(String nombre,String apellido,int dni ,Integer fechaNacimiento , Integer anActual, String grado,String titulo)
    {
       super(nombre, apellido, dni, fechaNacimiento,anActual);
       this.grado= grado;
       this.titulo=titulo;
       
    }
    public void setgrado(String grado)
    {
        this.grado=grado;
    }
    public String getGrado()
    {
        return grado;
    }
    public void setTitulo(String titulo)
    {
       this.titulo= titulo;
    }
    public String getTitulo()
    {
      return titulo;  
    }
    public void listarDocente()
    {
    System.out.println ("\nnombresDocente: "+this.getNombre()+ 
    "\nApellidos: " +this.getApellido()+
    "\nDni:  "+this.getDni()+
    "\nAnio De Nac.: "+this.getFechaNacimiento()+
    "\nTitulo: "+this.getTitulo()+
    "\nGrado: "+this.getGrado()+
    "\nEdad: "+this.calcularEdad());
  }
    @Override
   public Integer calcularEdad()
  {
     return this.anActual - this.fechaNacimiento;
 
  }


    
}