package aaa.project.config;

import aaa.project.realm.MyRealm;

import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;
import org.apache.shiro.mgt.SecurityManager;


/**
 * shiro的配置文件信息
 */
@Configuration
public class ShiroConfig {
    @Bean
    public ShiroFilterFactoryBean shiroFilter(SecurityManager securityManager){
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(securityManager);
        //拦截器.
        //没有登录跳转到的界面
        shiroFilterFactoryBean.setLoginUrl("/admin/login");
      //没有授权跳转到的界面
        shiroFilterFactoryBean.setUnauthorizedUrl("/admin/toError");
        Map<String, String> filterChainDefinitionMap = shiroFilterFactoryBean.getFilterChainDefinitionMap();
//配置不能拦截的请求
        filterChainDefinitionMap.put("/admin/login","anon");
        filterChainDefinitionMap.put("/admin/checkUser","anon");
        filterChainDefinitionMap.put("/admin/toError","anon");
       // filterChainDefinitionMap.put("/static/*","anon");
//所有其他请求都要经过登录校验
       filterChainDefinitionMap.put("/admin/**","authc");
        return shiroFilterFactoryBean;
    }

    /**
     * 创建凭证匹配器对象
     * @return
     */
    @Bean
    public HashedCredentialsMatcher getMatcher(){
        HashedCredentialsMatcher credentialsMatcher = new HashedCredentialsMatcher();
        credentialsMatcher.setHashAlgorithmName("MD5");
        credentialsMatcher.setHashIterations(10);
        return credentialsMatcher;
    }


    /**
     * 创建realm的实现类对象
     * @return
     */
    @Bean
    public MyRealm getRealm(){

        MyRealm realm = new MyRealm();
        realm.setCredentialsMatcher(getMatcher());
        return realm;
    }

    /**
     * 在spring工厂中创建SecurityManager 对象
     * @return
     */
    @Bean
    public SecurityManager getSecurityManager(){
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRealm(getRealm());
        return securityManager;
    }


    @Bean
    public LifecycleBeanPostProcessor lifecycleBeanPostProcessor(){
        return new LifecycleBeanPostProcessor();
    }

    /**
     * 注册全局异常处理
     * @return
     */
  /*  @Bean(name = "exceptionHandler")
    public HandlerExceptionResolver handlerExceptionResolver() {
        return new ExceptionHandler();
    }*/
}
