/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controladores;

import Modelos.Asistencia;
import ModelosDAO.AsistenciaDAO;
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
public class ControladorAsis extends HttpServlet {
    AsistenciaDAO dao = new AsistenciaDAO();
    Asistencia Asistencia = new Asistencia();
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
            out.println("<title>Servlet ControladorAsis</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControladorAsis at " + request.getContextPath() + "</h1>");
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
        switch (accion){
            case "Listar" -> {
                List<Asistencia>datos = dao.listar();
                request.setAttribute("datos" ,datos);
                request.getRequestDispatcher("jsp/crud-asistencia.jsp").forward(request , response);
                break;
            }
            case "Nuevo" -> {
                request.getRequestDispatcher("jsp/crud-asistencia-add.jsp").forward(request,response);
                break;
            } 
            case "Guardar" -> {
                int DIA = Integer.parseInt(request.getParameter("intDia"));
                int MES = Integer.parseInt(request.getParameter("intMes"));
                int ANIO = Integer.parseInt(request.getParameter("intAnio"));
                int CODIGO_CLASE_ASISTENCIA = Integer.parseInt(request.getParameter("intCodigoCA"));
                int ID_USUARIO_ASISTENCIA = Integer.parseInt(request.getParameter("intCodigoUA"));
                Asistencia.setDIA(DIA);
                Asistencia.setMES(MES);
                Asistencia.setANIO(ANIO);
                Asistencia.setCODIGO_CLASE_ASISTENCIA(CODIGO_CLASE_ASISTENCIA);
                Asistencia.setID_USUARIO_ASISTENCIA(ID_USUARIO_ASISTENCIA);
                dao.agregar(Asistencia);
                request.getRequestDispatcher("ControladorAsis?accion=Listar").forward(request,response);
                break;
            }
            case "Editar" ->{
                int id = Integer.parseInt(request.getParameter("Id_asistencia"));
                Asistencia as = dao.listarId(id);
                request.setAttribute("Asistencia" , as);
                request.getRequestDispatcher("jsp/crud-asistencia-edit.jsp").forward(request, response);
                break;
            }
            case "Actualizar" -> {
                int DIA2 = Integer.parseInt(request.getParameter("intDia"));
                int MES2 = Integer.parseInt(request.getParameter("intMes"));
                int ANIO2 = Integer.parseInt(request.getParameter("intAnio"));
                int CODIGO_CLASE_ASISTENCIA2 = Integer.parseInt(request.getParameter("intCodigoCA"));
                int ID_USUARIO_ASISTENCIA2 = Integer.parseInt(request.getParameter("intIDUA"));
                System.out.println("ID_USUARIO_ASISTENCIA2 es = " + ID_USUARIO_ASISTENCIA2);
                Asistencia.setDIA(DIA2);
                Asistencia.setMES(MES2);
                Asistencia.setANIO(ANIO2);
                Asistencia.setCODIGO_CLASE_ASISTENCIA(CODIGO_CLASE_ASISTENCIA2);
                Asistencia.setID_USUARIO_ASISTENCIA(ID_USUARIO_ASISTENCIA2);
                dao.actualizar(Asistencia);
                request.getRequestDispatcher("ControladorAsis?accion=Listar").forward(request, response);
                break;
            }
            case "Borrar" -> {
                int id2 = Integer.parseInt(request.getParameter("Id_asistencia"));
                dao.Borrar(id2);
                request.getRequestDispatcher("ControladorAsis?accion=Listar").forward(request,response);
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
