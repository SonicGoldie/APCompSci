package Projects;
import java.io.*;
public class IntChart2 
{
	public static void main(String[] args) throws IOException {
		Histogram histogram = new Histogram();
		histogram.collect_values();
		histogram.print_results();
	} 
} 
