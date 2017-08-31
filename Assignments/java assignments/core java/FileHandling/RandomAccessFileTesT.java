package FileHandling;
import java.io.*;
import java.util.Scanner;
public class RandomAccessFileTesT {
static void create(int acc_no,double bal,String name) throws IOException{
	File file = new File("raf2.txt"); 
	Account ac=new Account(acc_no,bal,name);
	RandomAccessFile raf = new RandomAccessFile(file, "rw");
	  long fileLength = file.length();
	 
	    raf.seek(fileLength);
	raf.writeInt(ac.acc_no); 
	raf.writeDouble(ac.balance); 
	raf.writeUTF(ac.name); 
	raf.writeChar('\n'); 
	
	raf.close();
}

static void read() throws IOException{
	
	File file = new File("raf2.txt"); 
	RandomAccessFile raf = new RandomAccessFile(file, "rw");
	System.out.println("ENTER ACCOUNT NO");
	Scanner sc=new Scanner(System.in);
	int user_acc=sc.nextInt();
	raf.seek(0);
	boolean found=false;
	do{
		int tempid=0;
		try{
			tempid=raf.readInt();
		}
		catch(Exception e){
			System.out.println("ACCOUNT NOT FOUND");
		}
	if(user_acc==tempid)
	{
	System.out.println("ACC :"+tempid+"       BALANCE : "+raf.readDouble()+ "      NAME : "+raf.readUTF());
	found=true;
	}
	else{
		raf.readLine();
	}
	}while(found==false);
	raf.close();
	}




static void delete() throws IOException{
	
	File file = new File("raf2.txt"); 
	RandomAccessFile raf = new RandomAccessFile(file, "rw");
	System.out.println("ENTER ACCOUNT NO");
	Scanner sc=new Scanner(System.in);
	int user_acc=sc.nextInt();
	raf.seek(0);
	 try {
         String data = null;
     
         while ((data = raf.readLine()) != null) {
             String[] de = data.split(" ");
             if (de[0].equals(user_acc)) {
                 data.trim();
             }
         }
     } catch (IOException e) {
         e.printStackTrace();
     }
	raf.close();
	}


static void update() throws IOException{

	File file = new File("raf2.txt"); 
	RandomAccessFile raf = new RandomAccessFile(file, "rw");
	System.out.println("ENTER ACCOUNT NO");
	Scanner sc=new Scanner(System.in);
	int user_acc=sc.nextInt();
	raf.seek(0);
	boolean found=false;
	do{
		int tempid=0;
		try{
			tempid=raf.readInt();
		}
		catch(Exception e){
			System.out.println("ACCOUNT NOT FOUND");
		}
	if(user_acc==tempid)
	{
		found=true;
	//System.out.println("NAME :"+tempid+"       ACCOUNT NO : "+raf.readDouble()+ "      BALANCE : "+raf.readUTF());
	System.out.println("Enter BALANCE");
	double balance=sc.nextDouble();

	raf.writeDouble(balance);
	System.out.println("ENTER NAME :");
	String name =sc.next();
	raf.writeUTF(name);

	
	}
	else{
		raf.readLine();
	}
	}while(found==false);
		
	raf.close();
	}
	








	static void readAll() throws IOException{
		File file = new File("raf2.txt"); 
		RandomAccessFile raf = new RandomAccessFile(file, "rw");
		

		raf.seek(0);
		try{
			
	
	     while(true){
	    	int acc_no=raf.readInt();
	    	double bal=raf.readDouble();
	    	String name=raf.readUTF();
	    	char end=raf.readChar();
	    	if(end=='\n'){
	    		System.out.println("ACC NO:"+acc_no+"       BALANCE : "+bal+ "      NAME : "+name);
	    	}
	     }
		}
		catch(Exception e){
			System.out.println("END OF FILE");
		}
	}
	
	
	static void filter() throws IOException{
		File file = new File("raf2.txt"); 
		RandomAccessFile raf = new RandomAccessFile(file, "rw");
		

		raf.seek(0);
		try{
			
	
	     while(true){
	    	int acc_no=raf.readInt();
	    	double bal=raf.readDouble();
	    	String name=raf.readUTF();
	    	char end=raf.readChar();
	    	if(end=='\n' && bal>10000){
	    		System.out.println("ACC NO:"+acc_no+"       BALANCE : "+bal+ "      NAME : "+name);
	    	}
	     }
		}
		catch(Exception e){
			System.out.println("END OF FILE");
		}
	}


	 public static void removeLineFromFile(String file, String lineToRemove) {
		 
		 
	        try {
	            File inFile = new File(file);
	            if (!inFile.isFile()) {
	                System.out.println("Parameter is not an existing file");
	                return;
	            }
	            //Construct the new file that will later be renamed to the original filename. 
	            File tempFile = new File(inFile.getAbsolutePath() + ".tmp");
	            BufferedReader br = new BufferedReader(new FileReader(file));
	            PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
	            String line ;
	            //Read from the original file and write to the new 
	            //unless content matches data to be removed.
	            while ((line = br.readLine()) != null) {
	                if (!line.trim().equals(lineToRemove)) {
	                    pw.println(line);
	                    pw.flush();
	                }
	            }
	            pw.close();
	            br.close();
	 
	            //Delete the original file
	            if (!inFile.delete()) {
	                System.out.println("Could not delete file");
	                return;
	            }
	            //Rename the new file to the filename the original file had.
	            if (!tempFile.renameTo(inFile))
	                System.out.println("Could not rename file");
	 
	        } catch (FileNotFoundException ex) {
	            ex.printStackTrace();
	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }
	    }

  static String getline(int acc_no) throws IOException{
		File file = new File("raf2.txt"); 
		RandomAccessFile raf = new RandomAccessFile(file, "rw");
		raf.seek(0);
		String line = null;
		if(acc_no==raf.readInt()){
			line=raf.readLine();
		}
	  return line;
  }

	public static void main(String[] args) throws IOException {
		File file = new File("raf2.txt"); 
		// TODO Auto-generated method stub
			create(1,12000,"Sachin");
			create(2,4000,"Aniket");
			create(3,2000,"Gopal");
			create(4,11000,"Swapnil");
			String a=getline(1);
			removeLineFromFile("raf.txt", a);
		//read();
		//update();
	 	//read();
		//readAll();
		//delete();
		//readAll();
		//filter();
		//update();
	}

}
