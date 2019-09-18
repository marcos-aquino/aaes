/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doc;

/**
 *
 * @author ice
 */
public class JogadorIniciante extends Jogador{
    
    public JogadorIniciante(Jogador superior){
        
        listaRankings.add(TipoRankingBronze.getTipoRankingBronze());
        setJogadorSuperior(superior);
        
    }
    
    public String getDescricaoRanking(){
        return "Iniciante";
    }
    
}
