/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_management;

/**
 *
 * @author rohit
 */
class User {
    private int roll;
    private String subject,application,status;
    
    public User(int roll,String subject,String application,String status)
    {
        this.roll=roll;
        this.subject=subject;
        this.application=application;
        this.status=status;
        
    }
    public int getroll(){
        return roll;
    }
    public String getsubject(){
        return subject;
    }
    public String getapplication(){
        return application;
    }
    public String getstatus(){
        return status;
    }
}
