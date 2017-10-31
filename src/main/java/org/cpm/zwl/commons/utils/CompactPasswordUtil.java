package org.cpm.zwl.commons.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Scanner;

import org.cpm.zwl.commons.constrants.CategoryName;
import org.cpm.zwl.commons.entities.Account;
import org.springframework.boot.SpringApplication;


public class CompactPasswordUtil {

	public static void setUsernameAndPasswordInProperties(SpringApplication application, CategoryName category) throws IOException {
		Account account = new Account();
		account = getUsernameAndPassword(category);
		
		Properties properties = new Properties();
		properties.put("spring.datasource.username", account.getUsername());
		properties.put("spring.datasource.password", account.getPassword());
		
		application.setDefaultProperties(properties);
	}

	public static Account getUsernameAndPassword(CategoryName category) throws IOException {
		String DB_DECRYPT_COMMAND = "";
		Process process = Runtime.getRuntime().exec(DB_DECRYPT_COMMAND);
		InputStream in = process.getInputStream();
		String s = convertStreamToString(in);
		
		Account account = new Account();
		account.setUsername(s.split(" ")[0]);
		account.setPassword(s.split(" ")[1]);
		
		return account;
	}

	public static String convertStreamToString(InputStream in) {
		Scanner s = new Scanner(in).useDelimiter("\\A");
		return s.hasNext() ? s.next() : "";
	}
}
