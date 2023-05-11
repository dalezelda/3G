import java.io.*;
import java.util.ArrayList;

public class Problema {

    public static void main(String[] args) {

        BufferedReader br = null;
        BufferedWriter bw = null;

        Character letras [] = new Character [25];

        letras [0] = 'A';
        letras [1] = 'B';
        letras [2] = 'C';
        letras [3] = 'D';
        letras [4] = 'E';
        letras [5] = 'F';
        letras [6] = 'G';
        letras [7] = 'H';
        letras [8] = 'I';
        letras [9] = 'J';
        letras [10] = 'K';
        letras [11] = 'L';
        letras [12] = 'M';
        letras [13] = 'N';
        letras [14] = 'O';
        letras [15] = 'P';
        letras [16] = 'Q';
        letras [17] = 'R';
        letras [18] = 'S';
        letras [19] = 'T';
        letras [20] = 'U';
        letras [21] = 'V';
        letras [22] = 'W';
        letras [23] = 'X';
        letras [24] = 'Y';
        letras [25] = 'Z';

        try {
            br = new BufferedReader(new FileReader("mensaje.txt"));
            bw = new BufferedWriter(new FileWriter("mensaje_cifrado.txt"));

            String linea = null;

                        
            /* Lectura y validación  de clave */

            while ((linea = br.readLine()) != null) {
                StringBuilder sb = new StringBuilder(linea.length());


                /* Aquí vendría la lógica del programa */



                bw.write(sb.toString()); /* Escribe la cadena de caracteres en el fichero*/
                bw.newLine(); /* escribe nueva línea en el fichero */

            }
            System.out.println("El mensaje ha sido cifrado correctamente");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null)
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            if (bw != null)
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }

    }

}



