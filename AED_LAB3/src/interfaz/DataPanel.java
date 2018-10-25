package interfaz;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class DataPanel extends JPanel{
	
	public final static int COLUMNS = 8;
	private JTextField[] dataPlayers;
	private Main main;
	private JPanel panelAux1;
	private JPanel panelAux2;
	
	public DataPanel(Main pMain) {
		main = pMain;
		dataPlayers = new JTextField[COLUMNS];
		setBorder(new TitledBorder("Informacion Jugadores"));
		setLayout(new GridLayout(2, COLUMNS));
		panelAux1 = new JPanel();
		panelAux2 = new JPanel();
		panelAux1.setLayout(new GridLayout(main.getQuantity(), COLUMNS));
		panelAux2.setLayout(new GridLayout(main.getQuantity(), COLUMNS));
		 JLabel fact0 = new JLabel("Nombre");
		 JLabel fact1 = new JLabel("Edad");
		 JLabel fact2 = new JLabel("Equipo");
		 JLabel fact3 = new JLabel("(TS%) ");
		 JLabel fact4 = new JLabel("(ORB%)  ");
		 JLabel fact5 = new JLabel("(DRB%) ");
		 JLabel fact6 = new JLabel("(TRB%)");
		 JLabel fact7 = new JLabel("(AST%) ");
		 panelAux1.add(fact0);
		 panelAux1.add(fact1);
		 panelAux1.add(fact2);
		 panelAux1.add(fact3);
		 panelAux1.add(fact4);
		 panelAux1.add(fact5);
		 panelAux1.add(fact6);
		 panelAux1.add(fact7);
		 
		 for(int i = 0; i<dataPlayers.length; i++) {
			 JTextField txt = new JTextField("");
			 txt.setEditable(false);
			 dataPlayers[i] = txt;
			 panelAux2.add(dataPlayers[i]);
		 }
		 
		 add(panelAux1);
		 add(panelAux2);
		 
		
	}

}