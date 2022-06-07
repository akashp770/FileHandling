import java.io.*;
/*class F{
	public static void main(String args[] ) {
		File f =new File("My");
		System.out.println(f.exists());
		f.mkdir();
	}
}
*/




class F{
	/*public static void main(String args[] ) {
		
		int count =0;
		File f=new File("F:\\Core Java");
		String[] s=f.list();   // show total files 
		
		for(String x:s){
			count ++;
			System.out.println(x);
		}
		System.out.println("Total no.of Files " + count);
*/


				// To Show Folder  
public static void main(String args[] ) {
		
		int count =0;
		File f=new File("F:\\Core Java");
		String[] s=f.list();   // show total files 
		
		for(String x:s){
			File f1=new File (f,x);
			if(f1.isDirectory()){
				count ++;
				System.out.println(x);
			}
		}
		System.out.println("Total no.of Folders " + count);


	
	}
}