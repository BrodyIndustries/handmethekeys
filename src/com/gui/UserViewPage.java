package com.gui;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;

public class UserViewPage {

private JFrame frame;
private JTextField txtModel;
private JTextField txtModel_1;
private JTextField txtBrand;
private JTextField textField;
private JTextField textField_1;
private JTextField textField_2;


/**
* This is the successful frame for added car into our Database.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
	UserViewPage window = new UserViewPage();
window.frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}

/**
* Create the application.
*/
public UserViewPage() {
initialize();
}

/**
* Initialize the contents of the frame.
*/
private void initialize() 
{
frame = new JFrame();
frame.setBounds(100, 100, 998, 594);
frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
frame.getContentPane().setLayout(null);
JPanel HMTKLoginPanel = new JPanel();
HMTKLoginPanel.setBounds(6, 6, 986, 24);
frame.getContentPane().add(HMTKLoginPanel);
HMTKLoginPanel.setLayout(new BorderLayout(0, 0));
HMTKLoginPanel.setBorder(BorderFactory.createEmptyBorder());
JPanel HandMeTheKeysPanel = new JPanel();
HMTKLoginPanel.add(HandMeTheKeysPanel, BorderLayout.WEST);
HandMeTheKeysPanel.setBorder(BorderFactory.createEmptyBorder());
JLabel SoftwareTitlelabel = new JLabel("HAND ME THE KEYS");
SoftwareTitlelabel.setFont(new Font("Skia", Font.PLAIN, 20));
HandMeTheKeysPanel.add(SoftwareTitlelabel);
JPanel UserAndLogOutPanel = new JPanel();
HMTKLoginPanel.add(UserAndLogOutPanel, BorderLayout.EAST);
UserAndLogOutPanel.setLayout(new GridLayout(1, 2, 0, 0));
UserAndLogOutPanel.setBorder(BorderFactory.createEmptyBorder());
JPanel UserAccountTextPanel = new JPanel();
UserAccountTextPanel.addMouseListener(new MouseAdapter() {

    public void mouseClicked(MouseEvent e) 
    {
      
    }

});
FlowLayout fl_UserAccountTextPanel = (FlowLayout) UserAccountTextPanel.getLayout();
fl_UserAccountTextPanel.setVgap(10);
UserAndLogOutPanel.add(UserAccountTextPanel);
UserAccountTextPanel.setBorder(BorderFactory.createEmptyBorder());
JLabel UserTextLabel = new JLabel();

UserAccountTextPanel.add(UserTextLabel);
UserTextLabel.setText("USER");
UserTextLabel.setBackground(SystemColor.window);
JPanel LogoutTextPanel = new JPanel();
LogoutTextPanel.addMouseListener(new MouseAdapter() {

    public void mouseClicked(MouseEvent e) 
    {
      frame.dispose();
    }

});
FlowLayout fl_LogoutTextPanel = (FlowLayout) LogoutTextPanel.getLayout();
fl_LogoutTextPanel.setVgap(10);
UserAndLogOutPanel.add(LogoutTextPanel);
LogoutTextPanel.setBorder(BorderFactory.createEmptyBorder());
JLabel UserLogoutLabel = new JLabel();
UserLogoutLabel.setText("LOG OUT");
UserLogoutLabel.setBackground(SystemColor.window);
LogoutTextPanel.add(UserLogoutLabel);
JPanel panel = new JPanel();
panel.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
panel.setBounds(47, 135, 290, 50);
frame.getContentPane().add(panel);
panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
JButton btnRentedCar_1 = new JButton("RENTED CAR");
panel.add(btnRentedCar_1);
JButton btnRentedCar = new JButton("LISTED CAR");
btnRentedCar.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	}
});
panel.add(btnRentedCar);
JLabel lblListYourCar = new JLabel("LIST YOUR CAR");
lblListYourCar.setBounds(69, 228, 95, 16);
frame.getContentPane().add(lblListYourCar);
JLabel lblRentACar = new JLabel("RENT A CAR");
lblRentACar.setBounds(585, 228, 76, 16);
frame.getContentPane().add(lblRentACar);
txtModel_1 = new JTextField();
txtModel_1.setBounds(57, 279, 130, 26);
frame.getContentPane().add(txtModel_1);
txtModel_1.setText("MODEL");
txtModel_1.setColumns(10);
txtModel = new JTextField();
txtModel.setBounds(226, 279, 130, 26);
frame.getContentPane().add(txtModel);
txtModel.setText("CAR YEAR");
txtModel.setColumns(10);
txtBrand = new JTextField();
txtBrand.setBounds(57, 332, 130, 26);
frame.getContentPane().add(txtBrand);
txtBrand.setText("BRAND");
txtBrand.setColumns(10);
JButton btnSubmit = new JButton("SUBMIT");
btnSubmit.setBounds(114, 443, 117, 29);
frame.getContentPane().add(btnSubmit);
textField = new JTextField();
textField.setText("MODEL");
textField.setColumns(10);
textField.setBounds(585, 279, 130, 26);
frame.getContentPane().add(textField);
textField_1 = new JTextField();
textField_1.setText("CAR YEAR");
textField_1.setColumns(10);
textField_1.setBounds(750, 279, 130, 26);
frame.getContentPane().add(textField_1);
textField_2 = new JTextField();
textField_2.setText("BRAND");
textField_2.setColumns(10);
textField_2.setBounds(585, 345, 130, 26);
frame.getContentPane().add(textField_2);
JButton button = new JButton("SUBMIT");
button.setBounds(704, 443, 117, 29);
frame.getContentPane().add(button);


}


 


public void actionPerformed(ActionEvent e) 
{
// Action performed
}

/**
 * sets the frame visible for the class
 */

public void setvisible(){
	
	frame.setVisible(true);
}
}
