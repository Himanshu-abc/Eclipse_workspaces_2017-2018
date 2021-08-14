package com.pp;

public class Main {
	
	static String swap(String sx, int a,int b) {
		
		char ch[] = sx.toCharArray();
		char temp = ch[a];
		ch[a] = ch[b];
		ch[b] = temp;
		
		return String.valueOf(ch);
	}
	
	static void permute(String s,int l,int r){
		
		if(l == r) {
			System.out.println(s);
		}
		else {
			
		for(int i=l;i<=r;i++) {
				
			s=swap(s, l, i);
			permute(s, l+1, r);
			s=swap(s, l, i);
		}
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="abcdef";
		permute(s, 0, s.length()-1);
	}
}
