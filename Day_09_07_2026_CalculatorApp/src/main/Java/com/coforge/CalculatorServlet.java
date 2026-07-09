package com.coforge;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public CalculatorServlet() {
        super();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Read values from calculator.jsp
        double num1 = Double.parseDouble(request.getParameter("num1"));
        double num2 = Double.parseDouble(request.getParameter("num2"));

        // Read which button was clicked
        String operation = request.getParameter("operation");

        double result = 0;

        switch (operation) {

        case "add":
            result = num1 + num2;
            break;

        case "sub":
            result = num1 - num2;
            break;

        case "mul":
            result = num1 * num2;
            break;

        case "div":
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                request.setAttribute("message", "Division by zero is not allowed.");
                RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/result.jsp");
                rd.forward(request, response);
                return;
            }
            break;

        default:
            request.setAttribute("message", "Invalid Operation");
            RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/result.jsp");
            rd.forward(request, response);
            return;
        }

        // Pass result to JSP
        request.setAttribute("num1", num1);
        request.setAttribute("num2", num2);
        request.setAttribute("operation", operation);
        request.setAttribute("result", result);

        // Forward to result.jsp
        RequestDispatcher rd = request.getRequestDispatcher("Result.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        doPost(request, response);
    }
}