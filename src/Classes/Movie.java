/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import DataEstructure.List;
import DataEstructure.Queue;
import java.util.Set;

/**
 *
 * @author kevin
 */
public class Movie {
    public String name; 
    public List totalCharacterList;
    public Queue firstPriority;
    public Queue secondPriority;
    public Queue thirdPriority;
    public Queue reinforcment;

    public Movie(String name) {
        this.name = name;
        this.firstPriority = new Queue();
        this.secondPriority = new Queue();
        this.thirdPriority = new Queue();
        this.reinforcment = new Queue();
    }
    
    public void listainicial(){
        List lista = new List();
        Global global = new Global();
        if (this.name.equals("Star Wars")){
        for (int i = 0; i < global.star_wars_characters_names.length; i++) {
            MovieCharacter character1 = new MovieCharacter(global.sizeId, global.star_wars_characters_names[i]);
            global.setSizeId(global.getSizeId()+1);
            //System.out.println(name);
            lista.insertBegin(character1);
            //System.out.println(character1.printStats()+"\n");
        }}else{
        for (int i = 0; i < global.star_trek_characters_names.length; i++) {
            MovieCharacter character1 = new MovieCharacter(global.sizeId, global.star_trek_characters_names[i]);
            global.setSizeId(global.getSizeId()+1);
            //System.out.println(name);
            lista.insertBegin(character1);
            //System.out.println(character1.printStats()+"\n");
        }
        }
            setTotalCharacterList(lista);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getTotalCharacterList() {
        return totalCharacterList;
    }

    public void setTotalCharacterList(List totalCharacterList) {
        this.totalCharacterList = totalCharacterList;
    }

    public Queue getFirstPriority() {
        return firstPriority;
    }

    public void setFirstPriority(Queue firstPriority) {
        this.firstPriority = firstPriority;
    }

    public Queue getSecondPriority() {
        return secondPriority;
    }

    public void setSecondPriority(Queue secondPriority) {
        this.secondPriority = secondPriority;
    }

    public Queue getThirdPriority() {
        return thirdPriority;
    }

    public void setThirdPriority(Queue thirdPriority) {
        this.thirdPriority = thirdPriority;
    }

    public Queue getReinforcment() {
        return reinforcment;
    }

    public void setReinforcment(Queue reinforcment) {
        this.reinforcment = reinforcment;
    }
}
