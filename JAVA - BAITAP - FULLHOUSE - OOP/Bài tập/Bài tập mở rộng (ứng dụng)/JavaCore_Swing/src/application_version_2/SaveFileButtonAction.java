package application_version_2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;


public class SaveFileButtonAction implements ActionListener {
	
	private Application app;
	
	public SaveFileButtonAction(Application app) {
		this.app = app;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("SAVE FILE:");
		JFileChooser chooser = new JFileChooser();
		int result = chooser.showOpenDialog(null);
		if(result == JFileChooser.APPROVE_OPTION) {
			File selectedFile = chooser.getSelectedFile();
			this.app.getSm().saveFile(selectedFile);
		}
	}
	
}
