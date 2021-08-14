package codechef2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int t=Integer.parseInt(sc.nextLine());
		int d=Integer.parseInt(sc.nextLine());
		int [][]da=new int[d][2];
		int di=0,pi=0,deadi=0,requiredi=0;
		int[][]qa=new int[0][0];
		
		for(int i=0;i<t;i++) {
			
			for(int j=0;j<d;j++) {
				
				String s=sc.nextLine();
				String sa[]=s.split(" ");
				
				 da[di++][0]=Integer.parseInt(sa[0]);
				 da[pi++][1]=Integer.parseInt(sa[1]);
			}
			
			int q=sc.nextInt();
			
			qa=new int[q][2];
			
			for(int k=0;k<q;k++) {
				
				String s=sc.nextLine();
				String sa[]=s.split(" ");
				
				 qa[deadi++][0]=Integer.parseInt(sa[0]);
				 qa[requiredi++][1]=Integer.parseInt(sa[1]);
			}
		}
		
		di=0;pi=0;deadi=0;requiredi=0;
		int sumd=0;
		
		for(int i=0;i<qa.length;i++) {
			
			 deadi=qa[i][0];
			 requiredi=qa[i][1];
			 
			 while(da[di][0] < deadi) {
				 di++;
				 sumd=da[pi++][1];
			 }
			 
			 if(sumd>=requiredi) {
				 System.out.println("Go Camp");
			 }
			 else
				 System.out.println("Go Sleep");
			 
			 sumd=0;
		}

	}

}
