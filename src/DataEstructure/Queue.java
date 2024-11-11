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
public class Queue {
    private Node first;
    private Node last;
    private int size;

    public Queue() {
        this.first = null;
        this.size = 0;
    }

    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }
    
    
    public boolean isEmpty() {
       return getFirst()==null;
    
    }
    
    public void empty() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }
    
    public Node enqueue(MovieCharacter element) {
        Node node=new Node(element);
        if (isEmpty()) {
            setFirst(node);
            setLast(node);
        }
        
        else {
           getLast().setNext(node);
           setLast(node);
        }
        size ++;
        return node;
    }
    
    public Node dequeue() {
        if (!isEmpty()) {
            Node pointer= getFirst();
            setFirst(pointer.getNext());
            size --;
            return pointer;
        }
       return null; 
    }
    
public Node delete(Node element) {
    Node aux = getFirst();
    Node previous = null;
    
    // Caso especial: si el primer elemento es el que queremos eliminar
    if (aux != null && aux.getElement().id == element.getElement().id) {
        setFirst(aux.getNext());  // Ajustamos el primer nodo
        return aux;  // Devolvemos el nodo eliminado
    }
    
    // Recorremos la lista buscando el nodo a eliminar
    while (aux != null && aux.getElement().id != element.getElement().id) {
        previous = aux;  // Guardamos el nodo anterior
        aux = aux.getNext();  // Avanzamos al siguiente nodo
    }
    
    // Si encontramos el nodo
    if (aux != null) {
        previous.setNext(aux.getNext());  // El nodo anterior apunta al siguiente del nodo actual
        return aux;  // Devolvemos el nodo eliminado
    }
    
    // Si no encontramos el nodo
    return null;
}

public Node deleteByCharacter(MovieCharacter element) {
    Node aux = getFirst();
    Node previous = null;
    
    // Caso especial: si el primer elemento es el que queremos eliminar
    if (aux != null && aux.getElement().id == element.id) {
        setFirst(aux.getNext());  // Ajustamos el primer nodo
        return aux;  // Devolvemos el nodo eliminado
    }
    
    // Recorremos la lista buscando el nodo a eliminar
    while (aux != null && aux.getElement().id != element.id) {
        previous = aux;  // Guardamos el nodo anterior
        aux = aux.getNext();  // Avanzamos al siguiente nodo
    }
    
    // Si encontramos el nodo
    if (aux != null) {
        previous.setNext(aux.getNext());  // El nodo anterior apunta al siguiente del nodo actual
        return aux;  // Devolvemos el nodo eliminado
    }
    
    // Si no encontramos el nodo
    return null;
}
    
   public String print(){
       String x ="";
       Node index = getFirst();
       while (index!=null){
           x+= "(ID: "+index.getElement().getId()+") " + index.getElement().getName()+"\n";
           index=index.getNext();
       }
       return x;
   }
   

}
