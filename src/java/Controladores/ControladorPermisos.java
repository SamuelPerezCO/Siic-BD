/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controladores;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ModelosDAO.PermisoDAO;
import Modelos.Permisos;

/**
 *
 * @author Juan Pablo
 */
public class ControladorPermisos extends HttpServlet {
    
    Permisos per = new Permisos();
    PermisoDAO daoP = new PermisoDAO();

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
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControladorPermisos</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControladorPermisos at " + request.getContextPath() + "</h1>");
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
                List<Permisos>datos=daoP.listar();
                request.setAttribute("datos", datos);
                request.getRequestDispatcher("jsp/crud-permisos.jsp").forward(request, response);
                break;
            }
            
            case"Agregar" -> {
                request.getRequestDispatcher("jsp/crud-permisos-add.jsp").forward(request, response);
                break;
            }
            case"Guardar" -> {
                int id_permiso = Integer.parseInt(request.getParameter("txtid_permiso"));
                String detalle_permiso = request.getParameter("txtdetalle_permiso");
                per.setId_permiso(id_permiso);
                per.setDetalle_permiso(detalle_permiso);
                daoP.agregar(per);
                System.out.println("salio de guardar");
                request.getRequestDispatcher("ControladorPermisos?accion=Listar").forward(request, response);
                break;
            }
            case"Editar" -> {
                int id_edit = Integer.parseInt(request.getParameter("id_permiso"));
                Permisos perm = daoP.listarId(id_edit);
                request.setAttribute("Permisos", perm);
                request.getRequestDispatcher("jsp/crud-permisos-edit.jsp").forward(request, response);
                break;
            }
            case"Modificar" -> {
                int idMod = Integer.parseInt(request.getParameter("txtid_permiso"));
                String nombreMod = request.getParameter("txtdetalle_permiso");
                per.setId_permiso(idMod);
                per.setDetalle_permiso(nombreMod);
                daoP.modificar(per);
                request.getRequestDispatcher("ControladorPermisos?accion=Listar").forward(request, response);
                break;
            }
            case"Borrar" -> {
                int idBorrar =Integer.parseInt(request.getParameter("id_permiso"));
                daoP.borrar(idBorrar); 
                request.getRequestDispatcher("ControladorPermisos?accion=Listar").forward(request, response);
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
