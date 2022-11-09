import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class myPhotoFrame extends JFrame  {
    private JPanel contentPane;
    public int i = 0 ;
    private JCheckBox ck;
    private JRadioButton jrb1 , jrb2;
    private JLabel jl;

    myPhotoFrame() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Hello JFrame!!!");
        setBounds(100, 100, 450, 450);
        setVisible(true);

        contentPane = new JPanel();
        
        ArrayList<ImageIcon> iconArray = new ArrayList<ImageIcon>();
        ImageIcon img1= new ImageIcon("C:\\Users\\User\\OneDrive\\桌面\\OOPII\\practicesinclass\\未命名111.png");
        ImageIcon img2= new ImageIcon("C:\\Users\\User\\OneDrive\\桌面\\OOPII\\practicesinclass\\未命名.png");
        iconArray.add(img1);
        iconArray.add(img2);
        
        JLabel lab1 = new JLabel();
        
        lab1.setIcon(iconArray.get(i));
        contentPane.add(lab1);
        this.add(contentPane,BorderLayout.CENTER);
        
        
        
        JButton btn1 = new JButton("上一張");
        btn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e ){
                if(i>0){
                    i=0;
                    lab1.setIcon(iconArray.get(i));
                }else{
                    JOptionPane.showMessageDialog(null,"圖片沒了","圖片沒了",JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        

        JButton btn2 = new JButton("下一張");
        btn2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e ){
                if(i==0){
                    i = 1;
                    lab1.setIcon(iconArray.get(i));
                }else{
                    JOptionPane.showMessageDialog(null,"圖片沒了","圖片沒了",JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        
        JPanel ctp2;
        ctp2 = new JPanel();
        ctp2.add(btn1);
        ctp2.add(btn2);
        ctp2.setBackground(Color.CYAN);
        this.add(ctp2,BorderLayout.SOUTH);

    }
}
public class showPhotoPractice {
    public static void main(String[] args){
        myPhotoFrame f1 = new myPhotoFrame();
        
    }
    
}
