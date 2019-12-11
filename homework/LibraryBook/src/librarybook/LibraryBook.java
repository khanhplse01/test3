/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarybook;

import Data.Information;

/**
 *
 * @author phanluukhanh
 */
public class LibraryBook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Information bookOne = new Information("GSE010972","A First Course in Database Systems", "Jeffrey D.Ullman and Fennifer Widom", 3, 2014, "11/7/2018", "22/7/2018");
        bookOne.aboutBook();
    }
    
}
