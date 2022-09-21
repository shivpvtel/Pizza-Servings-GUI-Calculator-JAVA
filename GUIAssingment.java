/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package gui.assingment;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
/**
 *
 * @author shiv0248
 */
public class GUIAssingment extends JFrame{
    
    String size;
    double x;
    double servings;
    private Frame frame;
    private JPanel slot2 = new JPanel();
   
    GUIAssingment(){
            //frame maker
            frame = new JFrame();
            // pizza serving title maker with centering, red font, and 24 font size.
            JLabel guititle = new JLabel("Pizza servings calculator" , SwingConstants.CENTER);
            guititle.setForeground(Color.red);
            guititle.setFont(new Font("Serif", Font.BOLD,24));
            //text field as well as what the user needs to input.
            JLabel userInputText = new JLabel("Enter the size of the pizza in inches: ");
            slot2.add(userInputText);
            //given textfield size 
            JTextField inputBox = new JTextField(4);
            slot2.add(inputBox);
            //calculate button 
            JButton calculator = new JButton("Calculate servings");
            //spot for the answer to show up, making it centered too
            JLabel answerView = new JLabel("", SwingConstants.CENTER);
            //what to do when the calculate button is pressed as well as the calculation.
            calculator.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae){
                    size = inputBox.getText();
                    x = (Double.parseDouble(size)/8);
                    servings = x*x;
                           
                    //answer that will be replaced with the "" in line 41
                    answerView.setText("A " +size+ " inch pizza will serve " +servings+ " people");
                }
            });
        // making up the frame stuff, adding in all the variables
        frame.add(guititle);
        frame.add(slot2);
        frame.add(calculator);
        frame.add(answerView);
        // making the grid layout 
        frame.setLayout (new GridLayout(4,1));
        //the exit button in the corner
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // given size
        frame.setSize(350,300);
        frame.setVisible(true);
        
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new GUIAssingment();
    }
    
}
