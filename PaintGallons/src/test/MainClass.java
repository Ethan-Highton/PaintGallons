package test;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.JSpinner;
import javax.swing.border.MatteBorder;
import javax.swing.SpinnerNumberModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.EventQueue;
import java.awt.BorderLayout;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.JSplitPane;
import javax.swing.BoxLayout;

public class MainClass {

	private JFrame frame;
	private JTextField sH;
	private JTextField sW1;
	private JTextField sW2;
	private JTextField Ssqrf;
	private JTextField Sgals;
	private JTextField H;
	private JTextField W1;
	private JTextField W2;
	private JTextField H2;
	private JTextField W1_2;
	private JTextField W2_2;
	private JTextField H3;
	private JTextField W1_3;
	private JTextField W2_3;
	private JTextField H4;
	private JTextField W1_4;
	private JTextField W2_4;
	private JTextField H5;
	private JTextField W1_5;
	private JTextField W2_5;
	private JTextField H6;
	private JTextField W1_6;
	private JTextField W2_6;
	private JTextField H7;
	private JTextField W1_7;
	private JTextField W2_7;
	private JTextField H8;
	private JTextField W1_8;
	private JTextField W2_8;
	private JTextField H9;
	private JTextField W1_9;
	private JTextField W2_9;
	private JTextField H10;
	private JTextField W1_10;
	private JTextField W2_10;
	private JTextField H11;
	private JTextField W1_11;
	private JTextField W2_11;
	private JTextField H12;
	private JTextField W1_12;
	private JTextField W2_12;
	private JTextField Msqrf;
	private JTextField Mgals;
	private JTextField tSsqrf;
	private JTextField tSgal;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainClass window = new MainClass();
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
	public MainClass() {
		initialize();
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));
		
		JPanel Single = new JPanel();
		Single.setBounds(213, 5, 1, 1);
		Single.setBorder(new LineBorder(new Color(0, 0, 0)));
		frame.getContentPane().add(Single);
		Single.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("One room");
		lblNewLabel.setBounds(113, 11, 74, 14);
		Single.add(lblNewLabel);
//Single room height		
		sH = new JTextField();
		sH.setBounds(32, 113, 86, 20);
		Single.add(sH);
		sH.setColumns(10);
//single room Width 1		
		sW1 = new JTextField();
		sW1.setBounds(32, 168, 86, 20);
		Single.add(sW1);
		sW1.setColumns(10);
//Single room width 2		
		sW2 = new JTextField();
		sW2.setBounds(32, 223, 86, 20);
		Single.add(sW2);
		sW2.setColumns(10);
//Single Room Calculate button		
		JButton Scalc = new JButton("Calculate!");
		Scalc.setBounds(78, 274, 95, 23);
		Scalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double stot;
//Converting textfield to string then double				
				String SsH= sH.getText();
				String SsW1= sW1.getText();
				String SsW2= sW2.getText();
				double dsH=Double.parseDouble(SsH);  
				double dsW1=Double.parseDouble(SsW1);  
				double dsW2=Double.parseDouble(SsW2); 
//calculations				
				double stot2 = 2*((dsH * dsW1 * 2) + (dsH * dsW2 * 2));
				double stot1 = (dsH * dsW1 * 2) + (dsH * dsW2 * 2);
				double sgals1= stot1 / 400 ;
				double sgals2= stot2 / 400 ;
//double to string
				String g1 = Double.toString(sgals1);
				String g2 = Double.toString(sgals2);
				String s1 = Double.toString(stot1);
				String s2 = Double.toString(stot2);
//single or double coat, show results	
				Sgals.setText(g1);
				Ssqrf.setText(s1);
				tSgal.setText(g2);
				tSsqrf.setText(s2);
			}
		});
		Single.add(Scalc);
		
		Ssqrf = new JTextField();
		Ssqrf.setBounds(20, 369, 86, 20);
		Ssqrf.setEditable(false);
		Single.add(Ssqrf);
		Ssqrf.setColumns(10);
		
		Sgals = new JTextField();
		Sgals.setBounds(128, 369, 86, 20);
		Sgals.setEditable(false);
		Single.add(Sgals);
		Sgals.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Squarefootage");
		lblNewLabel_1.setBounds(20, 344, 98, 14);
		Single.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("# of gallons");
		lblNewLabel_1_1.setBounds(128, 344, 74, 14);
		Single.add(lblNewLabel_1_1);
		

		
		JLabel penisfart = new JLabel("Height");
		penisfart.setBounds(155, 116, 46, 14);
		Single.add(penisfart);
		
		JLabel lblWidth = new JLabel("Width (1)");
		lblWidth.setBounds(155, 171, 59, 14);
		Single.add(lblWidth);
		
		JLabel lblWidth_1 = new JLabel("Width (2)");
		lblWidth_1.setBounds(155, 226, 74, 14);
		Single.add(lblWidth_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("Squarefootage");
		lblNewLabel_1_3.setBounds(20, 437, 95, 14);
		Single.add(lblNewLabel_1_3);
		
		tSsqrf = new JTextField();
		tSsqrf.setBounds(20, 462, 86, 20);
		tSsqrf.setEditable(false);
		tSsqrf.setColumns(10);
		Single.add(tSsqrf);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("# of gallons");
		lblNewLabel_1_1_1.setBounds(128, 437, 74, 14);
		Single.add(lblNewLabel_1_1_1);
		
		tSgal = new JTextField();
		tSgal.setBounds(128, 462, 86, 20);
		tSgal.setEditable(false);
		tSgal.setColumns(10);
		Single.add(tSgal);
		
		JLabel lblNewLabel_5 = new JLabel("Two coats");
		lblNewLabel_5.setBounds(90, 414, 58, 14);
		Single.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("One coat");
		lblNewLabel_5_1.setBounds(90, 308, 58, 14);
		Single.add(lblNewLabel_5_1);
//Multiple rooms
		JPanel Multiple = new JPanel();
		Single.add(Multiple);
		Multiple.setBounds(280, -11, 595, 572);
		Multiple.setBorder(new LineBorder(new Color(0, 0, 0)));
		Multiple.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Multiple rooms (1-12)");
		lblNewLabel_2.setBounds(258, 25, 146, 14);
		Multiple.add(lblNewLabel_2);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(290, 50, 39, 20);
		spinner.setModel(new SpinnerNumberModel(2, 2, 12, 1));
		Multiple.add(spinner);
		
		
		
		JPanel Room1 = new JPanel();
		Room1.setVisible(false);
		Room1.setBounds(40, 81, 120, 117);
		Room1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		Multiple.add(Room1);
		Room1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Room 1");
		lblNewLabel_3.setBounds(40, 11, 46, 14);
		Room1.add(lblNewLabel_3);
		
		H = new JTextField();
		H.setBounds(10, 27, 46, 20);
		Room1.add(H);
		H.setColumns(10);
		
		W1 = new JTextField();
		W1.setColumns(10);
		W1.setBounds(10, 58, 46, 20);
		Room1.add(W1);
		
		W2 = new JTextField();
		W2.setColumns(10);
		W2.setBounds(10, 86, 46, 20);
		Room1.add(W2);
		
		JLabel cock = new JLabel("Height");
		cock.setBounds(66, 30, 46, 14);
		Room1.add(cock);
		
		JLabel lblWidth_2 = new JLabel("Width (1)");
		lblWidth_2.setBounds(66, 61, 54, 14);
		Room1.add(lblWidth_2);
		
		JLabel lblWidth_3 = new JLabel("Width (2)");
		lblWidth_3.setBounds(66, 89, 64, 14);
		Room1.add(lblWidth_3);
		
		JPanel Room2 = new JPanel();
		Room2.setVisible(false);
		Room2.setBounds(182, 81, 120, 117);
		Room2.setLayout(null);
		Room2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		Multiple.add(Room2);
		
		JLabel lblNewLabel_3_1 = new JLabel("Room 2");
		lblNewLabel_3_1.setBounds(40, 11, 46, 14);
		Room2.add(lblNewLabel_3_1);
		
		H2 = new JTextField();
		H2.setColumns(10);
		H2.setBounds(10, 27, 46, 20);
		Room2.add(H2);
		
		W1_2 = new JTextField();
		W1_2.setColumns(10);
		W1_2.setBounds(10, 58, 46, 20);
		Room2.add(W1_2);
		
		W2_2 = new JTextField();
		W2_2.setColumns(10);
		W2_2.setBounds(10, 86, 46, 20);
		Room2.add(W2_2);
		
		JLabel cock_1 = new JLabel("Height");
		cock_1.setBounds(66, 30, 46, 14);
		Room2.add(cock_1);
		
		JLabel lblWidth_2_1 = new JLabel("Width (1)");
		lblWidth_2_1.setBounds(66, 61, 54, 14);
		Room2.add(lblWidth_2_1);
		
		JLabel lblWidth_3_1 = new JLabel("Width (2)");
		lblWidth_3_1.setBounds(66, 89, 54, 14);
		Room2.add(lblWidth_3_1);
		
		JPanel Room3 = new JPanel();
		Room3.setVisible(false);
		Room3.setBounds(325, 81, 120, 117);
		Room3.setLayout(null);
		Room3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		Multiple.add(Room3);
		
		JLabel lblNewLabel_3_2 = new JLabel("Room 3");
		lblNewLabel_3_2.setBounds(40, 11, 46, 14);
		Room3.add(lblNewLabel_3_2);
		
		H3 = new JTextField();
		H3.setColumns(10);
		H3.setBounds(10, 27, 46, 20);
		Room3.add(H3);
		
		W1_3 = new JTextField();
		W1_3.setColumns(10);
		W1_3.setBounds(10, 58, 46, 20);
		Room3.add(W1_3);
		
		W2_3 = new JTextField();
		W2_3.setColumns(10);
		W2_3.setBounds(10, 86, 46, 20);
		Room3.add(W2_3);
		
		JLabel cock_2 = new JLabel("Height");
		cock_2.setBounds(66, 30, 46, 14);
		Room3.add(cock_2);
		
		JLabel lblWidth_2_2 = new JLabel("Width (1)");
		lblWidth_2_2.setBounds(66, 61, 54, 14);
		Room3.add(lblWidth_2_2);
		
		JLabel lblWidth_3_2 = new JLabel("Width (2)");
		lblWidth_3_2.setBounds(66, 89, 54, 14);
		Room3.add(lblWidth_3_2);
		
		JPanel Room4 = new JPanel();
		Room4.setVisible(false);
		Room4.setBounds(465, 81, 120, 117);
		Room4.setLayout(null);
		Room4.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		Multiple.add(Room4);
		
		JLabel lblNewLabel_3_3 = new JLabel("Room 4");
		lblNewLabel_3_3.setBounds(40, 11, 46, 14);
		Room4.add(lblNewLabel_3_3);
		
		H4 = new JTextField();
		H4.setColumns(10);
		H4.setBounds(10, 27, 46, 20);
		Room4.add(H4);
		
		W1_4 = new JTextField();
		W1_4.setColumns(10);
		W1_4.setBounds(10, 58, 46, 20);
		Room4.add(W1_4);
		
		W2_4 = new JTextField();
		W2_4.setColumns(10);
		W2_4.setBounds(10, 86, 46, 20);
		Room4.add(W2_4);
		
		JLabel cock_3 = new JLabel("Height");
		cock_3.setBounds(66, 30, 46, 14);
		Room4.add(cock_3);
		
		JLabel lblWidth_2_3 = new JLabel("Width (1)");
		lblWidth_2_3.setBounds(66, 61, 54, 14);
		Room4.add(lblWidth_2_3);
		
		JLabel lblWidth_3_3 = new JLabel("Width (2)");
		lblWidth_3_3.setBounds(66, 89, 54, 14);
		Room4.add(lblWidth_3_3);
		
		JPanel Room5 = new JPanel();
		Room5.setVisible(false);
		Room5.setBounds(40, 209, 120, 117);
		Room5.setLayout(null);
		Room5.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		Multiple.add(Room5);
		
		JLabel lblNewLabel_3_4 = new JLabel("Room 5");
		lblNewLabel_3_4.setBounds(40, 11, 46, 14);
		Room5.add(lblNewLabel_3_4);
		
		H5 = new JTextField();
		H5.setColumns(10);
		H5.setBounds(10, 27, 46, 20);
		Room5.add(H5);
		
		W1_5 = new JTextField();
		W1_5.setColumns(10);
		W1_5.setBounds(10, 58, 46, 20);
		Room5.add(W1_5);
		
		W2_5 = new JTextField();
		W2_5.setColumns(10);
		W2_5.setBounds(10, 86, 46, 20);
		Room5.add(W2_5);
		
		JLabel cock_4 = new JLabel("Height");
		cock_4.setBounds(66, 30, 46, 14);
		Room5.add(cock_4);
		
		JLabel lblWidth_2_4 = new JLabel("Width (1)");
		lblWidth_2_4.setBounds(66, 61, 54, 14);
		Room5.add(lblWidth_2_4);
		
		JLabel lblWidth_3_4 = new JLabel("Width (2)");
		lblWidth_3_4.setBounds(66, 89, 54, 14);
		Room5.add(lblWidth_3_4);
		
		JPanel Room6 = new JPanel();
		Room6.setVisible(false);
		Room6.setBounds(182, 209, 120, 117);
		Room6.setLayout(null);
		Room6.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		Multiple.add(Room6);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Room 6");
		lblNewLabel_3_1_1.setBounds(40, 11, 46, 14);
		Room6.add(lblNewLabel_3_1_1);
		
		H6 = new JTextField();
		H6.setColumns(10);
		H6.setBounds(10, 27, 46, 20);
		Room6.add(H6);
		
		W1_6 = new JTextField();
		W1_6.setColumns(10);
		W1_6.setBounds(10, 58, 46, 20);
		Room6.add(W1_6);
		
		W2_6 = new JTextField();
		W2_6.setColumns(10);
		W2_6.setBounds(10, 86, 46, 20);
		Room6.add(W2_6);
		
		JLabel cock_1_1 = new JLabel("Height");
		cock_1_1.setBounds(66, 30, 46, 14);
		Room6.add(cock_1_1);
		
		JLabel lblWidth_2_1_1 = new JLabel("Width (1)");
		lblWidth_2_1_1.setBounds(66, 61, 54, 14);
		Room6.add(lblWidth_2_1_1);
		
		JLabel lblWidth_3_1_1 = new JLabel("Width (2)");
		lblWidth_3_1_1.setBounds(66, 89, 54, 14);
		Room6.add(lblWidth_3_1_1);
		
		JPanel Room7 = new JPanel();
		Room7.setVisible(false);
		Room7.setBounds(325, 209, 120, 117);
		Room7.setLayout(null);
		Room7.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		Multiple.add(Room7);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("Room 7");
		lblNewLabel_3_2_1.setBounds(40, 11, 46, 14);
		Room7.add(lblNewLabel_3_2_1);
		
		H7 = new JTextField();
		H7.setColumns(10);
		H7.setBounds(10, 27, 46, 20);
		Room7.add(H7);
		
		W1_7 = new JTextField();
		W1_7.setColumns(10);
		W1_7.setBounds(10, 58, 46, 20);
		Room7.add(W1_7);
		
		W2_7 = new JTextField();
		W2_7.setColumns(10);
		W2_7.setBounds(10, 86, 46, 20);
		Room7.add(W2_7);
		
		JLabel cock_2_1 = new JLabel("Height");
		cock_2_1.setBounds(66, 30, 46, 14);
		Room7.add(cock_2_1);
		
		JLabel lblWidth_2_2_1 = new JLabel("Width (1)");
		lblWidth_2_2_1.setBounds(66, 61, 54, 14);
		Room7.add(lblWidth_2_2_1);
		
		JLabel lblWidth_3_2_1 = new JLabel("Width (2)");
		lblWidth_3_2_1.setBounds(66, 89, 54, 14);
		Room7.add(lblWidth_3_2_1);
		
		JPanel Room8 = new JPanel();
		Room8.setVisible(false);
		Room8.setBounds(465, 209, 120, 117);
		Room8.setLayout(null);
		Room8.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		Multiple.add(Room8);
		
		JLabel lblNewLabel_3_3_1 = new JLabel("Room 8");
		lblNewLabel_3_3_1.setBounds(40, 11, 46, 14);
		Room8.add(lblNewLabel_3_3_1);
		
		H8 = new JTextField();
		H8.setColumns(10);
		H8.setBounds(10, 27, 46, 20);
		Room8.add(H8);
		
		W1_8 = new JTextField();
		W1_8.setColumns(10);
		W1_8.setBounds(10, 58, 46, 20);
		Room8.add(W1_8);
		
		W2_8 = new JTextField();
		W2_8.setColumns(10);
		W2_8.setBounds(10, 86, 46, 20);
		Room8.add(W2_8);
		
		JLabel cock_3_1 = new JLabel("Height");
		cock_3_1.setBounds(66, 30, 46, 14);
		Room8.add(cock_3_1);
		
		JLabel lblWidth_2_3_1 = new JLabel("Width (1)");
		lblWidth_2_3_1.setBounds(66, 61, 54, 14);
		Room8.add(lblWidth_2_3_1);
		
		JLabel lblWidth_3_3_1 = new JLabel("Width (2)");
		lblWidth_3_3_1.setBounds(66, 89, 54, 14);
		Room8.add(lblWidth_3_3_1);
		
		JPanel Room9 = new JPanel();
		Room9.setVisible(false);
		Room9.setBounds(40, 337, 120, 117);
		Room9.setLayout(null);
		Room9.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		Multiple.add(Room9);
		
		JLabel lblNewLabel_3_4_1 = new JLabel("Room 9");
		lblNewLabel_3_4_1.setBounds(40, 11, 46, 14);
		Room9.add(lblNewLabel_3_4_1);
		
		H9 = new JTextField();
		H9.setColumns(10);
		H9.setBounds(10, 27, 46, 20);
		Room9.add(H9);
		
		W1_9 = new JTextField();
		W1_9.setColumns(10);
		W1_9.setBounds(10, 58, 46, 20);
		Room9.add(W1_9);
		
		W2_9 = new JTextField();
		W2_9.setColumns(10);
		W2_9.setBounds(10, 86, 46, 20);
		Room9.add(W2_9);
		
		JLabel cock_4_1 = new JLabel("Height");
		cock_4_1.setBounds(66, 30, 46, 14);
		Room9.add(cock_4_1);
		
		JLabel lblWidth_2_4_1 = new JLabel("Width (1)");
		lblWidth_2_4_1.setBounds(66, 61, 54, 14);
		Room9.add(lblWidth_2_4_1);
		
		JLabel lblWidth_3_4_1 = new JLabel("Width (2)");
		lblWidth_3_4_1.setBounds(66, 89, 54, 14);
		Room9.add(lblWidth_3_4_1);
		
		JPanel Room10 = new JPanel();
		Room10.setVisible(false);
		Room10.setBounds(182, 337, 120, 117);
		Room10.setLayout(null);
		Room10.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		Multiple.add(Room10);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("Room 10");
		lblNewLabel_3_1_1_1.setBounds(40, 11, 72, 14);
		Room10.add(lblNewLabel_3_1_1_1);
		
		H10 = new JTextField();
		H10.setColumns(10);
		H10.setBounds(10, 27, 46, 20);
		Room10.add(H10);
		
		W1_10 = new JTextField();
		W1_10.setColumns(10);
		W1_10.setBounds(10, 58, 46, 20);
		Room10.add(W1_10);
		
		W2_10 = new JTextField();
		W2_10.setColumns(10);
		W2_10.setBounds(10, 86, 46, 20);
		Room10.add(W2_10);
		
		JLabel cock_1_1_1 = new JLabel("Height");
		cock_1_1_1.setBounds(66, 30, 46, 14);
		Room10.add(cock_1_1_1);
		
		JLabel lblWidth_2_1_1_1 = new JLabel("Width (1)");
		lblWidth_2_1_1_1.setBounds(66, 61, 54, 14);
		Room10.add(lblWidth_2_1_1_1);
		
		JLabel lblWidth_3_1_1_1 = new JLabel("Width (2)");
		lblWidth_3_1_1_1.setBounds(66, 89, 54, 14);
		Room10.add(lblWidth_3_1_1_1);
		
		JPanel Room11 = new JPanel();
		Room11.setVisible(false);
		Room11.setBounds(325, 337, 120, 117);
		Room11.setLayout(null);
		Room11.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		Multiple.add(Room11);
		
		JLabel lblNewLabel_3_2_1_1 = new JLabel("Room 11");
		lblNewLabel_3_2_1_1.setBounds(40, 11, 72, 14);
		Room11.add(lblNewLabel_3_2_1_1);
		
		H11 = new JTextField();
		H11.setColumns(10);
		H11.setBounds(10, 27, 46, 20);
		Room11.add(H11);
		
		W1_11 = new JTextField();
		W1_11.setColumns(10);
		W1_11.setBounds(10, 58, 46, 20);
		Room11.add(W1_11);
		
		W2_11 = new JTextField();
		W2_11.setColumns(10);
		W2_11.setBounds(10, 86, 46, 20);
		Room11.add(W2_11);
		
		JLabel cock_2_1_1 = new JLabel("Height");
		cock_2_1_1.setBounds(66, 30, 46, 14);
		Room11.add(cock_2_1_1);
		
		JLabel lblWidth_2_2_1_1 = new JLabel("Width (1)");
		lblWidth_2_2_1_1.setBounds(66, 61, 54, 14);
		Room11.add(lblWidth_2_2_1_1);
		
		JLabel lblWidth_3_2_1_1 = new JLabel("Width (2)");
		lblWidth_3_2_1_1.setBounds(66, 89, 54, 14);
		Room11.add(lblWidth_3_2_1_1);
		
		JPanel Room12 = new JPanel();
		Room12.setVisible(false);
		Room12.setBounds(465, 337, 120, 117);
		Room12.setLayout(null);
		Room12.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		Multiple.add(Room12);
		
		JLabel lblNewLabel_3_3_1_1 = new JLabel("Room 12");
		lblNewLabel_3_3_1_1.setBounds(40, 11, 70, 14);
		Room12.add(lblNewLabel_3_3_1_1);
		
		H12 = new JTextField();
		H12.setColumns(10);
		H12.setBounds(10, 27, 46, 20);
		Room12.add(H12);
		
		W1_12 = new JTextField();
		W1_12.setColumns(10);
		W1_12.setBounds(10, 58, 46, 20);
		Room12.add(W1_12);
		
		W2_12 = new JTextField();
		W2_12.setColumns(10);
		W2_12.setBounds(10, 86, 46, 20);
		Room12.add(W2_12);
		
		JLabel cock_3_1_1 = new JLabel("Height");
		cock_3_1_1.setBounds(66, 30, 46, 14);
		Room12.add(cock_3_1_1);
		
		JLabel lblWidth_2_3_1_1 = new JLabel("Width (1)");
		lblWidth_2_3_1_1.setBounds(66, 61, 54, 14);
		Room12.add(lblWidth_2_3_1_1);
		
		JLabel lblWidth_3_3_1_1 = new JLabel("Width (2)");
		lblWidth_3_3_1_1.setBounds(66, 89, 54, 14);
		Room12.add(lblWidth_3_3_1_1);
		
		JLabel lblNewLabel_4 = new JLabel("# of rooms");
		lblNewLabel_4.setBounds(227, 53, 69, 14);
		Multiple.add(lblNewLabel_4);
		
		Msqrf = new JTextField();
		Msqrf.setBounds(113, 484, 86, 20);
		Msqrf.setEditable(false);
		Msqrf.setColumns(10);
		Multiple.add(Msqrf);
		
		Mgals = new JTextField();
		Mgals.setBounds(412, 484, 86, 20);
		Mgals.setEditable(false);
		Mgals.setColumns(10);
		Multiple.add(Mgals);
		
		JButton begin = new JButton("Start!");
		begin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int rnum =(Integer) spinner.getValue();
				JPanel[] Rooms = {Room1, Room2, Room3, Room4,Room5,Room6,Room7,Room8,Room9,Room10,Room11,Room12} ;
				if (rnum==2){
					Rooms[0].setVisible(true);
					Rooms[1].setVisible(true);
				}else if(rnum==3) {
					Rooms[0].setVisible(true);
					Rooms[1].setVisible(true);
					Rooms[2].setVisible(true);
				}else if(rnum==4) {
					Rooms[0].setVisible(true);
					Rooms[1].setVisible(true);
					Rooms[2].setVisible(true);
					Rooms[3].setVisible(true);
				}else if(rnum==5) {
					Rooms[0].setVisible(true);
					Rooms[1].setVisible(true);
					Rooms[2].setVisible(true);
					Rooms[3].setVisible(true);
					Rooms[4].setVisible(true);
				}else if(rnum==6) {
					Rooms[0].setVisible(true);
					Rooms[1].setVisible(true);
					Rooms[2].setVisible(true);
					Rooms[3].setVisible(true);
					Rooms[4].setVisible(true);
					Rooms[5].setVisible(true);
				}else if(rnum==7) {
					Rooms[0].setVisible(true);
					Rooms[1].setVisible(true);
					Rooms[2].setVisible(true);
					Rooms[3].setVisible(true);
					Rooms[4].setVisible(true);
					Rooms[5].setVisible(true);
					Rooms[6].setVisible(true);
				}else if(rnum==8) {
					Rooms[0].setVisible(true);
					Rooms[1].setVisible(true);
					Rooms[2].setVisible(true);
					Rooms[3].setVisible(true);
					Rooms[4].setVisible(true);
					Rooms[5].setVisible(true);
					Rooms[6].setVisible(true);
					Rooms[7].setVisible(true);
				}else if(rnum==9) {
					Rooms[0].setVisible(true);
					Rooms[1].setVisible(true);
					Rooms[2].setVisible(true);
					Rooms[3].setVisible(true);
					Rooms[4].setVisible(true);
					Rooms[5].setVisible(true);
					Rooms[6].setVisible(true);
					Rooms[7].setVisible(true);
					Rooms[8].setVisible(true);
				}else if(rnum==10) {
					Rooms[0].setVisible(true);
					Rooms[1].setVisible(true);
					Rooms[2].setVisible(true);
					Rooms[3].setVisible(true);
					Rooms[4].setVisible(true);
					Rooms[5].setVisible(true);
					Rooms[6].setVisible(true);
					Rooms[7].setVisible(true);
					Rooms[8].setVisible(true);
					Rooms[9].setVisible(true);
				}else if(rnum==11) {
					Rooms[0].setVisible(true);
					Rooms[1].setVisible(true);
					Rooms[2].setVisible(true);
					Rooms[3].setVisible(true);
					Rooms[4].setVisible(true);
					Rooms[5].setVisible(true);
					Rooms[6].setVisible(true);
					Rooms[7].setVisible(true);
					Rooms[8].setVisible(true);
					Rooms[9].setVisible(true);
					Rooms[10].setVisible(true);
				}else if(rnum==12) {
					Rooms[0].setVisible(true);
					Rooms[1].setVisible(true);
					Rooms[2].setVisible(true);
					Rooms[3].setVisible(true);
					Rooms[4].setVisible(true);
					Rooms[5].setVisible(true);
					Rooms[6].setVisible(true);
					Rooms[7].setVisible(true);
					Rooms[8].setVisible(true);
					Rooms[9].setVisible(true);
					Rooms[10].setVisible(true);
					Rooms[11].setVisible(true);
				}
			}
		});
		begin.setBounds(339, 50, 89, 23);
		Multiple.add(begin);
		
		JButton Mcalc = new JButton("Calculate!");
		Mcalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int rnum =(Integer) spinner.getValue();
			String [] sw2j = {W2.getText(),W2_2.getText(),W2_3.getText(),W2_4.getText(),W2_5.getText(),W2_6.getText(),W2_7.getText(),W2_8.getText(),W2_9.getText(),W2_10.getText(),W2_11.getText(),W2_12.getText()} ;
			//System.out.println(sw2j[1]);
			String [] HS = {H.getText(),H2.getText(),H3.getText(),H4.getText(),H5.getText(),H6.getText(),H7.getText(),H8.getText(),H9.getText(),H10.getText(),H11.getText(),H12.getText()} ;
			//System.out.println(HS[1]);
			String sw1j []= {W1.getText(),W1_2.getText(),W1_3.getText(),W1_4.getText(),W1_5.getText(),W1_6.getText(),W1_7.getText(),W1_8.getText(),W1_9.getText(),W1_10.getText(),W1_11.getText(),W1_12.getText()};
			//System.out.println(sw1j[1]);
			double tsq = 0; 
			double nsq = 0;
	    	//System.out.println(tsq);
	    	int i = 1 ;
		    for (; i < rnum+1; i++){
		    	System.out.println(rnum);
		    	System.out.println(i);
		    	double width1 = Double.parseDouble(sw1j[i-1]);
				double width2 = Double.parseDouble(sw2j[i-1]);
				double Height = Double.parseDouble(HS[i-1]);
				System.out.println("width 1 for i="+ i + " is "+ width1);
				System.out.println("width 2 for i="+ i + " is "+ width2);
				System.out.println("Height for i="+ i + " is "+ Height);
		    	nsq = ((width1 * 2)+ (width2 * 2)) * Height;
		    	System.out.println(nsq);
		    	tsq = tsq + nsq;
		    }
	    	double tsq2 = tsq * 2;
		    double tgals = tsq2 / 400;
		    String tg = Double.toString(Math.round(tgals));
		    String ts = Double.toString(Math.round(tsq2));
	    	Mgals.setText(tg);
	    	Msqrf.setText(ts);
		}
	});
		Mcalc.setBounds(273, 465, 99, 23);
		Multiple.add(Mcalc);
		
		JLabel lblNewLabel_1_2 = new JLabel("Squarefootage (x2)");
		lblNewLabel_1_2.setBounds(110, 463, 128, 14);
		Multiple.add(lblNewLabel_1_2);
		

		
		JLabel lblNewLabel_1_2_1 = new JLabel("# of gallons");
		lblNewLabel_1_2_1.setBounds(417, 463, 74, 14);
		Multiple.add(lblNewLabel_1_2_1);
		
		
		JLabel lblNewLabel_6 = new JLabel("Numbers only, all in ft");
		lblNewLabel_6.setBounds(91, 64, 149, 20);
		Single.add(lblNewLabel_6);
		
		
// Code Starts here
//Single Room
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 891, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Wall Area");
		frame.setVisible(true);
		frame.setSize(892, 538);
	}
}
