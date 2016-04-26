package com.atguigu.cleint;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.atguigu.server.Server;



public class Cleint {
	public static void main(String[] args) {
		JaxWsProxyFactoryBean jaxWsProxyFactoryBean=new JaxWsProxyFactoryBean();
		jaxWsProxyFactoryBean.setAddress("http://localhost:8989/WebService");
		jaxWsProxyFactoryBean.setServiceClass(Server.class);
		Server server = (Server)jaxWsProxyFactoryBean.create();
		server.sayHello("lilei");
		System.out.println("hello");
	}
}
