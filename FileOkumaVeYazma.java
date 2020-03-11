package fileokumaveyazma;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.logging.Level;
import java.util.logging.Logger;



public class FileOkumaVeYazma 
{
	public static void main (String[] args)
	{
		int[] ciftdizisi = new int[50];
		int[] tekdizisi = new int[50];
		int i;
		File f = new File("C:/Users/offic/Desktop/deneme/1-100.txt");	
		File fcift = new File("C:/Users/offic/Desktop/deneme/cift.txt");
		File ftek = new File("C:/Users/offic/Desktop/deneme/tek.txt");
		//DOSYAYA 1-100 ARASI SAYILARI YAZMA
		try 
		{
			BufferedWriter writer = new BufferedWriter (new OutputStreamWriter (new FileOutputStream(f)));
			for (i=1; i<=100; i++) 
			{
				String str1 = Integer.toString(i);
				writer.append(str1);
				writer.newLine();
			}
				writer.flush();
		} 
		catch (FileNotFoundException e) 
		{
			
		}
		catch (IOException ex) 
		{
			
		}
		//DOSYADAN VERÝ ÇEKME KISMI
		try 
		{
			BufferedReader reader = new BufferedReader (new InputStreamReader (new FileInputStream(f)) );
			for(int ic1 = 1 ; ic1 <= 100 ; ic1++) {
				String s = reader.readLine();
				int s11 = Integer.parseInt(s);
				if(s11 % 2== 0) {
					ciftdizisi[ic1/2-1] = s11;	
				}
				else {
					tekdizisi[(ic1+1)/2-1]= s11;
				}
				
			}
			System.out.println(tekdizisi[10]);
			
		}
		catch (FileNotFoundException e) 
		{
			
		} 
		catch (IOException ex) 
		{
			
		} 
		try 
		{
			BufferedWriter writerd = new BufferedWriter (new OutputStreamWriter (new FileOutputStream(fcift)));
			for (i=0; i<50; i++) 
			{
				
				String a1 = Integer.toString(ciftdizisi[i]);
				writerd.append(a1);
				writerd.newLine();
			}
				writerd.flush();
		} 
		catch (FileNotFoundException e) 
		{
			
		}
		catch (IOException ex) 
		{
			
		}
		
		try 
		{
			BufferedWriter writerx = new BufferedWriter (new OutputStreamWriter (new FileOutputStream(ftek)));
			for (i=0; i<50; i++) 
			{
				
				String a2 = Integer.toString(tekdizisi[i]);
				writerx.append(a2);
				writerx.newLine();
			}
				writerx.flush();
		} 
		catch (FileNotFoundException e) 
		{
			
		}
		catch (IOException ex) 
		{
			
		}
		
			
	}
}