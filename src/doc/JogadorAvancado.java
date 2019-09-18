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
public class JogadorAvancado extends Jogador{
    
    public JogadorAvancado(Jogador superior){
        
        listaRankings.add(TipoRankingOuro.getTipoRankingOuro());
        setJogadorSuperior(superior);
        
    }
    
    public String getDescricaoRanking(){
        return "Avancado";
    }
    
}
