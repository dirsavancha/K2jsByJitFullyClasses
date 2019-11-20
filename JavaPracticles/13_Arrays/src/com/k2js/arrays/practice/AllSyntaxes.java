//Using all Syntaxes

package com.k2js.arrays.practice;

class AllSyntaxes{
	static int[]i={10,20};
	static String[] j=new String[]{"H","E"};
	static int[] k=new int[2];
	static Integer[] l=new Integer[2];
}

class AllSyntaxesLogic{
	public static void m(StringBuffer[] m,Object[] n){
		for(int i=0;i<m.length;i++){
			//System.out.println(AllSyntaxes.i[i]+"\t"+AllSyntaxes.j[i]+"\t"+AllSyntaxes.k[i]+"\t"+AllSyntaxes.l[i]);
			System.out.printf("%d\t%s\t%d\t%d\t%s\t%s\n",AllSyntaxes.i[i],AllSyntaxes.j[i],AllSyntaxes.k[i],AllSyntaxes.l[i],m[i].toString(),n[i]);
		}
		
	}
}

class AllSyntaxesTest{
	public static void main(String...abc){
		AllSyntaxesLogic.m(new StringBuffer[]{new StringBuffer("Hello"),new StringBuffer("World")},new Object[2]);
	}
}