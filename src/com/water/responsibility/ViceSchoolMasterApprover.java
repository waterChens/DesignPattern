package com.water.responsibility;

public  class ViceSchoolMasterApprover extends Approver {
    public ViceSchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {

        if (request.price>5000&&request.price<=30000){
            System.out.println(request.id+"处理者"+this.name+",处理金额:"+request.price);
        }else {
            approver.processRequest(request);
        }
    }
}
