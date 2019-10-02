package amw.informatyka.zadanie1.runtime;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.JFileChooser;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTree;

public class uczelniaGUI {

	private JFrame frmAplikacjaUczelnia;
	/**
	 * @wbp.nonvisual location=334,379
	 */
	private final JFileChooser fileChooser = new JFileChooser();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					uczelniaGUI window = new uczelniaGUI();
					window.frmAplikacjaUczelnia.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public uczelniaGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAplikacjaUczelnia = new JFrame();
		frmAplikacjaUczelnia.setTitle("Aplikacja Uczelnia");
		frmAplikacjaUczelnia.setBounds(100, 100, 450, 300);
		frmAplikacjaUczelnia.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmAplikacjaUczelnia.setJMenuBar(menuBar);
		
		JMenu mnPlik = new JMenu("Plik");
		menuBar.add(mnPlik);
		
		JMenuItem mntmOtwrz = new JMenuItem("Otw\u00F3rz");
		
		JMenuItem mntmZapisz = new JMenuItem("Zapisz");
		mntmZapisz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openFile();
			}
		});
		mnPlik.add(mntmZapisz);
		
		JMenuItem mntmZamknij = new JMenuItem("Zamknij");
		mnPlik.add(mntmZamknij);
		
		JMenuItem mntmWidok = new JMenuItem("Widok");
		menuBar.add(mntmWidok);
		
		JButton btnNewButton = new JButton("New button");
		frmAplikacjaUczelnia.getContentPane().add(btnNewButton, BorderLayout.NORTH);
		
		JScrollPane scrollPane = new JScrollPane();
		frmAplikacjaUczelnia.getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		scrollPane.setViewportView(tabbedPane);
		
		JTree tree = new JTree();
		tabbedPane.addTab("New tab", null, tree, null);
	}

	protected void openFile() {
		fileChooser.showSaveDialog(this.frmAplikacjaUczelnia);
		
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
