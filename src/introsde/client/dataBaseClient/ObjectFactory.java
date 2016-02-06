
package introsde.client.dataBaseClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the introsde.client.dataBaseClient package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ReadPersonMeasureResponse_QNAME = new QName("http://ws.introsde/", "readPersonMeasureResponse");
    private final static QName _CreatePersonDailyGoalResponse_QNAME = new QName("http://ws.introsde/", "createPersonDailyGoalResponse");
    private final static QName _DeleteGoal_QNAME = new QName("http://ws.introsde/", "deleteGoal");
    private final static QName _ReadPersonMeasure_QNAME = new QName("http://ws.introsde/", "readPersonMeasure");
    private final static QName _GetPersonDailyGoals_QNAME = new QName("http://ws.introsde/", "getPersonDailyGoals");
    private final static QName _ReadPerson_QNAME = new QName("http://ws.introsde/", "readPerson");
    private final static QName _UpdateDailyGoalResponse_QNAME = new QName("http://ws.introsde/", "updateDailyGoalResponse");
    private final static QName _ReadPersonHistoryResponse_QNAME = new QName("http://ws.introsde/", "readPersonHistoryResponse");
    private final static QName _ReadPersonResponse_QNAME = new QName("http://ws.introsde/", "readPersonResponse");
    private final static QName _ReadPersonHistory_QNAME = new QName("http://ws.introsde/", "readPersonHistory");
    private final static QName _UpdateDailyGoal_QNAME = new QName("http://ws.introsde/", "updateDailyGoal");
    private final static QName _UpdatePersonMeasure_QNAME = new QName("http://ws.introsde/", "updatePersonMeasure");
    private final static QName _GetPersonDailyGoalsResponse_QNAME = new QName("http://ws.introsde/", "getPersonDailyGoalsResponse");
    private final static QName _ReadMeasureTypes_QNAME = new QName("http://ws.introsde/", "readMeasureTypes");
    private final static QName _CreatePersonDailyGoal_QNAME = new QName("http://ws.introsde/", "createPersonDailyGoal");
    private final static QName _SavePersonMeasure_QNAME = new QName("http://ws.introsde/", "savePersonMeasure");
    private final static QName _SavePersonMeasureResponse_QNAME = new QName("http://ws.introsde/", "savePersonMeasureResponse");
    private final static QName _GetPersonGoalsResponse_QNAME = new QName("http://ws.introsde/", "getPersonGoalsResponse");
    private final static QName _SaveGoalResponse_QNAME = new QName("http://ws.introsde/", "saveGoalResponse");
    private final static QName _DeleteDailyGoalResponse_QNAME = new QName("http://ws.introsde/", "deleteDailyGoalResponse");
    private final static QName _ReadPersonList_QNAME = new QName("http://ws.introsde/", "readPersonList");
    private final static QName _GetPersonGoals_QNAME = new QName("http://ws.introsde/", "getPersonGoals");
    private final static QName _DeleteDailyGoal_QNAME = new QName("http://ws.introsde/", "deleteDailyGoal");
    private final static QName _ReadPersonListResponse_QNAME = new QName("http://ws.introsde/", "readPersonListResponse");
    private final static QName _UpdatePersonMeasureResponse_QNAME = new QName("http://ws.introsde/", "updatePersonMeasureResponse");
    private final static QName _ReadMeasureTypesResponse_QNAME = new QName("http://ws.introsde/", "readMeasureTypesResponse");
    private final static QName _DeleteGoalResponse_QNAME = new QName("http://ws.introsde/", "deleteGoalResponse");
    private final static QName _SaveGoal_QNAME = new QName("http://ws.introsde/", "saveGoal");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: introsde.client.dataBaseClient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SaveGoal }
     * 
     */
    public SaveGoal createSaveGoal() {
        return new SaveGoal();
    }

    /**
     * Create an instance of {@link DeleteGoalResponse }
     * 
     */
    public DeleteGoalResponse createDeleteGoalResponse() {
        return new DeleteGoalResponse();
    }

    /**
     * Create an instance of {@link ReadMeasureTypesResponse }
     * 
     */
    public ReadMeasureTypesResponse createReadMeasureTypesResponse() {
        return new ReadMeasureTypesResponse();
    }

    /**
     * Create an instance of {@link DeleteDailyGoal }
     * 
     */
    public DeleteDailyGoal createDeleteDailyGoal() {
        return new DeleteDailyGoal();
    }

    /**
     * Create an instance of {@link ReadPersonListResponse }
     * 
     */
    public ReadPersonListResponse createReadPersonListResponse() {
        return new ReadPersonListResponse();
    }

    /**
     * Create an instance of {@link UpdatePersonMeasureResponse }
     * 
     */
    public UpdatePersonMeasureResponse createUpdatePersonMeasureResponse() {
        return new UpdatePersonMeasureResponse();
    }

    /**
     * Create an instance of {@link ReadPersonList }
     * 
     */
    public ReadPersonList createReadPersonList() {
        return new ReadPersonList();
    }

    /**
     * Create an instance of {@link GetPersonGoals }
     * 
     */
    public GetPersonGoals createGetPersonGoals() {
        return new GetPersonGoals();
    }

    /**
     * Create an instance of {@link DeleteDailyGoalResponse }
     * 
     */
    public DeleteDailyGoalResponse createDeleteDailyGoalResponse() {
        return new DeleteDailyGoalResponse();
    }

    /**
     * Create an instance of {@link SaveGoalResponse }
     * 
     */
    public SaveGoalResponse createSaveGoalResponse() {
        return new SaveGoalResponse();
    }

    /**
     * Create an instance of {@link GetPersonGoalsResponse }
     * 
     */
    public GetPersonGoalsResponse createGetPersonGoalsResponse() {
        return new GetPersonGoalsResponse();
    }

    /**
     * Create an instance of {@link SavePersonMeasure }
     * 
     */
    public SavePersonMeasure createSavePersonMeasure() {
        return new SavePersonMeasure();
    }

    /**
     * Create an instance of {@link SavePersonMeasureResponse }
     * 
     */
    public SavePersonMeasureResponse createSavePersonMeasureResponse() {
        return new SavePersonMeasureResponse();
    }

    /**
     * Create an instance of {@link CreatePersonDailyGoal }
     * 
     */
    public CreatePersonDailyGoal createCreatePersonDailyGoal() {
        return new CreatePersonDailyGoal();
    }

    /**
     * Create an instance of {@link GetPersonDailyGoalsResponse }
     * 
     */
    public GetPersonDailyGoalsResponse createGetPersonDailyGoalsResponse() {
        return new GetPersonDailyGoalsResponse();
    }

    /**
     * Create an instance of {@link ReadMeasureTypes }
     * 
     */
    public ReadMeasureTypes createReadMeasureTypes() {
        return new ReadMeasureTypes();
    }

    /**
     * Create an instance of {@link UpdateDailyGoal }
     * 
     */
    public UpdateDailyGoal createUpdateDailyGoal() {
        return new UpdateDailyGoal();
    }

    /**
     * Create an instance of {@link UpdatePersonMeasure }
     * 
     */
    public UpdatePersonMeasure createUpdatePersonMeasure() {
        return new UpdatePersonMeasure();
    }

    /**
     * Create an instance of {@link ReadPersonHistoryResponse }
     * 
     */
    public ReadPersonHistoryResponse createReadPersonHistoryResponse() {
        return new ReadPersonHistoryResponse();
    }

    /**
     * Create an instance of {@link UpdateDailyGoalResponse }
     * 
     */
    public UpdateDailyGoalResponse createUpdateDailyGoalResponse() {
        return new UpdateDailyGoalResponse();
    }

    /**
     * Create an instance of {@link ReadPersonHistory }
     * 
     */
    public ReadPersonHistory createReadPersonHistory() {
        return new ReadPersonHistory();
    }

    /**
     * Create an instance of {@link ReadPersonResponse }
     * 
     */
    public ReadPersonResponse createReadPersonResponse() {
        return new ReadPersonResponse();
    }

    /**
     * Create an instance of {@link ReadPerson }
     * 
     */
    public ReadPerson createReadPerson() {
        return new ReadPerson();
    }

    /**
     * Create an instance of {@link CreatePersonDailyGoalResponse }
     * 
     */
    public CreatePersonDailyGoalResponse createCreatePersonDailyGoalResponse() {
        return new CreatePersonDailyGoalResponse();
    }

    /**
     * Create an instance of {@link DeleteGoal }
     * 
     */
    public DeleteGoal createDeleteGoal() {
        return new DeleteGoal();
    }

    /**
     * Create an instance of {@link GetPersonDailyGoals }
     * 
     */
    public GetPersonDailyGoals createGetPersonDailyGoals() {
        return new GetPersonDailyGoals();
    }

    /**
     * Create an instance of {@link ReadPersonMeasure }
     * 
     */
    public ReadPersonMeasure createReadPersonMeasure() {
        return new ReadPersonMeasure();
    }

    /**
     * Create an instance of {@link ReadPersonMeasureResponse }
     * 
     */
    public ReadPersonMeasureResponse createReadPersonMeasureResponse() {
        return new ReadPersonMeasureResponse();
    }

    /**
     * Create an instance of {@link DailyGoal }
     * 
     */
    public DailyGoal createDailyGoal() {
        return new DailyGoal();
    }

    /**
     * Create an instance of {@link CurrentHealth }
     * 
     */
    public CurrentHealth createCurrentHealth() {
        return new CurrentHealth();
    }

    /**
     * Create an instance of {@link Goal }
     * 
     */
    public Goal createGoal() {
        return new Goal();
    }

    /**
     * Create an instance of {@link MeasureDefinition }
     * 
     */
    public MeasureDefinition createMeasureDefinition() {
        return new MeasureDefinition();
    }

    /**
     * Create an instance of {@link Measure }
     * 
     */
    public Measure createMeasure() {
        return new Measure();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.introsde/", name = "readPersonMeasureResponse")
    public JAXBElement<ReadPersonMeasureResponse> createReadPersonMeasureResponse(ReadPersonMeasureResponse value) {
        return new JAXBElement<ReadPersonMeasureResponse>(_ReadPersonMeasureResponse_QNAME, ReadPersonMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePersonDailyGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.introsde/", name = "createPersonDailyGoalResponse")
    public JAXBElement<CreatePersonDailyGoalResponse> createCreatePersonDailyGoalResponse(CreatePersonDailyGoalResponse value) {
        return new JAXBElement<CreatePersonDailyGoalResponse>(_CreatePersonDailyGoalResponse_QNAME, CreatePersonDailyGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.introsde/", name = "deleteGoal")
    public JAXBElement<DeleteGoal> createDeleteGoal(DeleteGoal value) {
        return new JAXBElement<DeleteGoal>(_DeleteGoal_QNAME, DeleteGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.introsde/", name = "readPersonMeasure")
    public JAXBElement<ReadPersonMeasure> createReadPersonMeasure(ReadPersonMeasure value) {
        return new JAXBElement<ReadPersonMeasure>(_ReadPersonMeasure_QNAME, ReadPersonMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonDailyGoals }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.introsde/", name = "getPersonDailyGoals")
    public JAXBElement<GetPersonDailyGoals> createGetPersonDailyGoals(GetPersonDailyGoals value) {
        return new JAXBElement<GetPersonDailyGoals>(_GetPersonDailyGoals_QNAME, GetPersonDailyGoals.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.introsde/", name = "readPerson")
    public JAXBElement<ReadPerson> createReadPerson(ReadPerson value) {
        return new JAXBElement<ReadPerson>(_ReadPerson_QNAME, ReadPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDailyGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.introsde/", name = "updateDailyGoalResponse")
    public JAXBElement<UpdateDailyGoalResponse> createUpdateDailyGoalResponse(UpdateDailyGoalResponse value) {
        return new JAXBElement<UpdateDailyGoalResponse>(_UpdateDailyGoalResponse_QNAME, UpdateDailyGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonHistoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.introsde/", name = "readPersonHistoryResponse")
    public JAXBElement<ReadPersonHistoryResponse> createReadPersonHistoryResponse(ReadPersonHistoryResponse value) {
        return new JAXBElement<ReadPersonHistoryResponse>(_ReadPersonHistoryResponse_QNAME, ReadPersonHistoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.introsde/", name = "readPersonResponse")
    public JAXBElement<ReadPersonResponse> createReadPersonResponse(ReadPersonResponse value) {
        return new JAXBElement<ReadPersonResponse>(_ReadPersonResponse_QNAME, ReadPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.introsde/", name = "readPersonHistory")
    public JAXBElement<ReadPersonHistory> createReadPersonHistory(ReadPersonHistory value) {
        return new JAXBElement<ReadPersonHistory>(_ReadPersonHistory_QNAME, ReadPersonHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDailyGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.introsde/", name = "updateDailyGoal")
    public JAXBElement<UpdateDailyGoal> createUpdateDailyGoal(UpdateDailyGoal value) {
        return new JAXBElement<UpdateDailyGoal>(_UpdateDailyGoal_QNAME, UpdateDailyGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.introsde/", name = "updatePersonMeasure")
    public JAXBElement<UpdatePersonMeasure> createUpdatePersonMeasure(UpdatePersonMeasure value) {
        return new JAXBElement<UpdatePersonMeasure>(_UpdatePersonMeasure_QNAME, UpdatePersonMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonDailyGoalsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.introsde/", name = "getPersonDailyGoalsResponse")
    public JAXBElement<GetPersonDailyGoalsResponse> createGetPersonDailyGoalsResponse(GetPersonDailyGoalsResponse value) {
        return new JAXBElement<GetPersonDailyGoalsResponse>(_GetPersonDailyGoalsResponse_QNAME, GetPersonDailyGoalsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadMeasureTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.introsde/", name = "readMeasureTypes")
    public JAXBElement<ReadMeasureTypes> createReadMeasureTypes(ReadMeasureTypes value) {
        return new JAXBElement<ReadMeasureTypes>(_ReadMeasureTypes_QNAME, ReadMeasureTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePersonDailyGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.introsde/", name = "createPersonDailyGoal")
    public JAXBElement<CreatePersonDailyGoal> createCreatePersonDailyGoal(CreatePersonDailyGoal value) {
        return new JAXBElement<CreatePersonDailyGoal>(_CreatePersonDailyGoal_QNAME, CreatePersonDailyGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SavePersonMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.introsde/", name = "savePersonMeasure")
    public JAXBElement<SavePersonMeasure> createSavePersonMeasure(SavePersonMeasure value) {
        return new JAXBElement<SavePersonMeasure>(_SavePersonMeasure_QNAME, SavePersonMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SavePersonMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.introsde/", name = "savePersonMeasureResponse")
    public JAXBElement<SavePersonMeasureResponse> createSavePersonMeasureResponse(SavePersonMeasureResponse value) {
        return new JAXBElement<SavePersonMeasureResponse>(_SavePersonMeasureResponse_QNAME, SavePersonMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonGoalsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.introsde/", name = "getPersonGoalsResponse")
    public JAXBElement<GetPersonGoalsResponse> createGetPersonGoalsResponse(GetPersonGoalsResponse value) {
        return new JAXBElement<GetPersonGoalsResponse>(_GetPersonGoalsResponse_QNAME, GetPersonGoalsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.introsde/", name = "saveGoalResponse")
    public JAXBElement<SaveGoalResponse> createSaveGoalResponse(SaveGoalResponse value) {
        return new JAXBElement<SaveGoalResponse>(_SaveGoalResponse_QNAME, SaveGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDailyGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.introsde/", name = "deleteDailyGoalResponse")
    public JAXBElement<DeleteDailyGoalResponse> createDeleteDailyGoalResponse(DeleteDailyGoalResponse value) {
        return new JAXBElement<DeleteDailyGoalResponse>(_DeleteDailyGoalResponse_QNAME, DeleteDailyGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.introsde/", name = "readPersonList")
    public JAXBElement<ReadPersonList> createReadPersonList(ReadPersonList value) {
        return new JAXBElement<ReadPersonList>(_ReadPersonList_QNAME, ReadPersonList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonGoals }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.introsde/", name = "getPersonGoals")
    public JAXBElement<GetPersonGoals> createGetPersonGoals(GetPersonGoals value) {
        return new JAXBElement<GetPersonGoals>(_GetPersonGoals_QNAME, GetPersonGoals.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDailyGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.introsde/", name = "deleteDailyGoal")
    public JAXBElement<DeleteDailyGoal> createDeleteDailyGoal(DeleteDailyGoal value) {
        return new JAXBElement<DeleteDailyGoal>(_DeleteDailyGoal_QNAME, DeleteDailyGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.introsde/", name = "readPersonListResponse")
    public JAXBElement<ReadPersonListResponse> createReadPersonListResponse(ReadPersonListResponse value) {
        return new JAXBElement<ReadPersonListResponse>(_ReadPersonListResponse_QNAME, ReadPersonListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.introsde/", name = "updatePersonMeasureResponse")
    public JAXBElement<UpdatePersonMeasureResponse> createUpdatePersonMeasureResponse(UpdatePersonMeasureResponse value) {
        return new JAXBElement<UpdatePersonMeasureResponse>(_UpdatePersonMeasureResponse_QNAME, UpdatePersonMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadMeasureTypesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.introsde/", name = "readMeasureTypesResponse")
    public JAXBElement<ReadMeasureTypesResponse> createReadMeasureTypesResponse(ReadMeasureTypesResponse value) {
        return new JAXBElement<ReadMeasureTypesResponse>(_ReadMeasureTypesResponse_QNAME, ReadMeasureTypesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.introsde/", name = "deleteGoalResponse")
    public JAXBElement<DeleteGoalResponse> createDeleteGoalResponse(DeleteGoalResponse value) {
        return new JAXBElement<DeleteGoalResponse>(_DeleteGoalResponse_QNAME, DeleteGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.introsde/", name = "saveGoal")
    public JAXBElement<SaveGoal> createSaveGoal(SaveGoal value) {
        return new JAXBElement<SaveGoal>(_SaveGoal_QNAME, SaveGoal.class, null, value);
    }

}
