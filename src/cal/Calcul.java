package cal;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

@SuppressWarnings("serial")
public class Calcul extends JFrame implements ActionListener,FocusListener,MouseListener {
	private JPanel pc,pn,p;
	private JTextField t;
	private JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bs,ba,be,bm,bd,bv,bc,br,bcos,bsin,bp,bpi;
	private JMenuBar menu;
	private JMenu aff,opt;
	private JMenuItem nouveau,quitter,ap;
	
	//constructeur de la classe Calcul
	public  Calcul() {
		//titre de la fenetre
		setTitle("Calculatrice");
		//taille de la fenetre
		setSize(315, 240);
		//centrer l'affichage de la fenetre à l'ecran
		setLocationRelativeTo(this);
		//empecher de redimensionner la fenetre
	    setResizable(false);
	    //arreter l'execution lors de la fermeture de la fenetre 
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	//modification de l'icone de la fenetre
		Toolkit kit=Toolkit.getDefaultToolkit();
		 Image img=kit.getImage("cal1.png");
		 setIconImage(img);
		
	//creation du panneau de la fenetre 	 
		p=new JPanel();
		p.setLayout(new BorderLayout());
	    add(p,"Center");
	    
		//creation du panneau centre
		pc=new JPanel();
		p.add(pc,BorderLayout.CENTER);
		pc.setLayout(new GridLayout(4, 4));
		
		//creation des boutons
		br=new JButton("√");
		pc.add(br);
		br.addActionListener(this);
		
		bp=new JButton("x²");
		pc.add(bp);
		bp.addActionListener(this);
		
		bpi=new JButton("π");
		pc.add(bpi);
		bpi.addActionListener(this);
		
		bcos=new JButton("cos");
		pc.add(bcos);
		bcos.addActionListener(this);
		
		ba=new JButton("+");
		pc.add(ba);
		ba.addActionListener(this);
		
		b1=new JButton("1");
		pc.add(b1);
		b1.addActionListener(this);
		
		b2=new JButton("2");
		pc.add(b2);
		b2.addActionListener(this);
		
		b3=new JButton("3");
		pc.add(b3);
		b3.addActionListener(this);
		
		b4=new JButton("4");
		pc.add(b4);
		b4.addActionListener(this);
		
		bm=new JButton("*");
		pc.add(bm);
		bm.addActionListener(this);
		
		b5=new JButton("5");
		pc.add(b5);
		b5.addActionListener(this);
		
		b6=new JButton("6");
		pc.add(b6);
		b6.addActionListener(this);
		
		b7=new JButton("7");
		pc.add(b7);
		b7.addActionListener(this);
		
		b8=new JButton("8");
		pc.add(b8);
		b8.addActionListener(this);
		
		bs=new JButton("-");
		pc.add(bs);
		bs.addActionListener(this);
		
		b9=new JButton("9");
		pc.add(b9);
		b9.addActionListener(this);
		
		b0=new JButton("0");
		pc.add(b0);
		b0.addActionListener(this);
		
		bv=new JButton(",");
		pc.add(bv);
		bv.addActionListener(this);
		
		be=new JButton("=");
		pc.add(be);
		be.addActionListener(this);
		
		
		
		bd=new JButton("/");
		pc.add(bd);
		bd.addActionListener(this);
		
		//creation du panneau nord
		pn=new JPanel();
		p.add(pn,BorderLayout.NORTH);
		
		bsin=new JButton("sin");
		pn.add(bsin);
		bsin.addActionListener(this);
		
		//creation du jtextfield 
		t=new JTextField(14);
		pn.add(t);
		t.addMouseListener(this);
		//mettre les caracteres en gras 
	    t.setFont(new Font("Cambria", Font.BOLD, 15));
	    t.setHorizontalAlignment(JTextField.RIGHT);
	    
	    
	    
		bc=new JButton("C");
		pn.add(bc);
		bc.addActionListener(this);
	    bc.setToolTipText("Effacer");
		
	    pn.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		
		//creation de la barre de menu 
		menu =new JMenuBar();
		setJMenuBar(menu);
		aff=new JMenu("Affichage");
		menu.add(aff);
		nouveau=new JMenuItem("Nouveau");
		aff.add(nouveau);
		nouveau.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,InputEvent.CTRL_MASK));
		nouveau.addActionListener(this);
		quitter=new JMenuItem("Quitter");
		aff.add(quitter);
		quitter.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q,InputEvent.ALT_MASK));
		quitter.addActionListener(this);
		opt=new JMenu("Option");
		menu.add(opt);
		ap=new JMenuItem("A propos de la calculatrice");
		opt.add(ap);
		ap.addActionListener(this);
		
	}
	

	public static void main(String[] args) {
		Calcul c=new Calcul();
		c.setVisible(true);

	}
//definir les action des boutons
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==b1) {
			t.setText(t.getText()+1);
		}
		
		if (e.getSource()==b2) {
			t.setText(t.getText()+2);
		}
		
		if (e.getSource()==b3) {
			t.setText(t.getText()+3);
		}
		
		if (e.getSource()==b4) {
			t.setText(t.getText()+4);
		}
		
		if (e.getSource()==b5) {
			t.setText(t.getText()+5);
		}
		
		if (e.getSource()==b6) {
			t.setText(t.getText()+6);
		}
		
		if (e.getSource()==b7) {
			t.setText(t.getText()+7);
		}
		
		if (e.getSource()==b8) {
			t.setText(t.getText()+8);
		}
		
		if (e.getSource()==b9) {
			t.setText(t.getText()+9);
		}
		
		if (e.getSource()==b0) {
			t.setText(t.getText()+0);
		}
		
		if (e.getSource()==bv) {
			t.setText(t.getText()+'.');
		}
		
		if (e.getSource()==bc || e.getSource()==nouveau) {
			t.setText(null);
		}
		
		if (e.getSource()==ba) {
			t.setText(t.getText()+'+');
		}
		
		if (e.getSource()==bs) {
			t.setText(t.getText()+'-');
		}
		
		if (e.getSource()==bm) {
			t.setText(t.getText()+'*');
		}
		
		if (e.getSource()==bd) {
			t.setText(t.getText()+'/');
		}
		
		if (e.getSource()==br) {
			double d=Double.parseDouble(t.getText());
			t.setText(""+Math.sqrt(d));
		}
		
		if (e.getSource()==bp) {
			double d=Double.parseDouble(t.getText());
			t.setText(""+Math.pow(d, 2));
		}
		
		if (e.getSource()==bpi) {
			t.setText(""+Math.PI);
		}
		
		if (e.getSource()==bcos) {
			double d=Double.parseDouble(t.getText());
			t.setText(""+Math.cos(d));
		}
		
		if (e.getSource()==bsin) {
			double d=Double.parseDouble(t.getText());
			t.setText(""+Math.sin(d));
		}
		
		
		if (e.getSource()==be) {
			String ch=t.getText();
			
			for (int i = 0; i < ch.length(); i++) {
			if (ch.charAt(i)=='+') {
			double n1=Double.parseDouble(ch.substring(0,ch.indexOf('+')));
			double n2=Double.parseDouble(ch.substring(ch.indexOf('+')+1));
			t.setText(""+(n1+n2));}
		
			else
				if (ch.charAt(i)=='-'){
			
			double n3=Double.parseDouble(ch.substring(0,ch.indexOf('-')));
			double n4=Double.parseDouble(ch.substring(ch.indexOf('-')+1));
			t.setText(""+(n3-n4));
		}
				else if (ch.charAt(i)=='*'){
					double n5=Double.parseDouble(ch.substring(0,ch.indexOf('*')));
					double n6=Double.parseDouble(ch.substring(ch.indexOf('*')+1));
					t.setText(""+(n5*n6));
				}
				else if (ch.charAt(i)=='/') {
					double n7=Double.parseDouble(ch.substring(0,ch.indexOf('/')));
					double n8=Double.parseDouble(ch.substring(ch.indexOf('/')+1));
					t.setText(""+(n7/n8));
				}
				
			
				}}
	                         
		if (e.getSource()==quitter) {
			int x=JOptionPane.showConfirmDialog(this, "Voulez vous vraiment quitter ?","Confirmation",JOptionPane.YES_NO_OPTION);
			if (x==0) {
				System.exit(0);
			}
			
		}
		
          if (e.getSource()==ap) {
		//ouvrir la fenetre Apropos	
			Apropos a=new Apropos();
			a.setVisible(true);
			
		}
		
		
	
		}

   
	@Override
	public void focusGained(FocusEvent e) {
          
	}


	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		
	}

//mouselisner c'est pour controler les mouvements de la souris
	@Override
	public void mouseClicked(MouseEvent arg0) {
			
		
		
	}

    //quand le curseur entre dans le jtextfield la couleur du jtextfield deviendra grise
	@Override
	public void mouseEntered(MouseEvent e) {
		t.setBackground(Color.lightGray);
		
	}

	//quand le curseur sort dans le jtextfield la couleur du jtextfield deviendra blanche
	@Override
	public void mouseExited(MouseEvent arg0) {
       t.setBackground(Color.WHITE);		
	}


	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
	
	}}



