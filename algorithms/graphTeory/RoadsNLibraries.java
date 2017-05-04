package hackerhank.algorithms.graphTeory;

import java.util.Scanner;

public class RoadsNLibraries {

	private class Query {
		public int numOfCities = 0, numOfRoads = 0, libCost = 0, roadCost = 0; 
		int[][] cityConn;
	}
	
	private class GroupCity {
		int cityNum = 0, groupNum = 0; 
		boolean inGroup = false;
	}
	
	private void checkCityConn(Query query, GroupCity[] groups, int cityNum, int group) {
		for (int i = 0; i < query.numOfRoads; i++) {
			if (query.cityConn[i][0] == cityNum &&
					(groups[query.cityConn[i][1]-1] == null ||
					!groups[query.cityConn[i][1]-1].inGroup) ) {
				groups[query.cityConn[i][1]-1] = new GroupCity();
				groups[query.cityConn[i][1]-1].inGroup = true;
				groups[query.cityConn[i][1]-1].cityNum = query.cityConn[i][1];
				groups[query.cityConn[i][1]-1].groupNum = group;
				checkCityConn(query, groups, query.cityConn[i][1], group);
			}
			
			if (query.cityConn[i][1] == cityNum &&
					(groups[query.cityConn[i][0]-1] == null 
					||!groups[query.cityConn[i][0]-1].inGroup) ) {
				groups[query.cityConn[i][0]-1] = new GroupCity();
				groups[query.cityConn[i][0]-1].inGroup = true;
				groups[query.cityConn[i][0]-1].cityNum = query.cityConn[i][0];
				groups[query.cityConn[i][0]-1].groupNum = group;
				checkCityConn(query, groups, query.cityConn[i][0], group);
			}						
		}
		
	}
	
	private void costDecision(Query query) {
		int totalCost = 0;
		int group = 1;
		if (query.libCost > query.roadCost) {
			GroupCity[] groups = new GroupCity[query.numOfCities];
			for (int j = 0; j < groups.length; j++) {
				if (groups[j] == null)
					groups[j] = new GroupCity();
				if (!groups[j].inGroup) {
					groups[j].cityNum = j+1;
					groups[j].groupNum = group;
					groups[j].inGroup = true;
					for (int i = 0; i < query.numOfRoads; i++) {
						if (query.cityConn[i][0] == groups[j].cityNum &&
								(groups[query.cityConn[i][1]-1] == null || 
								!groups[query.cityConn[i][1]-1].inGroup)) {
							groups[query.cityConn[i][1]-1] = new GroupCity();
							groups[query.cityConn[i][1]-1].inGroup = true;
							groups[query.cityConn[i][1]-1].cityNum = query.cityConn[i][1];
							groups[query.cityConn[i][1]-1].groupNum = group;
							checkCityConn(query, groups, query.cityConn[i][1], group);
						}
						
						if (query.cityConn[i][1] == groups[j].cityNum &&
								(groups[query.cityConn[i][0]-1] == null ||
								!groups[query.cityConn[i][0]-1].inGroup)) {
							groups[query.cityConn[i][0]-1] = new GroupCity();
							groups[query.cityConn[i][0]-1].inGroup = true;
							groups[query.cityConn[i][0]-1].cityNum = query.cityConn[i][0];
							groups[query.cityConn[i][0]-1].groupNum = group;
							checkCityConn(query, groups, query.cityConn[i][0], group);
						}						
					}
					group++;
				}
			}
			int citiGroupCount = 0;
			int actualGroup = 0;
			int lastGroup = 0;
			for (int i = 0; i < groups.length; i++) {
				actualGroup = groups[i].groupNum;
				if (actualGroup != lastGroup) {
					if (lastGroup != 0) {
						totalCost += query.libCost + (query.roadCost*citiGroupCount-1);
					}
					citiGroupCount = 1;
					lastGroup = actualGroup;
				} else {
					citiGroupCount++;
				}
			}
			totalCost += query.libCost + (query.roadCost*citiGroupCount-1);
		} else {
			totalCost = query.numOfCities * query.libCost;
		}
		System.out.println(totalCost);
	}
	
	public static void main(String[] args) {
		RoadsNLibraries rnl = new RoadsNLibraries();
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		Query[] queries = new Query[q];
		for(int a0 = 0; a0 < q; a0++){
			queries[a0] = rnl.new Query();
			int n = in.nextInt();
			int m = in.nextInt();
			int x = in.nextInt();
			int y = in.nextInt();
			
			queries[a0].numOfCities = n;
			queries[a0].numOfRoads = m;
			queries[a0].libCost = x;
			queries[a0].roadCost = y;
			
			queries[a0].cityConn = new int[m][2];
			
			for(int a1 = 0; a1 < m; a1++){
				int city_1 = in.nextInt();
				int city_2 = in.nextInt();
				
				queries[a0].cityConn[a1][0] = city_1;
				queries[a0].cityConn[a1][1] = city_2;
			}
			
			rnl.costDecision(queries[a0]);
		}
	}

}