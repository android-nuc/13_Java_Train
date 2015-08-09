package com.test;

import com.utils.Assist;

public class Test {

	public static final int GAME_OVER = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father fa = new Father("康熙", "68");

		Son son = new Son("雍正", "40");
		// fa.Da();
		son.Da();
		Assist.game_state = Assist.GAME_RESUME;
		
		switch (Assist.game_state) {
		case Assist.GAME_OVER:

			break;
		case Assist.GAME_RESUME:

			break;
		case Assist.GAME_START:
			
			break;
		default:
			break;
		}
	}

}
