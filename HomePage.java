package net.processmanagmentgui.swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.basic.BasicScrollBarUI;

public class HomePage extends JFrame{

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
	private String windowTitle = "Process Managment GUI";
//	private static HomePage frame;
//	private Container mainContainer;
//	private JPanel contentContainer;
	
	/**
	 * Universal Background & Foreground Colors
	 */
	private Color bg = new Color(133, 203, 217);
	private Color fg = new Color(255,255,255);
	private Color bga = new Color(255,200,109);
	
	/**
	 * Universal Border
	 */
	private LineBorder border = new LineBorder(new Color(255,200,109), 2);
	private Border loweredBorder = BorderFactory.createBevelBorder(BevelBorder.LOWERED, new Color(255,200,109), new Color(255,200,109));
	
	/**
	 * Universal Fonts
	 */
	private Font H1Font = new Font("Times New Roman", Font.PLAIN, 30);
	private Font H2Font = new Font("Times New Roman", Font.PLAIN, 25);
	private Font PFont = new Font("Times New Roman", Font.PLAIN, 20);
	private Font P2Font = new Font("Times New Roman", Font.PLAIN, 16);
	
	private int usedSpace = 0;
	private int freeSpace = 0;
	private int totalSpace = 0;
		
	//private ArrayList<JPanel> panelListG = new ArrayList<JPanel>();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame frame = new HomePage();
					frame.setVisible(true);
					System.out.println("I was called after line 88");
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		});

	}
	
	public HomePage() {
		/**
		 * Window Setup
		 */
		setTitle(windowTitle);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(windowStartingX, windowStartingY, windowWidth, windowHeight);
		setResizable(windowResizeable);
		
		
		/**
		 * Creating Main Container Layout
		 */
		Container mainContainer = new Container();
		mainContainer = getContentPane();
		mainContainer.setLayout(new BorderLayout());
		mainContainer.setBackground(bg);
		
		
		/**
		 * Creating A Navigation Bar
		 * Adding the Navigation Bar to the Main Container
		 */
		JPanel navBar = navBar();
		mainContainer.add(navBar, BorderLayout.NORTH);
		
		
		/**
		 * Creating A Grid Layout For Content Center
		 */
		JPanel contentContainer = new JPanel();
		contentContainer.setBackground(bg);
		contentContainer.setLayout(new GridLayout());
		
		
		/**
		 * Creating a New Process Queue Frame
		 * Adding the New Process Queue Frame to the Content Container
		 */
		JPanel newProcessQueueFrame = newProcessQueueFrame();
		contentContainer.add(newProcessQueueFrame);
		
		
		/**
		 * Creating a Ready Process Queue Frame
		 * Adding the Ready Process Queue Frame to the Content Container
		 */
		JPanel readyProcessQueueFrame = readyProcessQueueFrame();
		contentContainer.add(readyProcessQueueFrame);
		
		
		/**
		 * Creating a Current Process Frame
		 * Adding the Current Process Frame to the Content Container
		 */
		JPanel currentProcessFrame = currentProcessFrame();
		contentContainer.add(currentProcessFrame);
		
		
		/**
		 * Creating a Memory Frames View Frame
		 * Adding the Memory Frames Frame to the Content Container
		 */
		 JPanel memoryFrames = new JPanel();
		 memoryFrames.setBackground(bg);
		 memoryFrames.setLayout(new BorderLayout());
		 memoryFrames.setBorder(loweredBorder);
			
		 JLabel mfpTitle = new JLabel("Fragmentation");
		 mfpTitle.setFont(H2Font);
		 mfpTitle.setForeground(fg);
		 mfpTitle.setHorizontalAlignment(SwingConstants.CENTER);
		 
		 memoryFrames.add(mfpTitle, BorderLayout.NORTH);
		 contentContainer.add(memoryFrames);
		
		
			
		/**
		 * Creating a Controller Frame
		 * Adding the Controller Frame to Main Container
		 */
		JPanel controllerFrame = controller();
		contentContainer.add(controllerFrame);
		
		
		/**
		 * Adding Content Container to Main Container
		 */
		mainContainer.add(contentContainer, BorderLayout.CENTER);
	}
	
	public HomePage(JPanel memoryFramesJPanel) {
		/**
		 * Window Setup
		 */
		setTitle(windowTitle);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(windowStartingX, windowStartingY, windowWidth, windowHeight);
		setResizable(windowResizeable);
		
		
		/**
		 * Creating Main Container Layout
		 */
		Container mainContainer = new Container();
		mainContainer = getContentPane();
		mainContainer.setLayout(new BorderLayout());
		mainContainer.setBackground(bg);
		
		
		/**
		 * Creating A Navigation Bar
		 * Adding the Navigation Bar to the Main Container
		 */
		JPanel navBar = navBar();
		mainContainer.add(navBar, BorderLayout.NORTH);
		
		
		/**
		 * Creating A Grid Layout For Content Center
		 */
		JPanel contentContainer = new JPanel();
		contentContainer.setBackground(bg);
		contentContainer.setLayout(new GridLayout());
		
		
		/**
		 * Creating a New Process Queue Frame
		 * Adding the New Process Queue Frame to the Content Container
		 */
		JPanel newProcessQueueFrame = newProcessQueueFrame();
		contentContainer.add(newProcessQueueFrame);
		
		
		/**
		 * Creating a Ready Process Queue Frame
		 * Adding the Ready Process Queue Frame to the Content Container
		 */
		JPanel readyProcessQueueFrame = readyProcessQueueFrame();
		contentContainer.add(readyProcessQueueFrame);
		
		
		/**
		 * Creating a Current Process Frame
		 * Adding the Current Process Frame to the Content Container
		 */
		JPanel currentProcessFrame = currentProcessFrame();
		contentContainer.add(currentProcessFrame);
		
		
		/**
		 * Creating a Memory Frames View Frame
		 * Adding the Memory Frames Frame to the Content Container
		 */
		 //JPanel memoryFrames = memoryFrames();
		 contentContainer.add(memoryFramesJPanel);
		
		
			
		/**
		 * Creating a Controller Frame
		 * Adding the Controller Frame to Main Container
		 */
		JPanel controllerFrame = controller();
		contentContainer.add(controllerFrame);
		
		
		/**
		 * Adding Content Container to Main Container
		 */
		mainContainer.add(contentContainer, BorderLayout.CENTER);
	}
	
	public JPanel navBar() {
		// Creating Top Panel
		JPanel topPanel = new JPanel();
		topPanel.setBorder(border);
		topPanel.setBackground(bg);
		topPanel.setLayout(new BorderLayout());
		
		// Creating Container for Space Information
		JPanel space = new JPanel();
		space.setLayout(new BorderLayout());
		space.setBackground(bg);
		
		
		// Creating Title
		JLabel title = new JLabel("COSC 439: Memory Management");
		title.setForeground(fg);
		title.setFont(H1Font);
		
		
		/**
		 * Creates a panel to hold information about used space
		 * Creates a label for the used space header
		 * Creates a label for the used space body
		 */
		
		JPanel usedSpacePanel = new JPanel();
		usedSpacePanel.setLayout(new FlowLayout());
		usedSpacePanel.setBackground(bg);
		
		
		JLabel usedSpaceLabel = new JLabel("Used Space: ");
		usedSpaceLabel.setForeground(fg);
		usedSpaceLabel.setFont(PFont);
		
		JLabel usedSpaceText = new JLabel(String.valueOf(usedSpace));
		usedSpaceText.setForeground(fg);
		usedSpaceText.setFont(PFont);
		
		usedSpacePanel.add(usedSpaceLabel);
		usedSpacePanel.add(usedSpaceText);
		
		
		/**
		 * Creates a panel to hold information about free space
		 * Creates a label for the free space header
		 * Creates a label for the free space body
		 */
		
		JPanel freeSpacePanel = new JPanel();
		freeSpacePanel.setLayout(new FlowLayout());
		freeSpacePanel.setBackground(bg);
		

		JLabel freeSpaceLabel = new JLabel("Free Space: ");
		freeSpaceLabel.setForeground(fg);
		freeSpaceLabel.setFont(PFont);


		JLabel freeSpaceText = new JLabel(String.valueOf(freeSpace));
		freeSpaceText.setForeground(fg);
		freeSpaceText.setFont(PFont);
		
		freeSpacePanel.add(freeSpaceLabel);
		freeSpacePanel.add(freeSpaceText);
		
		
		/**
		 * Creates a panel to hold information about total space
		 * Creates a label for the total space header
		 * Creates a label for the total space body
		 */
		
		JPanel totalSpacePanel = new JPanel();
		totalSpacePanel.setLayout(new FlowLayout());
		totalSpacePanel.setBackground(bg);
		
		JLabel totalSpaceLabel = new JLabel("Total Space: ");
		totalSpaceLabel.setForeground(fg);
		totalSpaceLabel.setFont(PFont);

		JLabel totalSpaceText = new JLabel(String.valueOf(totalSpace));
		totalSpaceText.setForeground(fg);
		totalSpaceText.setFont(PFont);
		
		totalSpacePanel.add(totalSpaceLabel);
		totalSpacePanel.add(totalSpaceText);
		
		
		// Adds the panels to the space layout
		space.add(usedSpacePanel, BorderLayout.WEST);
		space.add(freeSpacePanel, BorderLayout.CENTER);
		space.add(totalSpacePanel, BorderLayout.EAST);
		
		// Adds Items to Top Panel
		topPanel.add(title, BorderLayout.WEST);
		topPanel.add(space, BorderLayout.EAST);
		
		// Return Top Panel
		return topPanel;
	}

	public JPanel newProcessQueueFrame() {
		/**
		 * Creating The Panel For Process Queue
		 */
		JPanel leftPanel = new JPanel();
		leftPanel.setBackground(bg);
		leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
		leftPanel.setBorder(loweredBorder);
		
		/**
		 * Creating a BorderLayout for the Alignment
		 */
		JPanel container = new JPanel();
		container.setBackground(bg);
		container.setLayout(new BorderLayout());
		
		/**
		 * Creating a Title 
		 * Creating a List View
		 */
		JLabel npqTitle = new JLabel("New Process Queue");
		npqTitle.setFont(H2Font);
		npqTitle.setForeground(fg);
		npqTitle.setHorizontalAlignment(SwingConstants.CENTER);
		
		JList<String> list;
		DefaultListModel<String> listModel = new DefaultListModel<String>();
		listModel = setListItems(listModel);
		list = new JList<String>(listModel);
		list.setBackground(bg);
		list.setForeground(fg);
		list.setSelectionBackground(bg);
		list.setFont(PFont);
		
		JScrollPane listScrollPane = new JScrollPane(list);
		listScrollPane.setBorder(BorderFactory.createEmptyBorder());
		listScrollPane.getVerticalScrollBar().setBackground(bg);
		listScrollPane.getVerticalScrollBar().setUI(new BasicScrollBarUI() {
			@Override
			protected void configureScrollBarColors() {
				this.thumbColor = bga;
			}
		});
		
		
		/**
		 * Adding Title to Container
		 * Adding List View to Container
		 */
		container.add(npqTitle, BorderLayout.NORTH);
		container.add(listScrollPane, BorderLayout.CENTER);
		
		/**
		 * Adding Container to Left Panel
		 */
		leftPanel.add(container);
		
		return leftPanel;
	}
	
	public JPanel readyProcessQueueFrame() {
		/**
		 * Creating the Panel for Ready Process Queue
		 */
		JPanel centerPanel = new JPanel();
		centerPanel.setBackground(bg);
		centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
		centerPanel.setBorder(loweredBorder);
		
		
		/**
		 * Creating a BorderLayout for the Alignment
		 */
		JPanel container = new JPanel();
		container.setBackground(bg);
		container.setLayout(new BorderLayout());
		
		
		/**
		 * Creating a Title
		 * Creating a List View
		 */
		JLabel rpqTitle = new JLabel("Ready Process Queue");
		rpqTitle.setFont(H2Font);
		rpqTitle.setForeground(fg);
		rpqTitle.setHorizontalAlignment(SwingConstants.CENTER);
		
		JList<String> list;
		DefaultListModel<String> listModel = new DefaultListModel<String>();
		listModel = setListItems(listModel);
		list = new JList<String>(listModel);
		list.setBackground(bg);
		list.setForeground(fg);
		list.setSelectionBackground(bg);
		list.setFont(PFont);
		
		JScrollPane listScrollPane = new JScrollPane(list);
		listScrollPane.setBorder(BorderFactory.createEmptyBorder());
		listScrollPane.getVerticalScrollBar().setBackground(bg);
		listScrollPane.getVerticalScrollBar().setUI(new BasicScrollBarUI() {
			@Override
			protected void configureScrollBarColors() {
				this.thumbColor = bga;
			}
		});
		
		
		/**
		 * Adding Title to Container
		 * Adding List View to Container
		 */
		container.add(rpqTitle, BorderLayout.NORTH);
		container.add(listScrollPane, BorderLayout.CENTER);
		
		
		/**
		 * Adding Container to Center Panel
		 */
		centerPanel.add(container);
		
		
		return centerPanel;
	}
	
	public JPanel currentProcessFrame() {
		/**
		 * Creating Panel for Current Process
		 */
		JPanel rightPanel = new JPanel();
		rightPanel.setBackground(bg);
		rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
		rightPanel.setBorder(loweredBorder);
		
		
		/**
		 * Creating a BorderLayout for the Alignment
		 */
		JPanel container = new JPanel();
		container.setBackground(bg);
		container.setLayout(new BorderLayout());
		
		
		/**
		 * Creating a Title
		 * Creating Body with contents
		 */
		JLabel cpTitle = new JLabel("Current Process");
		cpTitle.setFont(H2Font);
		cpTitle.setForeground(fg);
		cpTitle.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel body = new JPanel();
		body.setLayout(new BoxLayout(body, BoxLayout.Y_AXIS));
		body.setBackground(bg);
		
		
		/**
		 * Creating a Panel to Hold Process Number display
		 * Creating a Process Number Title
		 * Creating a Process Number Text
		 * Adding Title and Text to Panel
		 */
		JPanel processNumberPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		processNumberPanel.setBackground(bg);
		processNumberPanel.setAlignmentX(SwingConstants.LEFT);
		
		JLabel processNumberLabel = new JLabel("Process: ");
		processNumberLabel.setBackground(bg);
		processNumberLabel.setForeground(fg);
		processNumberLabel.setFont(PFont);
		processNumberLabel.setHorizontalTextPosition(SwingConstants.LEFT);
		
		JLabel processNumber = new JLabel("23");
		processNumber.setBackground(bg);
		processNumber.setForeground(fg);
		processNumber.setFont(P2Font);
		
		processNumberPanel.add(processNumberLabel);
		processNumberPanel.add(processNumber);
		
		
		/**
		 * Creating a Panel to Hold Process Start Frame display
		 * Creating a Process Start Frame Title
		 * Creating a Process Start Frame Text
		 * Adding Title and Text to Panel
		 */
		JPanel processStartFramePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		processStartFramePanel.setBackground(bg);
		processStartFramePanel.setAlignmentX(SwingConstants.LEFT);
		
		JLabel processStartFrameLabel = new JLabel("Start Frame: ");
		processStartFrameLabel.setBackground(bg);
		processStartFrameLabel.setForeground(fg);
		processStartFrameLabel.setFont(PFont);
		
		JLabel processStartFrame = new JLabel("1");
		processStartFrame.setBackground(bg);
		processStartFrame.setForeground(fg);
		processStartFrame.setFont(P2Font);
		
		processStartFramePanel.add(processStartFrameLabel);
		processStartFramePanel.add(processStartFrame);

		
		/**
		 * Creating a Panel to Hold Process End Frame display
		 * Creating a Process End Frame Title
		 * Creating a Process End Frame Text
		 * Adding Title and Text to Panel
		 */
		JPanel processEndFramePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		processEndFramePanel.setBackground(bg);
		processEndFramePanel.setAlignmentX(SwingConstants.LEFT);
		
		JLabel processEndFrameLabel = new JLabel("End Frame: ");
		processEndFrameLabel.setBackground(bg);
		processEndFrameLabel.setForeground(fg);
		processEndFrameLabel.setFont(PFont);
		
		JLabel processEndFrame = new JLabel("2");
		processEndFrame.setBackground(bg);
		processEndFrame.setForeground(fg);
		processEndFrame.setFont(P2Font);
		
		processEndFramePanel.add(processEndFrameLabel);
		processEndFramePanel.add(processEndFrame);
		
		
		/**
		 * Creating a Panel to Hold Process Current Runtime display
		 * Creating a Process Current Runtime Title
		 * Creating a Process Current Runtime Text
		 * Adding Title and Text to Panel
		 */
		JPanel processCurrentRuntimePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		processCurrentRuntimePanel.setBackground(bg);
		processCurrentRuntimePanel.setAlignmentX(SwingConstants.LEFT);
		
		JLabel processCurrentRuntimeLabel = new JLabel("Current Runtime: ");
		processCurrentRuntimeLabel.setBackground(bg);
		processCurrentRuntimeLabel.setForeground(fg);
		processCurrentRuntimeLabel.setFont(PFont);
		
		JLabel processCurrentRuntime = new JLabel("8000 ms");
		processCurrentRuntime.setBackground(bg);
		processCurrentRuntime.setForeground(fg);
		processCurrentRuntime.setFont(P2Font);
		
		processCurrentRuntimePanel.add(processCurrentRuntimeLabel);
		processCurrentRuntimePanel.add(processCurrentRuntime);
		
		/**
		 * Creating a Panel to Hold Process Total Runtime display
		 * Creating a Process Total Runtime Title
		 * Creating a Process Total Runtime Text
		 * Adding Title and Text to Panel
		 */
		JPanel processTotalRuntimePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		processTotalRuntimePanel.setBackground(bg);
		processTotalRuntimePanel.setAlignmentX(SwingConstants.LEFT);
		
		JLabel processTotalRuntimeLabel = new JLabel("Total Runtime: ");
		processTotalRuntimeLabel.setBackground(bg);
		processTotalRuntimeLabel.setForeground(fg);
		processTotalRuntimeLabel.setFont(PFont);
		
		JLabel processTotalRuntime = new JLabel("8000 ms");
		processTotalRuntime.setBackground(bg);
		processTotalRuntime.setForeground(fg);
		processTotalRuntime.setFont(P2Font);
		
		processTotalRuntimePanel.add(processTotalRuntimeLabel);
		processTotalRuntimePanel.add(processTotalRuntime);
		
		
		/**
		 * Adding all display frames to body container
		 */
		body.add(processNumberPanel);
		body.add(processStartFramePanel);
		body.add(processEndFramePanel);
		body.add(processCurrentRuntimePanel);
		body.add(processTotalRuntimePanel);
		
		/**
		 * Adding Title to Panel
		 * Adding List View to Panel
		 */
		container.add(cpTitle, BorderLayout.NORTH);
		container.add(body, BorderLayout.CENTER);
		
		/**
		 * Adding Container to Right Panel
		 */
		rightPanel.add(container);
		
		
		return rightPanel;
	}

	public JPanel memoryFrames(ArrayList<JPanel> panels) {		
		/**
		 * Creating Panel for Memory Frames
		 */
		JPanel memoryPanel = new JPanel();
		memoryPanel.setBackground(bg);
		memoryPanel.setLayout(new BorderLayout());
		memoryPanel.setBorder(loweredBorder);
		
		JLabel mfpTitle = new JLabel("Fragmentation");
		mfpTitle.setFont(H2Font);
		mfpTitle.setForeground(fg);
		mfpTitle.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel holder = new JPanel();
		holder.setLayout(new BoxLayout(holder, BoxLayout.Y_AXIS));
		holder.setBackground(bg);
		holder.setBorder(loweredBorder);
		
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		for(int i = 1; i < 11; i++) {
//			list.add(100 * 1);
//		}
		
		//ArrayList<JPanel> panels = getMemoryPanels(list);
		for(JPanel panel : panels) {
			holder.add(panel);
		}
		
		JScrollPane scrollPane = new JScrollPane(holder);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBorder(BorderFactory.createEmptyBorder());
		scrollPane.getVerticalScrollBar().setBackground(bg);
		scrollPane.getVerticalScrollBar().setUI(new BasicScrollBarUI() {
			@Override
			protected void configureScrollBarColors() {
				this.thumbColor = bga;
			}
		});
		
		memoryPanel.add(scrollPane, BorderLayout.CENTER);
		
		
		memoryPanel.add(mfpTitle, BorderLayout.NORTH);
		return memoryPanel;
	}
	
	public DefaultListModel<String> setListItems(DefaultListModel<String> lm) {
		
		for(int i = 0; i < 50; i++) {
			lm.addElement("Element ".concat(String.valueOf(i + 1)));
		}
		
		return lm;
	}

	public JPanel controller() {
		/**
		 * Creating Main Panel for controller buttons
		 */
		JPanel controllerPanelMain = new JPanel(new BorderLayout());
		controllerPanelMain.setBackground(bg);
		controllerPanelMain.setBorder(loweredBorder);
		
		
		/**
		 * Creating a panel for button layout with constraints for view
		 */
		JPanel buttonPanel = new JPanel(new GridBagLayout());
		buttonPanel.setBackground(bg);
		
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 20;
		c.ipadx = 30;
		c.insets = new Insets(10,10,10,5);
		
		
		/**
		 * Creating Buttons
		 * Adding Buttons to Button Panel
		 */
		JButton startButton = new JButton("Start");
		startButton.setBackground(bga);
		startButton.setOpaque(true);
		startButton.setBorder(BorderFactory.createRaisedBevelBorder());
		startButton.setForeground(fg);
		startButton.getModel().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				ButtonModel model = (ButtonModel) e.getSource();
                if (model.isPressed()) {
                    startButton.setBackground(bg);
                }else {
                	startButton.setBackground(bga);
                }
			}
			
		});
		
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = GridBagConstraints.REMAINDER;
		c.anchor = GridBagConstraints.CENTER;
		buttonPanel.add(startButton, c);
		
		
		JButton pauseButton = new JButton("Pause");
		pauseButton.setBackground(bga);
		pauseButton.setOpaque(true);
		pauseButton.setBorder(BorderFactory.createRaisedBevelBorder());
		pauseButton.setForeground(fg);
		pauseButton.getModel().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				ButtonModel model = (ButtonModel) e.getSource();
                if (model.isPressed()) {
                	pauseButton.setBackground(bg);
                }else {
                	pauseButton.setBackground(bga);
                }
			}
			
		});

		c.gridwidth = 1;
		c.weightx = 0.5;
		c.gridx = 0;
		c.gridy = 1;
		buttonPanel.add(pauseButton, c);
		
		
		JButton resetButton = new JButton("Reset");
		resetButton.setBackground(bga);
		resetButton.setOpaque(true);
		resetButton.setBorder(BorderFactory.createRaisedBevelBorder());
		resetButton.setForeground(fg);
		resetButton.getModel().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				ButtonModel model = (ButtonModel) e.getSource();
                if (model.isPressed()) {
                	resetButton.setBackground(bg);
                }else {
                	resetButton.setBackground(bga);
                }
			}
			
		});
		
		c.weightx = 0.5;
		c.gridx = 1;
		c.gridy = 1;
		buttonPanel.add(resetButton, c);
		
		
		JButton stopButton = new JButton("Stop");
		stopButton.setBackground(bga);
		stopButton.setOpaque(true);
		stopButton.setBorder(BorderFactory.createRaisedBevelBorder());
		stopButton.setForeground(fg);
		stopButton.getModel().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				ButtonModel model = (ButtonModel) e.getSource();
                if (model.isPressed()) {
                	stopButton.setBackground(bg);
                }else {
                	stopButton.setBackground(bga);
                }
			}
			
		});
		
		c.gridwidth = GridBagConstraints.REMAINDER;
		c.gridx = 0;
		c.gridy = 2;
		buttonPanel.add(stopButton, c);
		
		JButton showFragmentation = new JButton("Show Fragmentation");
		showFragmentation.setBackground(bga);
		showFragmentation.setOpaque(true);
		showFragmentation.setBorder(BorderFactory.createRaisedBevelBorder());
		showFragmentation.setForeground(fg);
		showFragmentation.getModel().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				ButtonModel model = (ButtonModel) e.getSource();
                if (model.isPressed()) {
                	showFragmentation.setBackground(bg);
                }else {
                	showFragmentation.setBackground(bga);
                }
			}
			
		});
		
		ArrayList<Integer> panelSizes = new ArrayList<Integer>();
		panelSizes.add(100);
		panelSizes.add(10);
		panelSizes.add(45);
		
		showFragmentation.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.print("Show Fragmentation");
				update(panelSizes);
			}
		});
		
		c.gridwidth = GridBagConstraints.REMAINDER;
		c.gridx = 0;
		c.gridy = 3;
		buttonPanel.add(showFragmentation, c);
		
		JButton defragmentationButton = new JButton("Defragmentation");
		defragmentationButton.setBackground(bga);
		defragmentationButton.setOpaque(true);
		defragmentationButton.setBorder(BorderFactory.createRaisedBevelBorder());
		defragmentationButton.setForeground(fg);
		defragmentationButton.getModel().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				ButtonModel model = (ButtonModel) e.getSource();
                if (model.isPressed()) {
                	defragmentationButton.setBackground(bg);
                }else {
                	defragmentationButton.setBackground(bga);
                }
			}
			
		});
		
		defragmentationButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				

			}
		});
		
		c.gridwidth = GridBagConstraints.REMAINDER;
		c.gridx = 0;
		c.gridy = 4;
		buttonPanel.add(defragmentationButton, c);
		
		/**
		 * Creating Title for Panel
		 */
		JLabel buttonPanelTitle = new JLabel("Controls");
		buttonPanelTitle.setFont(H2Font);
		buttonPanelTitle.setForeground(fg);
		buttonPanelTitle.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		/**
		 * Adding Button Layout Panel to Main Controller Panel
		 * Adding Section Title to Main Container Panel
		 */
		controllerPanelMain.add(buttonPanelTitle, BorderLayout.NORTH);
		controllerPanelMain.add(buttonPanel, BorderLayout.CENTER);
		
		return controllerPanelMain;
	}

	/**
	 * Creates the JPanels with colors with dimensions from ArrayList<Integer> given 
	 * @param list - Integer array  list that creates JPanels to the height of the elements in the array
	 * @return ArrayList of JPanels for display
	 */
	public ArrayList<JPanel> getMemoryPanels(ArrayList<Integer> list){
		ArrayList<JPanel> panels = new ArrayList<JPanel>();
		Random rand = new Random();
		int width = 400;
		
		for(int index : list) {
			JPanel temp = new JPanel(new BorderLayout());
			float r = rand.nextFloat();
			float g = rand.nextFloat();
			float b = rand.nextFloat();
			temp.setBackground(new Color(r,g,b));
			temp.setPreferredSize(new Dimension(width, index));
			temp.setMaximumSize(new Dimension(width, index));
			panels.add(temp);
		}
		
		return panels;
	}

	public ArrayList<JPanel>updateFrames(ArrayList<JPanel> list) {
		int width = 400;
		Random rand = new Random();
		JPanel temp = new JPanel(new BorderLayout());
		float r = rand.nextFloat();
		float g = rand.nextFloat();
		float b = rand.nextFloat();
		temp.setBackground(new Color(r,g,b));
		if(list.size() == 0) {
			temp.setPreferredSize(new Dimension(width, 100));
			temp.setMaximumSize(new Dimension(width, 100));
		}else {
			temp.setPreferredSize(new Dimension(width, list.get(0).getHeight()));
			temp.setMaximumSize(new Dimension(width, list.get(0).getHeight()));
		}
		
		list.add(temp);
		return list;
	}
	
	public void update(ArrayList<Integer> list) {
		ArrayList<JPanel> panelSizes = getMemoryPanels(list);
		JPanel newMemoryFramesJPanel = memoryFrames(panelSizes);
		dispose();
		HomePage h2 = new HomePage(newMemoryFramesJPanel);
		h2.setVisible(true);
	}
	
}