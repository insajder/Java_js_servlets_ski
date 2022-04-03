/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modellist.ListeModela;
import models.Kategorija;

/**
 *
 * @author WINDOWS 10
 */
public class EditKategorija extends HttpServlet {

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
        request.setAttribute("kategorije", ListeModela.listaKategorija);
        
        int id = Integer.parseInt(request.getParameter("id"));
        
        for(Kategorija k: ListeModela.listaKategorija){
            if(k.getId()==id){
                request.setAttribute("kategorija", k);
                break;
            }
        }
        
        request.getRequestDispatcher("kategorija/izmeniKategoriju.jsp").forward(request, response);
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
        int id = Integer.parseInt(request.getParameter("id"));
        String naziv = request.getParameter("naziv");
        
        boolean provera=false;
        for(Kategorija k: ListeModela.listaKategorija){
            if(k.getId() != id && k.getNaziv().toLowerCase().equals(naziv.toLowerCase())){
                request.setAttribute("poruka", "Kategorija sa ovim nazivom postoji");
                provera=true;
                break;
            }
        }
        if(provera==false){
            for(Kategorija k: ListeModela.listaKategorija){
                if(k.getId()==id){
                    k.setNaziv(naziv);
                    request.setAttribute("success", "Uspesno ste izmenili kategoriju");
                    break;
                }
            }
        }
        processRequest(request, response);
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
