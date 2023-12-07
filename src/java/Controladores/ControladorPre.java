/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controladores;

import Modelos.presentaciones;
import ModelosDAO.presentacionesDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author serna
 */
public class ControladorPre extends HttpServlet {
    
    presentacionesDAO dao = new presentacionesDAO();
    presentaciones pre = new presentaciones();
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControladorPre</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControladorPre at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        
        switch (accion) {
            case "Listar" -> {
                System.out.println("switch de controladorpre \n");
                List<presentaciones>datos=dao.listar();
                request.setAttribute("datos", datos);
                request.getRequestDispatcher("jsp/crud-presentaciones.jsp").forward(request, response);
            }
            case "Nuevo" -> {
                System.out.println("Controlador Presentaciones Nuevo");
                request.getRequestDispatcher("jsp/crud-presentaciones-add.jsp").forward(request, response);
                break;
            }
            case "Guardar" ->{
                String Id_Presentaciones = request.getParameter("txtidpre");
                String PowerPoint = request.getParameter("txtpowerpoint");
                String Presen_descripcion = request.getParameter("txtdescrip");
                pre.setId_presentacion(Id_Presentaciones);
                pre.setPowerpoint(PowerPoint);
                pre.setPresen_descripcion(Presen_descripcion);
                dao.agregar(pre);
                request.getRequestDispatcher("ControladorPre?accion=Listar").forward(request, response);
                break;
            }
            case "Editar" -> {
                String Id_presentacion = request.getParameter("Id_presentacion");
                presentaciones pres = dao.listarId( Id_presentacion);
                request.setAttribute("presentaciones", pres);
                request.getRequestDispatcher("jsp/crud-presentaciones-edit.jsp").forward(request,response);
                break;
            }
            case "Actualizar" ->{
                String Id_presentacion1 = request.getParameter("txtidpre");
                String Powerpoint1 = request.getParameter("txtpowerpoint");
                String Presen_descripcion1 = request.getParameter("txtdescrip");
                pre.setId_presentacion(Id_presentacion1);
                pre.setPowerpoint(Powerpoint1);
                pre.setPresen_descripcion(Presen_descripcion1);
                dao.actualizar(pre);
                request.getRequestDispatcher("ControladorPre?accion=Listar").forward(request,response);
            }
            case "Borrar" -> {
                String Id_presentacion2 = request.getParameter("Id_presentacion");
                dao.delete(Id_presentacion2);
                request.getRequestDispatcher("ControladorPre?accion=Listar").forward(request, response);
                break;
            }
            default -> throw new AssertionError();
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
