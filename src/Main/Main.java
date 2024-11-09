/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Classes.AI;
import Classes.Admin;
import Classes.Global;
import Classes.Movie;
import Classes.MovieCharacter;
import DataEstructure.Node;
import DataEstructure.Queue;
import java.util.Random;

/**
 *
 * @author kevin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Global global = new Global();
        
        System.out.println(global.star_trek_characters_names[1]);
        MovieCharacter a = new MovieCharacter(1,"a");
        MovieCharacter b = new MovieCharacter(2,"b");
        MovieCharacter c = new MovieCharacter(3,"c");
        MovieCharacter d = new MovieCharacter(4,"d");
        Queue q = new Queue();
        q.enqueue(a);
        q.enqueue(b);
        q.enqueue(c);
        q.enqueue(d);
        q.print();

        System.out.println("\n\n\n\n\n\n--------------------------");
        Node ewew= q.delete((q.getFirst().getNext().getNext()));
        q.print();
        System.out.println("\n\n\n\n\n\n--------------------------");
        System.out.println(ewew.getElement().printStats());
        
        
        Movie st = new Movie("Star Trek");
        st.listainicial();
        Movie sw = new Movie("Star Wars");
        sw.listainicial();
        AI ai = new AI();
        Admin xd = new Admin(ai);
        sw.totalCharacterList.imprimir();
        //x.start();

    }
    
}
