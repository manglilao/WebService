package com.atguigu.server;

import javax.jws.WebService;

@WebService
public interface Server {
	
	public void sayHello(String name);
}
