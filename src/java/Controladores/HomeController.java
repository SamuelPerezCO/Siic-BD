 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controladores;

import ModelosDAO.UsuarioDAO;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Modelos.Usuario;
/**
 *
 * @author Asus
 */
public class HomeController extends HttpServlet {

    UsuarioDAO daoUsuario = new UsuarioDAO();
    Usuario Usuario = new Usuario();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        switch (accion) {
            case "Iniciar Sesion" ->  {
                String username = request.getParameter("username");
                String password = request.getParameter("password");
                Usuario usuarioLogin = daoUsuario.inicioSesion(username, password);
                if (usuarioLogin != null) {
                    switch (usuarioLogin.getCodigo_perfil()) {
                        case 1:
                            // Administrador
                            response.sendRedirect("/Siic/jsp/profesor.jsp");
                            System.out.println("No fue a la segunda");
                            break;
                        case 2:
                            // Estudiante
                            response.sendRedirect("/Siic/jsp/inicio.jsp");
                            System.out.println("soy estudiante y Me quede aqui");
                            break;
                        default:
                            // Por defecto
                            response.sendRedirect("/Siic/jsp/index.jsp");
                            System.out.println("Me quede aqui");
                            break;
                    }
                } else {
                    response.sendRedirect("/Siic/jsp/index.jsp");
                    System.out.println("Me quede aqui");
                }
            }
            case "Registrarse" ->  {

                String username = request.getParameter("usernameR");
                String password = request.getParameter("passwordR");
                String email = request.getParameter("email");
                Usuario usuarioRegistrado = new Usuario(8, password, username, "1", "1", email, 2);
                if (daoUsuario.registrarUsuario(usuarioRegistrado) == true) {
                    System.out.println("Se registro");
                }
                response.sendRedirect("jsp/index.jsp");
            }
            case "Listar" -> {
                List<Usuario>datos=daoUsuario.listar();
                request.setAttribute("datos" , datos);
                request.getRequestDispatcher("jsp/crud-usuarios.jsp").forward(request,response);
                break;
            }
            case "Nuevo" ->{
                request.getRequestDispatcher("jsp/crud-usuarios-add.jsp").forward(request, response);
                break;
            }
            
            case "Guardar" -> {
                int ID_USUARIO = Integer.parseInt(request.getParameter("ID_USUARIO"));
                String Contrasenia = request.getParameter("txtccusuario");
                String US_NOMBRE = request.getParameter("txtusnombre");
                String US_APELLIDO = request.getParameter("txtusapellido");
                String US_SEGAPELLIDO = request.getParameter("txtussegapellido");
                String CORREO = request.getParameter("txtcorreo");
                int CODIGO_PERFIL = Integer.parseInt(request.getParameter("CODIGO_PERFIL"));
                Usuario.setId_usuario(ID_USUARIO);
                Usuario.setContrasenia(Contrasenia);
                Usuario.setCc_nombre(US_NOMBRE);
                Usuario.setCc_apellido(US_APELLIDO);
                Usuario.setCc_segApellido(US_SEGAPELLIDO);
                Usuario.setCorreo(CORREO);
                Usuario.setCodigo_perfil(CODIGO_PERFIL);
                daoUsuario.agregar(Usuario);
                request.getRequestDispatcher("HomeController?accion=Listar").forward(request,response);
                break;
            }
            
            case "Editar" -> {
                int id = Integer.parseInt(request.getParameter("id"));
                System.out.println("Id es " + id);
                Usuario us = daoUsuario.listarId(id);
                System.out.println("El usuario es = " + us);
                request.setAttribute("usuario" , us);
                request.getRequestDispatcher("jsp/crud-usuarios-edit.jsp").forward(request , response);
                break;
            }
            
            case "Actualizar" -> {
                int ID_USUARIO2 = Integer.parseInt(request.getParameter("ID_USUARIO"));
                String Contrasenia2 = request.getParameter("txtccusuario");
                String US_NOMBRE2 = request.getParameter("txtusnombre");
                String US_APELLIDO2 = request.getParameter("txtusapellido");
                String US_SEGAPELLIDO2 = request.getParameter("txtussegapellido");
                String CORREO2 = request.getParameter("txtcorreo");
                int CODIGO_PERFIL2 = Integer.parseInt(request.getParameter("CODIGO_PERFIL"));
                Usuario.setId_usuario(ID_USUARIO2);
                Usuario.setContrasenia(Contrasenia2);
                Usuario.setCc_nombre(US_NOMBRE2);
                Usuario.setCc_apellido(US_APELLIDO2);
                Usuario.setCc_segApellido(US_SEGAPELLIDO2);
                Usuario.setCorreo(CORREO2);
                Usuario.setCodigo_perfil(CODIGO_PERFIL2);
                daoUsuario.actualizar(Usuario);
                request.getRequestDispatcher("HomeController?accion=Listar").forward(request,response);
                break;
            }
            case "Borrar" -> {
                int id2 = Integer.parseInt(request.getParameter("id"));
                daoUsuario.Borrar(id2);
                request.getRequestDispatcher("HomeController?accion=Listar").forward(request, response);
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
