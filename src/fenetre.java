import java.awt.event.*;
import javax.swing.*;

public class fenetre extends JFrame{
    JLabel l1,l2;
    JTextField T1,T2;
    JButton copie,couper,fermer;

    public fenetre(){
        l1=new JLabel("texte1");
        l2=new JLabel("texte2");
        T1=new JTextField();
        T2=new JTextField();
        copie=new JButton("copier");
        couper=new JButton("couper ");
        fermer=new JButton("Fermer ");

    
     ActionListener act=new ActionListener(){
         public void actionPerformed(ActionEvent e){
             if(e.getSource()==fermer){
                 System.exit(0);
             }
             else if(e.getSource()==copie){
                 String s=T1.getText();
                 T2.setText(s);
             }
             else if(e.getSource()==couper){
                 String s=T1.getText();
                 T2.setText(s);
                 T1.setText("");

             }
         }
};
this.setLayout(null);
copie.addActionListener(act);
fermer.addActionListener(act);
couper.addActionListener(act);
this.setBounds(50,50,400,200);
l1.setBounds(20,20,60,20);
T1.setBounds(100,20,100,20);

l2.setBounds(20,60,60,20);
T2.setBounds(100,60,100,20);
copie.setBounds(30,100,80,20);
couper.setBounds(120,100,80,20);
fermer.setBounds(210,100,80,20);
this.add(l1);
this.add(l2);
this.add(T1);
this.add(T2);
this.add(copie);
this.add(couper);
this.add(fermer);
}
     public static void main(String[] args) {
         fenetre f=new fenetre();
         f.setVisible(true);
     }
}
    JTextField T1,T2;
    JButton copie,couper,fermer;

    public fenetre(){
        l1=new JLabel("texte1");
        l2=new JLabel("texte2");
        T1=new JTextField();
        T2=new JTextField();
        copie=new JButton("copier");
        couper=new JButton("couper ");
        fermer=new JButton("Fermer ");

    
     ActionListener act=new ActionListener(){
         public void actionPerformed(ActionEvent e){
             if(e.getSource()==fermer){
                 System.exit(0);
             }
             else if(e.getSource()==copie){
                 String s=T1.getText();
                 T2.setText(s);
             }
             else if(e.getSource()==couper){
                 String s=T1.getText();
                 T2.setText(s);
                 T1.setText("");

             }
         }
};
this.setLayout(null);
copie.addActionListener(act);
fermer.addActionListener(act);
couper.addActionListener(act);
this.setBounds(50,50,400,200);
l1.setBounds(20,20,60,20);
T1.setBounds(100,20,100,20);

l2.setBounds(20,60,60,20);
T2.setBounds(100,60,100,20);
copie.setBounds(30,100,80,20);
couper.setBounds(120,100,80,20);
fermer.setBounds(210,100,80,20);
this.add(l1);
this.add(l2);
this.add(T1);
this.add(T2);
this.add(copie);
this.add(couper);
this.add(fermer);
}
     public static void main(String[] args) {
         fenetre f=new fenetre();
         f.setVisible(true);
     }
}