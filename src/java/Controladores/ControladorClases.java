/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controladores;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ModelosDAO.claseDAO;
import Modelos.clase;
import java.util.Date;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author serna
 */
public class ControladorClases extends HttpServlet {

    claseDAO dao = new claseDAO();
    clase cla = new clase();
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
            out.println("<title>Servlet ControladorClases</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControladorClases at " + request.getContextPath() + "</h1>");
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
        switch(accion){
            case "Listar" -> {
                List<clase>datos = dao.listar();
                request.setAttribute("datos", datos);
                request.getRequestDispatcher("jsp/crud-clases.jsp").forward(request, response);
                break;
            }
            case "Nuevo" ->{
                request.getRequestDispatcher("jsp/crud-clases-add.jsp").forward(request, response);
                break;
            }
            case "Guardar" -> {
                int ID_CLASE = Integer.parseInt(request.getParameter("numberid"));
                String LINK_GRABACION = request.getParameter("txtlinkgrabacion");
                String CLASE_DESCRIPCION = request.getParameter("txtclase");
                cla.setID_CLASE(ID_CLASE);
                cla.setLINK_GRABACION(LINK_GRABACION);
                cla.setCLASE_DESCRIPCION(CLASE_DESCRIPCION);
                dao.agregar(cla);
                request.getRequestDispatcher("ControladorClases?accion=Listar").forward(request, response);
                break;
            }
            case "Editar" ->{
                int id = Integer.parseInt(request.getParameter("id"));
                clase clas = dao.listarId(id);
                request.setAttribute("clase", clas);
                request.getRequestDispatcher("jsp/crud-clases-edit.jsp").forward(request,response);
                break;
            }
                case "Actualizar" -> {
                    int ID_CLASE2 = Integer.parseInt(request.getParameter("numberid"));
                    String LINK_GRABACION2 = request.getParameter("txtlinkgrabacion");
                    String CLASE_DESCRIPCION2 = request.getParameter("txtclase");
                    cla.setID_CLASE(ID_CLASE2);
                    cla.setLINK_GRABACION(LINK_GRABACION2);
                    cla.setCLASE_DESCRIPCION(CLASE_DESCRIPCION2);
                    dao.actualizar(cla);
                    request.getRequestDispatcher("ControladorClases?accion=Listar").forward(request, response);
                    break;
                }
                case "Borrar" ->{
                    int ID_CLASE = Integer.parseInt(request.getParameter("id"));
                    dao.Borrar(ID_CLASE);
                    request.getRequestDispatcher("ControladorClases?accion=Listar").forward(request,response);
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
