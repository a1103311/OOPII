import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class mySpotFrame extends JFrame implements ListSelectionListener{
    private JLabel jb;
    private JList<String> jl;
    private JTextArea jta;
    private JScrollPane jsp1,jsp2;
    String locations[] = {"台北", "桃園", "台中", "彰化", "嘉義", "高雄", "屏東", "台東", "花蓮", "宜蘭"};
    String spot[] = {"西門町", "沒有喔", "金錢豹", "肉圓應該算景點", "阿里山", "瑞豐夜市", "OK不知道", "七星潭", "大魯閣是花蓮嗎", "民宿很好玩"};
    public void start(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("各地景點");
        setBounds(0,0,300,300);
        setVisible(true);
        setLayout(null);
        
        jb = new JLabel("找景點囉!");
        jb.setBounds(35,35,120,40);
        this.add(jb);
        
        jl = new JList<String>(locations);
        jl.addListSelectionListener(this);
        jsp1= new JScrollPane(jl);
        jsp1.setBounds(140,40, 100, 100);
        this.add(jsp1);
        
        jta = new JTextArea("可選取地名");
        jsp2 = new JScrollPane(jta,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jsp2.setBounds(40,150,200,100);
        this.add(jsp2);
    }
    @Override
    public void valueChanged(ListSelectionEvent e) {
        String text="";
        for(int i = 0 ; i < locations.length ; i++){
            if(jl.isSelectedIndex(i)){
                text +=locations[i]+"的景點"+" : "+spot[i]+"\n";
            }
        }
        jta.setText(text);
    }
}

public class findSpot {
    public static void main(String[] args){
        mySpotFrame f = new mySpotFrame();
        f.start();
    }    
}
