package aaa.project.service;

import aaa.project.entity.Apartment;

import java.util.List;

public interface AdminApartmentManagementService {
    public List<Apartment> findAllApt();

    public List<Apartment> findAvailableApt(Apartment apartment);
    public List<Apartment> findMyApt(Integer id);
}
