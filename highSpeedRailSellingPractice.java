import java.security.SecureRandom;

class sellingClass implements Runnable {
    static int tickets = 10000;
    static int toSellTickets = 0;
    int sold;
    Thread t;
    
    

    sellingClass(String name) {
        sold = 0;
        t = new Thread(this, name);
        t.start();
    }
    public void run(){
        while(sellingTickets()==true){
            sold+=toSellTickets;      
            System.out.println(t.getName()+"賣了"+sold+"張票");
        }
        System.out.println(t.getName()+"總共賣了"+sold+"張票");
    }

    public int getsold() {
        return sold;
    }

    synchronized private static boolean sellingTickets() {
        SecureRandom sr= new SecureRandom();        
        if (tickets > 0) {                      
            do{
                toSellTickets = sr.nextInt(4)+1;
            }while(toSellTickets > tickets);
            tickets -= toSellTickets;
            System.out.println(tickets);
            return true;
        } else {
            return false;
        }
    }
}

public class highSpeedRailSellingPractice {
    public static void main(String[] args) {
        sellingClass ta = new sellingClass("販售機a");
        sellingClass tb = new sellingClass("販售機b");
        sellingClass tc = new sellingClass("販售機c");
        sellingClass td = new sellingClass("販售機d");
    }
}
