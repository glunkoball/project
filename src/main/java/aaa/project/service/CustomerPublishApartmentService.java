package aaa.project.service;

import aaa.project.common.DefaultMsg;
import aaa.project.entity.Apartment;

import java.util.List;

public interface CustomerPublishApartmentService {
    DefaultMsg publishApt(Apartment apartment, List<String> url);
}
