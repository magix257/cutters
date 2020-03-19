package com.etiko;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {


	


		
		@RequestMapping("/")
		public String index() {
			return "index.jsp";
			
		}
		
		
		@RequestMapping("check")
		public String check(@RequestParam File file, Model m) throws IOException {
			
			File plik = new File(file.getAbsolutePath());
			Scanner scan = new Scanner(plik);
			String koniec = "";
			
			
		    	while (scan.hasNextLine()) {
		    	  
		    			koniec = koniec.concat(scan.nextLine() + "\n");
			    
		    	}
		    	scan.close();
		    		
		    	FileWriter writer = new FileWriter("F:\\PROGRAMOWANIE\\JAVA\\SPRING\\PROJEKTY\\cutters\\output.txt");
		    	writer.write(koniec);
		    	writer.close();
		    	
		    
		
		m.addAttribute("result", koniec);
			
			
			
			return "result.jsp";
		}

}
