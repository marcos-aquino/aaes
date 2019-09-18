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
public class TipoRankingBronze implements TipoRanking{

    private static TipoRankingBronze tipoDocumentoBoleto = new TipoRankingBronze();
    
    public static TipoRankingBronze getTipoRankingBronze(){
        
        return tipoDocumentoBoleto;
    }

    
}
