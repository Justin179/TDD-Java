package kata.game.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
import org.junit.*;
import kata.game.*;

import kata.game.Game;

class GameTest {

	private Game g = new Game();		// 宣告參考變數，指向 Game instance
	
//	@Before
//	public void setUp() throws Exception {
//		g = new Game();
//	}

	@Test
	// 測試玩家投球共20次全洗溝 (gutter)時的總得分數
	// 期望結果值：0
	public void testGutterGame() throws Exception {
		int expected = 0;	// 期望結果值
		int actual;			// 實際結果值
		
		// 投20次，每次倒0瓶
		this.rollMany(20, 0);
		actual = g.計分();
		
		// 斷言比對
		assertEquals(expected, actual);
	}
	
	private void rollMany(int n, int pins) {
		for (int i = 0; i < n; i++)
			g.投球(pins);
	}	
	
	@Test
	// 測試玩家投球共20次，每次都只得一分時的總得分數
	// 期望結果值：20	
	public void testAllOnes() throws Exception {
		int expected = 20;
		int actual;	
		
		// 投20次，每次倒1瓶
		this.rollMany(20, 1);
		actual = g.計分();
		
		// 斷言比對
		assertEquals(expected, actual);
	}

}
