package aaa.project.service;

import aaa.project.common.DefaultMsg;
import aaa.project.entity.User;

public interface SigninService {
    DefaultMsg signinUser(User user);
}
