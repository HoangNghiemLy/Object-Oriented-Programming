package application_version_2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;


public class LoadFileButtonAction implements ActionListener {
	
	private Application app;
	
	public LoadFileButtonAction(Application app) {
		this.app = app;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("LOAD FILE:");
		JFileChooser chooser = new JFileChooser();
		int result = chooser.showOpenDialog(null);
		if(result == JFileChooser.APPROVE_OPTION) {
			File selectedFile = chooser.getSelectedFile();
			this.app.getSm().loadFile(selectedFile);
		}
	}
	
}
