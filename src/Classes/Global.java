/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import DataEstructure.List;
import DataEstructure.Node;
import java.util.concurrent.Semaphore;

/**
 *
 * @author kevin
 */
public class Global {
    final static Semaphore SAdmin = new Semaphore(0);
    final static Semaphore SAI = new Semaphore(0);
    public static int reviewCount = 0;
    public static int winStarWars =0;
    public static int winStarTrek =0;
    public static int sizeId =0;
    public static Node IdStarWars ;
    public static Node IdStarTrek;
    public static List ganadores = new List();
    public static Movie sw = new Movie("Star Wars");
    public static Movie st = new Movie("Star Trek");

    public static String[] star_wars_characters_names = {
        "Emperador", "Mace Windu", "Grand Moff Tarkin", "Chewbacca", "Admiral Ackbar",
        "K-2SO", "C-3PO", "Darth Maul", "Obi-Wan Kenobi", "R2-D2",
        "Luke Skywalker", "Princesa Leia", "Yoda", "Darth Vader", "Han Solo",
        "Ahsoka Tano", "Boba Fett", "Qui-Gon Jinn", "Anakin Skywalker", "Conde Dooku"
    };
    
    public static String[] star_trek_characters_names = {
        "Spock","Garak","Kai Winn","Data","EMH",
        "James T. Kirk","Jean-Luc Picard","Phlox","Benjamin Sisko","Kira",
        "T'Pol","Weyoun","Tuvok","Seven of Nine","Geordi La Forge",
        "Q","Kira Nerys","Leonard-Bones-McCoy","Miles O'Brien","Odo"
    };
    

    
    public static Movie getSw() {
        return sw;
    }

    public static void setSw(Movie sw) {
        Global.sw = sw;
    }

    public static Movie getSt() {
        return st;
    }

    public static void setSt(Movie st) {
        Global.st = st;
    }
    
    

    public static List getGanadores() {
        return ganadores;
    }

    public static void setGanadores(List ganadores) {
        Global.ganadores = ganadores;
    }
    
    
    
    
    public static Node getIdStarWars() {
        return IdStarWars;
    }

    public static void setIdStarWars(Node IdStarWars) {
        Global.IdStarWars = IdStarWars;
    }

    public static Node getIdStarTrek() {
        return IdStarTrek;
    }

    public static void setIdStarTrek(Node IdStarTrek) {
        Global.IdStarTrek = IdStarTrek;
    }

    public static int getWinStarWars() {
        return winStarWars;
    }

    public static void setWinStarWars(int winStarWars) {
        Global.winStarWars = winStarWars;
    }

    public static int getWinStarTrek() {
        return winStarTrek;
    }

    public static void setWinStarTrek(int winStarTrek) {
        Global.winStarTrek = winStarTrek;
    }
    
    public static int getSizeId() {
        return sizeId;
    }

    public static void setSizeId(int sizeId) {
        Global.sizeId = sizeId;
    }
    

    public static int getReviewCount() {
        return reviewCount;
    }

    public static void setReviewCount(int reviewCount) {
        Global.reviewCount = reviewCount;
    }

}
