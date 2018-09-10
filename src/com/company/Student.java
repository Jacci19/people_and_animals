package com.company;

public class Student extends Person{

    private String indexNo;

    public Student(String firstName, String lastName, int age, String indexNo) {
        super(firstName, lastName, age);
        this.indexNo = indexNo;
    }


    public String getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(String indexNo) {
        this.indexNo = indexNo;
    }

    @Override
    public void emitSound() {
        System.out.println("WOOOW");
    }
}
