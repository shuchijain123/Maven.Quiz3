package rocks.zipcode.io.quiz3.collections;

import rocks.zipcode.io.quiz3.objectorientation.enums.LabStatus;

import java.util.HashMap;
import java.util.Map;

/**
 * @author leon on 10/12/2018.
 */
public class Student{
    Lab lb = new Lab();

   //Lab labName = lb.getName();
    LabStatus labStatus;
    Lab labName ;





    Map<Lab,LabStatus> map = new HashMap<Lab ,LabStatus>();


    public Student() {



       this.map=map;
    }

    public Student(Map<Lab, LabStatus> map) {

        this.map=map;
    }

    public Lab getLab(String labName) {
        Lab val = null;


        for (Object o : map.keySet()) {
            if (map.get(o).equals(lb.getName())) {



            }
        }
        return val;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {

       Lab lab = getLab(labName);

          map.put(lab,labStatus);


    }


    public void forkLab(Lab  lab) {






    }

    public LabStatus getLabStatus(String labName) {

        return map.get(getLab(labName));
       // throw new UnsupportedOperationException("Method not yet implemented");
    }
}
