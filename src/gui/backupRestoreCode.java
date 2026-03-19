
package gui;

public class backupRestoreCode {
    

    String backupDB(String path) {
        Process p = null;
        String msg = null;
        try {
            Runtime runtime = Runtime.getRuntime();
            p = runtime.exec("C:\\Program Files\\MySQL\\MySQL Server 8.0\\bin\\mysqldump.exe -uroot -pChooty2006@0322 "
                    + " --add-drop-database --port=3306 -B "
                    + " libms -r " + path);
            int processComplete = p.waitFor();
            System.out.println("process done" + processComplete);
            msg = "Success..!";
        } catch (Exception e) {
            e.printStackTrace();
            msg = "Error " + e.getMessage();
        }

        return msg;

    }


String restoreDB(String path) {
Process p = null;
        String msg = null;
        try {
            Runtime runtime = Runtime.getRuntime();
            String[] restoreCmd = new String[]{"C:\\Program Files\\MySQL\\MySQL Server 8.0\\bin\\mysql.exe",
                "--user=root",
                "--password=Chooty2006@0322",
                "-e",
                " source " + path};
            p = runtime.exec(restoreCmd);
            int processComplete = p.waitFor();
            System.out.println("process done" + processComplete);
            msg = "Success..!";
        } catch (Exception e) {
            e.printStackTrace();
            msg = "Error " + e.getMessage();
        }

        return msg;
}
}
