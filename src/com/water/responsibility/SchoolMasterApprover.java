package com.water.responsibility;

public  class SchoolMasterApprover extends Approver {
    public SchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {

        if (request.price>30000){
            System.out.println(request.id+"处理者:"+this.name+",处理金额:"+request.price);
        }else {
            approver.processRequest(request);
        }
    }
}
