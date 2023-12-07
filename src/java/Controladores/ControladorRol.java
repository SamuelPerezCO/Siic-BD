package Controladores;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ModelosDAO.RolDAO;
import Modelos.Roles;

/**
 *
 * @author Juan Pablo
 */
public class ControladorRol extends HttpServlet {
    RolDAO dao = new RolDAO();
    Roles rol = new Roles();

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
            out.println("<title>Servlet ControladorRol</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControladorRol at " + request.getContextPath() + "</h1>");
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
                List<Roles>datos=dao.listar();
                request.setAttribute("datos", datos);
                request.getRequestDispatcher("jsp/crud-roles.jsp").forward(request, response);
            }
                
            case"Agregar" -> {
                request.getRequestDispatcher("jsp/crud-roles-add.jsp").forward(request, response);
            }
            case"Guardar" -> {
                //System.out.println("si entro a guardar");
                int id_rol = Integer.parseInt(request.getParameter("txtid_rol"));
                String nombre_rol = request.getParameter("txtnombre_rol");
                rol.setId_rol(id_rol);
                rol.setNombre_rol(nombre_rol);
                dao.agregar(rol);
                //System.out.println("salio de guardar");
                request.getRequestDispatcher("ControladorRol?accion=Listar").forward(request, response);
            }
            case"Editar" -> {
                int id_edit = Integer.parseInt(request.getParameter("id_rol"));
                Roles roll=dao.listarId(id_edit);
                request.setAttribute("Roles", roll);
                request.getRequestDispatcher("jsp/crud-roles-edit.jsp").forward(request, response);
            }
            case"Modificar" -> {
                int idMod = Integer.parseInt(request.getParameter("txtid_rol"));
                String nombreMod = request.getParameter("txtnombre_rol");
                rol.setId_rol(idMod);
                rol.setNombre_rol(nombreMod);
                dao.modificar(rol);
                request.getRequestDispatcher("ControladorRol?accion=Listar").forward(request, response);
            }
            case"Borrar" -> {
                int idBorrar =Integer.parseInt(request.getParameter("id_rol"));
                dao.borrar(idBorrar); 
                request.getRequestDispatcher("ControladorRol?accion=Listar").forward(request, response);
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
