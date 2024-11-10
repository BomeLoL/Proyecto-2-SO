    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import DataEstructure.List;
import Interfaces.Interface;
import java.util.Random;

/**
 *
 * @author kevin
 */
public class AI extends Thread {
    private int speed;
    private MovieCharacter characterStarWars;
    private MovieCharacter characterStarTrek;
    private MovieCharacter winner; 
    private String result;
    private boolean ready; 
    private String state;

    
    public AI() {
        this.speed = 2;
        this.characterStarWars = characterStarWars;
        this.characterStarTrek = characterStarTrek;
        this.ready = false;

    }
    
    public void changeStateTextDeciding(){
            if (Interface.getIASTATUS()!=null){
            Interface.getIASTATUS().setText("La IA esta decidiendo...");}
    }
    
    
    
    
    @Override
    public void run(){
        while(true){
            try{
                Global.SAI.acquire();
                changeStateTextDeciding();
                
                sleep(this.speed*1000);
                decisorDeEventos();
                Global.SAdmin.release();

            }
            catch (Exception e) {
                  System.out.println(e);  
            }
        }
        }
        
    public String seleccionadorGanador (){
        Random random = new Random();
        int puntosSW = characterStarWars.skillPoints+characterStarWars.healthPoints+characterStarWars.strengthPoints+characterStarWars.agilityPoints;
        int puntosST = characterStarTrek.skillPoints+characterStarTrek.healthPoints+characterStarTrek.strengthPoints+characterStarTrek.agilityPoints;
        String saga;
        if (puntosST>puntosSW){
            this.winner = characterStarTrek;
            saga = "st";
        } else if (puntosSW> puntosST){
            this.winner = characterStarWars;
            saga = "sw";

        }else if (random.nextDouble()>0.5){
            this.winner=characterStarWars;
            saga = "sw";

        }else {
            this.winner=characterStarTrek;
            saga = "st";

        }

        return saga;
    }
    
    

    
    public void decisorDeEventos(){
        Random random = new Random();
        Global global = new Global();
        if (random.nextDouble() < 0.4){
            this.result = "Tenemos un ganador";
        } else if (random.nextDouble() > 0.4 && random.nextDouble() < 0.67 ){
            this.result = "Empate";}
            else{
              this.result = "No hay combate";       
              }
        global.setReviewCount(global.getReviewCount()+1);
    }
    

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public MovieCharacter getCharacterStarWars() {
        return characterStarWars;
    }

    public void setCharacterStarWars(MovieCharacter characterStarWars) {
        this.characterStarWars = characterStarWars;
    }

    public MovieCharacter getCharacterStarTrek() {
        return characterStarTrek;
    }

    public void setCharacterStarTrek(MovieCharacter characterStarTrek) {
        this.characterStarTrek = characterStarTrek;
    }

    public MovieCharacter getWinner() {
        return winner;
    }

    public void setWinner(MovieCharacter winner) {
        this.winner = winner;
    }

    public boolean isReady() {
        return ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    
    
}
