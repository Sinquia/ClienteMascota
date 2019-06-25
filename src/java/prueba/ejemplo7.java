
package prueba;

import dao.MascotaDao;
import entidades.Mascota;
import managedBean.manageBean;

/**
 *
 *@author SINQUIA
 */
public class ejemplo7 {

    public static void main(String[] args) {
        // TODO code application logic here
        MascotaDao bean = new MascotaDao();
        Mascota mascota= new Mascota();
        //mascota.getIdMascota();
        //Mascota mascota = new Mascota(2, "masito", "Juan", "perro peruano");
       // bean.getMascota(mascota.getIdMascota());
       /* boolean res= bean.eliminarM(mascota);
        System.out.println(res);*/
    }
    
}
