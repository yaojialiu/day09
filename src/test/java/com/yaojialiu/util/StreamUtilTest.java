package com.yaojialiu.util;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

public class StreamUtilTest {

	@Test
	public void testCloseAll() throws FileNotFoundException, IOException {
		//InputStream is = new FileInputStream("F:\\");
		StreamUtil.closeAll(new FileInputStream("F:\\"));
	}

	@Test 
	public void testCopy() throws FileNotFoundException, IOException {
		StreamUtil.copy(new FileInputStream("F:\\"), new FileOutputStream("F:\\a.text"), true, true);
	}

	@Test
	public void testReadTextFileInputStream() throws FileNotFoundException, IOException {
		StreamUtil.readTextFile(new FileInputStream("F:\\a.text"));
	}

	@Test
	public void testReadTextFileFile() throws FileNotFoundException, IOException {
		StreamUtil.readTextFile(new FileInputStream("F:\\a.text"));
	}

	@Test
	public void testReadStringFromSystemIn() throws FileNotFoundException {
		StreamUtil.readStringFromSystemIn("请输入姓名");
	}

	@Test
	public void testReadIntFromSystemIn() throws FileNotFoundException {
		StreamUtil.readIntFromSystemIn("请输入年龄:");
	}

}
