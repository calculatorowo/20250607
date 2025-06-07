//412421147 統資二甲 周楷翔 K=1
import  java.io.*;
import  java.util.ArrayList;
import java.util.*;
public class HW10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		double d=sc.nextDouble();
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
		String[] p=new String[k];
		for(int x=0;x<myList.size()/5;x++) {
			for(int y=0;y<4;y++) {
				trans_array[x][y]=Double.parseDouble((String)myList.get(count));
				count++;
			}
			p[x]=(String)myList.get(count);
			count++;
		}
		double A;
		double B;
		double C;
		double D;
		double q = 0;
		double w=0;
		double e=0;
		double r=0;
		double min=1000;
		String []t=new String[1];
		//double [][]check=new double[k][4];
		for(int x=0;x<k;x++) {
			for(int y=0;y<4;y++) {
				System.out.print(trans_array[x][y]+"  ");
			}
			A=trans_array[x][0];
			B=trans_array[x][1];
			C=trans_array[x][2];
			D=trans_array[x][3];
			double length=Math.sqrt((A-a)*(A-a)+(B-b)*(B-b)+(C-c)*(C-c)+(D-d)*(D-d));
			System.out.print(p[x]+"   ");
			System.out.println();
			System.out.printf("%.2f\n",length);
			System.out.println();
			if(min>length) {
				min=length;
				t[0]=p[x];
				q=trans_array[x][0];
				w=trans_array[x][1];
				e=trans_array[x][2];
				r=trans_array[x][3];
				
			}
		}
		System.out.print(q+"  "+w+"  "+e+"  "+r+"  ");
		System.out.print(t[0]+"  ");
		System.out.println();
		System.out.printf("%.2f",min);
		
	}

	}

