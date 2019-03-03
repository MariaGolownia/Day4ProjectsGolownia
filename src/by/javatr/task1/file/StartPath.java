package by.javatr.task1.file;

	import java.io.File;
	import java.io.UnsupportedEncodingException;
	import java.net.URL;
	import java.net.URLDecoder;
	import java.nio.charset.Charset;
	 
	public class StartPath {
	 
		public static String getURL() {
			URL location = StartPath.class.getProtectionDomain().getCodeSource().getLocation();
						
			String classLocation = null;
			
			try {
				classLocation = URLDecoder.decode(location.getFile().substring(1).replace('/', File.separatorChar), Charset.defaultCharset().name()) + StartPath.class.getName().replace('.', File.separatorChar).replace("StartPath", "");
			} catch (UnsupportedEncodingException e) {
			}
			
			return classLocation;
		}
	}

