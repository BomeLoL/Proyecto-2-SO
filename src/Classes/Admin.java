/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import Classes.Global;
import DataEstructure.List;
import DataEstructure.Node;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kevin
 */
public class Admin extends Thread{
    private int counter;
    private AI ai;


    public Admin(AI ai) {
        this.counter = 0;
        this.ai = ai;

    }
        
    @Override
    public void run(){
        while(true){
            try{
                IniciadorDe20Personajes();
                
                if (this.counter==2){
                    Random random = new Random(); 
                    if (random.nextDouble() < 0.8){
                        seleccionarDosNuevos();
                    }
                }

                if (Global.sw.reinforcment.isEmpty()==false){

                    salirDeRefuerzo();                    
                }

                seleccionadorDePersonajes();

                Global.SAI.release();
                Global.SAdmin.acquire();
                if (ai.getResult().equals("Tenemos un ganador")){
                    String sagaGanadora = ai.seleccionadorGanador();
                    eliminarpostpelea(sagaGanadora);
                } else if (ai.getResult().equals("Empate")){
                    casoEmpate();
                } else if (ai.getResult().equals("No hay combate")){
                    casoRefuerzo();
                }
                contadorInanicion();
                this.counter+=1;
                System.out.println("\n\n--------Starwars Second Priority------------");
                Global.sw.secondPriority.print();
                //System.out.println("\n\n--------Starwars Backup------------");
                //Global.sw.reinforcment.print();
                //System.out.println("\n\n--------Winners------------");
                //Global.ganadores.imprimir();
                System.out.println("\n\n\n\n------------------------");
            }
            catch (Exception e) {
                  System.out.println(e);  
            }
        }
        }
    
    public void seleccionarDosNuevos (){
        boolean stSalir = false;
        boolean swSalir = false;
        for (int i=0; i < 20; i++){
            if (i == Global.IdStarTrek && stSalir == false){
                MovieCharacter personajeST = new MovieCharacter(Global.getSizeId(), Global.star_trek_characters_names[i] );
                if (personajeST.priority == 1){
                    Global.st.firstPriority.enqueue(personajeST);
                }else if (personajeST.priority == 2){
                    Global.st.secondPriority.enqueue(personajeST);
                }else if (personajeST.priority == 3){
                    Global.st.thirdPriority.enqueue(personajeST);
                }
                if (i!= 19){
                Global.setIdStarTrek(Global.getIdStarTrek()+1);}
                else{
                Global.setIdStarTrek(0);
                }
                stSalir = true;
                Global.setSizeId(Global.getSizeId()+1);

                System.out.println("PERSONAJE ESPECIAL ST");
                System.out.println(personajeST.printStats());
                }
                
            if (i == Global.IdStarWars && swSalir == false){
                MovieCharacter personajeSW = new MovieCharacter(Global.getSizeId(), Global.star_wars_characters_names[i] );
                if (personajeSW.priority == 1){
                    Global.sw.firstPriority.enqueue(personajeSW);
                }else if (personajeSW.priority == 2){
                    Global.sw.secondPriority.enqueue(personajeSW);
                }else if (personajeSW.priority == 3){
                    Global.sw.thirdPriority.enqueue(personajeSW);
                }
                if (i!= 19){
                Global.setIdStarWars(Global.getIdStarWars()+1);}
                else{
                Global.setIdStarWars(0);
                }
                swSalir =true;
                Global.setSizeId(Global.getSizeId()+1);
                System.out.println("PERSONAJE ESPECIAL Sw");
                System.out.println(personajeSW.printStats());
                }            
        }
        
        ;
    }
    
    public void eliminarpostpelea(String saga){
        Global global = new Global();
            if (saga=="sw"){
            if (ai.getWinner().priority ==1){
                global.sw.firstPriority.deleteByCharacter(ai.getWinner());
            }else if (ai.getWinner().priority ==2){
                global.sw.secondPriority.deleteByCharacter(ai.getWinner());
            }else if (ai.getWinner().priority ==3) {
                global.sw.thirdPriority.deleteByCharacter(ai.getWinner());
            }
            if (ai.getCharacterStarTrek().priority ==1){
                global.st.firstPriority.deleteByCharacter(ai.getCharacterStarTrek());
            }else if (ai.getCharacterStarTrek().priority ==2){
                global.st.secondPriority.deleteByCharacter(ai.getCharacterStarTrek());
            }else if (ai.getCharacterStarTrek().priority ==3) {
                global.st.thirdPriority.deleteByCharacter(ai.getCharacterStarTrek());
            }
        }else{
            if (ai.getWinner().priority ==1){
                global.st.firstPriority.deleteByCharacter(ai.getWinner());
            }else if (ai.getWinner().priority ==2){
                global.st.secondPriority.deleteByCharacter(ai.getWinner());
            }else if (ai.getWinner().priority ==3) {
                global.st.thirdPriority.deleteByCharacter(ai.getWinner());
            }
            if (ai.getCharacterStarWars().priority ==1){
                global.sw.firstPriority.deleteByCharacter(ai.getCharacterStarWars());
            }else if (ai.getCharacterStarWars().priority ==2){
                global.sw.secondPriority.deleteByCharacter(ai.getCharacterStarWars());
            }else if (ai.getCharacterStarWars().priority ==3) {
                global.sw.thirdPriority.deleteByCharacter(ai.getCharacterStarWars());
            }   
        }
        List Listaganador = global.ganadores;
        Listaganador.insertBegin(ai.getWinner());

        global.setGanadores(Listaganador);
    }
    
    public void casoRefuerzo(){
        Global global = new Global();   
            if(ai.getCharacterStarTrek().priority ==1){
                global.st.firstPriority.deleteByCharacter(ai.getCharacterStarTrek());
                global.st.reinforcment.enqueue(ai.getCharacterStarTrek());
            }else if(ai.getCharacterStarTrek().priority ==2){
                global.st.secondPriority.deleteByCharacter(ai.getCharacterStarTrek());
                global.st.reinforcment.enqueue(ai.getCharacterStarTrek());                
            }else if(ai.getCharacterStarTrek().priority ==3){
                global.st.thirdPriority.deleteByCharacter(ai.getCharacterStarTrek());
                global.st.reinforcment.enqueue(ai.getCharacterStarTrek());                 
            }
            if(ai.getCharacterStarWars().priority ==1){
                global.sw.firstPriority.deleteByCharacter(ai.getCharacterStarWars());
                global.sw.reinforcment.enqueue(ai.getCharacterStarWars());                
            }else if(ai.getCharacterStarWars().priority ==2){
                global.sw.secondPriority.deleteByCharacter(ai.getCharacterStarWars());
                global.sw.reinforcment.enqueue(ai.getCharacterStarWars());                   
            }else if(ai.getCharacterStarWars().priority ==3){
                global.sw.thirdPriority.deleteByCharacter(ai.getCharacterStarWars());
                global.sw.reinforcment.enqueue(ai.getCharacterStarWars());   
            
        }
    }    
    
    public void salirDeRefuerzo(){
        Random random = new Random();
        Global global = new Global();   
            if(random.nextDouble()<0.4){
                Node nuevost= global.st.reinforcment.dequeue();
                global.st.firstPriority.enqueue(nuevost.getElement());
                Node nuevosw= global.sw.reinforcment.dequeue();
                global.sw.firstPriority.enqueue(nuevosw.getElement());
            }
            else{
                Node nuevost= global.st.reinforcment.dequeue();
                global.st.reinforcment.enqueue(nuevost.getElement());
                Node nuevosw= global.sw.reinforcment.dequeue();
                global.sw.reinforcment.enqueue(nuevosw.getElement());              
            }
        }
    
    public void casoEmpate(){
        Global global = new Global();
            if (ai.getCharacterStarWars().priority ==1){
                Node nuevoSW = global.sw.firstPriority.deleteByCharacter(ai.getCharacterStarWars());
                global.sw.firstPriority.enqueue(nuevoSW.getElement());
            }else if (ai.getCharacterStarWars().priority ==2){
                Node nuevoSW = global.sw.secondPriority.deleteByCharacter(ai.getCharacterStarWars());
                global.sw.firstPriority.enqueue(nuevoSW.getElement());
            }else if (ai.getCharacterStarWars().priority ==3) {
                Node nuevoSW = global.sw.thirdPriority.deleteByCharacter(ai.getCharacterStarWars());
                global.sw.firstPriority.enqueue(nuevoSW.getElement());
            }
            if (ai.getCharacterStarTrek().priority ==1){
                Node nuevoST = global.st.firstPriority.deleteByCharacter(ai.getCharacterStarTrek());
                global.st.firstPriority.enqueue(nuevoST.getElement());
            }else if (ai.getCharacterStarTrek().priority ==2){
                Node nuevoST = global.st.secondPriority.deleteByCharacter(ai.getCharacterStarTrek());
                global.st.firstPriority.enqueue(nuevoST.getElement());
            }else if (ai.getCharacterStarTrek().priority ==3) {
                Node nuevoST = global.st.thirdPriority.deleteByCharacter(ai.getCharacterStarTrek());
                global.st.firstPriority.enqueue(nuevoST.getElement());
            }
        }
    
    public void seleccionadorDePersonajes(){
        Global global = new Global();
        if (global.sw.firstPriority.isEmpty()==false){
            ai.setCharacterStarWars(global.sw.firstPriority.getFirst().getElement());
                global.sw.firstPriority.getFirst().getElement().setCounter(0);
        }
        else if (global.sw.secondPriority.isEmpty()==false){
            ai.setCharacterStarWars(global.sw.secondPriority.getFirst().getElement());
                global.sw.secondPriority.getFirst().getElement().setCounter(0);
        }else if (global.sw.thirdPriority.isEmpty()==false){
            ai.setCharacterStarWars(global.sw.thirdPriority.getFirst().getElement());
                global.sw.thirdPriority.getFirst().getElement().setCounter(0);
        }
        
        if (global.st.firstPriority.isEmpty()==false){
            ai.setCharacterStarTrek(global.st.firstPriority.getFirst().getElement());
                global.st.firstPriority.getFirst().getElement().setCounter(0);
        }
        else if (global.st.secondPriority.isEmpty()==false){
            ai.setCharacterStarTrek(global.st.secondPriority.getFirst().getElement());
                global.st.secondPriority.getFirst().getElement().setCounter(0);
        }else if (global.st.thirdPriority.isEmpty()==false){
            ai.setCharacterStarTrek(global.st.thirdPriority.getFirst().getElement());
                global.st.thirdPriority.getFirst().getElement().setCounter(0);
        }
    }
    
    
    public void contadorInanicion(){
        Global global = new Global();
        Node swThirdPriorityNode = global.sw.thirdPriority.getFirst();
        Node swSecondPriorityNode = global.sw.secondPriority.getFirst();
        Node stThirdPriorityNode = global.st.thirdPriority.getFirst();
        Node stSecondPriorityNode = global.st.thirdPriority.getFirst();
        while (swThirdPriorityNode!=null){
            swThirdPriorityNode.getElement().setCounter(swThirdPriorityNode.getElement().getCounter()+1);
            if (swThirdPriorityNode.getElement().getCounter()==8){
                Node aMover=global.sw.thirdPriority.delete(swThirdPriorityNode);
                MovieCharacter personajeNuevo = aMover.getElement();
                personajeNuevo.setPriority(2);
                global.sw.secondPriority.enqueue(personajeNuevo);
                swThirdPriorityNode.getElement().setCounter(0);
            }
            swThirdPriorityNode=swThirdPriorityNode.getNext();
        }
        while (swSecondPriorityNode!=null){
            swSecondPriorityNode.getElement().setCounter(swSecondPriorityNode.getElement().getCounter()+1);
            if (swSecondPriorityNode.getElement().getCounter()==8){
                Node bMover=global.sw.secondPriority.delete(swSecondPriorityNode);
                MovieCharacter personajeNuevo = bMover.getElement();
                personajeNuevo.setPriority(1);
                global.sw.firstPriority.enqueue(personajeNuevo);
                swSecondPriorityNode.getElement().setCounter(0);}
            swSecondPriorityNode=swSecondPriorityNode.getNext();
        }
        while (stThirdPriorityNode!=null){
            stThirdPriorityNode.getElement().setCounter(stThirdPriorityNode.getElement().getCounter()+1);
            if (stThirdPriorityNode.getElement().getCounter()==8){
                Node cMover=global.st.thirdPriority.delete(stThirdPriorityNode);
                MovieCharacter personajeNuevo = cMover.getElement();
                personajeNuevo.setPriority(2);
                global.st.secondPriority.enqueue(personajeNuevo);
                stThirdPriorityNode.getElement().setCounter(0);}
            stThirdPriorityNode=stThirdPriorityNode.getNext();
        }
        while (stSecondPriorityNode!=null){
            stSecondPriorityNode.getElement().setCounter(stSecondPriorityNode.getElement().getCounter()+1);
            if (stSecondPriorityNode.getElement().getCounter()==8){
                Node dMover=global.st.secondPriority.delete(stSecondPriorityNode);
                MovieCharacter personajeNuevo = dMover.getElement();
                personajeNuevo.setPriority(1);
                global.st.firstPriority.enqueue(personajeNuevo);
                stSecondPriorityNode.getElement().setCounter(0);}
            stSecondPriorityNode=stSecondPriorityNode.getNext();
        }
        
    }
    
    public void IniciadorDe20Personajes(){
        Global global = new Global();
        if(global.sw.firstPriority.isEmpty() && global.sw.secondPriority.isEmpty() && global.sw.thirdPriority.isEmpty() && global.sw.reinforcment.isEmpty() && global.st.firstPriority.isEmpty() && global.st.secondPriority.isEmpty() && global.st.thirdPriority.isEmpty() && global.st.reinforcment.isEmpty()){
            Node nodeStarWars = global.sw.totalCharacterList.getHead() ;
            Node nodeStarTrek = global.st.totalCharacterList.getHead() ;

            while (nodeStarWars!=null && nodeStarTrek!=null) {

                if (nodeStarWars.getElement().priority == 1){
                    global.sw.firstPriority.enqueue(nodeStarWars.getElement());}
                if (nodeStarTrek.getElement().priority == 1){
                    global.st.firstPriority.enqueue(nodeStarTrek.getElement());
                }
                if (nodeStarWars.getElement().priority == 2){
                    global.sw.secondPriority.enqueue(nodeStarWars.getElement());}
                if (nodeStarTrek.getElement().priority == 2){
                    global.st.secondPriority.enqueue(nodeStarTrek.getElement());
                }
                if (nodeStarWars.getElement().priority == 3){
                    global.sw.thirdPriority.enqueue(nodeStarWars.getElement());}
                if (nodeStarTrek.getElement().priority == 3){
                    global.st.thirdPriority.enqueue(nodeStarTrek.getElement());
                }
                    nodeStarWars = nodeStarWars.getNext();
                    nodeStarTrek = nodeStarTrek.getNext();
                
             }

        }
    }
    
    
    };

