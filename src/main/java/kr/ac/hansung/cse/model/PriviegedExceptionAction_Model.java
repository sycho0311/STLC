package kr.ac.hansung.cse.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.security.PrivilegedExceptionAction;

public class PriviegedExceptionAction_Model implements PrivilegedExceptionAction {//절대경로 엑세스 거부 해결 클래스
	public String filePath;

	public PriviegedExceptionAction_Model(String filePath) {
		this.filePath = filePath;
	}

	public Object run() throws FileNotFoundException {
		return new FileInputStream(filePath);
	}
}