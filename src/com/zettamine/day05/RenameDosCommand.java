package com.zettamine.day05;

import java.io.File;

public class RenameDosCommand {

	public static void main(String[] args) {
		// rename/ren [<drive>:][<path>]<filename1> <filename2> ---> DOS Command to
		// rename a file

		// rename C:/Cjava/java/sample.txt java.txt ---> Variable arguments

		File f = new File(args[1]);
		if (!f.exists()) {
			System.out.println(args[1] + " | file does not exist in given directory");
			return;
		}
		if (!(args[0].equalsIgnoreCase("ren") || args[0].equalsIgnoreCase("rename"))) {
			System.out.println("Only Rename command is allowed");
			return;
		}
		System.out.println("Path -> " + args[1]);

		String[] path = args[1].split("/");
		System.out.println("File name: " + path[path.length - 1]);
		String finalPath = "";
		for (int i = 0; i < path.length - 1; i++)
			finalPath += path[i] + "/";
		finalPath += args[2];
		System.out.println();
		System.out.println("After Renaming " + path[path.length - 1] + " to " + args[2]);
		System.out.println();
		System.out.println("Path-> " + finalPath);
		System.out.println("File name: " + args[2]);
		File f1 = new File(finalPath);

		f.renameTo(f1);
		System.out.println("File renamed Successfully ");

	}

}
