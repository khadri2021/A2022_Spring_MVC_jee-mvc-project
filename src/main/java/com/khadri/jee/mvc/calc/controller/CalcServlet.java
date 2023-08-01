package com.khadri.jee.mvc.calc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.khadri.jee.mvc.calc.service.CalcService;

public class CalcServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("CalcServlet Invoked");

		String v1 = req.getParameter("v1");
		String v2 = req.getParameter("v2");
		String mode = req.getParameter("MODE");

		int val1 = Integer.parseInt(v1);
		int val2 = Integer.parseInt(v2);

		RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		CalcService addCalcService = new CalcService();

		// This logic is more complex and legacy
		// There is not possible with one servlet separated resource mapping

		if (mode.equals("ADD")) {
			Integer sum = addCalcService.addition(val1, val2);
			req.setAttribute("res_sum", sum);
		} else if (mode.equals("SUB")) {
			Integer sub = addCalcService.substraction(val1, val2);
			req.setAttribute("res_sub", sub);
		}

		rd.forward(req, resp);

	}

}
