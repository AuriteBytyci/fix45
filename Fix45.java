import java.util.*;
public class Fix45
{
  public static void main(String[] args)
  {
     int [] vargu={1,4,3,4,3,6,5,5,4,6,5,5,6,4,12,3};
     for (int m: fix45(vargu,find4(vargu),find5(vargu)))
          {System.out.print(m+" ");}
   }

 private static int[] fix45(int[] a,ArrayList<Integer> katershet,ArrayList<Integer> peseshet)
     { if((katershet.size()!=peseshet.size())&& (katershet.get(katershet.size()-1)==a.length))
          {System.out.println("Vargu gabim");}

     int[] answer=new int[a.length];
  
     for ( int k=0; k<katershet.size(); k++)
         {answer[katershet.get(k)]=4;
          answer[katershet.get(k)+1]=5;
          answer[peseshet.get(k)]=a[katershet.get(k)+1];}
     for ( int r=0; r<a.length; r++)
         {if (answer[r]==0)
         {answer[r]=a[r];}}
        return answer;
      }

   private static ArrayList<Integer> find4(int[] b)
   { 
    ArrayList<Integer> vlerate4=new ArrayList<Integer>();

    for ( int j=0; j<b.length; j++)
        {if(b[j]==4)
         vlerate4.add(j);}
        
         return vlerate4;
    }



     private static ArrayList<Integer> find5(int[] c)
     { 
       ArrayList<Integer> vlerate5=new ArrayList<Integer>();
 
      for ( int j=0; j<c.length; j++)
          { if(c[j]==5)
           vlerate5.add(j);}
 
 return vlerate5;
}
}

