package org.wainodu.orders;

public enum OrderStatus {
    COMPLETE("Complete"),
    IN_PROCESS("InProcess"),
    AWAITING_COURIER("AwaitingCourier");

    private String status;

    OrderStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return status;
    }
}

