import java.awt.EventQueue;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;

public class W15 {

	private JFrame frame;
	int r=0;
	int p=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					W15 window = new W15();
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
	public W15() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 763, 529);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel count = new JLabel("");
		count.setFont(new Font("新細明體", Font.PLAIN, 24));
		count.setBounds(207, 102, 87, 51);
		frame.getContentPane().add(count);
		
		JLabel total_prass = new JLabel("");
		total_prass.setFont(new Font("新細明體", Font.PLAIN, 24));
		total_prass.setBounds(221, 20, 73, 51);
		frame.getContentPane().add(total_prass);
		
		JButton random = new JButton("Random");
		random.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temp2=random.getText();
				p++;
				int b=my_random(0,10);
				temp2=Integer.toString(b);
				DecimalFormat df = new DecimalFormat("#");
				int s=Integer.parseInt(temp2);
				if(s==0) {
					r++;
				}
				String k=df.format(r);
				count.setText(k);
				String m=df.format(p);
				total_prass.setText(m);
			}
			public static int my_random(int low,int up) {
				return((int)(Math.random()*(up-low+1))+low);
			}
		});
		random.setBounds(52, 279, 87, 87);
		frame.getContentPane().add(random);
		
		JLabel lblNewLabel = new JLabel("0出現的次數");
		lblNewLabel.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblNewLabel.setBounds(35, 102, 162, 35);
		frame.getContentPane().add(lblNewLabel);
		
		JButton probability = new JButton("計算機率");
		probability.setFont(new Font("新細明體", Font.PLAIN, 24));
		probability.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double pr=(double)r/p;
				DecimalFormat df = new DecimalFormat("#.###");
				String x=df.format(pr);
				probability.setText(x);
				
			}
		});
		probability.setBounds(291, 163, 162, 58);
		frame.getContentPane().add(probability);
		
		JLabel pr = new JLabel("出現0的機率為:");
		pr.setFont(new Font("新細明體", Font.PLAIN, 24));
		pr.setBounds(35, 163, 192, 63);
		frame.getContentPane().add(pr);
		
		JLabel lblNewLabel_1 = new JLabel("總次數");
		lblNewLabel_1.setFont(new Font("新細明體", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(35, 10, 142, 77);
		frame.getContentPane().add(lblNewLabel_1);
		

		
		
		
	
		
	
		

		
	
	}
}
/*
random.setText(temp2);
String temp3=textArea.getText();
temp3=temp2+"\n"+temp3;
textArea.setText(temp3);
*/