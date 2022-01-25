package exam;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

class Item{
	int y,x;
	String result;
	public Item(int y, int x, String result) {
		super();
		this.y = y;
		this.x = x;
		this.result = result;
	}
	
}

public class Solution {
	static int t;
	static int[][] map;
	static int[] xpos= {0,0,1,-1};
	static int[] ypos= {1,-1,0,0};

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		t=sc.nextInt();
		for (int tc = 1; tc <=t; tc++) {
			map=new int[4][4];
			for (int i = 0; i<4; i++) {
				for (int j = 0; j < 4; j++) {
					map[i][j]=sc.nextInt();
				}
			}
			Set<String> set=new HashSet<>();
			for (int i = 0; i<4; i++) {
				for (int j = 0; j < 4; j++) {
					Queue<Item> q=new LinkedList<>();
					q.add(new Item(i,j,Integer.toString(map[i][j])));
					while(q.size()!=0) {
						Item cur=q.poll();
						int y=cur.y;
						int x=cur.x;
						String s=cur.result;
						for (int k = 0; k < 4; k++) {
							int yy=y+ypos[k];
							int xx=x+xpos[k];
							if(xx<0 || yy<0 || xx>=4 || yy>=4)continue;
							String news=s+Integer.toString(map[yy][xx]);
							if(news.length()<7){
								q.add(new Item(yy,xx,news));
							}else {
								if(!set.contains(news)) {
									set.add(news);
								}
							}
							
						}
					}
				}
			}
			System.out.printf("#%d %d\n",tc,set.size());
			
		}
		
	}
}