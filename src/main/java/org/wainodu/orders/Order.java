package org.wainodu.orders;

public interface Order {
    public void takeOrder();
    public void completeOrder();
    public void cancelOrder();
    public void notifyClient();
}