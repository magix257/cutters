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
			String typ = "";
			String szerPap = "";
			String zeby = "";
			
			
		    	while (scan.hasNextLine()) {
		    	  
		    			koniec = scan.nextLine();
			    if (koniec.contains("|")) {
			    	typ = koniec.substring(2, 4).trim();
			    	szerPap = koniec.substring(38, 41);
			    	zeby = koniec.substring(60, 63).trim();
			    	FileWriter writer = new FileWriter("F:\\PROGRAMOWANIE\\JAVA\\SPRING\\PROJEKTY\\cutters\\output.txt", true);
			    	writer.write(typ+"|"+szerPap+"|"+zeby+"\n");
			    	writer.close();
			    	//extrakt = extrakt.replaceAll("[\\t\\n\\x0B\\f\\r]{5,7}", "");
			    }
			    else {
			    	
			    }
		    	}
		    	scan.close();
		    		
		    	
		    	
		    
		
		m.addAttribute("result", typ);
		m.addAttribute("result2", szerPap);
		m.addAttribute("result3", zeby);
			
			
			
			return "result.jsp";
		}

}
