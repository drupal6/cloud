package com.cloud.gateway.zuulfilter;

import com.netflix.zuul.ZuulFilter;

public class ZuulPreFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        //请求转发具体服务前进行安全验证
        return null;
    }
}
