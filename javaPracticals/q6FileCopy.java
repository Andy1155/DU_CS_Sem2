import java.io.*;

class q6FileCopy{
	
	public static void main(String[] args)throws Exception{
		File infile = new File(args[0]);
		File outfile = new File(args[1]);
		
		FileReader fr = null;
		FileWriter fw = null;
		
		try{
			fr = new FileReader(infile);
			fw = new FileWriter(outfile);
			
			int ch;
			while((ch = fr.read()) != -1){
				fw.write((char)ch);
			}
		}
		catch(IOException e){
			System.out.println(e);
		}
		finally{
			fr.close();
			fw.close();
		}
	}

}
