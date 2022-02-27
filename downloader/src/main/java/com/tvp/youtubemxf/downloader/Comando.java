/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tvp.youtubemxf.downloader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Esteban Anfuso
 */
public class Comando {
	private String Link;
	private String Destino;
	public String getLink() {
		return Link;
	}
	public void setLink(String link) {
		Link = link;
	}
	public String getDestino() {
		return Destino;
	}
	public void setDestino(String destino) {
		Destino = destino;
	}
	public Comando(String link, String destino) {
		super();
		Link = link;
		Destino = destino;
	}
	
	////////////**********************************************************
	
	public void ejecutar() {
		try {
			//String[] cmd = {"ping", aux};
			String[] cmd = {"C:/youtube-dl/youtube-dl", "-o", "C:\\convertidos\\temp\\temp1.mxf" , "-f", "best", Link};
			//String str = String.join("youtube-dl ", " -f ", " best ", " -g ", aux); desordena 
			//System.out.println("El str es: "+str);
		//	
			for(int i=0; i < cmd.length; i++){
				System.out.println(cmd[i]);
			}
//			System.out.println("el tipo de aux es: " + aux.getClass());
//			System.out.println("el tipo de cmd es: " + cmd.getClass());
//			StringBuffer cmd2 = null;
//			for(int i = 0; i < cmd.length; i++) {
//				
//			cmd2= cmd2.append(cmd[i]); 
//			}
//			 
		//	
	
			
		Process process = Runtime.getRuntime().exec(cmd);
		//try {
//			process.waitFor();
		//} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
		//}
		InputStream inputStream = process.getInputStream();
		//System.out.println(inputStream);
		//BufferedInputStream buffer = new BufferedInputStream(inputStream);
		InputStreamReader in = new InputStreamReader(inputStream);
		Stream<String> sos = new BufferedReader(in).lines();
		String soso = sos.collect(Collectors.joining());
		System.out.println(soso);
		
		
		
//		try {
//			wait(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	
		//Calculo time to live
//		int posExp = soso.indexOf("expire");
//		String exp = soso.substring((posExp + 7), (posExp + 17));
//		System.out.println("El tiempo de expiración es: "+ exp);
//
//		long unixTime = System.currentTimeMillis() / 1000L;
//		long rest = (Long.parseLong(exp) - unixTime)/ 3600;
//		System.out.println("Hora Unix actual: " + unixTime);
//		System.out.println("Horas antes de la expiración: " + rest);


		//youtube-dl -f best -g https://www.youtube.com/watch?v=u1zO7MVLMbA

		// mp4a.40.296           mp4        1920x1080
		// Thread.sleep(10000);

		//System.out.println("variable post-manifest: " + ff);
		//Process process2 = Runtime.getRuntime().exec(ff);
	
		//COMANDO BRUTO:
		//  ffmpeg -y -i C:\convertidos\bajado1.MXF -pix_fmt yuv422p -vcodec mpeg2video -g 12 -r 25 -b:v 50000k -minrate 50000k -maxrate 50000k -bufsize 8000k -acodec pcm_s16le -ar 48000  -f mxf C:\convertidos\output.mxf
		
		//CONVERSION PENDIENTE
	
		//ProcessBuilder(ff);

		





		} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		}

		private void ProcessBuilder(String[] ff) {
			ProcessBuilder(ff);
			
		}
	
	
	
	
	
	public void convertir () {
		System.out.println("entré***************************************");
		String[] ff = {"ffmpeg", "-y", "-i", "C:\\convertidos\\temp\\temp1.mxf", "-pix_fmt", "yuv422p", "-vcodec", "mpeg2video",    "-g","12","-r","25","-b:v","50000k","-minrate","50000k","-maxrate","50000k","-bufsize","8000k","-acodec","pcm_s16le","-ar","48000", "-f", "mxf", Destino};
		try {
			Runtime.getRuntime().exec(ff);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //RESTITUIR!
		Runtime.getRuntime().exit(0);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
    
}
