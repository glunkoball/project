package aaa.project.service;

import aaa.project.entity.Admin;
import aaa.project.entity.Module;

import java.util.List;

public interface AdminLoginService {
    public Admin findUserAndPassword(Admin admin);
    public List<Module> queryUserMenus(Admin user);
}
