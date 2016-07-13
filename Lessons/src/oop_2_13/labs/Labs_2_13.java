package oop_2_13.labs;

import java.util.Arrays;
import java.util.Scanner;

import oop_2_13.labs._2_13_1_and_2.Season;
import oop_2_13.labs._2_13_4.ChessColor;
import oop_2_13.labs._2_13_4.ChessPieceKind;
import oop_2_13.labs._2_13_4.Chesspiece;

public interface Labs_2_13 {

	static void demo() {
		//lab_2_13_1();
		//lab_2_13_2();
		//lab_2_13_3();
		lab_2_13_4();
	}

	static void lab_2_13_1() {
		for(Season season : Season.values()) {
			System.out.println(season);
		}
	}
	
	static void lab_2_13_2() {
		System.out.println("It is mostly warm weather in the:");
		for(Season warm : Season.values()) {
			if(warm.ordinal() != Season.values().length - 1) 
				System.out.println("\t" + warm);
		}
	}
	
	static void lab_2_13_3() {
		System.out.println("Please, enter current season name:");
		Scanner sc = new Scanner(System.in);
		String currentSeason = sc.nextLine();
		try {
			switch(Season.valueOf(currentSeason)) {
			case SPRING: case SUMMER: case AUTUMN: case WINTER: {
				System.out.println("Next season is: " + 
			                  Season.nextSeason(Season.valueOf(currentSeason)));
				break;
			}
			default:
				System.out.println("Incorrect season name passed!");
			}
		} catch(Exception e) {
			System.out.println("Incorrect value passed!");
			return;
		} finally {
			sc.close();
		}
		
	}
	
	static void lab_2_13_4() {
		Chesspiece[] chesspieces = new Chesspiece[0];
		for(ChessColor color : ChessColor.values()) {
			for(ChessPieceKind piece : ChessPieceKind.values()) {
				chesspieces = Arrays.copyOf(chesspieces, 
						                    chesspieces.length + 1);
				chesspieces[chesspieces.length - 1] = new Chesspiece(color, 
						                                             piece);
			}
		}
		
		boolean isBlack = false;
		for(Chesspiece chesspiece : chesspieces) {
			if(chesspiece.getColor() == ChessColor.BLACK && isBlack == false) {
				isBlack = true;
				System.out.println();
			}
			System.out.println(chesspiece);
		}
	}
}
