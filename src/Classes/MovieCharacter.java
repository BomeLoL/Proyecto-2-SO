/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author kevin
 */
public class MovieCharacter {
    public int id; 
    public String name; 
    public int skillPoints;
    public int healthPoints;
    public int strengthPoints;
    public int agilityPoints;
    public int priority;  
    public int counter;

    public MovieCharacter(int id, String name) {
        this.id = id;   
        this.name = name;
        this.skillPoints = statPoints(0.6);
        this.healthPoints = statPoints(0.7);
        this.strengthPoints = statPoints(0.5);
        this.agilityPoints = statPoints(0.4);
        this.priority = prioritySetter();
        this.counter = 0;
    }
    
    private int statPoints (double probability){
        Random random = new Random();
        boolean nice = false;
        int finalPoints;
        if (random.nextDouble() < probability){
            nice = true; 
        }
        if (nice){
            finalPoints = (int) (Math.random() * 50) + 51;
        }else {
            finalPoints = (int) (Math.random() * 50) + 1;
        }
    return finalPoints;
    }
    
    
    private int prioritySetter (){
        int niceCounter = 0;
        int finalPriority;
        if (this.skillPoints >= 51){
            niceCounter ++; 
        }
        if (this.healthPoints >= 51){
            niceCounter ++; 
        }  
        if (this.strengthPoints >= 51){
            niceCounter ++; 
        }
        if (this.agilityPoints >= 51){
            niceCounter ++; 
        }
        if (niceCounter ==4 || niceCounter == 3){
            finalPriority = 1;
        } else if (niceCounter == 2 ){
            finalPriority = 2;
        } else{
            finalPriority =3;
        }
        
        return finalPriority;
    };
 
    public String printStats() {
        String content = "ID: " + this.id+ "\nname: " + this.name+ "\nskill: " + this.skillPoints + "\nhealth: " + this.healthPoints + "\nstrength: " + this.strengthPoints + "\nagility: " + this.agilityPoints;
        return content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSkillPoints() {
        return skillPoints;
    }

    public void setSkillPoints(int skillPoints) {
        this.skillPoints = skillPoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getStrengthPoints() {
        return strengthPoints;
    }

    public void setStrengthPoints(int strengthPoints) {
        this.strengthPoints = strengthPoints;
    }

    public int getAgilityPoints() {
        return agilityPoints;
    }

    public void setAgilityPoints(int agilityPoints) {
        this.agilityPoints = agilityPoints;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
 
}
