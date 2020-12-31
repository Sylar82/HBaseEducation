import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.*;
import org.apache.hadoop.hbase.client.*;
import org.apache.hadoop.hbase.util.Bytes;

import java.io.IOException;

public class HBaseTable {

    public void CreateTable() throws IOException {
        Configuration config = HBaseConfiguration.create();
        Connection connection = ConnectionFactory.createConnection(config);
       try {
           Table table = connection.getTable(TableName.valueOf("myLittleHBaseTable"));
           Put p = new Put(Bytes.toBytes("myLittleRow"));
        //   p.add(Bytes.toBytes("myLittleFamily"), Bytes.toBytes("someQualifier"),Bytes.toBytes("Some Value"));
           table.put(p);
       }catch (Exception e) {
           e.printStackTrace();
       }


    }
}
