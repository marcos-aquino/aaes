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
public class JogadorProfissional extends Jogador{
    
    public JogadorProfissional(Jogador superior){
        
        listaRankings.add(TipoRankingDiamante.getTipoRankingDiamante());
        listaRankings.add(TipoRankingPlatina.getTipoRankingPlatina());
        setJogadorSuperior(superior);
        
    }
    
    public String getDescricaoRanking(){
        return "Pro Player";
    }
    
}
