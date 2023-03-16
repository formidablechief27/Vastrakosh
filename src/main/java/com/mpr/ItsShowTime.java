package com.mpr;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ItsShowTime {
	public static void main(String args[]) {
		FileWriter f = null;
		BufferedWriter b = null;
		PrintWriter p = null;
		try {
			f = new FileWriter("C:/Users/Dhrumil/OneDrive/Desktop/Rubix23-35-NotDevelopers/Rubix23-35-NotDevelopers/Templates/discussion.html",false);
			b = new BufferedWriter(f);
			p = new PrintWriter(b);
			p.println(makehtml());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				p.close();
				b.close();
				f.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Runtime rTime = Runtime.getRuntime();
		String url = "C:/Users/Dhrumil/OneDrive/Desktop/Rubix23-35-NotDevelopers/Rubix23-35-NotDevelopers/Templates/discussion.html";
		String browser = "C:/Program Files/Google/Chrome/Application/chrome.exe ";
		Process pc;
		try {
			pc = rTime.exec(browser + url);
			pc.waitFor();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static String makehtml() {
		String html="";
		html = "<html><head><meta charset=\"UTF-8\"><meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n"
				+ "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
				+ "  <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css\">"
				+ "<style> body {\r\n"
				+ "    background-color: #eff6e0;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".container-fluid {\r\n"
				+ "    background-color: #1f2937;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".text {\r\n"
						+ "    text-align: center;\r\n"
						+ "}\r\n"
				+ "#image {\r\n"
				+ "    position: absolute;\r\n"
				+ "    left: 120vh;\r\n"
				+ "    top: 20%;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "#list a {\r\n"
				+ "    color: rgb(237, 226, 226);\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "#list a:hover {\r\n"
				+ "    background-color: rgb(213, 207, 207);\r\n"
				+ "    color: rgb(16, 9, 9);\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "#card {\r\n"
				+ "    background-color: #1f2937;\r\n"
				+ "    color: white;\r\n"
				+ "    left: 10;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "/* #Checkbox1 {\r\n"
				+ "    left: 50;\r\n"
				+ "} */\r\n"
				+ "\r\n"
				+ ".progress-bar {\r\n"
				+ "    width: 0%;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "#consultCard {\r\n"
				+ "    top: 2000px;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "@media(max-width:762px) {\r\n"
				+ "    #card {\r\n"
				+ "        display: inline-block;\r\n"
				+ "    }\r\n"
				+ "}"
				+ ".content form .user-details {\r\n"
				+ "        display: flex;\r\n"
				+ "        flex-wrap: wrap;\r\n"
				+ "        justify-content: space-between;\r\n"
				+ "        margin: 20px 0 12px 0;\r\n"
				+ "        width: 210%;\r\n"
				+ "        font-family: Verdana;\r\n"
				+ "      }\r\n"
				+ "  \r\n"
				+ "      form .user-details .input-box {\r\n"
				+ "        width: 3000px;\r\n"
				+ "  height: 150px;\r\n"
				+ "  align:center;\r\n"
				+ "      }"
				+ "form .input-box span.details {\r\n"
				+ "        display: block;\r\n"
				+ "        font-weight: 500;\r\n"
				+ "        margin-bottom: 5px;\r\n"
				+ "        font-family: Verdana\r\n"
				+ "        align:center;\r\n"
				+ "      }\r\n"
				+ "  \r\n"
				+ "      .user-details .input-box input {\r\n"
				+ "        height: 125px;\r\n"
				+ "        align:center;\r\n"
				+ "        width: 600px;\r\n"
				+ "        outline: none;\r\n"
				+ "        font-size: 16px;\r\n"
				+ "        border-radius: 5px;\r\n"
				+ "        padding-left: 15px;\r\n"
				+ "        border: 1px solid #ccc;\r\n"
				+ "        border-bottom-width: 2px;\r\n"
				+ "        transition: all 0.3s ease;\r\n"
				+ "      }\r\n"
				+ "  \r\n"
				+ ".container {\r\n"
				+ "        width: 10%;\r\n"
				+ "        position: relative;\r\n"
				+ "      }\r\n"
				+ "  \r\n"+ 
				"      .user .input-box input {\r\n"
				+ "        height: 40px;\r\n"
				+ "        align:center;\r\n"
				+ "        width: 300px;\r\n"
				+ "        position: relative;\r\n"
				+"outline: none;\r\n"
				+ "        font-size: 16px;\r\n"
				+ "        border-radius: 5px;\r\n"
				+ "        padding-left: 15px;\r\n"
				+ "        border: 1px solid #ccc;\r\n"
				+ "        border-bottom-width: 2px;\r\n"
				+ "        transition: all 0.3s ease;\r\n"
				+ "      }\r\n"
				+ "  \r\n"
				+ " form .buttonn {\r\n"
				+ "        height: 45px;\r\n"
				+ "      } "
				+ ".buttonn input {\r\n"
				+ "        height: 50px;\r\n"
				+ "        width: 200px;\r\n"
				+"background-color: white;\r\n"
				+"cursor:pointer;\r\n"
				+ "        border-radius: 5px;\r\n"
				+ "        padding-left: 15px;\r\n"
				+ "        border: 1px solid #ccc;\r\n"
				+ "        border-bottom-width: 2px;\r\n"
				+ "color: black;\r\n"
				+ "      }"
				+ ".tab {\r\n"
				+ "    display: inline-block;\r\n"
				+ "    margin-left: 40px;\r\n"
				+ "}.showafter{\r\n"
				+ "  display:block;\r\n"
				+ " margin-left:60px;\r\n"
				+"background-color: white;\r\n"
				+"cursor:pointer;\r\n"
				+ "        border-radius: 5px;\r\n"
				+ "        padding-left: 15px;\r\n"
				+ "        border: 1px solid #ccc;\r\n"
				+ "        border-bottom-width: 2px;\r\n"
				+ "color: black;\r\n"
				+ "}\r\n"
				+ ".showafter12{\r\n"
				+ "  display:block;\r\n"
				+ " margin-left:60px;\r\n"
				+ " width: 400px;\r\n"
				+ " height: 60px;\r\n"
				+"background-color: white;\r\n"
				+"cursor:pointer;\r\n"
				+ "        border-radius: 5px;\r\n"
				+ "        padding-left: 15px;\r\n"
				+ "        border: 1px solid #ccc;\r\n"
				+ "        border-bottom-width: 2px;\r\n"
				+ "color: black;\r\n"
				+ "}"
				+ ".show{\r\n"
				+ "  display:block;\r\n"
				+ " margin-left:20px;\r\n"
				+"background-color: white;\r\n"
				+"cursor:pointer;\r\n"
				+ "        border-radius: 5px;\r\n"
				+ "        padding-left: 15px;\r\n"
				+ "        border: 1px solid #ccc;\r\n"
				+ "        border-bottom-width: 2px;\r\n"
				+ "color: black;\r\n"
				+ "}"
				+ ".show12{\r\n"
				+ "  display:block;\r\n"
				+ " margin-left:20px;\r\n"
				+ " width: 400px;\r\n"
				+ " height: 60px;\r\n"
				+"background-color: white;\r\n"
				+"cursor:pointer;\r\n"
				+ "        border-radius: 5px;\r\n"
				+ "        padding-left: 15px;\r\n"
				+ "        border: 1px solid #ccc;\r\n"
				+ "        border-bottom-width: 2px;\r\n"
				+ "color: black;\r\n"
				+ "}.logo-image{\r\n"
				+ "    width: 120px;\r\n"
				+ "    height: 80px;\r\n"
				+ "    border-radius: 50%;\r\n"
				+ "    overflow: hidden;\r\n"
				+ "    margin-top: -6px;\r\n"
				+ "}"
				+ "</style> "
				+ "<body><nav class=\"navbar navbar-expand-lg bg-body-tertiary sticky-top pt-1 pb-1\" data-bs-theme=\"dark\">\r\n"
				+ "      <div class=\"container-fluid\">\r\n"
				+ "        <a class=\"fs-3 navbar-brand\" href=\"#\"></a>\r\n"
				+ "        <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\"\r\n"
				+ "          aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n"
				+ "          <span class=\"navbar-toggler-icon\"></span>\r\n"
				+ "        </button>\r\n"
				+ "        <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n"
				+ "          <ul class=\"navbar-nav\">\r\n"
				+ "<a class=\"navbar-brand\" href=\"/\">\r\n"
				+ "      <div class=\"logo-image\">\r\n"
				+ "<a href=\"mainNew.html\"><img src=\"logo.png\" class = \"logo-image\"></a>"  
				+ "      </div>\r\n"
				+ "</a>"  
				+ "          </ul>\r\n"
				+ "        </div>\r\n"
				+ "      </div>\r\n"
				+ "  </div>\r\n"
				+ "  </nav> ";
		String add="";
		String addown="";
		ArrayList<String> a1 = new ArrayList<String>();
		ArrayList<String> a2 = new ArrayList<String>();
		ArrayList<String> a3 = new ArrayList<String>();
		String st="";
		File f = new File("data.txt");
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));
			
			int i = 0;
			String s = br.readLine();
			while((st = br.readLine())!=null) {
				a1.add(st);
				String st1 = br.readLine();
				a2.add(st1);
				String p = br.readLine();
				a3.add(p);
				String b = br.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int maxlength = a3.size();
		int n = maxlength;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				long e1 = Long.parseLong(a3.get(j));
				long e2 = Long.parseLong(a3.get(j+1));
				if (e1 < e2) {
					String x = a3.get(j);
					a3.set(j, a3.get(j+1));
					a3.set(j+1,x);
					
					String y = a2.get(j);
					a2.set(j, a2.get(j+1));
					a2.set(j+1,y);
					
					String z = a1.get(j);
					a1.set(j, a1.get(j+1));
					a1.set(j+1,z);
				}
			}
		}
		long maxindex = 0;
		if (a3.size()>0)maxindex=Long.parseLong(a3.get(0)) + 1;
		for(int i=0;i<n;i++) {
			long k = Long.parseLong(a3.get(i));
			if (i==0 || !(a3.get(i).equals(a3.get(i-1)))) {
				for(int j=0;j<a2.get(i).length();j+=140) {
					String print="";
					if (j+140 <= a2.get(i).length()) {
						print = a2.get(i).substring(j,j+140);
					}
					else {
						print = a2.get(i).substring(j,a2.get(i).length());
					}
					add += "<p>" + print + "</p>";
				}
				add += "</p>" +" &emsp; " + "- " + a1.get(i) + "</p>";
				
				String y = "onclick= \"" + "onButtonClick" + (i+1) + "()" + "\"/>";
				String x = "		<input class=\"show12\" type=\"text\"" + "placeholder=\"Reply\"" + "id= \"" + "textInput" + (i+1) + "\"/>";
				add += x;
				String z = "		<input class=\"show\" type=\"text\"" + "placeholder=\"Your Name\"" + "id= \"" + "textInputd" + (i+1) + "\"/>";
				add += z;
				String p = "<button id = \"" + "text" + k + "InputButton" + (i+1) + "\" " +  "class = \"show\" onclick = \"onButtonClick" + (i+1) + "(this.id)\">Post Reply</button>";
				add += p;
				add += "<br>";
			}
			else if (a3.get(i).equals(a3.get(i-1))) {
				for(int j=0;j<a2.get(i).length();j+=140) {
					String print="";
					if (j+140 <= a2.get(i).length()) {
						print = a2.get(i).substring(j,j+140);
					}
					else {
						print = a2.get(i).substring(j,a2.get(i).length());
					}
					add += "<p>"+" &emsp;&emsp;&emsp;&emsp; " + print + "</p>";
				}
				add += "</p>" +" &emsp;&emsp;&emsp;&emsp;&emsp; " + "- " + a1.get(i) + "</p>";
				String x = "		<input class=\"showafter12\" type=\"text\"" + "placeholder=\"Reply\"" + "id= \"" + "textInput" + (i+1) + "\"/>";
				add += x;
				String z = "		<input class=\"showafter\" type=\"text\"" + "placeholder=\"Your Name\"" + "id= \"" + "textInputd" + (i+1) + "\"/>";
				add += z;
				String p = "<button id = \"" + "text" + k + "InputButton" + (i+1) + "\" " +  "class = \"showafter\" onclick = \"onButtonClick" + (i+1) + "(this.id)\">Post Reply</button>";
				add += p;
				add += "<br>";
			}
		}
		
		add += "<br>";
		addown = "  <div class=\"container text-center\" style=\"display:inline-block;\"><div class=\"content\">\r\n"
				+ "      <form action=\"#\">\r\n"
				+ "        <div class=\"user-details\">\r\n"
				+ "          <div class=\"input-box\">\r\n"
				+ "            <span class=\"details\"></span>\r\n"
				+ "            <input type=\"text\" placeholder=\"Add your own message\" required name=\"fullname\" id=\"msg\">\r\n"
				+ "          </div>\r\n"
				+ "        </div>\r\n" +
				"<div class=\"user\">\r\n"
						+ "          <div class=\"input-box\">\r\n"
						+ "            <span class=\"details\"></span>\r\n"
						+ "            <input type=\"text\" placeholder=\"Your name\" required name=\"name\" id=\"id\">\r\n"
						+ "          </div>\r\n"
						+ "        </div>\r\n"
				+ "</form>\r\n"
				+ "</div>  <div class=\"part\">\r\n"
				+ "                      <div class=\"buttonn\">\r\n"
				+ "                        <input type=\"button\" class=\"button\" value=\"Post a new comment\" onclick = \"myFunction()\">\r\n"
				+ "                      </div>\r\n"
				+ "                    </div>"
				+ "</div>" + "</body>";
		
		String end = "</head></html>";
		String link = "var z = \"http://localhost:51234/add\" + \"/\" + y + \"/\" + x + \"/\" + " + maxindex + ";\r\n";
		String l = "  function myFunction() {\r\n"
				+ "          \r\n"
				+ "          var x = document.getElementById(\"msg\").value;\r\n"
				+ "          var y = document.getElementById(\"id\").value;\r\n"
				+ link
				+ "          window.close();\r\n"
				+ "          window.location = z;\r\n"
				+ "        }\r\n\r\n";
		String p = "";
		for(int i=0;i<n;i++) {
			String functionname = "onButtonClick" + (i+1) + "(id)";
			String id1 = "textInput" + (i+1);
			String id2 = "textInputd" + (i+1);
			p+= "function " + functionname + "{\r\n"  
					+ "	  var p = id.substring(4,5);\r\n" + "var x = document.getElementById('" + id1 + "').value;\r\n" + "var y = document.getElementById('" + id2 + "').value;\r\n" + "var z = \"http://localhost:51234/add" + "/\" + x + \"/\" + y + \"/\" + p;\r\n"
							+ "	  window.close();\r\n"
							+ "	  window.location = z;\r\n"
							+  "}\r\n\r\n";
		}
		
		String script="<script>\r\n" + l + p
				+ "</script>";
		html+= add + addown + script + end;
		return html;
	}
}
