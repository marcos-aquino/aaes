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
public class Doc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JogadorProfissional profissional = new JogadorProfissional(null);
        JogadorAvancado avancado = new JogadorAvancado(profissional);
        JogadorRegular regular = new JogadorRegular(avancado);        
        JogadorIniciante iniciante = new JogadorIniciante(regular);
        
        System.out.println(                
                iniciante.verificarRankingJogador(
                new Ranking(TipoRankingPlatina.getTipoRankingPlatina())));
        
        System.out.println(                
                iniciante.verificarRankingJogador(
                new Ranking(TipoRankingDiamante.getTipoRankingDiamante())));
        
        System.out.println(                
                iniciante.verificarRankingJogador(
                new Ranking(TipoRankingPrata.getTipoRankingPrata())));
        
        System.out.println(                
                iniciante.verificarRankingJogador(
                new Ranking(TipoRankingOuro.getTipoRankingOuro())));
        
        System.out.println(                
                iniciante.verificarRankingJogador
        (
                new Ranking(TipoRankingBronze.getTipoRankingBronze())));      
        
        
    }
    
}
