package com.gba.s21.server;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.service.http.HttpService;

public class S21ServerActivator implements BundleActivator {

	private static BundleContext context;
	private static HttpService httpService;

	public void start(BundleContext bundleContext) throws Exception {
		context = bundleContext;

		System.out.println(">>> S21ServerActivator.start()");

		// Obtener HttpService y registrar servlet
		ServiceReference<HttpService> ref = bundleContext.getServiceReference(HttpService.class);
		System.out.println(">>> HttpService ref: " + ref);

		if (ref != null) {
			httpService = bundleContext.getService(ref);
			httpService.registerServlet("/hello", new HelloServlet(), null, null);
			System.out.println("Servlet registered at /hello");
		} else {
			System.out.println(">>> ERROR: HttpService not available!");
		}
	}

	public void stop(BundleContext bundleContext) throws Exception {
		if (httpService != null) {
			httpService.unregister("/hello");
		}
		context = null;
	}

	public static BundleContext getContext() {
		return context;
	}

}
