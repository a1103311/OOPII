import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

class myJFrame extends JFrame implements ActionListener{
    private JPanel contentPane;
    private static String text;
    private static ArrayList<String> al = new ArrayList<String>();
    myJFrame(){
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("CALCULATOR");
        setBounds(100,100,800,800);
        setVisible(true);
        
        
        contentPane = new JPanel();
        //contentPane.setLayout(null);
        //contentPane.setLayout(new BorderLayout(10,10));
        //contentPane.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
        contentPane.setLayout(new GridLayout(4,4,5,5));
        setContentPane(contentPane);

        JButton btn1 = new JButton("1");
        btn1.addActionListener(this);
        contentPane.add(btn1);

        JButton btn2 = new JButton("2");
        btn2.addActionListener(this);
        contentPane.add(btn2);

        JButton btn3 = new JButton("3");
        btn3.addActionListener(this);
        contentPane.add(btn3);

        JButton btn4 = new JButton("+");
        btn4.addActionListener(this);
        contentPane.add(btn4);

        JButton btn5 = new JButton("4");
        btn5.addActionListener(this);
        contentPane.add(btn5);

        JButton btn6 = new JButton("5");
        btn6.addActionListener(this);
        contentPane.add(btn6);

        JButton btn7 = new JButton("6");
        btn7.addActionListener(this);
        contentPane.add(btn7);

        JButton btn8 = new JButton("-");
        btn8.addActionListener(this);
        contentPane.add(btn8);

        JButton btn9 = new JButton("7");
        btn9.addActionListener(this);
        contentPane.add(btn9);

        JButton btn10 = new JButton("8");
        btn10.addActionListener(this);
        contentPane.add(btn10);

        JButton btn11 = new JButton("9");
        btn11.addActionListener(this);
        contentPane.add(btn11);

        JButton btn12 = new JButton("*");
        btn12.addActionListener(this);
        contentPane.add(btn12);

        JButton btn13 = new JButton("0");
        btn13.addActionListener(this);
        contentPane.add(btn13);

        JButton btn14 = new JButton("=");
        btn14.addActionListener(this);
        contentPane.add(btn14);

        JButton btn15 = new JButton("/");
        btn15.addActionListener(this);
        contentPane.add(btn15);
    }
    public void actionPerformed(ActionEvent e){
        JButton namBtn=(JButton)e.getSource();
        int ans=0;
        text = namBtn.getText();
        if(text != "="){
            al.add(text);
        }
        else{
            ans = calculate();
            JOptionPane.showMessageDialog(null,ans);
        }

    }
    public int calculate(){
        int ans = 0;
        int num1 = 0;
        int cW = 0;
        int num2 = 0;
        while(al.get(0)=="1"||al.get(0)=="2"||al.get(0)=="3"||al.get(0)=="4"||al.get(0)=="5"||al.get(0)=="6"||al.get(0)=="7"||al.get(0)=="8"||al.get(0)=="9"||al.get(0)=="0"){
            int a = Integer.parseInt(al.get(0));
            num1=num1*10+a;
            al.remove(0);

        }

        switch(al.get(0)){
            case "+":
                cW=1;
                break;
            case "-":
                cW=2;
                break;
            case "*":
                cW=3;
                break;
            case "/":
                cW=4;
                break;
        }
        al.remove(0);
        while(al.isEmpty()==false){
            if(al.get(0)=="1"||al.get(0)=="2"||al.get(0)=="3"||al.get(0)=="4"||al.get(0)=="5"||al.get(0)=="6"||al.get(0)=="7"||al.get(0)=="8"||al.get(0)=="9"||al.get(0)=="0"){
                int a = Integer.parseInt(al.get(0));
                num2=num2*10+a;
                al.remove(0);
            }
        }
        switch(cW){
            case 1:
                ans=num1+num2;
                break;
            case 2:
                ans=num1-num2;
                break;
            case 3:
                ans=num1*num2;
                break;
            case 4:
                ans=num1/num2;
                break;
        }
        return ans;
    }
} 


public class calculatorPractice {
    
    public static void main(String[] args)throws Exception{
        
        myJFrame f1 = new myJFrame();

    }
}


