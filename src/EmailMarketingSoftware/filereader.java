/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmailMarketingSoftware;
/**
 *
 * @author iktakhairul
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class filereader {
    
    //emailHome obe = new emailHome();
    @SuppressWarnings("SleepWhileInLoop")
    public void freader () throws InterruptedException{
        try{
        FileReader fr = new FileReader("F:\\netbeansproject\\Email Marketing\\file.txt");
        BufferedReader br = new BufferedReader(fr);
       String line ="";
       
       int linenumber = 1;
        while((line = br.readLine()) != null){
                String Passline  ="";
                Passline = Passline + line.trim();
                //obe.passline(Passline, linenumber);// pass line and line number
            linenumber++;
        }
        
       
        br.close();
        fr.close();
       
        } catch (IOException e){
            e.printStackTrace();
        }
        
    }
    
    
    
}
