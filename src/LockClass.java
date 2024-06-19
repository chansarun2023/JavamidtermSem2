import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LockClass implements ActionListener {
    private JFrame frame;
    private JPanel p1, p2;
    private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, bClear, bEnter;
    private JLabel jStatus;
    private String[] status = new String[]{"Enter Password", "Password Set", "Incorrect Password", "Correct Password"};
    private JTextField txtPassword;

    private String pass=null;
    public LockClass(){
        initialForm();
    }
    private void initialForm(){
        frame = new JFrame();
        frame.setSize(400, 250);;
        frame.setLayout(new BorderLayout());
        p1 = new JPanel(new GridLayout(3,3));
        p2 = new JPanel(new FlowLayout());

        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        bClear = new JButton("Clear");
        bEnter = new JButton("Enter");

        txtPassword = new JTextField();
        txtPassword.setPreferredSize(new Dimension(100, 30));
        txtPassword.setEditable(false);
        jStatus = new JLabel(status[0]);

        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        p1.add(b5);
        p1.add(b6);
        p1.add(b7);
        p1.add(b8);
        p1.add(b9);

        p2.add(bClear);
        p2.add(txtPassword);
        p2.add(bEnter);
        p2.add(jStatus);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);

        bClear.addActionListener(this);
        bEnter.addActionListener(this);

        frame.add(p1);
        frame.add(p2, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            txtPassword.setText(txtPassword.getText()+"1");
        }else if(e.getSource()==b2){
            txtPassword.setText(txtPassword.getText()+"2");
        }else if(e.getSource()==b3){
            txtPassword.setText(txtPassword.getText()+"3");
        }else if(e.getSource()==b4){
            txtPassword.setText(txtPassword.getText()+"4");
        }else if(e.getSource()==b5){
            txtPassword.setText(txtPassword.getText()+"5");
        }else if(e.getSource()==b6){
            txtPassword.setText(txtPassword.getText()+"6");
        }else if(e.getSource()==b7){
            txtPassword.setText(txtPassword.getText()+"7");
        }else if(e.getSource()==b8){
            txtPassword.setText(txtPassword.getText()+"8");
        }else if(e.getSource()==b9){
            txtPassword.setText(txtPassword.getText()+"9");
        }else if(e.getSource()==bClear){
            txtPassword.setText("");
        }else if(e.getSource()==bEnter){
            if(pass==null) {
                pass = txtPassword.getText();
                jStatus.setText(status[1]);
                txtPassword.setText("");
            }else if(!pass.equals(txtPassword.getText())){
                jStatus.setText(status[2]);
            }else{
                jStatus.setText(status[3]);
            }
        }
    }
}