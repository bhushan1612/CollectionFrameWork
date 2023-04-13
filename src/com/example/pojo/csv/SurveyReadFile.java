package com.example.pojo.csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class SurveyReadFile {

	CsvFile csvFile;
	String[] values;
	
	/*Method of SurveyReadFile*/
	public List<CsvFile> surveyCsvFileRead(File file) {
		BufferedReader bufferedReader;
		List<CsvFile> list =new ArrayList<CsvFile>();
		try {
			bufferedReader = new BufferedReader(new FileReader(file));
			String line;
			
			while ((line = bufferedReader.readLine())!=null) {
				values = line.split(",");
				try {
					csvFile = new CsvFile();
					csvFile.setVariable(values[0]);
					csvFile.setBreakdow(values[1]);
					csvFile.setBreakdownCategory(values[2]);
					csvFile.setYear(values[3]);
					csvFile.setRdValue(values[4]);
					csvFile.setStatus(values[5]);
					csvFile.setFootnotes(values [6]);
					csvFile.setUnit_for_TSM_and_CSV(values[7]);
					list.add(csvFile);
					
					
				} catch (Exception e) {
					System.out.println(line);
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
		return list;
	}
	
	public void writeVariable(List<CsvFile> list) {
		File file = new File("variableFile.txt");
		FileWriter writer = null;
		
		try {
			file.createNewFile();
			try {
				writer = new FileWriter(file);
				
				Iterator<CsvFile>  variableIterator = list.iterator();
				
				while (variableIterator.hasNext()) {
					csvFile = variableIterator.next();
					writer.write(csvFile.getVariable()+"\n");
					
				}
			} finally {
				writer.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void writeBreakdow(List<CsvFile> list) {
		File file = new File("breakdowFile.txt");
		FileWriter writer = null;
		try {
			file.createNewFile();
			try {
				writer = new FileWriter(file);
				
				Iterator<CsvFile>  variableIterator = list.iterator();
				
				while (variableIterator.hasNext()) {
					csvFile = variableIterator.next();
					writer.write(csvFile.getBreakdow()+"\n");
					
				}
			} finally {
				writer.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void writeBreakdown_category(List<CsvFile> list) {
		File file = new File("breakdown_categoryFile.txt");
		FileWriter writer = null;
		try {
			file.createNewFile();
			try {
				writer = new FileWriter(file);
				
				Iterator<CsvFile>  variableIterator = list.iterator();
				
				while (variableIterator.hasNext()) {
					csvFile = variableIterator.next();
					writer.write(csvFile.getBreakdownCategory()+"\n");
					
				}
			} finally {
				writer.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void writeYear(List<CsvFile> list) {
		
		File file = new File("yearFile.txt");
		FileWriter writer = null;
		try {
			file.createNewFile();
			try {
				writer = new FileWriter(file);
				
				Iterator<CsvFile>  variableIterator = list.iterator();
				
				while (variableIterator.hasNext()) {
					csvFile = variableIterator.next();
					writer.write(csvFile.getYear()+"\n");
					
				}
			} finally {
				writer.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void writeRD_Value(List<CsvFile> list) {
		File file = new File("rdFile.txt");
		FileWriter writer = null;
		try {
			file.createNewFile();
			
			try {
				writer= new FileWriter(file);
				
				Iterator<CsvFile> variableIterator = list.iterator();
				
				while(variableIterator.hasNext()) {
					csvFile = variableIterator.next();
					writer.write(csvFile.getRdValue()+"\n");
					
				}
			} finally {
				writer.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void writeStatus(List<CsvFile> list) {
		File file = new File("statusFile.txt");
		FileWriter writer = null;
		try {
			file.createNewFile();
			
			try {
				writer= new FileWriter(file);
				
				Iterator<CsvFile> variableIterator = list.iterator();
				
				while(variableIterator.hasNext()) {
					csvFile = variableIterator.next();
					writer.write(csvFile.getStatus()+"\n");
					
				}
			} finally {
				writer.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void writeFootnotes(List<CsvFile> list) {
		File file = new File("footnotesFile.txt");
		FileWriter writer = null;
		try {
			file.createNewFile();
			
			try {
				writer= new FileWriter(file);
				
				Iterator<CsvFile> variableIterator = list.iterator();
				
				while(variableIterator.hasNext()) {
					csvFile = variableIterator.next();
					writer.write(csvFile.getFootnotes()+"\n");
					
				}
			} finally {
				writer.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void WriteUnit_for_TSM_and_CSV(List<CsvFile> list) {
		File file = new File("unit_for_TSM_and_CSVFile.txt");
		FileWriter writer = null;
		try {
			file.createNewFile();
			
			try {
				writer= new FileWriter(file);
				
				Iterator<CsvFile> variableIterator = list.iterator();
				
				while(variableIterator.hasNext()) {
					csvFile = variableIterator.next();
					writer.write(csvFile.getUnit_for_TSM_and_CSV()+"\n");
					
				}
			} finally {
				writer.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		SurveyReadFile readFile = new SurveyReadFile();
		String fileContent = "C:\\Users\\bhush\\Desktop\\JAVA\\JAVA PROGRAMS\\CollectionFrameWork\\survey.csv";
		File file = new File(fileContent);
		
		List<CsvFile> list = readFile.surveyCsvFileRead(file);
		readFile.writeVariable(list);
		readFile.writeBreakdow(list);
		readFile.writeBreakdown_category(list);
		readFile.writeYear(list);
		readFile.writeRD_Value(list);
		readFile.writeStatus(list);
		readFile.writeFootnotes(list);
		readFile.WriteUnit_for_TSM_and_CSV(list);		
	
	}

}
