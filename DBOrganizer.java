package Files;

import java.io.*;
import java.util.Arrays;

/**
 *
 * @author crisballa
 */
public class DBOrganizer {
    public void createDB() throws FileNotFoundException, IOException{
        File fileR = new File("dicionarioPalCruz.txt");
        File fileW = new File("VirtualDB.txt");
        
        FileReader fr = new FileReader(fileR);
        FileWriter fw = new FileWriter(fileW);
        
        BufferedReader br = new BufferedReader(fr);
        BufferedWriter bw = new BufferedWriter(fw);
        
        while(br.ready()){
            String line = br.readLine();
            System.out.println(line);
            bw.write(line.split(": ")[line.split(": ").length-1].trim());
            bw.newLine();
        }
        bw.close();
        br.close();
        fw.close();
        fr.close();
    }
    public static void main(String args[]) throws IOException{
        DBOrganizer dbVirt = new DBVirtualPlayer();
        dbVirt.createDB();
    }
}
