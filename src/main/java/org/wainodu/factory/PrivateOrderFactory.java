package org.wainodu.factory;

import org.wainodu.clients.Client;
import org.wainodu.observers.Observer;
import org.wainodu.orders.Order;
import org.wainodu.orders.PrivateOrder;

public class PrivateOrderFactory extends OrderFactory{
    public Order createOrder(Client client, Observer observer){
        return new PrivateOrder(client, observer);
    }
}
