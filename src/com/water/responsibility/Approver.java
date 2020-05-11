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

    public Approver approver;//下一个审批者

    public Approver(String name) {
        this.name = name;
    }

    public abstract void processRequest(PurchaseRequest request);
}
