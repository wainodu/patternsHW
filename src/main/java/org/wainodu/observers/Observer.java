package org.wainodu.observers;

import org.wainodu.clients.Client;
import org.wainodu.orders.OrderStatus;

public class Observer {
    private String orderNotification;

    public void notifyClientAboutStatus(Client client, OrderStatus orderStatus) {
        client.updateStatus(orderStatus);
    }
    public void notifyClientAboutAddress(Client client) {
        client.updateAddress();
    }
}
