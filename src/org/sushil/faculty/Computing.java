package org.sushil.faculty;

import org.sushil.person.DepartmentHead;
import org.sushil.person.Teacher;

import java.util.ArrayList;

/**
 * Created by Sushil on Jan, 2019
 */

public class Computing extends Faculty {
    private DepartmentHead dh;


    public Computing(String facultyName, DepartmentHead dh) {
        super(facultyName);
        this.dh = dh;
    }

    public DepartmentHead getDh() {
        return dh;
    }

}
