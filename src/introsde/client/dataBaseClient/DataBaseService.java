
package introsde.client.dataBaseClient;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "DataBaseService", targetNamespace = "http://ws.introsde/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface DataBaseService {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<introsde.client.dataBaseClient.Measure>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "readPersonHistory", targetNamespace = "http://ws.introsde/", className = "introsde.client.dataBaseClient.ReadPersonHistory")
    @ResponseWrapper(localName = "readPersonHistoryResponse", targetNamespace = "http://ws.introsde/", className = "introsde.client.dataBaseClient.ReadPersonHistoryResponse")
    @Action(input = "http://ws.introsde/DataBaseService/readPersonHistoryRequest", output = "http://ws.introsde/DataBaseService/readPersonHistoryResponse")
    public List<Measure> readPersonHistory(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<introsde.client.dataBaseClient.Goal>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPersonGoals", targetNamespace = "http://ws.introsde/", className = "introsde.client.dataBaseClient.GetPersonGoals")
    @ResponseWrapper(localName = "getPersonGoalsResponse", targetNamespace = "http://ws.introsde/", className = "introsde.client.dataBaseClient.GetPersonGoalsResponse")
    @Action(input = "http://ws.introsde/DataBaseService/getPersonGoalsRequest", output = "http://ws.introsde/DataBaseService/getPersonGoalsResponse")
    public List<Goal> getPersonGoals(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns introsde.client.dataBaseClient.Person
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "readPerson", targetNamespace = "http://ws.introsde/", className = "introsde.client.dataBaseClient.ReadPerson")
    @ResponseWrapper(localName = "readPersonResponse", targetNamespace = "http://ws.introsde/", className = "introsde.client.dataBaseClient.ReadPersonResponse")
    @Action(input = "http://ws.introsde/DataBaseService/readPersonRequest", output = "http://ws.introsde/DataBaseService/readPersonResponse")
    public Person readPerson(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @return
     *     returns java.util.List<introsde.client.dataBaseClient.Person>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "readPersonList", targetNamespace = "http://ws.introsde/", className = "introsde.client.dataBaseClient.ReadPersonList")
    @ResponseWrapper(localName = "readPersonListResponse", targetNamespace = "http://ws.introsde/", className = "introsde.client.dataBaseClient.ReadPersonListResponse")
    @Action(input = "http://ws.introsde/DataBaseService/readPersonListRequest", output = "http://ws.introsde/DataBaseService/readPersonListResponse")
    public List<Person> readPersonList();

    /**
     * 
     * @param arg0
     * @return
     *     returns introsde.client.dataBaseClient.Goal
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "saveGoal", targetNamespace = "http://ws.introsde/", className = "introsde.client.dataBaseClient.SaveGoal")
    @ResponseWrapper(localName = "saveGoalResponse", targetNamespace = "http://ws.introsde/", className = "introsde.client.dataBaseClient.SaveGoalResponse")
    @Action(input = "http://ws.introsde/DataBaseService/saveGoalRequest", output = "http://ws.introsde/DataBaseService/saveGoalResponse")
    public Goal saveGoal(
        @WebParam(name = "arg0", targetNamespace = "")
        Goal arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<introsde.client.dataBaseClient.DailyGoal>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPersonDailyGoals", targetNamespace = "http://ws.introsde/", className = "introsde.client.dataBaseClient.GetPersonDailyGoals")
    @ResponseWrapper(localName = "getPersonDailyGoalsResponse", targetNamespace = "http://ws.introsde/", className = "introsde.client.dataBaseClient.GetPersonDailyGoalsResponse")
    @Action(input = "http://ws.introsde/DataBaseService/getPersonDailyGoalsRequest", output = "http://ws.introsde/DataBaseService/getPersonDailyGoalsResponse")
    public List<DailyGoal> getPersonDailyGoals(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns introsde.client.dataBaseClient.DailyGoal
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createPersonDailyGoal", targetNamespace = "http://ws.introsde/", className = "introsde.client.dataBaseClient.CreatePersonDailyGoal")
    @ResponseWrapper(localName = "createPersonDailyGoalResponse", targetNamespace = "http://ws.introsde/", className = "introsde.client.dataBaseClient.CreatePersonDailyGoalResponse")
    @Action(input = "http://ws.introsde/DataBaseService/createPersonDailyGoalRequest", output = "http://ws.introsde/DataBaseService/createPersonDailyGoalResponse")
    public DailyGoal createPersonDailyGoal(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        DailyGoal arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns introsde.client.dataBaseClient.DailyGoal
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateDailyGoal", targetNamespace = "http://ws.introsde/", className = "introsde.client.dataBaseClient.UpdateDailyGoal")
    @ResponseWrapper(localName = "updateDailyGoalResponse", targetNamespace = "http://ws.introsde/", className = "introsde.client.dataBaseClient.UpdateDailyGoalResponse")
    @Action(input = "http://ws.introsde/DataBaseService/updateDailyGoalRequest", output = "http://ws.introsde/DataBaseService/updateDailyGoalResponse")
    public DailyGoal updateDailyGoal(
        @WebParam(name = "arg0", targetNamespace = "")
        DailyGoal arg0);

    /**
     * 
     * @return
     *     returns java.util.List<introsde.client.dataBaseClient.MeasureDefinition>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "readMeasureTypes", targetNamespace = "http://ws.introsde/", className = "introsde.client.dataBaseClient.ReadMeasureTypes")
    @ResponseWrapper(localName = "readMeasureTypesResponse", targetNamespace = "http://ws.introsde/", className = "introsde.client.dataBaseClient.ReadMeasureTypesResponse")
    @Action(input = "http://ws.introsde/DataBaseService/readMeasureTypesRequest", output = "http://ws.introsde/DataBaseService/readMeasureTypesResponse")
    public List<MeasureDefinition> readMeasureTypes();

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns introsde.client.dataBaseClient.Measure
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "readPersonMeasure", targetNamespace = "http://ws.introsde/", className = "introsde.client.dataBaseClient.ReadPersonMeasure")
    @ResponseWrapper(localName = "readPersonMeasureResponse", targetNamespace = "http://ws.introsde/", className = "introsde.client.dataBaseClient.ReadPersonMeasureResponse")
    @Action(input = "http://ws.introsde/DataBaseService/readPersonMeasureRequest", output = "http://ws.introsde/DataBaseService/readPersonMeasureResponse")
    public Measure readPersonMeasure(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns introsde.client.dataBaseClient.Measure
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "savePersonMeasure", targetNamespace = "http://ws.introsde/", className = "introsde.client.dataBaseClient.SavePersonMeasure")
    @ResponseWrapper(localName = "savePersonMeasureResponse", targetNamespace = "http://ws.introsde/", className = "introsde.client.dataBaseClient.SavePersonMeasureResponse")
    @Action(input = "http://ws.introsde/DataBaseService/savePersonMeasureRequest", output = "http://ws.introsde/DataBaseService/savePersonMeasureResponse")
    public Measure savePersonMeasure(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Measure arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns introsde.client.dataBaseClient.Measure
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updatePersonMeasure", targetNamespace = "http://ws.introsde/", className = "introsde.client.dataBaseClient.UpdatePersonMeasure")
    @ResponseWrapper(localName = "updatePersonMeasureResponse", targetNamespace = "http://ws.introsde/", className = "introsde.client.dataBaseClient.UpdatePersonMeasureResponse")
    @Action(input = "http://ws.introsde/DataBaseService/updatePersonMeasureRequest", output = "http://ws.introsde/DataBaseService/updatePersonMeasureResponse")
    public Measure updatePersonMeasure(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Measure arg1);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "deleteDailyGoal", targetNamespace = "http://ws.introsde/", className = "introsde.client.dataBaseClient.DeleteDailyGoal")
    @ResponseWrapper(localName = "deleteDailyGoalResponse", targetNamespace = "http://ws.introsde/", className = "introsde.client.dataBaseClient.DeleteDailyGoalResponse")
    @Action(input = "http://ws.introsde/DataBaseService/deleteDailyGoalRequest", output = "http://ws.introsde/DataBaseService/deleteDailyGoalResponse")
    public void deleteDailyGoal(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "deleteGoal", targetNamespace = "http://ws.introsde/", className = "introsde.client.dataBaseClient.DeleteGoal")
    @ResponseWrapper(localName = "deleteGoalResponse", targetNamespace = "http://ws.introsde/", className = "introsde.client.dataBaseClient.DeleteGoalResponse")
    @Action(input = "http://ws.introsde/DataBaseService/deleteGoalRequest", output = "http://ws.introsde/DataBaseService/deleteGoalResponse")
    public void deleteGoal(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

}
