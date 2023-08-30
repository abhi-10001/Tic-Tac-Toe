package tictactoe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.metal.MetalButtonUI;

public class TicTacToe extends JFrame implements ActionListener {
    
    JButton button1, button2, button3, button4, button5, button6, button7, button8, button9;
    boolean flag = false;
    char[][] arr = new char[3][3];
    int count =0;
    
    TicTacToe() {
        super("Tic Tac Toe");
        setLayout(null);
        getContentPane().setBackground(Color.black);


        button1 = new JButton();
        button1.setBounds(0, 0, 200, 200);
        button1.setSize(200, 200);
        button1.setFocusable(false);
        button1.setBackground(Color.white);
        button1.addActionListener(this);
        button1.setFont(new Font("Tahoma", Font.PLAIN, 100));
        add(button1);
        
        button2 = new JButton();
        button2.setBounds(210, 0, 200, 200);
        button2.setSize(200, 200);
        button2.setFocusable(false);
        button2.setBackground(Color.white);
        button2.addActionListener(this);
        button2.setFont(new Font("Tahoma", Font.PLAIN, 100));
        add(button2);
        
        button3 = new JButton();
        button3.setBounds(420, 0, 200, 200);
        button3.setSize(200, 200);
        button3.setFocusable(false);
        button3.setBackground(Color.white);
        button3.addActionListener(this);
        button3.setFont(new Font("Tahoma", Font.PLAIN, 100));
        add(button3);
        
        button4 = new JButton();
        button4.setBounds(0, 210, 200, 200);
        button4.setSize(200, 200);
        button4.setFocusable(false);
        button4.setBackground(Color.white);
        button4.addActionListener(this);
        button4.setFont(new Font("Tahoma", Font.PLAIN, 100));
        add(button4);
        
        button5 = new JButton();
        button5.setBounds(210, 210, 200, 200);
        button5.setSize(200, 200);
        button5.setFocusable(false);
        button5.setBackground(Color.white);
        button5.addActionListener(this);
        button5.setFont(new Font("Tahoma", Font.PLAIN, 100));
        add(button5);
        
        button6 = new JButton();
        button6.setBounds(420, 210, 200, 200);
        button6.setSize(200, 200);
        button6.setFocusable(false);
        button6.setBackground(Color.white);
        button6.addActionListener(this);
        button6.setFont(new Font("Tahoma", Font.PLAIN, 100));
        add(button6);
        
        button7 = new JButton();
        button7.setBounds(0, 420, 200, 200);
        button7.setSize(200, 200);
        button7.setFocusable(false);
        button7.setBackground(Color.white);
        button7.addActionListener(this);
        button7.setFont(new Font("Tahoma", Font.PLAIN, 100));
        add(button7);
        
        button8 = new JButton();
        button8.setBounds(210, 420, 200, 200);
        button8.setSize(200, 200);
        button8.setFocusable(false);
        button8.setBackground(Color.white);
        button8.addActionListener(this);
        button8.setFont(new Font("Tahoma", Font.PLAIN, 100));
        add(button8);
        
        button9 = new JButton();
        button9.setBounds(420, 420, 200, 200);
        button9.setSize(200, 200);
        button9.setFocusable(false);
        button9.setBackground(Color.white);
        button9.addActionListener(this);
        button9.setFont(new Font("Tahoma", Font.PLAIN, 100));
        add(button9);
        
        setSize(620, 620);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        setLocationRelativeTo(null);
    }
    
    public void actionPerformed(ActionEvent ae) {
//        if (ae.getSource() == button1 || ae.getSource() == button2 || ae.getSource() == button3 || ae.getSource() == button4 || ae.getSource() == button5 || ae.getSource() == button6 || ae.getSource() == button7 || ae.getSource() == button8 || ae.getSource() == button9) {
//            
//        }
        if (ae.getSource() == button1) {
            
            button1.setEnabled(false);
            if (flag) {
                arr[0][0] = 'o';
                button1.setText('o' + "");
                button1.setUI(new MetalButtonUI() {  // to change color of text of button after disabled
                    protected Color getDisabledTextColor() {
                        return Color.green;
                    }
                });
            } else {
                arr[0][0] = 'x';
                button1.setText('x' + "");
                button1.setUI(new MetalButtonUI() {  // to change color of text of button after disabled
                    protected Color getDisabledTextColor() {
                        return Color.red;
                    }
                });
            }
            flag = !flag;
            show(arr);
            if (check(arr) == 'x' || check(arr) == 'o') {
                JOptionPane.showMessageDialog(null, "You Won!!!");
                this.setVisible(false);
                new TicTacToe();
                
            }else if(count == 9) {
                JOptionPane.showMessageDialog(null, "Draw!!!");
                this.setVisible(false);
                new TicTacToe();
            }
        } else if (ae.getSource() == button2) {
            button2.setEnabled(false);
            if (flag) {
                arr[0][1] = 'o';
                button2.setText('o' + "");
                button2.setUI(new MetalButtonUI() {  // to change color of text of button after disabled
                    protected Color getDisabledTextColor() {
                        return Color.green;
                    }
                });
            } else {
                arr[0][1] = 'x';
                button2.setText('x' + "");
                button2.setUI(new MetalButtonUI() {  // to change color of text of button after disabled
                    protected Color getDisabledTextColor() {
                        return Color.red;
                    }
                });
            }
            
            flag = !flag;
            show(arr);
            if (check(arr) == 'x' || check(arr) == 'o') {
                JOptionPane.showMessageDialog(null, "You Won!!!");
                this.setVisible(false);
                new TicTacToe();
            }else if(count == 9) {
                JOptionPane.showMessageDialog(null, "Draw!!!");
                this.setVisible(false);
                new TicTacToe();
            }
        } else if (ae.getSource() == button3) {
            button3.setEnabled(false);
            if (flag) {
                arr[0][2] = 'o';
                button3.setText('o' + "");
                button3.setUI(new MetalButtonUI() {  // to change color of text of button after disabled
                    protected Color getDisabledTextColor() {
                        return Color.green;
                    }
                });
            } else {
                arr[0][2] = 'x';
                button3.setText('x' + "");
                button3.setUI(new MetalButtonUI() {  // to change color of text of button after disabled
                    protected Color getDisabledTextColor() {
                        return Color.red;
                    }
                });
            }
            
            flag = !flag;
            show(arr);
            if (check(arr) == 'x' || check(arr) == 'o') {
                JOptionPane.showMessageDialog(null, "You Won!!!");
                this.setVisible(false);
                new TicTacToe();
            }else if(count == 9) {
                JOptionPane.showMessageDialog(null, "Draw!!!");
                this.setVisible(false);
                new TicTacToe();
            }
        } else if (ae.getSource() == button4) {
            button4.setEnabled(false);
            if (flag) {
                arr[1][0] = 'o';
                button4.setText('o' + "");
                button4.setUI(new MetalButtonUI() {  // to change color of text of button after disabled
                    protected Color getDisabledTextColor() {
                        return Color.green;
                    }
                });
            } else {
                arr[1][0] = 'x';
                button4.setText('x' + "");
                button4.setUI(new MetalButtonUI() {  // to change color of text of button after disabled
                    protected Color getDisabledTextColor() {
                        return Color.red;
                    }
                });
            }
            flag = !flag;
            show(arr);
            if (check(arr) == 'x' || check(arr) == 'o') {
                JOptionPane.showMessageDialog(null, "You Won!!!");
                this.setVisible(false);
                new TicTacToe();
            }else if(count == 9) {
                JOptionPane.showMessageDialog(null, "Draw!!!");
                this.setVisible(false);
                new TicTacToe();
            }
        } else if (ae.getSource() == button5) {
            button5.setEnabled(false);
            if (flag) {
                arr[1][1] = 'o';
                button5.setText('o' + "");
                button5.setUI(new MetalButtonUI() {  // to change color of text of button after disabled
                    protected Color getDisabledTextColor() {
                        return Color.green;
                    }
                });
            } else {
                arr[1][1] = 'x';
                button5.setText('x' + "");
                button5.setUI(new MetalButtonUI() {  // to change color of text of button after disabled
                    protected Color getDisabledTextColor() {
                        return Color.red;
                    }
                });
            }
            
            flag = !flag;
            show(arr);
            if (check(arr) == 'x' || check(arr) == 'o') {
                JOptionPane.showMessageDialog(null, "You Won!!!");
                this.setVisible(false);
                new TicTacToe();
            }else if(count == 9) {
                JOptionPane.showMessageDialog(null, "Draw!!!");
                this.setVisible(false);
                new TicTacToe();
            }
        } else if (ae.getSource() == button6) {
            button6.setEnabled(false);
            if (flag) {
                arr[1][2] = 'o';
                button6.setText('o' + "");
                button6.setUI(new MetalButtonUI() {  // to change color of text of button after disabled
                    protected Color getDisabledTextColor() {
                        return Color.green;
                    }
                });
            } else {
                arr[1][2] = 'x';
                button6.setText('x' + "");
                button6.setUI(new MetalButtonUI() {  // to change color of text of button after disabled
                    protected Color getDisabledTextColor() {
                        return Color.red;
                    }
                });
            }
            
            flag = !flag;
            show(arr);
            if (check(arr) == 'x' || check(arr) == 'o') {
                JOptionPane.showMessageDialog(null, "You Won!!!");
                this.setVisible(false);
                new TicTacToe();
            }else if(count == 9) {
                JOptionPane.showMessageDialog(null, "Draw!!!");
                this.setVisible(false);
                new TicTacToe();
            }
        } else if (ae.getSource() == button7) {
            button7.setEnabled(false);
            if (flag) {
                arr[2][0] = 'o';
                button7.setText('o' + "");
                button7.setUI(new MetalButtonUI() {  // to change color of text of button after disabled
                    protected Color getDisabledTextColor() {
                        return Color.green;
                    }
                });
            } else {
                arr[2][0] = 'x';
                button7.setText('x' + "");
                button7.setUI(new MetalButtonUI() {  // to change color of text of button after disabled
                    protected Color getDisabledTextColor() {
                        return Color.red;
                    }
                });
            }
            
            flag = !flag;
            show(arr);
            if (check(arr) == 'x' || check(arr) == 'o') {
                JOptionPane.showMessageDialog(null, "You Won!!!");
                this.setVisible(false);
                new TicTacToe();
            }else if(count == 9) {
                JOptionPane.showMessageDialog(null, "Draw!!!");
                this.setVisible(false);
                new TicTacToe();
            }
        } else if (ae.getSource() == button8) {
            button8.setEnabled(false);
            if (flag) {
                arr[2][1] = 'o';
                button8.setText('o' + "");
                button8.setUI(new MetalButtonUI() {  // to change color of text of button after disabled
                    protected Color getDisabledTextColor() {
                        return Color.green;
                    }
                });
            } else {
                arr[2][1] = 'x';
                button8.setText('x' + "");
                button8.setUI(new MetalButtonUI() {  // to change color of text of button after disabled
                    protected Color getDisabledTextColor() {
                        return Color.red;
                    }
                });
            }
            
            flag = !flag;
            show(arr);
            if (check(arr) == 'x' || check(arr) == 'o') {
                JOptionPane.showMessageDialog(null, "You Won!!!");
                this.setVisible(false);
                new TicTacToe();
            }else if(count == 9) {
                JOptionPane.showMessageDialog(null, "Draw!!!");
                this.setVisible(false);
                new TicTacToe();
            }
        } else if (ae.getSource() == button9) {
            button9.setEnabled(false);
            if (flag) {
                arr[2][2] = 'o';
                button9.setText('o' + "");
                button9.setUI(new MetalButtonUI() {  // to change color of text of button after disabled
                    protected Color getDisabledTextColor() {
                        return Color.green;
                    }
                });
            } else {
                arr[2][2] = 'x';
                button9.setText('x' + "");
                button9.setUI(new MetalButtonUI() {  // to change color of text of button after disabled
                    protected Color getDisabledTextColor() {
                        return Color.red;
                    }
                });
            }
            
            flag = !flag;
            show(arr);
            if (check(arr) == 'x' || check(arr) == 'o') {
                JOptionPane.showMessageDialog(null, "     You Won!!!   \n      Retry???");
                this.setVisible(false);
                new TicTacToe();
            }else if(count == 9) {
                JOptionPane.showMessageDialog(null, "Draw!!!");
                this.setVisible(false);
                new TicTacToe();
            }
        }
    }
    
    public static char check(char[][] arr) {
        
        if (arr[0][0] == 'x' && arr[0][1] == 'x' && arr[0][2] == 'x') {
            return 'x';
        } else if (arr[1][0] == 'x' && arr[1][1] == 'x' && arr[1][2] == 'x') {
            return 'x';
        } else if (arr[2][0] == 'x' && arr[2][1] == 'x' && arr[2][2] == 'x') {
            return 'x';
        } else if (arr[0][0] == 'x' && arr[1][0] == 'x' && arr[2][0] == 'x') {
            return 'x';
        } else if (arr[0][1] == 'x' && arr[1][1] == 'x' && arr[2][1] == 'x') {
            return 'x';
        } else if (arr[0][2] == 'x' && arr[1][2] == 'x' && arr[2][2] == 'x') {
            return 'x';
        } else if (arr[0][0] == 'x' && arr[1][1] == 'x' && arr[2][2] == 'x') {
            return 'x';
        } else if (arr[2][0] == 'x' && arr[1][1] == 'x' && arr[0][2] == 'x') {
            return 'x';
        } else if (arr[0][0] == 'o' && arr[0][1] == 'o' && arr[0][2] == 'o') {
            return 'o';
        } else if (arr[1][0] == 'o' && arr[1][1] == 'o' && arr[1][2] == 'o') {
            return 'o';
        } else if (arr[2][0] == 'o' && arr[2][1] == 'o' && arr[2][2] == 'o') {
            return 'o';
        } else if (arr[0][0] == 'o' && arr[1][0] == 'o' && arr[2][0] == 'o') {
            return 'o';
        } else if (arr[0][1] == 'o' && arr[1][1] == 'o' && arr[2][1] == 'o') {
            return 'o';
        } else if (arr[0][2] == 'o' && arr[1][2] == 'o' && arr[2][2] == 'o') {
            return 'o';
        } else if (arr[0][0] == 'o' && arr[1][1] == 'o' && arr[2][2] == 'o') {
            return 'o';
        } else if (arr[2][0] == 'o' && arr[1][1] == 'o' && arr[0][2] == 'o') {
            return 'o';
        } else {
            return '?';
        }
    }
    
    public void show(char[][] arr) {
        count++;
        System.out.println("_________");
        for (int i = 0; i < 3; i++) {
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + "|");
            }
            System.out.println();
        }
        System.out.println("---------");
        
    }
    
    public static void main(String[] args) {
        new TicTacToe();
    }
}
