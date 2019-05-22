/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author New
 */
public class PartTimeStudent extends Student {
    private int noofhrs;
    public PartTimeStudent(String name, String stdid,int hrs )
    {
           super(name,stdid);
           hrs;
    }
    public int getnoofhrs(){
         return noofhrs;
    }
    public void setnoofhrs(int noofhrs){
        this.noofhrs=noofhrs;
    }
    
}
