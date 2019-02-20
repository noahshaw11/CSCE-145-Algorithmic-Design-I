/*
 * Created by Noah Shaw
 */
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;

public class LibrarySystemGUI {
	
	private LibrarySystem librarySystem;
	
	private JFrame frmLibraryDatabase;
	private JTextArea txtDisplay;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibrarySystemGUI window = new LibrarySystemGUI();
					window.frmLibraryDatabase.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LibrarySystemGUI() {
		initialize();
		librarySystem = new LibrarySystem(this); //What does this do?
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frmLibraryDatabase = new JFrame();
		frmLibraryDatabase.getContentPane().setBackground(Color.DARK_GRAY);
		frmLibraryDatabase.getContentPane().setForeground(Color.WHITE);
		frmLibraryDatabase.setTitle("Library Database");
		frmLibraryDatabase.setBounds(100, 100, 800, 305);
		frmLibraryDatabase.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLibraryDatabase.getContentPane().setLayout(null);
		
		JButton btnDisplay = new JButton("Display");
		btnDisplay.setBackground(Color.LIGHT_GRAY);
		btnDisplay.setForeground(Color.BLACK);
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetDisplay();
				librarySystem.print();
			}
		});
		btnDisplay.setBounds(56, 205, 100, 40);
		frmLibraryDatabase.getContentPane().add(btnDisplay);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setForeground(Color.BLACK);
		btnAdd.setBackground(Color.LIGHT_GRAY);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = JOptionPane.showInputDialog(null, "What is the name of the book?");
				String author = JOptionPane.showInputDialog(null, "Who is the author(s) of the book?");
				String yearPublished = JOptionPane.showInputDialog(null, "What year was the book published?");
				String publisher = JOptionPane.showInputDialog(null, "Who is the publisher of the book?");
				String ISBN = JOptionPane.showInputDialog(null, "What is the ISBN of the book?");
				String pageCount = JOptionPane.showInputDialog(null, "How many pages are in the book?");
				if(name != null && author != null && yearPublished != null && publisher != null && ISBN != null && pageCount != null)
				{
					librarySystem.addBook(new Book(name, author, Integer.parseInt(yearPublished), publisher, Integer.parseInt(ISBN), Integer.parseInt(pageCount)));
				}
			}
		});
		btnAdd.setBounds(168, 205, 100, 40);
		frmLibraryDatabase.getContentPane().add(btnAdd);
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.setForeground(Color.BLACK);
		btnRemove.setBackground(Color.LIGHT_GRAY);
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = JOptionPane.showInputDialog(null, "What is the name of the book?");
				String author = JOptionPane.showInputDialog(null, "Who is the author(s) of the book?");
				String yearPublished = JOptionPane.showInputDialog(null, "What year was the book published?");
				String publisher = JOptionPane.showInputDialog(null, "Who is the publisher of the book?");
				String ISBN = JOptionPane.showInputDialog(null, "What is the ISBN of the book?");
				String pageCount = JOptionPane.showInputDialog(null, "How many pages are in the book?");
				if(name != null && author != null && yearPublished != null && publisher != null && ISBN != null && pageCount != null)
				{
					librarySystem.removeBook(new Book(name, author, Integer.parseInt(yearPublished), publisher, Integer.parseInt(ISBN), Integer.parseInt(pageCount)));
				}
			}
		});
		btnRemove.setBounds(280, 205, 100, 40);
		frmLibraryDatabase.getContentPane().add(btnRemove);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBackground(Color.LIGHT_GRAY);
		btnSearch.setForeground(Color.BLACK);
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String searchBase = JOptionPane.showInputDialog(null, "What is the criteria you want to base your search on? Name, author, year published, publisher,	or ISBN?");
				String searchCriteria = JOptionPane.showInputDialog(null, "What are you looking for?");
				if(searchBase != null && searchCriteria != null)
				{
					librarySystem.search(searchBase, searchCriteria);
				}
			}
		});
		btnSearch.setBounds(392, 205, 100, 40);
		frmLibraryDatabase.getContentPane().add(btnSearch);
		
		JButton btnLoad = new JButton("Load");
		btnLoad.setForeground(Color.BLACK);
		btnLoad.setBackground(Color.LIGHT_GRAY);
		btnLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String fileName = JOptionPane.showInputDialog(null, "What is the name of the file you want to load?");
				librarySystem.load(fileName);
			}
		});
		btnLoad.setBounds(504, 205, 100, 40);
		frmLibraryDatabase.getContentPane().add(btnLoad);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBackground(Color.LIGHT_GRAY);
		btnSave.setForeground(Color.BLACK);
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String fileName = JOptionPane.showInputDialog(null, "What do you want to name this file? Beware that files with the same name will be overwritten.");
				librarySystem.save(fileName);
			}
		});
		btnSave.setBounds(616, 205, 100, 40);
		frmLibraryDatabase.getContentPane().add(btnSave);
		
		txtDisplay = new JTextArea();
		txtDisplay.setFont(new Font("Monospaced", Font.PLAIN, 13));
		txtDisplay.setForeground(Color.BLACK);
		txtDisplay.setEditable(false);
		txtDisplay.setBounds(12, 13, 758, 179);
		frmLibraryDatabase.getContentPane().add(txtDisplay);
	}
	
	//Methods for txtDisplay
	public void updateDisplay(String aString)
	{
		txtDisplay.append(aString);
	}
	public void resetDisplay()
	{
		txtDisplay.setText("");
	}
}
