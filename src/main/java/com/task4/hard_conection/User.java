package com.task4.hard_conection;

import com.task4.hard_conection.description.AgeThirty;
import com.task4.hard_conection.description.NameKira;
import com.task4.hard_conection.description.StatusStudent;

public class User {
   AgeThirty ageThirty = new AgeThirty();
   NameKira name = new NameKira();
   StatusStudent statusStudent= new StatusStudent();

    public AgeThirty getAgeThirty() {
        return ageThirty;
    }

    public void setAgeThirty(AgeThirty ageThirty) {
        this.ageThirty = ageThirty;
    }

    public NameKira getName() {
        return name;
    }

    public void setName(NameKira name) {
        this.name = name;
    }

    public StatusStudent getStatusStudent() {
        return statusStudent;
    }

    public void setStatusStudent(StatusStudent statusStudent) {
        this.statusStudent = statusStudent;
    }

    public void canDo () {
        name.getName();
        ageThirty.getAge();
        statusStudent.getStatus();
    }



}