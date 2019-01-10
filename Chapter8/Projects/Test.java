package Projects;

import java.io.*;

public class Test {
	
	public static void main(String[] args) throws IOException {
		Histogram histogram = new Histogram();
		histogram.collect_values();
		histogram.print_results();
	} 
} 
