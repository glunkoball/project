package aaa.project.service;
import aaa.project.entity.Admin;
import aaa.project.entity.Apartment;
import aaa.project.entity.Params;
import aaa.project.entity.User;

import java.util.List;

public interface AdminAuditService {
    public List<Apartment> listAll();
    public Integer pass(String newAptNum);
    public List<Admin> bindingbutton(String AptNum);
    public Integer binding(Params params);
    public List<Apartment> publishlistAll();

    public Integer updateState(String newAptNum);
    public boolean  updateprice(String aptNum,Double price);

}