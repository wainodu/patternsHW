package org.wainodu.factory;

import org.wainodu.clients.Client;
import org.wainodu.observers.Observer;
import org.wainodu.orders.Order;
import org.wainodu.orders.StandartAppOrder;

public class StandartAppOrderFactory extends OrderFactory {
    public Order createOrder(Client client, Observer observer) {
        return new StandartAppOrder(client, observer);
    }
}
