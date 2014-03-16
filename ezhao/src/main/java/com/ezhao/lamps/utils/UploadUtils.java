package com.ezhao.lamps.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UploadUtils {
	private static final String TARGETFOLDER = PropFileUtils.getInstance().getPropertiesValue("upload.file.path");
	
	public static String saveFile(InputStream input,String orginName){
		String format = orginName.substring(orginName.lastIndexOf("."),orginName.length());
		return saveFileFromInputStream(input, TARGETFOLDER, getFileName() + format);
	}
	
	public static String saveFileFromInputStream(InputStream ins, String targetFolder, String targetFileName) {
		FileOutputStream fs = null;
		File theFolder = new File(targetFolder);
		if (!(theFolder.isDirectory())) {
			theFolder.mkdirs();
		}
		String targetFullPath = targetFolder + targetFileName;
		try {
			fs = new FileOutputStream(targetFullPath);
			byte[] buffer = new byte[1024 * 1024];
			int bytesum = 0;
			int byteread = 0;
			while ((byteread = ins.read(buffer)) != -1) {
				bytesum += byteread;
				fs.write(buffer, 0, byteread);
				fs.flush();
			}
		} catch (Exception e) {
		} finally {
			try {
				fs.close();
				ins.close();
			} catch (IOException e) {
			}
		}
		return targetFullPath;
	}
	
	public static String getFileName(){
		StringBuffer newFileName = new StringBuffer();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String strDate = df.format(new Date()).replaceAll("-", "");
		newFileName.append(strDate);
		newFileName.append(System.currentTimeMillis());
		return newFileName.toString();
	}
}
