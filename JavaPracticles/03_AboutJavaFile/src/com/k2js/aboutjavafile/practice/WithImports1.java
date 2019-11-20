// With Import Statements

package com.k2js.aboutjavafile.practice;

	import java.io.PrintStream;
	import java.io.Console;
	import java.io.PrintWriter;

class B{
	public static void main(String...abc){
		PrintStream ps=System.out;
		ps.println("Hello World");
		Console c=System.console();
		PrintWriter pw=c.writer();
		pw.println("k2js");
	}
}
	