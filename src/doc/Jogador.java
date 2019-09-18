/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doc;

import java.util.ArrayList;

/**
 *
 * @author ice
 */
public abstract class Jogador {
    
    protected ArrayList listaRankings = new ArrayList();
    private Jogador jogadorSuperior;

    public ArrayList getListaRankings() {
        return listaRankings;
    }

    public void setListaRankings(ArrayList listaRankings) {
        this.listaRankings = listaRankings;
    }

    public Jogador getJogadorSuperior() {
        return jogadorSuperior;
    }

    public void setJogadorSuperior(Jogador jogadorSuperior) {
        this.jogadorSuperior = jogadorSuperior;
    }
    
    public abstract String getDescricaoRanking();
    
    public String verificarRankingJogador(Ranking ranking){
        
        if(listaRankings.contains(ranking.getTipoRanking())){
            
            return getDescricaoRanking();
            
            
        }
        else{
            
            if(jogadorSuperior != null){
                
                return jogadorSuperior.verificarRankingJogador(ranking);
            }
            else{
                return "sem ranking";
            }
            
        }
        
        
        
    }
    
}
