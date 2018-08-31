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
<<<<<<< HEAD
			System.out.println(f.getName());
			//根据前端传过来的名字，在图片文件夹中找到相应的图片，将路径存到数据库中
=======
>>>>>>> e32e14cf5b4034f7127c24f16b997979ecfba7ac
			if (f.getName().equals(name + ".jpg") || f.getName().equals(name + ".png")) {
				path = f.getPath();
			}

		}
		return path;

	}


}
