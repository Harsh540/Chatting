import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Server extends JFrame implements ActionListener {
    Server(){

        setLayout(null);

        JPanel p1=new JPanel();
        p1.setBackground(new Color(7,94,84));
        p1.setBounds(0,0,450,70);
        p1.setLayout(null);
        add(p1);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/3.png"));
        Image i2=i1.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel back=new JLabel(i3);
        back.setBounds(5,20,25,25);
        p1.add(back);

        back.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent ae){
                System.exit(0);
            }
        });


        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("icons/1.png"));
        Image i5=i4.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel profile=new JLabel(i6);
        profile.setBounds(40,10,50,50);
        p1.add(profile);


        ImageIcon i7=new ImageIcon(ClassLoader.getSystemResource("icons/video.png"));
        Image i8=i7.getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT);
        ImageIcon i9=new ImageIcon(i8);
        JLabel video=new JLabel(i9);
        video.setBounds(300,20,30,30);
        p1.add(video);


        ImageIcon i10=new ImageIcon(ClassLoader.getSystemResource("icons/phone.png"));
        Image i11=i10.getImage().getScaledInstance(35,30,Image.SCALE_DEFAULT);
        ImageIcon i12=new ImageIcon(i11);
        JLabel phone=new JLabel(i12);
        phone.setBounds(360,20,35,30);
        p1.add(phone);


        ImageIcon i13=new ImageIcon(ClassLoader.getSystemResource("icons/3icon.png"));
        Image i14=i13.getImage().getScaledInstance(10,25,Image.SCALE_DEFAULT);
        ImageIcon i15=new ImageIcon(i14);
        JLabel morevert=new JLabel(i15);
        morevert.setBounds(420,20,10,25);
        p1.add(morevert);


        JLabel name =new JLabel("Harsh Verma");
        name.setBounds(110,20,200,20);
        name.setForeground(Color.WHITE);
        name.setFont(new Font("SAN SERIF",Font.BOLD,18));
        p1.add(name);

        JLabel online =new JLabel("Online");
        online.setBounds(110,45,100,10);
        online.setForeground(Color.WHITE);
        online.setFont(new Font("SAN_SERIF",Font.BOLD,10));
        p1.add(online);


        JPanel a1=new JPanel();
        a1.setBounds(5,75,440,570);
        add(a1);

        JTextField text=new JTextField();
        text.setBounds(5,655,310,40);
        text.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
        add(text);

        JButton send=new JButton("Send");
        send.setBounds(320,655,123,40);
        send.setBackground(new Color(7,94,84));
        send.setForeground(Color.WHITE);
        send.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
        add(send);



        setLocation(200,50);
        setUndecorated(true);
        setSize(450,700);
        getContentPane().setBackground(Color.WHITE);


        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){

    }
    public static void main(String args[]){
        new Server();
    }
}

