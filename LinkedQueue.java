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
import java.util.Random;

public class LinkedQueue {

    CustomerInfo[] tellers = new CustomerInfo[2];

    Node head;
    Node tail;
    int count;

    public LinkedQueue() {
        head = tail = null;
        count = 0;
    }
    // add the customer to the queue
    public boolean add(CustomerInfo customer) {
        Node n = new Node();
        n.setData(customer);
        if (count == 0) {
            head = tail = n;
            count = 1;
            return true;
        } else {
            tail.setNext(n);
            tail = tail.getNext();
            count++;
        }
        return false;
    }

   
    // remove the customer from the queue 
    public CustomerInfo remove() {
        if (count == 0) {
            return null;
        } else {
            CustomerInfo rtn = head.getData();
            if (count == 1) {
                head = tail = null;
                count = 0;
            } else {
                head = head.getNext();
                count--;
            }
            return rtn;
        }
    }

    public int length() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return false;
    }


    static int random() {
        Random random = new Random();
        int answer = random.nextInt(3) + 1;

        return answer;
    }
  // print the queue and service at tellers each minute
    public void print() {

        LinkedQueue linked = new LinkedQueue();

        int customerArrialTime = random();
        int waitTime = 0;
        int list = 1;

        System.out.println("Welcome to Your Bank Simulator ! \n ");

        for (int minuteOfDay = 1; minuteOfDay <= 480; minuteOfDay++) {

            System.out.println(" Current time : " + minuteOfDay + "  (minutes)\n");

            // add the first customer when customerArrialTime == minuteOfDay
            if (customerArrialTime == minuteOfDay) {

                System.out.println(" New costumer has arrived at minute  " + minuteOfDay);

                // get the arrival time of the next customer
                customerArrialTime = minuteOfDay + random();

                // add the next customer when the scheduled time equals the random number
                System.out.println(" Next customer will arrive at minute  " + customerArrialTime);
                CustomerInfo newCus = new CustomerInfo();
                linked.add(newCus);
                count++;

            }
            for (int k = 0; k < tellers.length; k++) {
              // if teller is busy get the finish time 
                if ((tellers[k] != null)) { 
                    if (tellers[k].getFinishTime() == minuteOfDay) {
                        tellers[k] = null;

                        System.out.println("Customer is done with teller " + (k + 1));
                    }
                }
                 // remove customer  if a teller is open
                if (tellers[k] == null) {
                    tellers[k] = linked.remove();

                    if (tellers[k] == null) {
                        continue;
                    }
                     // get the srevice time that the customer will need 
                    int serviceTime1 = random();
                    tellers[k].setFinishTime(minuteOfDay + serviceTime1);
                    System.out.println("teller " + (k + 1) + " is helping a customer , will finish at minute "
                            + tellers[k].getFinishTime());
                      // get the waiting time 
                    waitTime = customerArrialTime - tellers[k].getFinishTime();

                }

            }
            // count the customers in the waiting line at each minute 
            System.out.println(" There are " + linked.length() + " customers in the line");

            System.out.println("==========================================");
            System.out.println("==========================================");

        }
 
        System.out.println(" Maximum number of customer in the queue at any point in time is:  " + list);
        System.out.println(" Longest wait time experienced by any customer is:  " + waitTime);
        System.out.println(" Number of customers served is :  " + count);

    }

}
