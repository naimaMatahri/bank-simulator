/*
 * Bank simulator 
 * 
 *  Naima Matahri
 *  04/08/2018
 *  Data Structure / Project 2 
 * 
 * Description:
 *       the program implements the Linked Queues in Java
 *       I created 5 classes to handle the goal of this project
 *       which is creating a bank simulator with 2 tellers and the program run's for 480 minutes per day
 *       Add the customers randomly from 1 to 4 minutes and start servicing them;
 *       if teller 1 is free assigne the first coming customer otherways check the other teller if no 
 *       add it back to the line
         checkes the queue at each minute to keep truck of costomers waiting in the list
         the program schedual's the arrival time of next customer also randomly
         at the end the program displays max waiting time and max number customers in the line
         also the number of clients serviced 
         
         For this projects I use classes, public and private methods, variables, objects, for loops, random method, 
         if statements, setters, getters,  Booleans methods, …
      

 * */


package dtproject2;

/**
 *
 * @author naima
 */
public class DTProject2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedQueue linked = new LinkedQueue();
        linked.print();

    }

}
