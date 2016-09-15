package exercise61;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DiaryManager {

	public static void readFile(String filePath) {
		Diary diary = new Diary();
		
		try (DataInputStream in = new DataInputStream(new 
				BufferedInputStream(new FileInputStream(filePath)))) {
			while (in.available() > 0) {
				diary.setDate(in.readUTF());
				diary.setContent(in.readUTF());
				//diarys.add(diary);
				System.out.println(diary.toString());
			}
			
			in.close();
		}
		catch (IOException ex) {
			System.out.println("Exception: " + ex.getMessage());
		}
	}
	
	public static void writeFile(String filePath, Diary diary) {
		try (DataOutputStream out = new DataOutputStream(new 
				BufferedOutputStream(new FileOutputStream(filePath, true)))){
			out.writeUTF(diary.getDate());
			out.writeUTF(diary.getContent());
			System.out.println("Diary was recorded");
			
			out.close();
		}
		catch (IOException ex) {
			System.out.println("Exception: " + ex);
		}
	}
	
	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new
				InputStreamReader(System.in));
		String filePath = "src/exercise61/daily.txt";
		try {
			boolean flag = true;
			while (flag) {
				System.out.println("1. View diary");
				System.out.println("2. Write a new diary");
				System.out.println("3. Exit");
				
				String choose = input.readLine();
				while (!"1".equals(choose) && !"2".equals(choose)
						&& !"3".equals(choose)) {
					System.out.println("Choose again");
					System.out.println("1. View diary");
					System.out.println("2. Write a new diary");
					System.out.println("3. Exit");
					
					choose = input.readLine();
				}
				
				switch (choose) {
				case "1":
					readFile(filePath);
					break;
				case "2":
					System.out.println("What do you want to write?");
					String content = input.readLine();
					
					Date now = new Date();
					SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
					String date = sdf.format(now);
					
					Diary diary = new Diary(date, content);
					writeFile(filePath, diary);
					break;
				case "3":
					flag = false;
					System.out.println("Application ended");
					break;
				default:
					break;
				}
			}
		}
		catch (IOException ex) {
			System.out.println("Exception: " + ex.getMessage());
		}
	}
}
