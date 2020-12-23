import java.awt.*;
import java.awt.event.*;
public class Calculator implements ActionListener{
    Button one,two,three,four,five,six,seven,eight,nine,zero,add,sub,mul,div,dec,eq;
    int c,n;
    String s1,s2,s3,s4,s5;
    TextField t;
    Calculator(){
        Frame f = new Frame("Calculator");
        Panel p = new Panel();
        f.setLayout(new FlowLayout());
        f.setBackground(Color.blue);
        p.setBackground(Color.blue);
        one = new Button("1");
        one.addActionListener(this);
        two = new Button("2");
        two.addActionListener(this);
        three = new Button("3");
        three.addActionListener(this);
        four = new Button("4");    
        four.addActionListener(this);
        five = new Button("5");
        five.addActionListener(this);
        six = new Button("6");     
        six.addActionListener(this);   
        seven = new Button("7");  
        seven.addActionListener(this);      
        eight = new Button("8");    
        eight.addActionListener(this);    
        nine = new Button("9");     
        nine.addActionListener(this);   
        zero = new Button("0");    
        zero.addActionListener(this);            
        dec = new Button(".");
        dec.addActionListener(this);
        add = new Button("+");    
        add.addActionListener(this);    
        sub = new Button("-");    
        sub.addActionListener(this);    
        mul = new Button("X");    
        mul.addActionListener(this);    
        div = new Button("/");
        div.addActionListener(this);
        eq = new Button("=");
        eq.addActionListener(this);
        p.setLayout(new GridLayout(4,4,5,5));
        p.add(seven);
        p.add(eight);
        p.add(nine);
        p.add(div);
        p.add(four);
        p.add(five);
        p.add(six);
        p.add(mul);
        p.add(one);
        p.add(two);
        p.add(three);
        p.add(sub);
        p.add(zero);
        p.add(dec);
        p.add(add);
        p.add(eq);
        t = new TextField(10);
        f.add(t);
        f.add(p);
        f.setSize(100,200);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==zero)
        {
            s3 = t.getText();
            s4 = "0";
            s5 = s3+s4;
            t.setText(s5);
        }
        if(e.getSource()==one)
        {
            s3 = t.getText();
            s4 = "1";
            s5 = s3+s4;
            t.setText(s5);
        }
        if(e.getSource()==two)
        {
            s3 = t.getText();
            s4 = "2";
            s5 = s3+s4;
            t.setText(s5);
        }if(e.getSource()==three)
        {
            s3 = t.getText();
            s4 = "3";
            s5 = s3+s4;
            t.setText(s5);
        }
        if(e.getSource()==four)
        {
            s3 = t.getText();
            s4 = "4";
            s5 = s3+s4;
            t.setText(s5);
        }
        if(e.getSource()==five)
        {
            s3 = t.getText();
            s4 = "5";
            s5 = s3+s4;
            t.setText(s5);
        }
        if(e.getSource()==six)
        {
            s3 = t.getText();
            s4 = "6";
            s5 = s3+s4;
            t.setText(s5);
        }
        if(e.getSource()==seven)
        {
            s3 = t.getText();
            s4 = "7";
            s5 = s3+s4;
            t.setText(s5);
        }
        if(e.getSource()==eight)
        {
            s3 = t.getText();
            s4 = "8";
            s5 = s3+s4;
            t.setText(s5);
        }
        if(e.getSource()==nine)
        {
            s3 = t.getText();
            s4 = "9";
            s5 = s3+s4;
            t.setText(s5);
        }
        if(e.getSource()==add)
        {
            s1 = t.getText();
            t.setText("");
            c=1;
 
        }
        if(e.getSource()==sub)
        {
            s1 = t.getText();
            t.setText("");
            c=2;
 
        }
        if(e.getSource()==mul)
        {
            s1 = t.getText();
            t.setText("");
            c=3;
 
        }
        if(e.getSource()==div)
        {
            s1 = t.getText();
            t.setText("");
            c=4;
 
        }
        if(e.getSource()==eq)
        {
            s2 = t.getText();
            if(c==1)
            {
                n = Integer.parseInt(s1)+Integer.parseInt(s2);
                t.setText(String.valueOf(n));
            }
            else
            if(c==2)
            {
                n = Integer.parseInt(s1)-Integer.parseInt(s2);
                t.setText(String.valueOf(n));
            }
            else
            if(c==3)
            {
                n = Integer.parseInt(s1)*Integer.parseInt(s2);
                t.setText(String.valueOf(n));
            }
            if(c==4)
            {
                try
                {
                    int p=Integer.parseInt(s2);
                    if(p!=0)
                    {
                                        n = Integer.parseInt(s1)/Integer.parseInt(s2);
                    t.setText(String.valueOf(n));
                     }
                     else
                        t.setText("Infinite");
 
                }
                catch(Exception i){}
            }
        }
    }
   public void destroy(){}
    public static void main(String... args){
        Calculator v = new Calculator();
    }
}