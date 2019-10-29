/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtproject2;

/**
 *
 * @author naima
 */
public class Node {

    private CustomerInfo data;
    private Node next;

    public CustomerInfo getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setData(CustomerInfo data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
