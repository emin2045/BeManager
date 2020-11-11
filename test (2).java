import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class test {
	
	public static int cutRod(int price[], int n) {
		if (n <= 0)
			return 0;
		int max_val = Integer.MIN_VALUE;

		// Recursively cut the rod in different pieces and
		// compare different configurations
		for (int i = 0; i < n; i++)
			max_val = Math.max(max_val, price[i] + cutRod(price, n - i - 1));

		return max_val;
	}
	
	public  static Player findPlayer(Player arr[],Player p,int Y) {
		for (int k = 0; k < Y; k++) {
			if(arr[k].getRating() > p.getRating()) {
				p= arr[k];
			}
		}
		return p;
	}
	
	public  static Player findPlayer_byPerf(Player arr[],Player p,int Y) {
		for (int k = 0; k < Y; k++) {
			if(arr[k].getFiyatPerf() > p.getFiyatPerf()) {
				p= arr[k];
			}
		}
		return p;
	}
	public static void printArray(Player arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getName()+"\t\t"+ arr[i].getRating() + "\t\t"+ arr[i].getPrice());
		}
	}
	public static void printArray_just_a_name(Player arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getName());
		}
	}
	public static void printMatrix(int matrix[][]) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.println(matrix[i][j]);
			}
		}
	}
	
	

	public static void main(String[] args) throws FileNotFoundException {
		// Get scanner instance
		Scanner file = new Scanner(new File("C:\\Users\\asus\\Desktop\\input.txt"));
		Scanner file2 = new Scanner(new File("C:\\Users\\asus\\Desktop\\input.txt"));
		String line;
		String line2;
		String[] name = null;
		String[] name2 = null;
		int Q1 = 0;int Q2 = 0;int Q3 = 0;int Q4 = 0;int Q5 = 0;int Q6 = 0;int Q7 = 0;int Q8 = 0;int Q9 = 0;int Q10 = 0;
		
		while (file2.hasNextLine()) {
			line2 = file2.nextLine();
			// System.out.print(scanner.next() + "|");
			//System.out.println(line);
			// name = line.split(";");
			name2 = line2.split(";");
			int position2 = Integer.parseInt(name2[1]);
			if(position2 == 1) {
				Q1++;
			}
			else if(position2 == 2) {
				Q2++;
			}
			else if(position2 == 3) {
				Q3++;
			}
			else if(position2 == 4) {
				Q4++;
			}
			else if(position2 == 5) {
				Q5++;
			}
			else if(position2 == 6) {
				Q6++;
			}
			else if(position2 == 7) {
				Q7++;
			}
			else if(position2 == 8) {
				Q8++;
			}
			else if(position2 == 9) {
				Q9++;
			}
			else if(position2 == 10) {
				Q10++;
			}
			//System.out.print(name[0] + position +" "+ rating + price);
			
		}
		
		Player[] p1 = new Player[Q1];
		Player[] p2 = new Player[Q2];
		Player[] p3 = new Player[Q3];
		Player[] p4 = new Player[Q4];
		Player[] p5 = new Player[Q5];
		Player[] p6 = new Player[Q6];
		Player[] p7 = new Player[Q7];
		Player[] p8 = new Player[Q8];
		Player[] p9 = new Player[Q9];
		Player[] p10 = new Player[Q10];
		int index1 = 0;
		int index2 = 0;
		int index3 = 0;
		int index4 = 0;
		int index5 = 0;
		int index6 = 0;
		int index7 = 0;
		int index8 = 0;
		int index9 = 0;
		int index10 = 0;
		
		
		// Set the delimiter used in file
		// scanner.useDelimiter(",");

		// Get all tokens and store them in some data structure
		// I am just printing them

		while (file.hasNextLine()) {
			line = file.nextLine();
			// System.out.print(scanner.next() + "|");
			//System.out.println(line);
			// name = line.split(";");
			name = line.split(";");
			int position = Integer.parseInt(name[1]);
			int rating = Integer.parseInt(name[2]);
			int price = Integer.parseInt(name[3]);
			double fiyatPerformans = ((double) rating / price) * 1000;
			
			if(position == 1 ) {
				p1[index1] = new Player(name[0], position, rating, price,fiyatPerformans);
				index1++;
			}
			else if(position == 2) {
				p2[index2] = new Player(name[0], position, rating, price,fiyatPerformans);
				index2++;
			}
			else if(position == 3) {
				p3[index3] = new Player(name[0], position, rating, price,fiyatPerformans);
				index3++;
			}
			else if(position == 4) {
				p4[index4] = new Player(name[0], position, rating, price,fiyatPerformans);
				index4++;
			}
			else if(position == 5) {
				p5[index5] = new Player(name[0], position, rating, price,fiyatPerformans);
				index5++;
			}
			else if(position == 6) {
				p6[index6] = new Player(name[0], position, rating, price,fiyatPerformans);
				index6++;
			}
			else if(position == 7) {
				p7[index7] = new Player(name[0], position, rating, price,fiyatPerformans);
				index7++;
			}
			else if(position == 8) {
				p8[index8] = new Player(name[0], position, rating, price,fiyatPerformans);
				index8++;
			}
			else if(position == 9) {
				p9[index9] = new Player(name[0], position, rating, price,fiyatPerformans);
				index9++;
			}
			else if(position == 10) {
				p10[index10] = new Player(name[0], position, rating, price,fiyatPerformans);
				index10++;
			}
			//System.out.print(name[0] + position +" "+ rating + price);
			
		}
		
		//printArray(p1);
		
		
		
		/*int matrixx[][] = {
				{7,8,9},
				{34,54,0}
		};
		System.out.println(matrixx[0].length);	// kaç sütun var
		System.out.println(matrixx.length);	// kaç satýr var

		/*for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = p[j].getPrice();
			}
		}*/
		
		//printMatrix(matrix);
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter N: ");		// n tane pozisyon
		int N = scn.nextInt();
			
		System.out.print("\nEnter K: ");		// k tane oyuncu
		int K = scn.nextInt();
		
		System.out.print("\nEnter Money: ");		// k tane oyuncu
		int money = scn.nextInt();
		
		Player matrix[][] = new Player [N][K];
		
		Player val [] =new Player [N*K];
		Player wt [] = new Player [N*K];
		//int money = 60000;			
		int index = 0;
		int NN = val.length;
		
				
		for (int i = 0; i < matrix[0].length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if(i==0) {
					matrix[j][i]=p1[j];
					val[index]=p1[j];
					wt[index]=p1[j];
					index++;
				}
				else if(i==1) {
					matrix[j][i]=p2[j];
					val[index]=p2[j];
					wt[index]=p2[j];
					index++;
				}
				else if(i==2) {
					matrix[j][i]=p3[j];
					val[index]=p3[j];
					wt[index]=p3[j];
					index++;
				}
				else if(i==3) {
					matrix[j][i]=p4[j];
					val[index]=p4[j];
					wt[index]=p4[j];
					index++;
				}
				else if(i==4) {
					matrix[j][i]=p5[j];
					val[index]=p5[j];
					wt[index]=p5[j];
					index++;
				}
				else if(i==5) {
					matrix[j][i]=p6[j];
					val[index]=p6[j];
					wt[index]=p6[j];
					index++;
				}
				else if(i==6) {
					matrix[j][i]=p7[j];
					val[index]=p7[j];
					wt[index]=p7[j];
					index++;
				}
				else if(i==7) {
					matrix[j][i]=p8[j];
					val[index]=p8[j];
					wt[index]=p8[j];
					index++;
				}
				else if(i==8) {
					matrix[j][i]=p9[j];
					val[index]=p9[j];
					wt[index]=p9[j];
					index++;
				}
				else if(i==9) {
					matrix[j][i]=p10[j];
					val[index]=p10[j];
					wt[index]=p10[j];
					index++;
				}
			}
		}
		//printMatrix(matrix);
		//printArray(val);
		//printArray(wt);
		//long startTime = System.currentTimeMillis();
		System.out.println("\n\n\n\n\n\nTotal Rating:\t "+knapSack(money, wt, val, NN));	// 
		//long estimatedTime = System.currentTimeMillis() - startTime;
		//System.out.println("Estimated Time "+ estimatedTime);
		//System.out.println(findOptimum(matrix,K,N));
		
		
		/*System.out.print("\nEnter Budget: ");
		int money = scn.nextInt();*/
		
		Player[] bestPlayers = new Player[N];
		Player [] bestPerformer = new Player[N];
		Player condition = new Player("Emin",1,1,0,1) ;
		while(true) {
			
			for (int i = 1; i <= N; i++) {
				if (i == 1) {
					//System.out.println(findPlayer(p1,condition,K));
					bestPlayers[i-1] = findPlayer(p1,condition,K);
					bestPerformer[i-1] = findPlayer_byPerf(p1,condition,K);
				}
				else if ( i == 2) {
					//System.out.println(findPlayer(p2,condition,K));
					bestPlayers[i-1] = findPlayer(p2,condition,K);
					bestPerformer[i-1] = findPlayer_byPerf(p2,condition,K);
				}
				else if ( i == 3) {
					//System.out.println(findPlayer(p3,condition,K));
					bestPlayers[i-1] = findPlayer(p3,condition,K);
					bestPerformer[i-1] = findPlayer_byPerf(p3,condition,K);
				}
				else if ( i == 4) {
					//System.out.println(findPlayer(p4,condition,K));
					bestPlayers[i-1] = findPlayer(p4,condition,K);
					bestPerformer[i-1] = findPlayer_byPerf(p4,condition,K);
				}
				else if ( i == 5) {
					//System.out.println(findPlayer(p5,condition,K));
					bestPlayers[i-1] = findPlayer(p5,condition,K);
					bestPerformer[i-1] = findPlayer_byPerf(p5,condition,K);
				}
				else if ( i == 6) {
					//System.out.println(findPlayer(p6,condition,K));
					bestPlayers[i-1] = findPlayer(p6,condition,K);
					bestPerformer[i-1] = findPlayer_byPerf(p6,condition,K);
				}
				else if ( i == 7) {
					//System.out.println(findPlayer(p7,condition,K));
					bestPlayers[i-1] = findPlayer(p7,condition,K);
					bestPerformer[i-1] = findPlayer_byPerf(p7,condition,K);
				}
				else if ( i == 8) {
					//System.out.println(findPlayer(p8,condition,K));
					bestPlayers[i-1] = findPlayer(p8,condition,K);
					bestPerformer[i-1] = findPlayer_byPerf(p8,condition,K);
				}
				else if ( i == 9) {
					//System.out.println(findPlayer(p9,condition,K));
					bestPlayers[i-1] = findPlayer(p9,condition,K);
					bestPerformer[i-1] = findPlayer_byPerf(p9,condition,K);
				}
				else if ( i == 10) {
					//System.out.println(findPlayer(p10,condition,K));
					bestPlayers[i-1] = findPlayer(p10,condition,K); 
					bestPerformer[i-1] = findPlayer_byPerf(p10,condition,K);
				}
			}
												
			break;
			
		}
		//printArray(p1);
		System.out.println("-------------------");
		
		HeapSort ob =new HeapSort();			// sýralama algoritmasý ---> en son eleman en iyi orana sahip olan oyuncuyu veriyor
		//ob.sort(p1);	ob.sort(p2); ob.sort(p2); ob.sort(p3);ob.sort(p4);ob.sort(p5);ob.sort(p6);ob.sort(p7);ob.sort(p8);	ob.sort(p9);ob.sort(p10);		
		//printArray(p1);
		
		System.out.println("--------------------");
		//printArray_just_a_name(bestPlayers);
		int rating = 0;
		//int money  = 100000; // sonra kapatýlacak
		int totalCost= 0;
		
		System.out.println("-------------------------------------------");
		int money2 = money;
		
	//	long startTime = System.currentTimeMillis();
		resultsFinder(rating,money2,totalCost,bestPlayers,bestPerformer,p1);
	//	long estimatedTime = System.currentTimeMillis() - startTime;
	//	System.out.println("Estimated Time "+ estimatedTime);
		// Do not forget to close the scanner
		// file.close();11
	}
	
	public static void resultsFinder(int rating,int money,int totalCost,Player bestPlayers[],Player bestPerformer[],Player[] p) {
		if((findbyRating(rating,money,totalCost,bestPlayers)==0)){
			while(true) {
				for (int i = 0; i < bestPlayers.length; i++) {
					if(p[i].price<=money) {
						System.out.println("\n\n----------------------------------\n"+"GREEDY RESULTS\n");
						System.out.println(p[i]);
						rating = p[i].price; money=money-p[i].price; totalCost = p[i].price;
						System.out.println("\nTotal Rating: "+rating+"\t\tRemaining Money: "+ money+ "\t\tTotal Cost: "+ totalCost);
						break;
					}
					
				}
				break;
			}
		}
		
		else if(findbyRating(rating,money,totalCost,bestPlayers)>findbyPerformance(rating,money,totalCost,bestPerformer)) {
			System.out.println("\n\n----------------------------------\n"+"GREEDY RESULTS\n");
			findbyRating(rating,money,totalCost,bestPlayers);
		}
		else {
			System.out.println("----------------------------------\n"+"GREEDY RESULTS\n");
			findbyPerformance(rating,money,totalCost,bestPerformer);
		}
	}
	
	public static int findbyRating(int rating, int money, int totalCost,Player bestPlayers[]){
		for (int i = 0; i < bestPlayers.length; i++) {
			if (money > bestPlayers[i].getPrice()) {
				rating = rating + bestPlayers[i].getRating();
				money = money - bestPlayers[i].getPrice();
				totalCost = totalCost + bestPlayers[i].getPrice();
				System.out.println(bestPlayers[i]);
			}
			else {
				break;
			}
		}
		System.out.println("\nTotal Rating: "+rating+"\t\tRemaining Money: "+ money+ "\t\tTotal Cost: "+ totalCost);
		System.out.println("------------------------------------------");
		return rating;
	}
	
	public static int findbyPerformance(int rating, int money, int totalCost,Player bestPerformer[]){
		for (int i = 0; i < bestPerformer.length; i++) {
			if (money > bestPerformer[i].getPrice()) {
				rating = rating + bestPerformer[i].getRating();
				money = money - bestPerformer[i].getPrice();
				totalCost = totalCost + bestPerformer[i].getPrice();
				System.out.println(bestPerformer[i]);
			}
			else {
				break;
			}
		}
		System.out.println("\nTotal Rating: "+rating+"\t\tRemaining Money: "+ money+ "\t\tTotal Cost: "+ totalCost);
		System.out.println("------------------------------------------");
		return rating;
	}
	/*public static int findOptimum (Player arr[][],int k,int n) {
		if (( k == 0) || (n == 0)){
			//System.out.println("girdim");
			return Integer.MAX_VALUE;
		}
		if(k==1 & n==1) {
			//System.out.println("girdim");
			return arr[0][0].getPrice();
		}
		return Integer.min(findOptimum(arr,k-1,n), findOptimum(arr,k,n-1))+arr[k-1][n-1].getPrice();
	}*/
	public static void printMatrix(Player arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.println(arr[j][i]);
			}
		}
	}
	
	static int max(int a, int b) {
		return (a > b) ? a : b;
	}
	// https://www.techiedelight.com/0-1-knapsack-problem/
	// https://walkccc.github.io/CLRS/Chap15/Problems/15-12/
	static int knapSack(int W, Player wt[], Player val[], int n)
    { 
     int i, w; 
     int K[][] = new int[n+1][W+1]; 
     int flag = 700;
     int index = 0;
     printArray(val);
     
     System.out.println("------------------------");
     //System.out.println(n+1+" "+W);
     // Build table K[][] in bottom up manner
     int A = 0;
     for (i = 0; i <= n; i++) 
     { 
         for (w = 0; w <= W; w++) 
         { 
				if (i == 0 || w == 0) {
					K[i][w] = 0;
				} 
				else if (wt[i - 1].getPrice() <= w) {
                    
					K[i][w] = max(val[i - 1].getRating() + K[i - 1][w - wt[i - 1].getPrice()], K[i - 1][w]);
					
					if(K[i][w]!=A) {						
						System.out.println(i +"---> "+K[i][w]);						
					}
					
					A=K[i][w];
				}

				else {
					K[i][w] = K[i - 1][w];
				}
         } 
      } 
     
     
     
      return K[n][W]; 
    } 		
	
}
