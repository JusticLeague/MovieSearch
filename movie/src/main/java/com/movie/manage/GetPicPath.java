package com.movie.manage;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * 得到图片的路径
 * 
 * @author QQ546
 *
 */
public class GetPicPath {
	
	// path: ../name
	public static List<String> getPath(String path) {
		
		File file = new File(path);
		
		List<String> list = new ArrayList<>();
		
		for (File f : file.listFiles()) {
			list.add(f.getPath());
		}
		
		return list;
	}
	
	public static void main(String[] args) {
		for (String string : getPath("E:/aac/pic2")) {
			System.out.println(string);
		}
	}
	
}
