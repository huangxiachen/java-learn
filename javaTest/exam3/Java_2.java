//*********Found**********

import java.lang.*;
import java.util.Vector;

public class Java_2
{
   public static void main(String args[])
   {
      Vector v=new Vector();
      try
      {
         //*********Found**********
         BufferedReader in = new BufferedReader(new InputStreamReader());
         String str = "";
         System.out.println("�������û���������Ϣ���м��ÿո����������quit�˳�:");
         //*********Found**********
         while (!(str.equals("quit")||str.equals("QUIT")))
         {
            str = in.readLine();
            if(isValid(str))
               v.add(str);
            else 
            {
               if(!(str.equals("quit")||str.equals("QUIT")))
                  System.out.println("The string is NOT valid!");
            }
         }
        
         System.out.println("�����뱣�浽���ļ���:");
         str=in.readLine();

         String curDir = System.getProperty("user.dir");
         File savedfile=new File(curDir+"\\"+   str   );
            
         BufferedWriter out = new BufferedWriter(new FileWriter(savedfile));
         for(int i=0; i<v.size(); i++)
         {
            String tmp=(String)v.elementAt(i);
         //*********Found**********
            out.write(tmp);
            out.write("\n");
         }
         out.close();
        
      }
      catch (Exception e)
      {
         System.out.print("ERROR:"+e.getMessage());	
      }
   }
	
   /**
   * �ж�������ַ����Ƿ���Ϲ淶
   * @param  s  ����Ĵ�У����ַ���
   * @return    У��Ľ������ȷ�򷵻�Ϊ��
   */
   public static boolean isValid(String s)
   {
      if(s.indexOf(" ")>0)
         return true;
      else
         return false;
   }
}
