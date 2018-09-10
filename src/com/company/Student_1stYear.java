package com.company;

public class Student_1stYear extends Student{
    private int matureScore;

    public Student_1stYear(String firstName, String lastName, int age, String indexNo, int matureScore) {
        super(firstName, lastName, age, indexNo);
        this.matureScore = matureScore;
    }

    public int getMatureScore() {
        return matureScore;
    }

    public void setMatureScore(int matureScore) {
        this.matureScore = matureScore;
    }
}
