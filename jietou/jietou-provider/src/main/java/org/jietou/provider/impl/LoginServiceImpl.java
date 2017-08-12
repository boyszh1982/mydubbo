package org.jietou.provider.impl;


import com.alibaba.dubbo.rpc.RpcContext;
import org.apache.log4j.Logger;
import org.jietou.api.i.LoginService;
import org.jietou.api.m.BwUser;
import org.jietou.provider.mapper.BwUserMapper;
import org.jietou.provider.routing.datasource.MyApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.alibaba.dubbo.config.annotation.Service;

@Service(interfaceClass = LoginService.class, timeout = 10000, retries = 2,
        cluster = "failfast", loadbalance = "consistenthash" )
public class LoginServiceImpl implements LoginService {

    Logger logger = Logger.getLogger(LoginServiceImpl.class);

    @Autowired
    @Qualifier("bwUserMapper")
    private BwUserMapper bwUserMapper;

    public BwUser selectUser(BwUser bwUser) {
    	
    	if(bwUser.getPASSWORD().equals("111111"))
    		MyApplicationContext.setDataSource("dataSourceJietou");
    	
        boolean isProviderSide = RpcContext.getContext().isProviderSide();
        String clientip = RpcContext.getContext().getRemoteHost();
        String application = RpcContext.getContext().getUrl().getParameter("application");
        String msg = String.format("isProviderSide=%s,clientip=%s,application=%s", isProviderSide, clientip, application);
        logger.info(msg);
        double r = Math.random() * 100;
        if (r < 10.00) {
            throw new RuntimeException("less than 10 exception !");
        }

        return bwUserMapper.selectByUser(bwUser);
    }


}
