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

        
        Global.st.listainicial();
        Global.sw.listainicial();
        AI ai = new AI();
        Admin xd = new Admin(ai);

        ai.start();
        xd.start();

    }
    
}
