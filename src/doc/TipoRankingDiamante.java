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
public class TipoRankingDiamante implements TipoRanking{

    private static TipoRankingDiamante tipoDocumentoMatricula = new TipoRankingDiamante();
    
    public static TipoRankingDiamante getTipoRankingDiamante(){
        
        return tipoDocumentoMatricula;
    }
}
