package net.processmanagmentgui.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicScrollBarUI;

public class GridPage extends JFrame{

	/**
	 * Default SerialVersionUID for JFRAME
	 */
	private static final long serialVersionUID = 1L;

	
	/**
	 * Initializing All Window Properties
	 */
	private int windowStartingX = 250; //450
	private int windowStartingY = 100; //190
	private int windowWidth = 1014; //1014
	private int windowHeight = 597; //597
	private boolean windowResizeable = false;
	private String windowTitle = "Memory Frame GUI";
	
	
	/**
	 * Universal Background & Foreground Colors
	 */
	private Color bg = new Color(133, 203, 217);
	private Color fg = new Color(255,255,255);
	private Color bga = new Color(255,200,109);
	
	
	/**
	 * Universal Fonts
	 */
	private Font P2Font = new Font("Times New Roman", Font.PLAIN, 16);
	
	
	/**
	 * Universal Border
	 */
	private LineBorder border = new LineBorder(new Color(255,200,109), 1);
	
	/**
	 * - Creates a new Window that displays the current Memory Frames
	 */
	public GridPage() {
		/**
		 * Window Setup
		 */
		setTitle(windowTitle);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		setBounds(windowStartingX, windowStartingY, windowWidth, windowHeight);
		setResizable(windowResizeable);
		
		
		/**
		 * Creating Layout for Main Container
		 */
		Container mainContainer = getContentPane();
		mainContainer.setLayout(new BorderLayout());
		mainContainer.setBackground(bg);
		
		/**
		 * Creating Grid Frame
		 * Adding Frame to Main Container
		 */
		JPanel memoryGridFrame =  memoryGridFrame();
		mainContainer.add(memoryGridFrame, BorderLayout.CENTER);
	}
	
	/**
	 * Creates a Panel for the Memory Frames
	 * @return - JPanel component that holds a GridLayout
	 */
	public JPanel memoryGridFrame() {
		int listSize = 4096;
		/**
		 * Creating Main Container for Grid Panel
		 */
		JPanel bottomPanel = new JPanel(new BorderLayout());
		bottomPanel.setBackground(bg);
		
		/**
		 * Creating the Grid Labels
		 * TODO - Create function to retrieve this information
		 * instead of setting it manually
		 */
		JLabel[] jLabels = new JLabel[listSize];
		for(int i = 0; i < listSize; i++) {
			jLabels[i] = new JLabel();
		}
		
		
		/**
		 * Creating The Grid Panel via a Grid Layout
		 * Adding each label to the Grid
		 * TODO - Create function to set this
		 */
		JPanel gridPanel = new JPanel();
		gridPanel.setLayout(new GridLayout(0,10));
		gridPanel.setBackground(bg);

		
		for(int i = 0; i < listSize; i++) {
			jLabels[i].setText(String.valueOf(i + 1));
			jLabels[i].setForeground(fg);
			jLabels[i].setFont(P2Font);
			jLabels[i].setBorder(border);
			jLabels[i].setHorizontalAlignment(SwingConstants.CENTER);;
			gridPanel.add(jLabels[i]);
		}
		
		JScrollPane listScrollPane = new JScrollPane(gridPanel);
		listScrollPane.setBackground(bg);
		listScrollPane.setBorder(BorderFactory.createEmptyBorder());
		listScrollPane.getVerticalScrollBar().setBackground(bg);
		listScrollPane.getVerticalScrollBar().setUI(new BasicScrollBarUI() {
			@Override
			protected void configureScrollBarColors() {
				this.thumbColor = bga;
			}
		});

		/**
		 * Adding the Grid to the Main Container
		 */
		bottomPanel.add(listScrollPane, BorderLayout.CENTER);
		
		return bottomPanel;
	}
}
