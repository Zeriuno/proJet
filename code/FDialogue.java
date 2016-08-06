import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
				//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				dialog.setLocationRelativeTo(null);
				dialog.setLayout(new BorderLayout());
				JLabel message= new JLabel("Erreur");
				message.setPreferredSize(new Dimension(150, 75));
				dialog.add(message,BorderLayout.CENTER);
				
				dialog.add(new JButton("OK"), BorderLayout.SOUTH);
			}
		});
	}
}
	