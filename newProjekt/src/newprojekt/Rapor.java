// Şevval Arslan 170503031
package newprojekt;

import javafx.beans.property.StringProperty;
import javafx.scene.control.DateCell;


public class Rapor {
    private final StringProperty raporNo;
    private final DateCell raporTarihi;
    
    public Rapor(StringProperty raporNo, DateCell raporTarihi ){
        this.raporNo = raporNo;
        this.raporTarihi = raporTarihi;
    }
    /**
     * @return the raporNo
     */
    public StringProperty getRaporNo() {
        return raporNo;
    }

    /**
     * @return the raporTarihi
     */
    public DateCell getRaporTarihi() {
        return raporTarihi;
    }   
   
    
}
