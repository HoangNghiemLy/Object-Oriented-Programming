package application_version_2;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class StudentManagement implements IStudentManagement {

	private ArrayList<Student> list;
	
	public StudentManagement() {
		this.list = new ArrayList<Student>();
	}
	
	// Học viên code ở đây
	@Override
	public void create(Student s) {
		// Triển khia chức năng thêm sinh viên vào danh sách
	}
	
	// Học viên code ở đây
	@Override
	public void update(Student s) {
		// Triển khai chức năng cập nhật thông tin sinh viên trong danh sách
	}

	// Học viên code ở đây
	@Override
	public Student search(int id) {
		// Triển khai chức năng tìm kiếm sinh viên trong danh sách
		return null;
	}

	// Học viên code ở đây
	@Override
	public void delete(int id) {
		// Triển khai chức năng xóa sinh viên khỏi danh sách
	}

	// Học viên code ở đây
	@Override
	public void showAll() {
		// Triển khai chức năng in ra toàn bộ sinh viên trong danh sách
	}

	// Học viên code ở đây
	@Override
	public void loadFile(File file) {
		// Triển khai chức năng load dữ liệu sinh viên từ file (input.txt là file được cung cấp sẵn)
	}

	// Học viên code ở đây
	@Override
	public void saveFile(File file) {
		// Triển khai chức năng save dữ liệu sinh viên vào file (định dạng thông tin để ghi vào file giống như file input.txt)
	}

}
