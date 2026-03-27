package com.gba.s21.server;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

public class S21Application implements IApplication {

	@Override
	public Object start(IApplicationContext context) throws Exception {

		System.out.println("=================================");
		System.out.println("S21 Server Starting...");
		System.out.println("=================================");

		// Acá va toda la lógica de inicio del server

		System.out.println("S21 Server started successfully!");

		return IApplication.EXIT_OK;
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

}
