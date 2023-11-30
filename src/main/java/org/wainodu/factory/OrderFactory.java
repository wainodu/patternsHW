package org.wainodu.factory;

import org.wainodu.clients.Client;
import org.wainodu.observers.Observer;
import org.wainodu.orders.Order;

public abstract class OrderFactory {
    public abstract Order createOrder(Client client, Observer observer);
}
