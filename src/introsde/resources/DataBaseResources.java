package introsde.rest.ehealth.resources;


import introsde.models.*;

import introsde.client.adapterClient.*;
import introsde.client.dataBaseClient.*;

import java.util.*;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.PathParam;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import java.text.SimpleDateFormat;
import java.text.ParseException;



@Stateless // only used if the the application is deployed in a Java EE container
@LocalBean // only used if the the application is deployed in a Java EE container
@Path("/internal")
public class DataBaseResources {
    @Context
    UriInfo uriInfo;
    @Context
    Request request;
    int id;

    //EntityManager entityManager; // only used if the application is deployed in a Java EE container

    private static DataBaseService getDataBaseService(){
        DataBaseServiceImplService dataBaseServiceImplService = new DataBaseServiceImplService();
        return dataBaseServiceImplService.getDataBaseServiceImplPort();
    }
    // Application integration


    @GET
    @Path("/people")
    @Produces({MediaType.APPLICATION_JSON })
    public List<Person> getPeople() {
        List<Person> peopleList = getDataBaseService().readPersonList();
        if (peopleList == null){
            return null;
            //Response res = Response.status(404).entity("404 Not Found").build();
            //throw new NotFoundException("ERROR ON ExternalApi",res);
        }
        return peopleList;
        }


    @GET
    @Path("/simplepeople")
    @Produces({MediaType.APPLICATION_JSON })
    public List<SimplePerson> getSimplePeople() {
        List<Person> peopleList = getDataBaseService().readPersonList();
        if (peopleList == null){
            return null;
            //Response res = Response.status(404).entity("404 Not Found").build();
            //throw new NotFoundException("ERROR ON ExternalApi",res);
        }
        List<SimplePerson> simplePersonList = new ArrayList<SimplePerson>();
        for (Person p : peopleList){
            simplePersonList.add(new SimplePerson(p));
        }
        return simplePersonList;
    }

    @GET
    @Path("people/{idPerson}")
    @Produces({MediaType.APPLICATION_JSON })
    public Person readPerson(@PathParam("idPerson") int idPerson){
        Person p = getDataBaseService().readPerson(idPerson);
        if (p == null){
            System.out.println("I am null!");
            return null;
            //throw new RuntimeException("Get: History for person " + id + " not found");
        }
        return p; //.getValue();
    }

    @GET
    @Path("people/{idPerson}/measure/{measureType}")
    @Produces({MediaType.APPLICATION_JSON })
    public List<Measure> readPersonHistory(@PathParam("idPerson") int idPerson,@PathParam("measureType") String measureType){
        List<Measure> mList = getDataBaseService().readPersonHistory(idPerson,measureType);
        if (mList == null)
            return null;
            //throw new RuntimeException("Get: History for person " + id + " not found");
        return mList;
    }

    @GET
    @Path("people/{idPerson}/goals")
    @Produces({MediaType.APPLICATION_JSON })
    public List<Goal> getPersonGoals(@PathParam("idPerson") int idPerson){
        List<Goal> gList = getDataBaseService().getPersonGoals(idPerson);
        if (gList == null)
            return null;
            //throw new RuntimeException("Get: History for person " + id + " not found");
        return gList;
    }

    @GET
    @Path("people/{idPerson}/dailygoals")
    @Produces({MediaType.APPLICATION_JSON })
    public List<DailyGoal> getPersonDailyGoals(@PathParam("idPerson") int idPerson){
        List<DailyGoal> dgList = getDataBaseService().getPersonDailyGoals(idPerson);
        if (dgList == null)
            return null;
            //throw new RuntimeException("Get: History for person " + id + " not found");
        return dgList;
    }

    @POST
    @Path("people/{idPerson}/goals")
    @Produces({ MediaType.APPLICATION_JSON })
    @Consumes({ MediaType.APPLICATION_JSON })
    public Goal saveGoal(Goal g){
        Goal savedGoal =  getDataBaseService().saveGoal(g);
        return savedGoal;
    }

    @POST
    @Path("people/{idPerson}/dailygoals")
    @Produces({ MediaType.APPLICATION_JSON })
    @Consumes({ MediaType.APPLICATION_JSON })
    public DailyGoal createPersonDailyGoal(@PathParam("idPerson") int idPerson, DailyGoal g){
        g.setIdPerson(idPerson);
        return getDataBaseService().createPersonDailyGoal(idPerson, g);
    }

    @POST
    @Path("people/dailygoals")
    @Produces({ MediaType.APPLICATION_JSON })
    @Consumes({ MediaType.APPLICATION_JSON })
    public DailyGoal updateDailyGoal(DailyGoal g){
        return getDataBaseService().updateDailyGoal(g);
    }

    @GET
    @Path("measuretypes")
    @Produces({ MediaType.APPLICATION_JSON })
    public List<MeasureDefinition> readMeasureTypes(){
        return getDataBaseService().readMeasureTypes();
    }

    @GET
    @Path("people/{idPerson}/measure/{measureType}/{mid}")
    public Measure readPersonMeasure(@PathParam("idPerson") int idPerson,@PathParam("measureType") String measureType,@PathParam("mid") int mid){
        return getDataBaseService().readPersonMeasure(idPerson,measureType,mid);
    }

    @POST
    @Path("people/{idPerson}/measure")
    public Measure savePersonMeasure(@PathParam("idPerson") int idPerson, Measure m){
        return getDataBaseService().savePersonMeasure(idPerson,m);
    }

    // TODO
    //public Measure updatePersonMeasure(int id, Measure m)


    @DELETE
    @Path("dailygoal/{dgid}")
    public void deleteDailyGoal(@PathParam("dgid") int dgid){
        getDataBaseService().deleteDailyGoal(dgid);
    }


    @DELETE
    @Path("goal/{gid}")
    public void deleteGoal(@PathParam("gid") int gid){
        getDataBaseService().deleteGoal(gid);
    }
}
