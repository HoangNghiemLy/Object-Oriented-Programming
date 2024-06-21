package application_version_2;
import java.io.File;


public interface IStudentManagement {
	
	void create(Student s);
	
	void update(Student s);
	
	Student search(int id);
	
	void delete(int id);
	
	void showAll();
	
	void loadFile(File file);
	
	void saveFile(File file);

}
