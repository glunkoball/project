package aaa.project.service;

import aaa.project.entity.Admin;

public interface AdminLoginService {
    public Admin findUserAndPassword(Admin admin);
}
