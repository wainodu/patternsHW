package org.wainodu.clients;

import org.wainodu.orders.OrderStatus;

public class Client {
    public String address;
    public void updateStatus(OrderStatus orderStatus) {
        System.out.println("Статус заказа для клиента по адресу " + this.address + " изменился на: " + orderStatus);
    }
    public void updateAddress() {
        System.out.println("Курьер прибыл по вашему адресу: " + this.address);
    }
}
