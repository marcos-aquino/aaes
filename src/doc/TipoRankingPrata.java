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
public class TipoRankingPrata implements TipoRanking{

    private static TipoRankingPrata tipoDocumentoCertificado = new TipoRankingPrata();
    
    public static TipoRankingPrata getTipoRankingPrata(){
        
        return tipoDocumentoCertificado;
    }
}