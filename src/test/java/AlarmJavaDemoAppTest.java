import com.sun.jna.Native;
import org.junit.Test;

public class AlarmJavaDemoAppTest {

    @Test
    public void loadTest() {
        System.out.println(this.getClass().getResource("HCNetSDK.dll").getPath());
        HCNetSDK INSTANCE = (HCNetSDK) Native.loadLibrary("D:\\workspace\\hcMonitor\\target\\classes\\HCNetSDK", HCNetSDK.class);
    }
}