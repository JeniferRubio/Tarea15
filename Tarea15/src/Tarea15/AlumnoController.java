package Tarea15;

public class AlumnoController 
{
   private Alumno alumno[];
   private int contador;
   public AlumnoController(int size)
   
    {
        this.alumno = new Alumno[size];

        this.contador = 0;
    }

    public void crearAlum(String nombre,String apellido,int dni, Integer fechaNacimiento, Integer anActual, int codigo)
    {
        this.alumno[this.contador] = new Alumno( nombre,apellido, dni,fechaNacimiento,  anActual, codigo );

        this.contador++;
    }

    public Alumno buscarAlum(int dni1)
    {
        int i;

        for(i=0; i<this.contador; i++)
        {
            if(this.alumno[i].getDni()==(dni1))
            {
                break;
            }
        }

        if(i == this.contador)
        {
            return null;

        } else {

            return this.alumno[i];
        }
    }

    public void listar()
    {
        for(int i=0; i<this.contador; i++)
        {
            this.alumno[i].listarAlumno();
        }
    }

   }