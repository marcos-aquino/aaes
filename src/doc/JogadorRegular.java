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
public class JogadorRegular extends Jogador{
    
    public JogadorRegular(Jogador superior){
        
        listaRankings.add(TipoRankingPrata.getTipoRankingPrata());
        setJogadorSuperior(superior);
        
    }
    
    public String getDescricaoRanking(){
        return "Regular";
    }
    
}
