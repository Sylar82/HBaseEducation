import org.apache.hadoop.hbase.HTableDescriptor;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        HBaseTable hBaseTable = new HBaseTable();
        hBaseTable.createTable();

    }
}
