package org.example;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table(name = "worker")
public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "worker_id")
    private int workerId;

    //@Transient - used in case if we do not want to map/have column firstName in Worker table
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "hire_date")
    private LocalDate hireDate;

    //Creates one to one relationship between worker and department.
    //cascade save and delete operations
    @OneToOne(cascade = CascadeType.PERSIST)
    //Join column allows Hibernate to create foreign key
    @JoinColumn(name = "dep_id", referencedColumnName = "department_id")
    private Department department;

    public Worker() {}

    public Worker(int workerId, String firstName, String lastName, LocalDate hireDate, Department department) {
        this.workerId = workerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.hireDate = hireDate;
        this.department = department;
    }

    public int getWorkerId() {
        return workerId;
    }

    public void setWorkerId(int workerId) {
        this.workerId = workerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "workerId=" + workerId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", hireDate=" + hireDate +
                ", department=" + department +
                '}';
    }
}