package simpleGame;

import junit.framework.Assert;
import simpleGame.cli.ICalculator;
import simpleGame.core.Board;
import simpleGame.core.Game;

import org.junit.Before;
import org.junit.Test;

//It is recommended to import Mockito statically so that the code looks clearer
import org.mockito.Mockito;


public class TestGame {
	
	Game game;
	
	@Before
	public void setup(){
		// Creating context
		ICalculator cal = Mockito.mock(ICalculator.class);
		
		Board  cal1 = Mockito.mock(Board.class);
		Mockito.when(cal1.numberOfPawns()).thenReturn(1);
		
		Mockito.when(cal.get(0)).thenReturn("first");
		
		// Calling the tested operation
		game = new Game();
	//	game.moveNextPawn( d);
	}
	

	@Test
	public void test(){
	//	Assert.assertEquals("first", game.toString());
	}
}
