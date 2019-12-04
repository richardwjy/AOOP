
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
	
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				JFrame f = new JFrame("Changing JButton Text");
				JButton btn=new JButton("Hello");
				JButton btnChange = new JButton("Change the Label");
				JLabel l1=new JLabel("This is a Label");
				JLabel l2=new JLabel("Changing button text by clicking it, Try it!");
				JTextField t1=new JTextField();
				
				f.setSize(400,400);
				f.setLayout(null);
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				f.setLocationRelativeTo(null);
				
				btn.addActionListener(new ActionListener() {
				int flag=1;
					@Override
					public void actionPerformed(ActionEvent ae) {
						// TODO Auto-generated method stub
						flag*=-1;
						if(flag==-1) {
							btn.setText("Clicked");
						}
						else {
							btn.setText("Hello");
						}
					}
					
				});
				
				btnChange.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent ae) {
						// TODO Auto-generated method stub
						if(!t1.getText().isEmpty()) {
							l1.setText(t1.getText());
							t1.setText("");
						}
						else {
							l1.setText("Empty string my friend");
						}
					}
					
				});
				
				t1.setBounds(50, 50, 100, 25);
				btnChange.setBounds(160, 50, 150, 25);
				l1.setBounds(50, 80, 150, 25);
				
				l2.setBounds(50,225,300,25);
				btn.setBounds(50, 250, 150, 25);
				
				f.add(btn);
				f.add(l1);f.add(l2);
				f.add(t1);
				f.add(btnChange);
				f.setVisible(true);
				
			}
			
		});		
	}


}
