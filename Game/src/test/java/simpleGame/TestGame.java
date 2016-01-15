package simpleGame;

import junit.framework.Assert;
import simpleGame.cli.ICalculator;
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
		Mockito.when(cal.get(0)).thenReturn("first");
		
		// Calling the tested operation
		game = new Game();
	//	game.moveNextPawn( d);
	}
	

	@Test
	public void testAddTwoNumbers(){
	//	Assert.assertEquals("first", game.toString());
	}
}
