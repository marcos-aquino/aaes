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
public class TipoRankingPlatina implements TipoRanking{

    private static TipoRankingPlatina tipoDocumentoHistorico = new TipoRankingPlatina();
    
    public static TipoRankingPlatina getTipoRankingPlatina(){
        
        return tipoDocumentoHistorico;
    }
}
