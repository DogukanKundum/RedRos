package tr.com.good.ee.redros.dao.deneme;

import org.springframework.stereotype.Repository;
import tr.com.good.ee.redros.entities.deneme.DenemeImpl;

/**
 * Created by DOGUKAN on 02.11.2018.
 */
@Repository
public class DenemeDaoImpl {


    public DenemeImpl firstGetMethod(){
        DenemeImpl deneme = new DenemeImpl();
        deneme.setId(1L);
        deneme.setAciklama("Merhaba Hoşgeldin.");
        return deneme;
    }
}
