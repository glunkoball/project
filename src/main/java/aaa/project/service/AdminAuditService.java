package aaa.project.service;
import aaa.project.entity.Apartment;

import java.util.List;

public interface AdminAuditService {
    public List<Apartment> listAll();
    public List<Apartment> findById(String newAptNum);
}