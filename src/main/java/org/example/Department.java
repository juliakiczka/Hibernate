package org.example;
//JPA - Java Persistence API

import jakarta.persistence.*;

/*
Custom Annotations:
Entity is a row in DB, something what has id
based on this annotation Hibernate will use Department object as DB entity
this will allow for operations such as persist to be performed
*/
@Entity
//this annotation allows Hibernate to create/map our class to DB table
//one class = one table in DB
@Table(name = "department")
public class Department {
    //    ID - means that this field will be a primary, unique key in DB
    @Id
//  Hibernate will handle key generation for us
    @GeneratedValue
//    explicitly setting column name, if not used column name = field name
    @Column(name = "department_id")
    private int departmentID;
    @Column(name = "department_name", nullable = false)
    private String departmentName;

    //  Constructor without parameters is required in Hibernate!
    public Department() {
    }

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentID=" + departmentID +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
}
