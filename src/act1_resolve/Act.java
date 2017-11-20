/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act1_resolve;

import java.util.Date;
import java.util.List;

/**
 *
 * @author cespe
 */
public class Act {
    
    private int c_number_in_month;
    private int cs_number_in_months;

    public Act() {
        c_number_in_month=0;
        cs_number_in_months=0;
    }
    
    
    
    public boolean is_older (Date fecha1, Date fecha2){
        int fec1=fecha1.getYear()*10000+fecha1.getMonth()*100+fecha1.getDay();
        int fec2=fecha2.getYear()*10000+fecha2.getMonth()*100+fecha2.getDay();
        return(fec1<fec2);
    }
    
    public int number_in_month (List<Date> fechas, int mes){
        
        if(fechas==null || fechas.isEmpty()){
            return 0;
        }else{
            int m_date=fechas.get(0).getMonth();
            if(m_date==mes){
                return 1 + number_in_month(fechas.subList(1, fechas.size()), mes);
            }else{
                return number_in_month(fechas.subList(1, fechas.size()), mes);
            }
        }
    }
    
    public int number_in_months(List<Date> fechas, List<Integer> meses){
        if(meses == null || meses.isEmpty()){
            return 0;
        }else{
            cs_number_in_months+= number_in_month(fechas, meses.get(0)) + 
                    number_in_month(fechas, meses.subList(1, meses.size()).get(0));
            return cs_number_in_months;
        }
    }
}
