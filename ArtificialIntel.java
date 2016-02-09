package Files;

import java.io.*;
/**
 *
 * @author MarcusVinicius
 */
public class ArtificialIntel {
    private File vpdb = new File("VirtualDB.txt");
    private FileReader fr;
    private BufferedReader br;
    private FileWriter fw;
    private BufferedWriter bw;
    
    public void getTip(String line) throws FileNotFoundException, IOException{
        fr = new FileReader(vpdb);
        br = new BufferedReader(fr);
        fw = new FileWriter(vpdb);
        bw = new BufferedWriter(fw);
        
        while(br.ready()){
            if(line.contains(br.readLine())){
                bw.write(": "+(line.split(line)[line.split(": ").length-1]));
                break;
            }
        }
        br.close();
        bw.close();
        fr.close();
        fw.close();
    }
    
    public String getAnswer(String tip, int wordLength) throws FileNotFoundException, IOException{
        fr = new FileReader(vpdb);
        br = new BufferedReader(fr);
        String answer = null;
        while(br.ready()){
            String line = br.readLine();
            if(line.contains(tip)){
                answer = line.split(": ")[line.split(": ").length-2];
                return answer;
            }
            if(line.length() == wordLength){
                answer = line;
            }
        }
        return answer;        
    }
}
