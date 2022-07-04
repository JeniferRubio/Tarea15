package Tarea15;

public class DocenteController 
{
    private Docente docente[];
    private int contador;
   
    public DocenteController(int size)
    
     {
         this.docente = new Docente[size];
 
         this.contador = 0;
     }
 
    public void crear(String nombre,String apellido,int dni, Integer fechaNacimiento, Integer anActual, String grado,String titulo)
     {
         this.docente[this.contador] = new Docente( nombre,apellido, dni,  fechaNacimiento,  anActual, grado,titulo );
 
         this.contador++;
     }
     public Docente buscar(int dni)
     {
         int i;
 
         for(i=0; i<this.contador; i++)
         {
             if(this.docente[i].getDni()==(dni))
             {
                 break;
             }
         }
 
         if(i == this.contador)
         {
             return null;
 
         } else {
 
             return this.docente[i];
         }
     }
     public void listar2()
     {
         for(int i=0; i<this.contador; i++)
         {
             this.docente[i].listarDocente();
         }
     }

     // estabamos probando
     public void eliminar(int dni)
     {
        int i; int band; 
        
        band=0;
        for(i=0; i<this.contador; i++)
        {
            if(this.docente[i].getDni()==(dni))
            {
                band=1;
            }
        }

        if(band==0)
        {
            System.out.println("elemento a eliminar no enconrado");

        } 
        if (band==1)
         {
             
            for(int j=i; i<this.contador-1; j++)
            
            docente[i]=docente[j+1];
        }
    }
    public void actulizado()
    {
    
        for(int i=0; i<this.contador; i++)
        {
           System.out.println(docente[i]);
        }

    }
     }
    
