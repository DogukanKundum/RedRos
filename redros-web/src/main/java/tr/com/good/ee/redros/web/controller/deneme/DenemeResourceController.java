package tr.com.good.ee.redros.web.controller.deneme;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tr.com.good.ee.redros.interfaces.service.deneme.IDenemeService;

/**
 * Created by DOGUKAN on 03.11.2018.
 */
@RestController
@RequestMapping("Deneme")
public class DenemeResourceController {

    @Autowired
    private IDenemeService service ;


    @RequestMapping(value = "/firstGetMethod", method = RequestMethod.GET)
    public String firstGetMethod(){
        return service.getFirstGetMethod();
    }
}
