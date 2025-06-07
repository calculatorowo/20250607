import  java.io.*;
import  java.util.ArrayList;
public class Irisdata {
	public static void main(String[] args) {
		FileReader fr=null;
		try {
		fr=new FileReader("C:\\Users\\User\\Dropbox\\PC\\Downloads\\irisdata(2).txt");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}	
		BufferedReader br=new BufferedReader(fr);
		String line,tempstring;
		String[] tempArray=new String[3];
		ArrayList myList=new ArrayList();
		int i=0;
		try {
		while((line=br.readLine())!=null) {
			tempstring=line;
			tempArray=tempstring.split("\\s");//指定分隔符號
			//(\\s)為空白鍵
			for(i=0;i<tempArray.length;i++) {
				myList.add(tempArray[i]);
			}
		}
		}catch(IOException e) {
			e.printStackTrace();
		}		
		int k=myList.size()/5;
		int count=0;
		double[][] trans_array=new double[k][4];
		String[] a=new String[k];
		for(int x=0;x<myList.size()/5;x++) {
			for(int y=0;y<4;y++) {
				trans_array[x][y]=Double.parseDouble((String)myList.get(count));
				count++;
			}
			a[x]=(String)myList.get(count);
			count++;
		}
		for(int x=0;x<k;x++) {
			for(int y=0;y<4;y++)
				System.out.print(trans_array[x][y]+"  ");
			System.out.print(a[x]+"   ");
			System.out.println();
		}
	}
	}