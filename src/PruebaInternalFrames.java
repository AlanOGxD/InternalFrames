
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;

class VentanaInicio extends JFrame implements ActionListener{
	
	JMenu masters, booking, testPerform, printing, transaction, labReports, Settings, Utilities, Window, Help;
	
	JInternalFrame menu;
	public VentanaInicio() {
		
		getContentPane().setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		setTitle("Lab Master - Test Booking");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
		JMenuBar menuBar =  new JMenuBar();
		masters =  new JMenu("Masters");
		menuBar.add(masters);
		
		booking =  new JMenu("Booking");
		menuBar.add(booking);
		
		testPerform = new JMenu("Test Perfom");
		menuBar.add(testPerform);
		
		printing = new JMenu("Printing");
		menuBar.add(printing);
		
		transaction = new JMenu("Transaction");
		menuBar.add(transaction);
		
		labReports = new JMenu("Lab Reports");
		menuBar.add(labReports);
		
		Settings = new JMenu("Settings");
		menuBar.add(Settings);
		
		Utilities = new JMenu("Utilities");
		menuBar.add(Utilities);
		
		Window =  new JMenu("Window");
		menuBar.add(Window);
		
		Help = new JMenu("Help");
		menuBar.add(Help);
		//menu.add(menuBar);
		//add(menuBar, BorderLayout.PAGE_START);
		//desktopPane.add(menu);
		
		//setJMenuBar(menuBar);
		
		menu=new JInternalFrame("Masters  Booking  TestPerform  Printing  Transaction  labReports  Settings  Utilities  Window  Help");
		menu.getContentPane().setLayout(new BorderLayout());
		
		menu.setDefaultCloseOperation(HIDE_ON_CLOSE);
		menu.setClosable(true);
		menu.setMaximizable(true);
		menu.setIconifiable(true);
		menu.setResizable(true);
		menu.setSize(500, 500);
		menu.setVisible(true);
		menu.add(menuBar);
		
		//add(desktopPane, BorderLayout.PAGE_START);
		
		
		JToolBar toolBar = new JToolBar();
			ImageIcon imagenAdd = new ImageIcon("add.jpg");
			ImageIcon imagenAddFinal = new ImageIcon(imagenAdd.getImage().getScaledInstance(45, 45, Image.SCALE_REPLICATE));
				toolBar.add(new JButton(imagenAddFinal));
			ImageIcon imagenEdit = new ImageIcon("Edit.jpg");
			ImageIcon imagenEditFinal = new ImageIcon(imagenEdit.getImage().getScaledInstance(45, 45, Image.SCALE_REPLICATE));
				toolBar.add(new JButton(imagenEditFinal));
			ImageIcon imagenBack = new ImageIcon("Back.jpg");
			ImageIcon imagenBackFinal = new ImageIcon(imagenBack.getImage().getScaledInstance(45, 45, Image.SCALE_REPLICATE));
				toolBar.add(new JButton(imagenBackFinal));
			ImageIcon imagenNext = new ImageIcon("Next.jpg");	
			ImageIcon imagenNextFinal = new ImageIcon(imagenNext.getImage().getScaledInstance(45, 45, Image.SCALE_REPLICATE));
				toolBar.add(new JButton(imagenNextFinal));
			ImageIcon imagenList = new ImageIcon("List.jpg");	
			ImageIcon imagenListFinal = new ImageIcon(imagenList.getImage().getScaledInstance(45, 45, Image.SCALE_REPLICATE));
				toolBar.add(new JButton(imagenListFinal));
			ImageIcon imagenSave = new ImageIcon("Save.jpg");	
			ImageIcon imagenSaveFinal = new ImageIcon(imagenSave.getImage().getScaledInstance(45, 45, Image.SCALE_REPLICATE));		
				toolBar.add(new JButton(imagenSaveFinal));
			ImageIcon imagenPrint = new ImageIcon("Print.jpg");	
			ImageIcon imagenPrintFinal = new ImageIcon(imagenPrint.getImage().getScaledInstance(45, 45, Image.SCALE_REPLICATE));
				toolBar.add(new JButton(imagenPrintFinal));
			ImageIcon imagenTest = new ImageIcon("Test.jpg");	
			ImageIcon imagenTestFinal = new ImageIcon(imagenTest.getImage().getScaledInstance(45, 45, Image.SCALE_REPLICATE));
				toolBar.add(new JButton(imagenTestFinal));
			ImageIcon imagenCancel = new ImageIcon("Cancel.jpg");	
			ImageIcon imagenCancelFinal = new ImageIcon(imagenCancel.getImage().getScaledInstance(45, 45, Image.SCALE_REPLICATE));
				toolBar.add(new JButton(imagenCancelFinal));
			ImageIcon imagenSettings = new ImageIcon("Settings.jpg");	
			ImageIcon imagenSettingsFinal = new ImageIcon(imagenSettings.getImage().getScaledInstance(45, 45, Image.SCALE_REPLICATE));	
				toolBar.add(new JButton(imagenSettingsFinal));
			ImageIcon imagenDelete = new ImageIcon("Delet.jpg");	
			ImageIcon imagenDeleteFinal = new ImageIcon(imagenDelete.getImage().getScaledInstance(45, 45, Image.SCALE_REPLICATE));	
				toolBar.add(new JButton(imagenDeleteFinal));
			ImageIcon imagenSlip = new ImageIcon("Slip.jpg");	
			ImageIcon imagenSlipFinal = new ImageIcon(imagenSlip.getImage().getScaledInstance(45, 45, Image.SCALE_REPLICATE));
				toolBar.add(new JButton(imagenSlipFinal));
			ImageIcon imagenExit = new ImageIcon("Exit.jpg");	
			ImageIcon imagenExitFinal = new ImageIcon(imagenExit.getImage().getScaledInstance(45, 45, Image.SCALE_REPLICATE));	
				toolBar.add(new JButton(imagenExitFinal));
		
		menu.add(toolBar, BorderLayout.PAGE_START);
		
		JPanel panel1 =  new JPanel(null);
		
		panel1.setBackground(Color.gray);
		panel1.setPreferredSize(new Dimension(150, 120));
		
				JLabel lblID = new JLabel("Patient ID ");
				lblID.setBounds(40, 7, 100, 25);
				panel1.add(lblID);
				JTextField cajaID = new JTextField(10);
				cajaID.setBounds(115, 10, 90, 20);
				panel1.add(cajaID);
		
				
				JLabel lblDato = new JLabel("Date");
				lblDato.setBounds(260, 10, 70, 20);
				panel1.add(lblDato);
				
				
				Calendar calendar = Calendar.getInstance();
				Date initDate = calendar.getTime();
					calendar.add(calendar.YEAR, -100);
					Date earliestDate = calendar.getTime();
					calendar.add(calendar.YEAR, 200);
					Date latestDate = calendar.getTime();
					SpinnerModel dateModel = new SpinnerDateModel(initDate, earliestDate, latestDate, calendar.YEAR);
					
					JSpinner spinnerFechaNac = new JSpinner(dateModel);
					spinnerFechaNac.setEditor(new JSpinner.DateEditor(spinnerFechaNac));
					
					 spinnerFechaNac.setBounds(330, 10, 100, 20);
					 panel1.add(spinnerFechaNac); 
		   			
		   		JLabel lblTime = new JLabel("*Time (hh:mm)");
		   		lblTime.setBounds(445, 10, 100, 20);
				panel1.add(lblTime);
				 
				JTextField cajahh = new JTextField(10);
				cajahh.setBounds(535, 10, 20, 20);
				panel1.add(cajahh);
			
				JTextField cajamm = new JTextField(10);
				cajamm.setBounds(560, 10, 20, 20);
				panel1.add(cajamm);
				
				JLabel lblLabNo = new JLabel("Lab No");
		   		lblLabNo.setBounds(600, 10, 100, 20);
				panel1.add(lblLabNo);
				 
				JTextField cajaLabNo = new JTextField(10);
				cajaLabNo.setBounds(650, 10, 60, 20);
				panel1.add(cajaLabNo);
				
				JLabel lblName = new JLabel("Name ");
				lblName.setBounds(40, 32, 100, 25);
				panel1.add(lblName);
				
				JComboBox<String> comboName=new JComboBox<String>();
				comboName.addItem("Mr.");
				comboName.addItem("Ms.");
				comboName.setBounds(115, 35, 65, 20);
			panel1.add(comboName);
				
				JTextField txtName = new JTextField(10);
				txtName.setBounds(190, 35, 175, 20);
				panel1.add(txtName);
				
				JLabel lblSex = new JLabel("Sex");
				lblSex.setBounds(40, 60, 55, 20);
				panel1.add(lblSex);
				
				JComboBox<String> comboSex=new JComboBox<String>();
				comboSex.addItem("MALE");
				comboSex.addItem("FEMALE");
				comboSex.setBounds(115, 60, 65, 20);
			panel1.add(comboSex);
			
				JLabel lblAge = new JLabel("Age");
				lblAge.setBounds(190, 60, 45, 20);
				panel1.add(lblAge);
				JTextField txtAge = new JTextField();
				
				menu.add(panel1);
		add(menu);
		pack();
		
	}//Constructor
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}//ClaseVentanaInicio


public class PruebaInternalFrames{

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new VentanaInicio();
				
			}
		});

	}//main

}//Class
