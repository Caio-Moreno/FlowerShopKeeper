/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import DAO.movimentacaoDAO;

/**
 *
 * @author caiomoreno
 */
public class movimentacaoController
{
    public static ArrayList<String> pesquisaPlantas()
    {
        return movimentacaoDAO.pesquisaPlanta();
        
    }
    
}