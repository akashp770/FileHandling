import java.io.*;
class Fw{
	public static void main (String args[]) throws Exception {
				
				//File Writer 
	/*
	FileWriter f= new FileWriter ("hello.text");
	
		f.write(65);
		f.write("Akash");
		f.write("pune");
		
		char [] ch ={'a','b','c'};
		f.write(ch);
	
	f.flush();
	f.close();
	*/
	
					
					//BufferWriter
	/*	
	FileWriter f= new FileWriter ("hello.text");    // It require to Address the file
	BufferedWriter b=new BufferedWriter(f);
	
	b.write(65);
	b.newLine();
	
	b.write("Akash");
	b.newLine();
	
	b.write("pune");
	b.newLine();
	
		char [] ch ={'a','b','c'};
		b.write(ch);
		b.newLine();
		
	b.flush();
	b.close();
*/



						//PrintWriter
	PrintWriter p=new PrintWriter("hello.txt");
	
	p.write(65);
	p.println(65);
	p.println("Aakash");
	p.println("Pune");
	p.println(10.23);
		
		
		p.flush();
		p.close();
	}
}
