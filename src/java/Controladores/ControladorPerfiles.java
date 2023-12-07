/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controladores;

import Modelos.Perfiles;
import ModelosDAO.PerfilesDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Juan Pablo
 */
public class ControladorPerfiles extends HttpServlet {
    Perfiles p = new Perfiles();
    PerfilesDAO dao = new PerfilesDAO();

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
            out.println("<title>Servlet ControladorPerfiles</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControladorPerfiles at " + request.getContextPath() + "</h1>");
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
                List<Perfiles>datos=dao.listar();
                request.setAttribute("datos", datos);
                request.getRequestDispatcher("jsp/crud-perfiles.jsp").forward(request, response);
            }
                
            case"Agregar" -> {
                request.getRequestDispatcher("jsp/crud-perfiles-add.jsp").forward(request, response);
            }
            case"Guardar" -> {
                //System.out.println("si entro a guardar");
                int id_perfil = Integer.parseInt(request.getParameter("txtid_perfil"));
                String descripcion_perfil = request.getParameter("txtdescripcion_perfil");
                int codigo_rol = Integer.parseInt(request.getParameter("txtcodigo_rol"));
                int codigo_permiso = Integer.parseInt(request.getParameter("txtcodigo_permiso"));
                p.setId_perfil(id_perfil);
                p.setDescripcion_perfil(descripcion_perfil);
                p.setCodigo_rol(codigo_rol);
                p.setCodigo_permiso(codigo_permiso);
                dao.agregar(p);
                //System.out.println("salio de guardar");
                request.getRequestDispatcher("ControladorPerfiles?accion=Listar").forward(request, response);
            }
            case"Editar" -> {
                int id_edit = Integer.parseInt(request.getParameter("id_perfil"));
                Perfiles p2 = dao.listarId(id_edit);
                request.setAttribute("Perfiles", p2);
                request.getRequestDispatcher("jsp/crud-perfiles-edit.jsp").forward(request, response);
            } 
            case"Modificar" -> {
                int idMod = Integer.parseInt(request.getParameter("txtid_perfil"));
                String descripcionMod = request.getParameter("txtdescripcion_perfil");
                int rolMod = Integer.parseInt(request.getParameter("txtcodigo_rol"));
                int permisoMod = Integer.parseInt(request.getParameter("txtcodigo_permiso"));
                
                p.setId_perfil(idMod);
                p.setDescripcion_perfil(descripcionMod);
                p.setCodigo_rol(rolMod);
                p.setCodigo_permiso(permisoMod);
                dao.modificar(p);
                request.getRequestDispatcher("ControladorPerfiles?accion=Listar").forward(request, response);
            }
            case"Borrar" -> {
                int idBorrar =Integer.parseInt(request.getParameter("id_perfil"));
                dao.borrar(idBorrar); 
                request.getRequestDispatcher("ControladorPerfiles?accion=Listar").forward(request, response);
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
