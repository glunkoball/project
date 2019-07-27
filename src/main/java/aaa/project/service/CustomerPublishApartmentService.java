package aaa.project.service;

import aaa.project.common.DefaultMsg;
import aaa.project.entity.Apartment;

import javax.servlet.http.HttpSession;
import java.util.List;

public interface CustomerPublishApartmentService {
    DefaultMsg publishApt(HttpSession session,Apartment apartment, List<String> url);
}
