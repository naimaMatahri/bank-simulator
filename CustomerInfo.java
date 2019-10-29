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
public class CustomerInfo {

    private int cusArrivalTime;
    private int finishTime;
    private int waitingTime;

  

    public int getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(int finishTime) {
        this.finishTime = finishTime;
    }

    public void setCusArrivalTime(int cusArrivalTime) {
        this.cusArrivalTime = cusArrivalTime;
    }

    public int getCusArrivalTime() {
        return cusArrivalTime;
    }
      public int getWaitingTime() {
        return waitingTime;
    }

    public void setWaitingTime(int waitingTime) {
        this.waitingTime = waitingTime;
    }
}
