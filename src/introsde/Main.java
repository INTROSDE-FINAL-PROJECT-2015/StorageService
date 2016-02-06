package introsde.ws;

import java.util.List;
import introsde.client.dataBaseClient.*;


public class Main{

  public static void main(String[] args) {
    DataBaseServiceImplService dataBaseServiceImplService = new DataBaseServiceImplService();
    DataBaseService dataBaseService = dataBaseServiceImplService.getDataBaseServiceImplPort();
    // TODO M #1
    List<Person> personList = dataBaseService.readPersonList();

    for (Person p : personList){
      asd(p.getIdPerson() + " " + p.getFirstname() + " " + p.getLastname());
    }
    //System.out.println("Response:" + mailService.sendMail("kingokongo46@hotmail.it","OGGETTO E-MAIL","Contenuto e-mail"));

    // TODO M #2
    Person p  =  dataBaseService.readPerson(1);

    asd(p.getIdPerson() + " " + p.getLastname() + " ");
    List<Goal> gList = p.getGoals();

    for (Goal g : gList){
      asd(g.getValue()+ " " + g.getOperator() + " " + g.getValue() + " " + g.getMeasureDefinition().getMeasureType());
    }

    // TODO M #3
    List<Measure> measureList = dataBaseService.readPersonHistory(1,"height");
    for (Measure mea : measureList){
      asd(mea.getMeasureDefinition().getMeasureType() + " " + mea.getMeasureValue());
    }
    // TODO M #4
    List<Goal> goalList = dataBaseService.getPersonGoals(1);
    for (Goal g : goalList){
      asd(g.getValue()+ " " + g.getOperator() + " " + g.getValue() + " " + g.getMeasureDefinition().getMeasureType());
    }

    Goal gggoal = new Goal();
    gggoal.setValue("199");
    gggoal.setIdMeasureDefinition(1);
    gggoal.setOperator("lt");
    gggoal.setIdGoal(8);
    gggoal.setIdPerson(1);
    // TODO M #5
    Goal savedGoal = dataBaseService.saveGoal(gggoal);
    asd(savedGoal.getMeasureDefinition().getMeasureType());

    // TODO M #6
    List<DailyGoal> dailyGoals = dataBaseService.getPersonDailyGoals(1);
    for(DailyGoal dg : dailyGoals){
      System.out.println(dg.getQuestion());
    }

    DailyGoal dg = new DailyGoal();
    dg.setIdPerson(1);
    dg.setQuestion("questionTEST!?!?!?");

    // TODO M #7
    dg = dataBaseService.createPersonDailyGoal(1,dg);
    asd(dg.getIdGoal() + " " + dg.getIdPerson() + " " + dg.getQuestion());

    dg.setQuestion("CIAO sono la nuovaDomanda");
    // TODO M #8
    dg = dataBaseService.updateDailyGoal(dg);

    // TODO M #9
    List<MeasureDefinition> mdef = dataBaseService.readMeasureTypes();
    for (MeasureDefinition m : mdef){
      asd(m.getMeasureType() + " " + m.getMeasureValueType() + " ");
    }
    // TODO M #11
    //dataBaseService.deleteDailyGoal(6);
    //dataBaseService.deleteGoal(8);

  }

  public static void asd(String s){
    System.out.println(s);
  }
}
