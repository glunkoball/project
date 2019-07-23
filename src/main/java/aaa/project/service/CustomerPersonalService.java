package aaa.project.service;

import aaa.project.entity.Apartment;

import java.util.List;

public interface CustomerPersonalService {

    public List<Apartment> findAllMyApt(Integer Id);

}
