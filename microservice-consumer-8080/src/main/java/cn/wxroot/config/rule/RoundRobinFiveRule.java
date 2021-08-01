package cn.wxroot.config.rule;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.Server;

import java.util.List;

public class RoundRobinFiveRule extends AbstractLoadBalancerRule {

    @Override
    public void initWithNiwsConfig(IClientConfig iClientConfig) {

        System.out.println(iClientConfig);
    }

    @Override
    public Server choose(Object key) {

        ILoadBalancer loadBalancer = this.getLoadBalancer();

        //所有服务器
        final List<Server> allServers = loadBalancer.getAllServers();

        //可达服务器
        final List<Server> reachableServers = loadBalancer.getReachableServers();

        return null;
    }

//    private Server getServer() {
//
//        Server returnServer = null;
//
//
//        while (true) {
//
//
//        }
//
//        return returnServer;
//    }
}
