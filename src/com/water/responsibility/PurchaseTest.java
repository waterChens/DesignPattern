package com.water.responsibility;

public class PurchaseTest {
    public static void main(String[] args) {
        PurchaseRequest request = new PurchaseRequest(300000);
        DepartmentApprover departmentApprover = new DepartmentApprover("立柱桩");
        SchoolMasterApprover masterApprover = new SchoolMasterApprover("好啊好啊");
        ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("你说了算");
        departmentApprover.setApprover(viceSchoolMasterApprover);
        viceSchoolMasterApprover.setApprover(masterApprover);
        masterApprover.setApprover(departmentApprover);
        masterApprover.processRequest(request);
    }
}
