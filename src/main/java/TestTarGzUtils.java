import java.io.IOException;

public class TestTarGzUtils {
    public static void main(String[] args) throws IOException {
        TarGzUtils.extractZipFileWithPermissions("/Users/chenyisheng/source/yiksanchan/pyflink-quickstart/pyflink-quickstart.tar.gz", "testtargzutils_dest");
    }
}
