import java.util.*;
public class plndromStringStack 
{
    public String revertseString(String str)
    {
        Stack<Character> stac=new Stack<>();
        char[] ss=str.toCharArray();
       
        for(int i=0;i<str.length();i++)
        {
            stac.push(ss[i]);
        }
        int k=0;
        while(!stac.isEmpty())
        {
            ss[k]=stac.pop();
            k++;
        }
        return String.copyValueOf(ss);
    }
    public static void main(String args[])
    {
        plndromStringStack obj=new plndromStringStack();
        String str="madam";
        String cmp=str;
        String result=obj.revertseString(str);
        if(cmp.equals(result))
        {
            System.out.println("True"+" "+cmp+" "+result);
        }
        else
        {
            System.out.println("False"+" "+cmp+" "+result);
        }
    }

    }