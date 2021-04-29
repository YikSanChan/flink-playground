import java.io.IOException;
import org.apache.flink.python.util.ZipUtils;

public class TestZipUtils {
    public static void main(String[] args) throws IOException {
        ZipUtils.extractZipFileWithPermissions("/Users/chenyisheng/source/aiinfra/featflow/pyflink/featflow-ml-env.zip", "testziputils_dest");
    }
}
