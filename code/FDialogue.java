import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class FDialogue extends JFrame{
	public static void main(String[] args){
		//JOptionPane.showMessageDialog(null, "Erreur dans la saisie", "Erreur", JOptionPane.ERROR_MESSAGE);
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				JDialog dialog = new JDialog();
				dialog.setSize(300, 200);
				dialog.setTitle("Dialogue");
				dialog.setVisible(true);
				dialog.setResizable(false);
				//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				dialog.setLocationRelativeTo(null);
				dialog.setLayout(new BorderLayout());
				JLabel message= new JLabel("Erreur T_T",SwingConstants.CENTER);
				message.setPreferredSize(new Dimension(150, 75));
				dialog.add(message,BorderLayout.CENTER);
				JButton ok=new JButton("OK");
				ok.addActionListener(new ButtonListener());
				JPanel buttonPane = new JPanel();
				buttonPane.add(ok);
				dialog.add(buttonPane, BorderLayout.SOUTH);
				
				
			}
		});
		
	}
	
}
class ButtonListener implements ActionListener{
	public void actionPerformed(ActionEvent e){
		System.exit(0);
	 }
	}
	