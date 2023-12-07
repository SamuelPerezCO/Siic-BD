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
import Modelos.PreCla;
import ModelosDAO.PreClaDAO;

/**
 *
 * @author Juan Pablo
 */
public class ControladorPreCla extends HttpServlet {
    PreCla pc = new PreCla();
    PreClaDAO dao = new PreClaDAO();

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
            out.println("<title>Servlet ControladorPreCla</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControladorPreCla at " + request.getContextPath() + "</h1>");
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
                System.out.println("hola");
                System.out.println("si entro");
                List<PreCla>datos=dao.listar();
                request.setAttribute("datos", datos);
                request.getRequestDispatcher("jsp/crud-precla.jsp").forward(request, response);
                break;
            }
                
            case"Agregar" -> {
                request.getRequestDispatcher("jsp/crud-precla-add.jsp").forward(request, response);
                break;
            }
            case"Guardar" -> {
                //System.out.println("si entro a guardar");
                int id_pc = Integer.parseInt(request.getParameter("txtid_pc"));
                int codigo_clase = Integer.parseInt(request.getParameter("txtcodigo_clase"));
                int codigo_presen = Integer.parseInt(request.getParameter("txtcodigo_presen"));
                pc.setId_pres_cla(id_pc);
                pc.setCodigo_clase(codigo_clase);
                pc.setCodigo_presen(codigo_presen);
                dao.agregar(pc);
                //System.out.println("salio de guardar");
                request.getRequestDispatcher("ControladorPreCla?accion=Listar").forward(request, response);
                break;
            }
            case"Editar" -> {
                int id_edit = Integer.parseInt(request.getParameter("id_pc"));
                PreCla pc2=dao.listarId(id_edit);
                request.setAttribute("PreCla", pc2);
                request.getRequestDispatcher("jsp/crud-precla-edit.jsp").forward(request, response);
                break;
            }
            case"Modificar" -> {
                int idMod = Integer.parseInt(request.getParameter("txtid_pc"));
                int CCMod = Integer.parseInt(request.getParameter("txtcodigo_clase"));
                int CPMod = Integer.parseInt(request.getParameter("txtcodigo_presen"));
                pc.setId_pres_cla(idMod);
                pc.setCodigo_clase(CCMod);
                pc.setCodigo_presen(CPMod);
                dao.modificar(pc);
                request.getRequestDispatcher("ControladorPreCla?accion=Listar").forward(request, response);
                break;
            }
            case"Borrar" -> {
                int idBorrar =Integer.parseInt(request.getParameter("id_pc"));
                dao.borrar(idBorrar); 
                request.getRequestDispatcher("ControladorPreCla?accion=Listar").forward(request, response);
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
