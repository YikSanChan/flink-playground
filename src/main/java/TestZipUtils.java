import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipFile;
import org.apache.flink.python.util.ZipUtils;
import org.apache.flink.util.FileUtils;

public class TestZipUtils {
    public static void main(String[] args) throws IOException {
        ZipUtils.extractZipFileWithPermissions("/Users/chenyisheng/source/yiksanchan/pyflink-quickstart/pyflink-quickstart.zip", "testziputils_dest");
//        ZipFile zipFile = new ZipFile("/Users/chenyisheng/source/aiinfra/featflow/pyflink/featflow-ml-env.zip");
//        Enumeration<ZipArchiveEntry> entries = zipFile.getEntriesInPhysicalOrder();
//        List<String> rows = Collections.list(entries).stream().map(ZipArchiveEntry::getName).collect(Collectors.toList());
//        FileUtils.writeFileUtf8(new File("output.ordered.txt"), String.join("\n", rows));
    }
}
