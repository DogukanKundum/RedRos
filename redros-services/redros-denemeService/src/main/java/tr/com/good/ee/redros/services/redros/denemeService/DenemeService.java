package tr.com.good.ee.redros.services.redros.denemeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tr.com.good.ee.redros.dao.deneme.DenemeDaoImpl;
import tr.com.good.ee.redros.entities.deneme.DenemeImpl;
import tr.com.good.ee.redros.interfaces.service.deneme.IDenemeService;

import javax.transaction.Transactional;

/**
 * Created by DOGUKAN on 02.11.2018.
 */
@Service
@Transactional
@SuppressWarnings(value = "unchecked")
public class DenemeService implements IDenemeService{

    @Autowired
    private DenemeDaoImpl dao ;

    public String getFirstGetMethod(){
        DenemeImpl returnData = dao.firstGetMethod();
        return returnData.toString();
    }


}
