package org.greencodeinitiative.java.checks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.logging.Logger;

class OptimizeReadFileExceptionCheck {

	Logger logger = Logger.getLogger("");

	OptimizeReadFileExceptionCheck(OptimizeReadFileExceptionCheck readFile) {
	}

	public void readPreferences(String filename) {
		//...
		InputStream in = null;
		try {
			in = new FileInputStream(filename); // Noncompliant {{Optimize Read File Exceptions}}
		} catch (FileNotFoundException e) {
			logger.info(e.getMessage());
		}
		//...
	}
}