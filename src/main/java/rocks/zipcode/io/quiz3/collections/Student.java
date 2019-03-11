package rocks.zipcode.io.quiz3.collections;

import rocks.zipcode.io.quiz3.objectorientation.enums.LabStatus;

import java.util.HashMap;
import java.util.Map;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
    Lab lb = new Lab();

    String labName= lb.getName();
    LabStatus LabStatus;





    Map<String,LabStatus> map = new HashMap<String ,LabStatus>();


    public Student() {



       this.map=map;
    }

    public Student(Map<String, LabStatus> map) {

        this.map=map;
    }

    public LabStatus getLab(String labName)
    {

        return map.get(labName);
    }

    public void setLabStatus(String labName, LabStatus labStatus) {

   this.labName=labName;
   this.LabStatus = labStatus;


    }


    public void forkLab(Lab lab) {
   //map.get(lab);
      lb.getName();

    }

    public LabStatus getLabStatus(String labName) {

        return map.get(labName);
       // throw new UnsupportedOperationException("Method not yet implemented");
    }
}
