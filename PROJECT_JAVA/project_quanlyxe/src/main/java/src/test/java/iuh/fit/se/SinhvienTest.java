package iuh.fit.se;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SinhvienTest {
	void testGetDiemTB() {
		Sinhvien sv = new Sinhvien(15454541, "Ly Hoang Nghiem", 5.5f, 10);
		assertEquals(4.5f, sv.getDiemTB());
	}
}
