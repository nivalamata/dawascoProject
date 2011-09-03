
import java.util.*;
import java.io.*;
public class horton
{
   private String o1;
   private String o2;
    

	
	

   Vector<horton> vo= new Vector<horton>(100,20);
   //horton[] ob =new horton[20];

/*  public  horton(String a, String b)
  {
     o1=a;
     o2=b;
  }*/
/*public horton( )
{
    o1="null";
    o2="null";

}*/
public horton()
{
    String aline;
    String[] atoken;
   //horton[] ob =new horton[500];
   
     Vector<horton> ob= new Vector<horton>();
    try
    {
        BufferedReader filescan =new BufferedReader(new InputStreamReader(new FileInputStream("customer.txt")));
       int i=0;
	   atoken =new String[10];
       while((aline=filescan.readLine()) !=null)
       {
	   
	   
           atoken=aline.split("[~]");

         // ob[i].o1 =atoken[0];
         // ob[i].o2 =atoken[1];
          //ob.add()
		horton a  = new horton(atoken[0],atoken[1]);
		ob.add(a);
          vo.add(ob.get(i));
           ++i;
        
     

       }

    }
    catch(IOException e)
{
e.printStackTrace();
System.exit(1);
}

catch(ArrayIndexOutOfBoundsException e) {
//System.out.println("Index-out-of-bounds exception caught ");

}
}

 public  horton(String a,String b )
  {
    //arr= new String[2];
  
  
     o1=a;
     o2=b;
	
	  
      
	  
  }
public String  geto1()
   {
       return o1;
   }
public String  geto2()
   {
       return o2;
   }
   
  
   
public void seto1(String a)
{
    o1=a;
}
public void seto2(String b)
{
    o1=b;
}

public Vector<horton> getvo()
{
return vo;
}

}
