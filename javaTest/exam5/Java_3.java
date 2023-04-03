//**********Found**********
import java.io.*;  
import java.awt.event.* ;
import javax.swing.*;

//**********Found**********
public class Java_3 implements ActionListener{ 
    JTextArea ta;
    JFrame frame ;
   
    public static void main(String args[ ]){
      Java_3 fr = new Java_3();  
      fr.frameAndMenu();
    }
	
    void frameAndMenu(){
	frame = new JFrame();
	frame.setSize(200,150);
	frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
	JMenuBar menuBar = new JMenuBar();
	JMenu menu = new JMenu("Menu");

	JMenuItem menuItemSaveFile = new JMenuItem("SaveFile");
        //**********Found**********
	menuItemSaveFile.addActionListener(this); 
	JMenuItem menuItemExit = new JMenuItem("Exit");
        //**********Found**********
	menuItemExit.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		    System.exit(0);
		}
	});
	menu.add(menuItemSaveFile);
	menu.add(menuItemExit);
        //**********Found**********
	menuBar.add(menu); 
        frame.setJMenuBar(menuBar); 
        ta = new JTextArea(3,20);
        frame.add(ta);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLocation(600, 300);
	frame.setVisible(true);
     }
		
     public void actionPerformed(ActionEvent event){
         try{
             FileWriter  out = new FileWriter("java_3.txt");   
             //**********Found**********    
             String str = ta.getText();
             out.write(str);  
             out.close();
         } catch( Exception e){ 	}
       	 ta.setText(" ");
    }       
}