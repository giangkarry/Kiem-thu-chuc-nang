
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LuongHuuTest {
    int tuoi_nghi = 234;
    int nam_bhxh = 134;
    int tien_luong = 123000000;
    
    LuongHuu test = new LuongHuu(tuoi_nghi, nam_bhxh, tien_luong);
    @Test
    public void luong_nghi_test(){
        assertEquals("khong hop le", test.run());
    }
}
