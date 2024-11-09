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
public class Node {
    
    private MovieCharacter element;
    
    private Node next;

    public Node(MovieCharacter element) {
        this.element = element;
        this.next = null;
    }

    public MovieCharacter getElement() {
        return element;
    }

    public void setElement(MovieCharacter element) {
        this.element = element;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
    
    
}
