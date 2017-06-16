package org.dimigo.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class MelonGenreChart {

	   public static void main(String[] args) {
	      List<Music> music1 = new ArrayList<Music>();
	      music1.add(new Music("팔레트","아이유"));
	      
	      List<Music> music2 = new ArrayList<Music>();
	      music2.add(new Music("I LUV IT","PSY"));
	      music2.add(new Music("맞지","언니쓰"));
	      
	      Map<String, List<Music>> map = new HashMap<String, List<Music>>();
	      map.put("[발라드]", music1);
	      map.put("[댄스]", music2);
	      
	      System.out.println("-- << 멜론 장르별 차트 >> --");
	      printMap(map);
	      System.out.println();
	      
	      System.out.println("-- << 댄스 2위 곡 변경 >> --");
	      music2.set(1, new Music("SIGNAL","트와이스"));
	      printMap(map);
	      System.out.println();
	      
	      System.out.println("-- << 댄스 1위 곡 삭제 >> --");
	      music2.remove(0);
	      printMap(map);
	      System.out.println();
	      
	      System.out.println("-- << 전체 리스트 삭제 >> --");
	      map.clear();
	      printMap(map);
	      System.out.println();
	      
	   }
	   public static void printMap(Map<String, List<Music>> map){
	      for (Map.Entry<String, List<Music>> entry : map.entrySet()){
	         System.out.println(entry.getKey());
	         int a = 1;
	         for(Music m : entry.getValue() ){
	            System.out.println(a+ ". " + m.toString());
	            a++;
	         }
	      }

	   }
	}