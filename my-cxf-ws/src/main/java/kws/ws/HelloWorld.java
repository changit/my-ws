package kws.ws;

import javax.jws.WebService;

/**
 * Created by IntelliJ IDEA.
 * User: uchan
 * Date: 7/23/11
 * Time: 3:24 PM
 * To change this template use File | Settings | File Templates.
 */
@WebService
public interface HelloWorld {

    void sayHello();
    
    Response payBill(Request request);
    
}
