package com.movie.manage;

import java.io.File;

/**
 * 得到一个路径中的某个名字的图片路径
 * 
 * @author QQ546
 *
 */
public class GetPicPath {

	// 得到一个路径中的某个名字的图片路径
	public static String getPath(String path, String name) {

		File file = new File(path);

		for (File f : file.listFiles()) {
			System.out.println(f.getName());
			if (f.getName().equals(name + ".jpg") || f.getName().equals(name + ".png")) {
				path = f.getPath();
			}

		}
		return path;

	}

}
