package calcul;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Apropos extends JFrame {

	private JPanel pc1, p1;
	private JLabel lfond, lfond1, lfond2;

	public Apropos() {
		setTitle("Apropos");
		setSize(260, 160);
		setLocationRelativeTo(this);
		setResizable(false);

		// modification de l'icone de la fenetre
		Toolkit kit = Toolkit.getDefaultToolkit();
		Image img = kit.getImage("images/ap.png");
		setIconImage(img);

		// creation du panneau de la fenetre
		p1 = new JPanel();
		p1.setLayout(new BorderLayout());
		add(p1, "Center");

		// creation du panneau centre
		pc1 = new JPanel();
		p1.add(pc1, BorderLayout.CENTER);
		pc1.setLayout(new GridLayout(5, 5));
		lfond = new JLabel("Cette calculatrice a été programmée");
		pc1.add(lfond);
		lfond1 = new JLabel("en utilisant le langage de programmation");
		pc1.add(lfond1);
		lfond2 = new JLabel("orienté objet JAVA sous l'IDE eclipse ");
		pc1.add(lfond2);

	}
}
