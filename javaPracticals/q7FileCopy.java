import java.io.*;

class q7FileCopy{
	public static void main(String[] args)throws IOException{
		File infile = new File(args[0]);
		BufferedReader br = new BufferedReader(new FileReader(infile));
		
		try(br){
			String sline, s;
			while((sline = br.readLine()) != null){
				sline = sline.trim();
				try{
					if(sline.substring(0,2).equals("//")){
						System.out.println(sline.substring(2));
					}
				}
				catch(StringIndexOutOfBoundsException e){
					continue;
				}
			}
		}
		catch(IOException e){
			System.out.println(e);
		}
		finally{
			br.close();
		}
	}
}
