package com.example.mapinterface;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SurveyListToMap {

	SurveyFile survey;
	String[] values;

	public List<SurveyFile> surveyFileRead(File file) {
		BufferedReader bufferedReader;
		List<SurveyFile> surveyList = new ArrayList<SurveyFile>();
		try {
			bufferedReader = new BufferedReader(new FileReader(file));
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				values = line.split(",");
				try {
					surveyList.add(new SurveyFile(values[0], values[1]));

				} catch (Exception e) {
					System.out.println(line);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return surveyList;

	}

	public List<SurveyFile> convertSurveyListToMap(List<SurveyFile> surveyList, File file) {
		BufferedWriter writer = null;
		try {
			file.createNewFile();
			writer = new BufferedWriter(new FileWriter(file));
			try {
				Map<String, String> recordSurveyMap = new HashMap<String, String>();
				for (SurveyFile sur : surveyList) {
					recordSurveyMap.put(sur.getVariable(), sur.getBreakdow());
				}

				for (Map.Entry<String, String> me : recordSurveyMap.entrySet()) {
					writer.write(me.getKey()+"<========>");
					writer.write(me.getValue()+"\n");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return surveyList;
	}

	public static void main(String[] args) {
		SurveyListToMap surveyListToMap = new SurveyListToMap();
		String fileContent = "C:\\Users\\bhush\\Desktop\\JAVA\\JAVA PROGRAMS\\CollectionFrameWork\\survey.csv";
		File file = new File(fileContent);

		File file1 = new File("surveyMap.txt");
		List<SurveyFile> surveyList = surveyListToMap.surveyFileRead(file);
		surveyListToMap.convertSurveyListToMap(surveyList, file1);

	}

}
