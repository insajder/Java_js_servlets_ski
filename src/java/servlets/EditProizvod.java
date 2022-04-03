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
import models.Proizvod;

/**
 *
 * @author WINDOWS 10
 */
public class EditProizvod extends HttpServlet {

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
        int id = Integer.parseInt(request.getParameter("id"));
        
        for(Proizvod p: ListeModela.listaProizvoda){
            if(p.getId()==id){
                request.setAttribute("proizvod", p);
                break;
            }
        }
        request.setAttribute("kategorije", ListeModela.listaKategorija);
        request.getRequestDispatcher("proizvod/izmeniProizvod.jsp").forward(request, response);
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
        String kategorija = request.getParameter("kategorija");
        
        boolean provera=false;
        for(Proizvod p: ListeModela.listaProizvoda){
            if(p.getId() != id && p.getNaziv().toLowerCase().equals(naziv.toLowerCase())){
                request.setAttribute("poruka", "Proizvod postoji");
                provera=true;
                break;
            }
        }
        if(provera==false){
            for(Proizvod p: ListeModela.listaProizvoda){
                if(p.getId()==id){
                    p.setNaziv(naziv);
                    p.setCena(Double.parseDouble(request.getParameter("cena")));
                    p.setOpis(request.getParameter("opis"));
                    for(Kategorija k: ListeModela.listaKategorija){
                        if(k.getNaziv().equals(kategorija)){
                            p.setKategorija(k);
                            break;
                        }
                    }
                    request.setAttribute("success", "Uspesna izmena");
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
