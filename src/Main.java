import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Main extends JFrame implements ActionListener {

	private JTextArea textArea = new JTextArea(
			"Colle ton emploi du temps ici petit(e) UTBohéMien(ne), puis clique sur Menu->Convertir.");
	private MenuBar mbar = new MenuBar();
	private Menu menu = new Menu("Menu");
	private MenuItem convert = new MenuItem("Convertir");

	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(textArea);
		mbar.add(menu);
		menu.add(convert);
		menu.addActionListener(this);
		this.setMenuBar(mbar);
		this.setTitle("UTBM Schedule Converter");
		this.setSize(600, 400);
		this.setVisible(true);
	}

	private void translate() {
		boolean begin = false;
		String oldSchedule = "";
		String[] lines = this.textArea.getText().split("\n");
		for (String line : lines) {
			if (line.isEmpty()) {
				continue;
			}
			if (begin) {
				oldSchedule += new Creneau(line).printOld() + "\n";
			}
			if (line.startsWith("Site") || line.startsWith("UV")) {
				begin = true;
			}
		}

		this.textArea.setText(oldSchedule);

	}

	public static void main(String[] args) {
		new Main();
	}

	public void actionPerformed(ActionEvent arg0) {
		this.translate();
	}
}
