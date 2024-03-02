package juegocenas;

import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class Dado {
    private int numero;

    public Dado() {
    }
    
    public void lanzar(Random r){
        numero = r.nextInt(6) + 1;
    }
    
    public void mostrar(JLabel lblDado){
        String nombreArchivo = "/imagenes/archivosparalaclase/" + String.valueOf(numero) + ".jpg";
        ImageIcon imagen = new ImageIcon(getClass().getResource(nombreArchivo));
        lblDado.setIcon(imagen);
    }
    
    public int obtenerNumero(){
        return numero;
    }
}
