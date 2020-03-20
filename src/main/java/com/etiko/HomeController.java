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
			String linia = "";
			String typ = "";
			String szerPap = "";
		
			String zeby = "";
			String id = "";
			String M1 = "5501";
			String M2 = "5502";
			String P5 = "5505";
			String P6 = "5506";
			String P7 = "5507";
			
			
		    	while (scan.hasNextLine()) {
		    	  
		    		linia = scan.nextLine();
			    if (linia.contains("|")) {
			    	typ = linia.substring(2, 4).trim();
			    	
			    	szerPap = linia.substring(38, 41).trim();
			    	if (szerPap.equals("")) {
			    		szerPap = "0";
			    	}
			    	Integer szerpap = Integer.valueOf(szerPap);
			    	
			    	zeby = linia.substring(60, 63).trim();
			    	id = linia.substring(217, 222).trim();
								    	
			    	if ((typ.equals("PP")) && szerpap<331) {
			    		FileWriter writer = new FileWriter("F:\\PROGRAMOWANIE\\JAVA\\SPRING\\PROJEKTY\\cutters\\output.txt", true);
			    		writer.write(id+"|"+P6+"\n");
				    	writer.write(id+"|"+P7+"\n");
				    	writer.close();
			    	}
			    	else if ((typ.equals("PP")) && szerpap>330) {
			    		FileWriter writer = new FileWriter("F:\\PROGRAMOWANIE\\JAVA\\SPRING\\PROJEKTY\\cutters\\output.txt", true);
				    	writer.write(id+"|"+P7+"\n");
				    	writer.close();
			    	}
			    	//KONIEC DLA PP
			    	
			    	//DLA 68Z
			    	if (zeby.equals("68")) {
			    		FileWriter writer = new FileWriter("F:\\PROGRAMOWANIE\\JAVA\\SPRING\\PROJEKTY\\cutters\\output.txt", true);
			    		writer.write(id+"|"+M1+"\n");
				    	writer.close();
			    	}
			    	//DLA 104Z
			    	if (zeby.equals("104")) {
			    		FileWriter writer = new FileWriter("F:\\PROGRAMOWANIE\\JAVA\\SPRING\\PROJEKTY\\cutters\\output.txt", true);
			    		writer.write(id+"|"+M1+"\n");
				    	writer.close();
			    	}
			    	
			    	//DLA 168Z
			    	if (zeby.equals("168")) {
			    		FileWriter writer = new FileWriter("F:\\PROGRAMOWANIE\\JAVA\\SPRING\\PROJEKTY\\cutters\\output.txt", true);
			    		writer.write(id+"|"+P7+"\n");
				    	writer.close();
			    	}
			    	
			    	//KONIEC DLA ZEBOW 68 I 104 I 168
			    	
			    	//DLA PAPIERU DO 255
			    	else if ((!typ.equals("PP")) && szerpap<256) {
			    		if (zeby.equals("79")) {
			    			FileWriter writer = new FileWriter("F:\\PROGRAMOWANIE\\JAVA\\SPRING\\PROJEKTY\\cutters\\output.txt", true);
			    			writer.write(id+"|"+M1+"\n");
			    			writer.write(id+"|"+M2+"\n");
			    			writer.write(id+"|"+P5+"\n");
			    			writer.write(id+"|"+P6+"\n");
			    			
					    	writer.close();
			    		}
			    		else if (zeby.equals("84")) {
			    			FileWriter writer = new FileWriter("F:\\PROGRAMOWANIE\\JAVA\\SPRING\\PROJEKTY\\cutters\\output.txt", true);
			    			writer.write(id+"|"+M1+"\n");
			    			writer.write(id+"|"+M2+"\n");
			    			writer.write(id+"|"+P5+"\n");
			    			writer.write(id+"|"+P6+"\n");
			    			writer.write(id+"|"+P7+"\n");
					    	writer.close();
			    		}
			    		else if (zeby.equals("89")) {
			    			FileWriter writer = new FileWriter("F:\\PROGRAMOWANIE\\JAVA\\SPRING\\PROJEKTY\\cutters\\output.txt", true);
			    			writer.write(id+"|"+M1+"\n");
			    			writer.write(id+"|"+M2+"\n");
			    			writer.write(id+"|"+P5+"\n");
			    			writer.write(id+"|"+P6+"\n");
			    			writer.write(id+"|"+P7+"\n");
					    	writer.close();
			    		}
			    		else if (zeby.equals("91")) {
			    			FileWriter writer = new FileWriter("F:\\PROGRAMOWANIE\\JAVA\\SPRING\\PROJEKTY\\cutters\\output.txt", true);
			    			
			    			writer.write(id+"|"+M2+"\n");
			    			writer.write(id+"|"+P5+"\n");
			    			writer.write(id+"|"+P6+"\n");
			    			writer.write(id+"|"+P7+"\n");
					    	writer.close();
			    		}
			    		else if (zeby.equals("92")) {
			    			FileWriter writer = new FileWriter("F:\\PROGRAMOWANIE\\JAVA\\SPRING\\PROJEKTY\\cutters\\output.txt", true);
			    			writer.write(id+"|"+M1+"\n");
					    	writer.close();
			    		}
			    		else if (zeby.equals("96")) {
			    			FileWriter writer = new FileWriter("F:\\PROGRAMOWANIE\\JAVA\\SPRING\\PROJEKTY\\cutters\\output.txt", true);
			    			writer.write(id+"|"+M1+"\n");
			    			writer.write(id+"|"+M2+"\n");
			    			writer.write(id+"|"+P5+"\n");
			    			writer.write(id+"|"+P6+"\n");
			    			writer.write(id+"|"+P7+"\n");
					    	writer.close();
			    		}
			    		else if (zeby.equals("100")) {
			    			FileWriter writer = new FileWriter("F:\\PROGRAMOWANIE\\JAVA\\SPRING\\PROJEKTY\\cutters\\output.txt", true);
			    			writer.write(id+"|"+M1+"\n");
			    			writer.write(id+"|"+M2+"\n");
			    			writer.write(id+"|"+P5+"\n");
			    			writer.write(id+"|"+P6+"\n");
			    			writer.write(id+"|"+P7+"\n");
					    	writer.close();
			    		}
			    		else if (zeby.equals("108")) {
			    			FileWriter writer = new FileWriter("F:\\PROGRAMOWANIE\\JAVA\\SPRING\\PROJEKTY\\cutters\\output.txt", true);
			    			writer.write(id+"|"+M1+"\n");
			    			writer.write(id+"|"+M2+"\n");
			    			writer.write(id+"|"+P5+"\n");
			    			writer.write(id+"|"+P6+"\n");
			    			writer.write(id+"|"+P7+"\n");
					    	writer.close();
			    		}
			    		else if (zeby.equals("110")) {
			    			FileWriter writer = new FileWriter("F:\\PROGRAMOWANIE\\JAVA\\SPRING\\PROJEKTY\\cutters\\output.txt", true);
			    			
			    			writer.write(id+"|"+M2+"\n");
			    			writer.write(id+"|"+P5+"\n");
			    			writer.write(id+"|"+P6+"\n");
			    			writer.write(id+"|"+P7+"\n");
					    	writer.close();
			    		}
			    		else if (zeby.equals("111")) {
			    			FileWriter writer = new FileWriter("F:\\PROGRAMOWANIE\\JAVA\\SPRING\\PROJEKTY\\cutters\\output.txt", true);
			    			writer.write(id+"|"+M1+"\n");
					    	writer.close();
			    		}
			    		else if (zeby.equals("120")) {
			    			FileWriter writer = new FileWriter("F:\\PROGRAMOWANIE\\JAVA\\SPRING\\PROJEKTY\\cutters\\output.txt", true);
			    			
			    			writer.write(id+"|"+M2+"\n");
			    			writer.write(id+"|"+P5+"\n");
			    			writer.write(id+"|"+P6+"\n");
			    			writer.write(id+"|"+P7+"\n");
					    	writer.close();
			    		}
			    		else if (zeby.equals("122")) {
			    			FileWriter writer = new FileWriter("F:\\PROGRAMOWANIE\\JAVA\\SPRING\\PROJEKTY\\cutters\\output.txt", true);
			    			writer.write(id+"|"+M1+"\n");
			    			
			    			writer.write(id+"|"+P5+"\n");
			    			writer.write(id+"|"+P6+"\n");
			    			writer.write(id+"|"+P7+"\n");
					    	writer.close();
			    		}
			    		else if (zeby.equals("132")) {
			    			FileWriter writer = new FileWriter("F:\\PROGRAMOWANIE\\JAVA\\SPRING\\PROJEKTY\\cutters\\output.txt", true);
			    			
			    			writer.write(id+"|"+M2+"\n");
			    			writer.write(id+"|"+P5+"\n");
			    			writer.write(id+"|"+P6+"\n");
			    			writer.write(id+"|"+P7+"\n");
					    	writer.close();
			    		}
			    		else if (zeby.equals("146")) {
			    			FileWriter writer = new FileWriter("F:\\PROGRAMOWANIE\\JAVA\\SPRING\\PROJEKTY\\cutters\\output.txt", true);
			    			
			    			writer.write(id+"|"+M2+"\n");
			    			writer.write(id+"|"+P5+"\n");
			    			writer.write(id+"|"+P6+"\n");
			    			writer.write(id+"|"+P7+"\n");
					    	writer.close();
			    		}
			    		else if (zeby.equals("149")) {
			    			FileWriter writer = new FileWriter("F:\\PROGRAMOWANIE\\JAVA\\SPRING\\PROJEKTY\\cutters\\output.txt", true);
			    			
			    			writer.write(id+"|"+M2+"\n");
			    			writer.write(id+"|"+P5+"\n");
			    			writer.write(id+"|"+P6+"\n");
			    			writer.write(id+"|"+P7+"\n");
					    	writer.close();
			    		}
			    		else if (zeby.equals("158")) {
			    			FileWriter writer = new FileWriter("F:\\PROGRAMOWANIE\\JAVA\\SPRING\\PROJEKTY\\cutters\\output.txt", true);
			    			
			    			writer.write(id+"|"+M2+"\n");
			    			writer.write(id+"|"+P5+"\n");
			    			writer.write(id+"|"+P6+"\n");
			    			writer.write(id+"|"+P7+"\n");
					    	writer.close();
			    		}
			    		
			    	}//KONIEC DLA PAPIERU 255
			    	
			    	//DLA PAPIERU DO 330
			    	else if ((!typ.equals("PP")) && szerpap>255 && szerpap<331) {
			    		if (zeby.equals("79")) {
			    			FileWriter writer = new FileWriter("F:\\PROGRAMOWANIE\\JAVA\\SPRING\\PROJEKTY\\cutters\\output.txt", true);
			    			
			    			writer.write(id+"|"+M2+"\n");
			    			writer.write(id+"|"+P5+"\n");
			    			writer.write(id+"|"+P6+"\n");
			    			
					    	writer.close();
			    		}
			    		else if (zeby.equals("84")) {
			    			FileWriter writer = new FileWriter("F:\\PROGRAMOWANIE\\JAVA\\SPRING\\PROJEKTY\\cutters\\output.txt", true);
			    			
			    			writer.write(id+"|"+M2+"\n");
			    			writer.write(id+"|"+P5+"\n");
			    			writer.write(id+"|"+P6+"\n");
			    			writer.write(id+"|"+P7+"\n");
					    	writer.close();
			    		}
			    		else if (zeby.equals("89")) {
			    			FileWriter writer = new FileWriter("F:\\PROGRAMOWANIE\\JAVA\\SPRING\\PROJEKTY\\cutters\\output.txt", true);
			    			
			    			writer.write(id+"|"+M2+"\n");
			    			writer.write(id+"|"+P5+"\n");
			    			writer.write(id+"|"+P6+"\n");
			    			writer.write(id+"|"+P7+"\n");
					    	writer.close();
			    		}
			    		else if (zeby.equals("91")) {
			    			FileWriter writer = new FileWriter("F:\\PROGRAMOWANIE\\JAVA\\SPRING\\PROJEKTY\\cutters\\output.txt", true);
			    			
			    			writer.write(id+"|"+M2+"\n");
			    			writer.write(id+"|"+P5+"\n");
			    			writer.write(id+"|"+P6+"\n");
			    			writer.write(id+"|"+P7+"\n");
					    	writer.close();
			    		}
			    		
			    		else if (zeby.equals("96")) {
			    			FileWriter writer = new FileWriter("F:\\PROGRAMOWANIE\\JAVA\\SPRING\\PROJEKTY\\cutters\\output.txt", true);
			    			
			    			writer.write(id+"|"+M2+"\n");
			    			writer.write(id+"|"+P5+"\n");
			    			writer.write(id+"|"+P6+"\n");
			    			writer.write(id+"|"+P7+"\n");
					    	writer.close();
			    		}
			    		else if (zeby.equals("100")) {
			    			FileWriter writer = new FileWriter("F:\\PROGRAMOWANIE\\JAVA\\SPRING\\PROJEKTY\\cutters\\output.txt", true);
			    			
			    			writer.write(id+"|"+M2+"\n");
			    			writer.write(id+"|"+P5+"\n");
			    			writer.write(id+"|"+P6+"\n");
			    			writer.write(id+"|"+P7+"\n");
					    	writer.close();
			    		}
			    		else if (zeby.equals("108")) {
			    			FileWriter writer = new FileWriter("F:\\PROGRAMOWANIE\\JAVA\\SPRING\\PROJEKTY\\cutters\\output.txt", true);
			    			
			    			writer.write(id+"|"+M2+"\n");
			    			writer.write(id+"|"+P5+"\n");
			    			writer.write(id+"|"+P6+"\n");
			    			writer.write(id+"|"+P7+"\n");
					    	writer.close();
			    		}
			    		else if (zeby.equals("110")) {
			    			FileWriter writer = new FileWriter("F:\\PROGRAMOWANIE\\JAVA\\SPRING\\PROJEKTY\\cutters\\output.txt", true);
			    			
			    			writer.write(id+"|"+M2+"\n");
			    			writer.write(id+"|"+P5+"\n");
			    			writer.write(id+"|"+P6+"\n");
			    			writer.write(id+"|"+P7+"\n");
					    	writer.close();
			    		}
			    		
			    		else if (zeby.equals("120")) {
			    			FileWriter writer = new FileWriter("F:\\PROGRAMOWANIE\\JAVA\\SPRING\\PROJEKTY\\cutters\\output.txt", true);
			    			
			    			writer.write(id+"|"+M2+"\n");
			    			writer.write(id+"|"+P5+"\n");
			    			writer.write(id+"|"+P6+"\n");
			    			writer.write(id+"|"+P7+"\n");
					    	writer.close();
			    		}
			    		else if (zeby.equals("122")) {
			    			FileWriter writer = new FileWriter("F:\\PROGRAMOWANIE\\JAVA\\SPRING\\PROJEKTY\\cutters\\output.txt", true);
			    			
			    			
			    			writer.write(id+"|"+P5+"\n");
			    			writer.write(id+"|"+P6+"\n");
			    			writer.write(id+"|"+P7+"\n");
					    	writer.close();
			    		}
			    		else if (zeby.equals("132")) {
			    			FileWriter writer = new FileWriter("F:\\PROGRAMOWANIE\\JAVA\\SPRING\\PROJEKTY\\cutters\\output.txt", true);
			    			
			    			writer.write(id+"|"+M2+"\n");
			    			writer.write(id+"|"+P5+"\n");
			    			writer.write(id+"|"+P6+"\n");
			    			writer.write(id+"|"+P7+"\n");
					    	writer.close();
			    		}
			    		else if (zeby.equals("146")) {
			    			FileWriter writer = new FileWriter("F:\\PROGRAMOWANIE\\JAVA\\SPRING\\PROJEKTY\\cutters\\output.txt", true);
			    			
			    			writer.write(id+"|"+M2+"\n");
			    			writer.write(id+"|"+P5+"\n");
			    			writer.write(id+"|"+P6+"\n");
			    			writer.write(id+"|"+P7+"\n");
					    	writer.close();
			    		}
			    		else if (zeby.equals("149")) {
			    			FileWriter writer = new FileWriter("F:\\PROGRAMOWANIE\\JAVA\\SPRING\\PROJEKTY\\cutters\\output.txt", true);
			    			
			    			writer.write(id+"|"+M2+"\n");
			    			writer.write(id+"|"+P5+"\n");
			    			writer.write(id+"|"+P6+"\n");
			    			writer.write(id+"|"+P7+"\n");
					    	writer.close();
			    		}
			    		else if (zeby.equals("158")) {
			    			FileWriter writer = new FileWriter("F:\\PROGRAMOWANIE\\JAVA\\SPRING\\PROJEKTY\\cutters\\output.txt", true);
			    			
			    			writer.write(id+"|"+M2+"\n");
			    			writer.write(id+"|"+P5+"\n");
			    			writer.write(id+"|"+P6+"\n");
			    			writer.write(id+"|"+P7+"\n");
					    	writer.close();
			    		}
			    	}
			    	
			    	//DLA PAPIERU OD 331
			    	else if ((!typ.equals("PP")) && szerpap>330) {
			    		FileWriter writer = new FileWriter("F:\\PROGRAMOWANIE\\JAVA\\SPRING\\PROJEKTY\\cutters\\output.txt", true);
			    		writer.write(id+"|"+P7+"\n");
			    		writer.close();
			    	}
			    	
			    	
			    }
			    //KONIEC DLA LINIA CONTAINS
			    else {
			    	
			    }
		    	}
		    	scan.close();
		    		
		    	
		    	
		    
		
		m.addAttribute("result", typ);
		m.addAttribute("result2", szerPap);
		m.addAttribute("result3", zeby);
		m.addAttribute("result4", id);
			
			
			
			return "result.jsp";
		}

}
