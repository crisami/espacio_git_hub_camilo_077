
package tienda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Leer {

    
    @SuppressWarnings("finally")
	public static String pedirCadena()
    {
        InputStreamReader entrada=new InputStreamReader(System.in);
        BufferedReader teclado=new BufferedReader(entrada);
        String cadenaLeida="fallo";
        try
        {
            cadenaLeida=teclado.readLine();
        }
        catch (IOException e)
        {
            System.out.println("Ha habido un error en la entrada de datos, nos salimos del programa");
            System.exit(0);
        }
        finally
        {
            return cadenaLeida;
        }        
    } // Fin pedir cadena
    
    public static int pedirEntero()
    {
        String cadEntero;
        int num=0;
        boolean correcto=false;
        do
        {
        	cadEntero=pedirCadena();
            try {
                num=Integer.parseInt(cadEntero);
                correcto=true;
            }
            catch (NumberFormatException e)
            {
                System.out.println("Se ha insertado letras, en vez de n�meros."
                        + "Por favor, insertalo de nuevo");
            }
        }while (correcto==false);
        return num;
    } //Fin pedirEntero()
    
    public static long pedirLargo()
    {
        String cadLargo;
        long num=0;
        boolean correcto=false;
        do
        {
        	cadLargo=pedirCadena();
            try {
                num=Long.parseLong(cadLargo);
                correcto=true;
            }
            catch (NumberFormatException e)
            {
                System.out.println("Se ha insertado letras, en vez de n�meros."
                        + "Por favor, insertalo de nuevo");
            }
        }while (correcto==false);
        return num;
    } //Fin pedirLargo()
    
    @SuppressWarnings("finally")
	public static char pedirCaracter()
    {
        char cLeido=' ';
        InputStreamReader entrada=new InputStreamReader(System.in);
        BufferedReader teclado=new BufferedReader(entrada);
         try
        {
            cLeido=(char)teclado.read();
        }
        catch (IOException e)
        {
            System.out.println("HA HABIDO UN FALLO EN LA ENTRADA DE DATOS. NOS"  
                    + " SALIMOS DEL PROGRAMA ");
            System.exit(0);
        }
        finally
        {
            return cLeido;
        }        
    }//Fin pedirFloat()
    
    public static float pedirFloat()
    {
        String cadFloat;
        float numFloat=0;
        boolean correcto=false;
        do
        {
            cadFloat=pedirCadena();
            try {
                numFloat = Float.parseFloat(cadFloat);            	
                correcto=true;
            }
            catch (NumberFormatException e)
            {
                System.out.println("Se ha insertado letras, en vez de n�meros reales. Por favor, insertalo de nuevo");
            }
        }while (correcto==false);
        return numFloat;
    }  //Fin pedirEntero()
    
}