
package prueba;

import dao.MascotaDao;

/**
 *
 * @author SINQUIA
 */
public class ejemplo6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MascotaDao mascotadao = new MascotaDao();
        int cantidad = mascotadao.CantidadMascota();
        System.out.println("Cantidad de mascotas:: "+cantidad);
        
    }
    
}
