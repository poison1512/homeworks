package less01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PudgeLocalise extends JPanel implements ActionListener {
	private Locale localeEN = new Locale("en", "EN");
	private Locale localeDE = new Locale("de", "DE");
	private Locale localeRU = new Locale("ru", "RU");
	private ResourceBundle bundleEN = ResourceBundle.getBundle("TextBundle", localeEN);
	private ResourceBundle bundleDE = ResourceBundle.getBundle("TextBundle", localeDE);
	private ResourceBundle bundleRU = ResourceBundle.getBundle("TextBundle", localeRU);
	private JFrame window = new JFrame("Try to switch V 1.0");
	private JPanel panel = new JPanel();
	private JPanel panelT = new JPanel();
	private JButton englButton = new JButton();
	private JButton germButton = new JButton();
	private JButton russButton = new JButton();
	private JLabel picLabel = new JLabel(new ImageIcon("pudge.png"));
	private JLabel txtLabel1 = new JLabel(bundleRU.getString("Joshua"));
	private JLabel txtLabel2 = new JLabel(bundleEN.getString("Sara"));
	private JLabel txtLabel3 = new JLabel(bundleEN.getString("Ash"));

	private ActionListener aListener = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	};

	PudgeLocalise() {

		aListener.actionPerformed(null);
		
		this.setBackground(Color.WHITE);
		window.add(this);

		picLabel.setBackground(Color.WHITE);

		englButton.addActionListener(aListener);
		englButton.setIcon(new ImageIcon("USA.png"));

		germButton.addActionListener(aListener);
		germButton.setIcon(new ImageIcon("GER.png"));

		russButton.addActionListener(aListener);
		russButton.setIcon(new ImageIcon("RUS.png"));

		panel.setLayout(new GridLayout(1, 3, 1, 1));
		panel.setBounds(240, 0, 100, 100);
		panel.add(englButton);
		panel.add(germButton);
		panel.add(russButton);

		panelT.setLayout(new GridLayout(3, 1, 1, 1));
		panelT.setBackground(Color.WHITE);
		panelT.add(txtLabel1);
		panelT.add(txtLabel2);
		panelT.add(txtLabel3);

		window.add(picLabel, BorderLayout.LINE_START);
		window.add(panel, BorderLayout.CENTER);
		window.add(panelT, BorderLayout.LINE_END);

		window.setSize(800, 210);
		window.setLocation(1200, 1000);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);

	}
	public void initListener() {
		englButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
//				bundleEN = ResourceBundle.getBundle("TextBundle", localeEN);
				txtLabel1.setText(bundleEN.getString("Joshua"));
				txtLabel2.setText(bundleEN.getString("Sara"));
				txtLabel3.setText(bundleEN.getString("Ash"));
			}
		});
		germButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
//				bundleDE = ResourceBundle.getBundle("TextBundle", localeDE);
				txtLabel1.setText(bundleDE.getString("Joshua"));
				txtLabel2.setText(bundleDE.getString("Sara"));
				txtLabel3.setText(bundleDE.getString("Ash"));
			}
		});
		russButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
//				bundleRU = ResourceBundle.getBundle("TextBundle", localeRU);
				txtLabel1.setText(bundleRU.getString("Joshua"));
				txtLabel2.setText(bundleRU.getString("Sara"));
				txtLabel3.setText(bundleRU.getString("Ash"));
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

