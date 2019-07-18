package aaa.project.realm;


import aaa.project.entity.Admin;
import aaa.project.service.AdminLoginService;
import org.apache.ibatis.javassist.bytecode.ByteArray;
import org.apache.ibatis.javassist.bytecode.Bytecode;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 自定义域对象  负责读取认证和授权信息的数据
 */
public class MyRealm  extends AuthorizingRealm {

    @Autowired
    private AdminLoginService adminLoginService;
    //授权
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //获取用户对象
        Admin user =(Admin)principalCollection.getPrimaryPrincipal();
       //根据用户id查询用户能操作的命名空间
        List<String> namespaces = adminLoginService.queryPermitByShiro(user);
         //把命名空间放到shiro中去
        SimpleAuthorizationInfo   saf = new SimpleAuthorizationInfo();
        saf.addStringPermissions(namespaces);
        return saf;
    }

    //认证
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
       //获取用户前台传过来的用户名和密码
        String username = authenticationToken.getPrincipal().toString();
       // String password =  new String((char[])authenticationToken.getCredentials());
        //根据用户名查找用户对象
        Admin user = adminLoginService.findByUsername(username);
        //如果用户不存在 抛出异常
        if(user==null){
            throw  new UnknownAccountException("用户名输入不正确");
        }

      //传递密码的时候设置盐值
        ByteSource salt = ByteSource.Util.bytes("123");
        SimpleAuthenticationInfo sif = new SimpleAuthenticationInfo(user,user.getPassword(),salt,"myrealm1");
        return sif;
    }
}
