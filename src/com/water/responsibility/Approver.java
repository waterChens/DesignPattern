package com.water.responsibility;

public abstract class Approver {
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    public Approver approver;

    public Approver(String name) {
        this.name = name;
    }

    public abstract void processRequest(PurchaseRequest request);
}
