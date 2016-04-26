package com.atguigu.server;

import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;


public class ServerPublish {
	public static void main(String[] args) {
		JaxWsServerFactoryBean jaxWsServiceFactoryBean=new JaxWsServerFactoryBean();
		jaxWsServiceFactoryBean.setAddress("http://localhost:8989/WebService");
		jaxWsServiceFactoryBean.setServiceClass(ServerImpl.class);
		Server server = jaxWsServiceFactoryBean.create();
		server.start();
	}
}
