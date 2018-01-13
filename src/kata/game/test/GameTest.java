package kata.game.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
import org.junit.*;
import kata.game.*;

import kata.game.Game;

class GameTest {

	private Game g = new Game();		// �ŧi�Ѧ��ܼơA���V Game instance
	
//	@Before
//	public void setUp() throws Exception {
//		g = new Game();
//	}

	@Test
	// ���ժ��a��y�@20�����~�� (gutter)�ɪ��`�o����
	// ���浲�G�ȡG0
	public void testGutterGame() throws Exception {
		int expected = 0;	// ���浲�G��
		int actual;			// ��ڵ��G��
		
		// ��20���A�C����0�~
		this.rollMany(20, 0);
		actual = g.�p��();
		
		// �_�����
		assertEquals(expected, actual);
	}
	
	private void rollMany(int n, int pins) {
		for (int i = 0; i < n; i++)
			g.��y(pins);
	}	
	
	@Test
	// ���ժ��a��y�@20���A�C�����u�o�@���ɪ��`�o����
	// ���浲�G�ȡG20	
	public void testAllOnes() throws Exception {
		int expected = 20;
		int actual;	
		
		// ��20���A�C����1�~
		this.rollMany(20, 1);
		actual = g.�p��();
		
		// �_�����
		assertEquals(expected, actual);
	}

}
