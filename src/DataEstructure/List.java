/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataEstructure;

import Classes.MovieCharacter;

/**
 *
 * @author kevin
 */
public class List {
    //lista para los ganadores
    private Node head;
    private int size;
    
    public List(){
        this.head = null;
        this.size = 0;
    }
    
    public int getSize(){
        return size;
    }
    
   public void setSize(int size){
       this.size = size;
   }
   
   public Node getHead(){
       return head;
   }
   
   public void setHead(Node head){
       this.head = head;
   }
   
   public boolean isEmpty(){
        return getHead() == null;
    }
   
   public String print(){
       String x ="";
       Node index = getHead();
       while (index!=null){
           x+= "(ID: "+index.getElement().getId() +") " + index.getElement().getName()+"\n";
           index=index.getNext();
       }
       return x;
   }
   
   public Node insertBegin(MovieCharacter winner){
        Node node = new Node(winner);
        if(isEmpty()){
            setHead(node);
        }else{
            node.setNext(getHead());
            setHead(node);
        }
        size ++;
        return node;
    }
    
    public Node deleteBegin(){
        if (!isEmpty()){
            Node pointer = getHead();
            setHead(pointer.getNext());
            pointer.setNext(null);
            size--;
            return pointer;
        }
        return null;
    }
   
}

