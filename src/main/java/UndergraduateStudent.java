/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sem
 */
public class UndergraduateStudent extends Student{
    
    private int year;

    public UndergraduateStudent(String studentID, String firstName, String lastName, int year) {
        super(studentID, firstName, lastName);
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    
    
    
    
}
