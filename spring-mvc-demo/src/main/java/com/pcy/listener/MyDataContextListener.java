package com.pcy.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @description:
 * @author: 彭椿悦
 * @data: 2021/3/23 11:31
 */
public class MyDataContextListener implements ServletContextListener {
	private ServletContext context = null;

	public MyDataContextListener() {
	}

	/**
	 * 该方法在ServletContext启动之后调用，并准备好处理客户端请求
	 * @param sce
	 */
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		this.context = sce.getServletContext();
		//在这里你可以实现自己的逻辑并将结果记录在属性中，
		//在web应用启动之后，就能在任意的Servlet或Jsp中获取到初始化的参数
		context.setAttribute("myData","this is MyData");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {

	}
}
