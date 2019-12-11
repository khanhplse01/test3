/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author phanluukhanh
 */
public class Information {
         private String codeNumber; // mã số 
        private String name; // tên 
        private String publishers; // nhà xuất bản
        private int noe; // lần tái bản 
        private int yop; // năm xuất bản
        public String nld; // ngày cho mượn gần nhất
        public String nrd; // ngày trả sách gần nhất
public Information ( String iCodeNumber, String iName, String iPublishers, int iNoe, int iYop, String iNld, String iNrd    )
{
    codeNumber=iCodeNumber;
    name=iName;
    publishers=iPublishers;
    noe = iNoe;
    yop=iYop;
    nld=iNld;
    nrd=iNrd;
    
    
}
public void aboutBook ()
{
    System.out.println("information about book: "+name);
    System.out.println("Code Number: "+codeNumber);
    System.out.println("Publishers: "+publishers);
    System.out.println("Numbers of Edition: "+noe);
    System.out.println("Year of Publish: "+yop);
    System.out.println("Nearest Loan Day: "+nld);
    System.out.println("Nearest Return Day: "+nrd);
}
    
}
