package org.wainodu.orders;

import org.wainodu.clients.Client;
import org.wainodu.observers.Observer;

public class PrivateOrder implements Order{
    public OrderStatus status;
    public Client client;
    public Observer observer;

    public PrivateOrder(Client client, Observer observer) {
        this.client = client;
        this.observer = observer;
    }
    public void notifyClient(){
        this.observer.notifyClientAboutStatus(this.client, this.status);
    }
    public void takeOrder(){
        this.status = OrderStatus.IN_PROCESS;
        notifyClient();
    };
    public void completeOrder(){
        this.status = OrderStatus.COMPLETE;
        notifyClient();
    };
    public void cancelOrder(){
        this.status = OrderStatus.AWAITING_COURIER;
        notifyClient();
    };
}
