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
public class TipoRankingOuro implements TipoRanking{

    private static TipoRankingOuro tipoDocumentoDiploma = new TipoRankingOuro();
    
    public static TipoRankingOuro getTipoRankingOuro(){
        
        return tipoDocumentoDiploma;
    }
}
