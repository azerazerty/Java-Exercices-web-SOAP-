
package ressources;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.0
 * Generated source version: 3.0
 * 
 */
@WebService(name = "DistService", targetNamespace = "http://distservice.dz/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface DistService {


    /**
     * 
     * @param arg0
     * @param arg1
     * @return
     *     returns float
     */
    @WebMethod(operationName = "CalcDistance")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "CalcDistance", targetNamespace = "http://distservice.dz/", className = "ressources.CalcDistance")
    @ResponseWrapper(localName = "CalcDistanceResponse", targetNamespace = "http://distservice.dz/", className = "ressources.CalcDistanceResponse")
    @Action(input = "http://distservice.dz/DistService/CalcDistanceRequest", output = "http://distservice.dz/DistService/CalcDistanceResponse")
    public float calcDistance(
        @WebParam(name = "arg0", targetNamespace = "")
        Point arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Point arg1);

}
