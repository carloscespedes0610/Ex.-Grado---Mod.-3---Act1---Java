/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act1_resolve;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author cespe
 */
public class Act1_Resolve {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Act act =new Act();
        System.out.println("p1: "+act.is_older(new Date(2017, 12, 28), new Date(2017, 12, 28)));
        
        /* mes: 0-11 */
        List<Date> fechas=new ArrayList();
        fechas.add(new Date(2017, 8, 29)); fechas.add(new Date(2016, 9, 3));
        fechas.add(new Date(1998, 11, 30)); fechas.add(new Date(2000, 10, 06));
        fechas.add(new Date(2012, 11, 21)); fechas.add(new Date(2040, 1, 1));
        fechas.add(new Date(2015, 11, 31)); fechas.add(new Date(2001, 5, 9));
        
        System.out.println("p2: "+act.number_in_month(fechas, 11));
        List<Integer> meses = new ArrayList<>();
        meses.add(1);
        meses.add(11);
        meses.add(8);
        System.out.println("p3: "+act.number_in_months(fechas, meses));
    }
    
}
