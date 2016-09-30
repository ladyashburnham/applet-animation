/*
Program: Galaga Scene
Creator: Mark Porter
Date: January 6, 2016
Purpose: to kick alien butt

*/
import java.applet.Applet ; 
import java.awt.* ; 
import java.util.*  ;

	public class SCENE extends Applet implements Runnable
	
	{//opening of SCENE
	int checker1 ; 
	int checker2  ;
	int checker3 ; 
	int fightertopx = 500 ;
	int fightertopy = 750 ; 
	int missiletopx = 200 ;
	int missiletopy = 200 ; 
	int alientopy = 300 ;
	int alientopx = 200 ; 
	int alien = 1 ; 
	int explosionx = 0 ; 
	int explosiony = 0 ; 
	int explosion = 0 ; 
	int explosionsquare1 = 0  ;
	int expcounter = 0 ; 
	int alien2topx = 400; 
	int alien2topy = 300 ;
	int alien2 = 1; 
	int alien3topx = 600 ; 
	int alien3topy = 300 ; 
	int alien3 = 1 ; 
	
	int alien4topx = 100 ; 
	int alien4topy = 100 ; 
	int alien4 = 1 ; 
	int alien5topx = 300 ; 
	int alien5topy = 100 ; 
	int alien5 = 1 ; 
	int alien6topx = 500 ; 
	int alien6topy = 100 ; 
	int alien6 = 1 ; 
	int alien7topx = 700 ; 
	int alien7topy = 100 ; 
	int alien7 = 1 ; 
	String text = "Mark Porter" ;
	
	int starmotiony ; 
	int starmotiony2  = 500; 
	int starmotiony3 = -500 ; 
	
	int playerscore =  0; 
	int score = 0 ; 
	int counter = 0 ; 
	int resetcounter = 0 ; 

	
	Thread runner ;
	
	//STARTING NEW THREAD IF ONE DOES NOT ALREADY EXIT AND START IT
	public void start ()
	{//opening start
		if (runner == null)
		{
		runner = new Thread (this);
		runner.start() ;
		}

	}//closing of start
	
	//WHAT CHAGNES ARE GOING TO OCCUR NEXT WHILE THE APPLET IS RUNNING

		
	
	public void run()
	{
		while(true)
		{
				//explosion 
			//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
			//if (explosion == 1)
			//{
			
			//expcounter = expcounter + 1 ; 
			
			//if (expcounter == 10) ; 
			//{
			//explosion = 0 ; 
			//}
			//repaint() ; 
			//}
			//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		
		//stars motion
		
		//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		starmotiony = starmotiony + 1 ; 
		
		starmotiony2 = starmotiony2 + 1 ; 
		
		starmotiony3 = starmotiony3 + 1 ; 
		
		if (starmotiony > 900)
		{
		starmotiony = starmotiony - 1500 ; 
		}
		if (starmotiony2 > 900)
		{
		starmotiony2 = starmotiony2 - 1500 ; 
		}
		
		if (starmotiony3 > 900)
		{
		starmotiony3 = starmotiony3 - 1500 ; 
		}
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		
		//fighter motion
		//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
			if (checker1 == 0 )
			{
			fightertopx = fightertopx + 1 ; 
			}

			if (checker1 == 1 )
			{
			fightertopx = fightertopx - 1 ; 
			}
			if (fightertopx > 900) 
			{
			checker1 = 1 ; 
			}
			if (fightertopx < 50)
			{
			checker1 = 0 ;
			}
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		//alien motion firsxt row
		
		
				if (checker2 == 0 )
			{
			if (alien == 1) 
			{
			alientopx = alientopx + 1 ; 
			}
			if (alien2 == 1) 
			{
			alien2topx = alien2topx + 1 ; 
			}
			if (alien3 == 1)
			{
			alien3topx = alien3topx + 1 ; 
			}
			}

			if (checker2 == 1 )
			{
				
				if (alien == 1) 
			{
			alientopx = alientopx - 1 ; 
			}
				
				if (alien2 == 1) 
			{
			alien2topx = alien2topx - 1 ; 
			}
			
			if (alien3 == 1)
			{
			alien3topx = alien3topx - 1 ; 
			}
			
			}
			
			if ((alientopx > 900) || (alien2topx > 900) || (alien3topx > 900) )
			{
			checker2 = 1 ; 
			}
			if ((alientopx < 50) || (alien2topx < 50) || (alien3topx  < 50 ) )
			{
			checker2 = 0 ;
			}
			
			//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
				//alien motion second row
		
		
				if (checker3 == 0 )
			{
				if (alien4 == 1)
			{
			alien4topx = alien4topx + 1 ; 
			}
				if (alien5 == 1)
			{
			alien5topx = alien5topx + 1 ; 
			}
				if (alien6 == 1)
			{
			alien6topx = alien6topx + 1 ; 
			}
				if (alien7 == 1)
			{
			alien7topx = alien7topx + 1 ; 
			}
			}

			if (checker3 == 1 )
			{
					if (alien4 == 1)
			{
			alien4topx = alien4topx - 1 ; 
			}
					if (alien5 == 1)
			{
			alien5topx = alien5topx - 1 ; 
			}
					if (alien6 == 1)
			{
			alien6topx = alien6topx - 1 ; 
			}
				if (alien7 == 1)
			{
			alien7topx = alien7topx - 1 ; 
			} 
			}
			if ((alien7topx > 900) || (alien6topx > 900) || (alien5topx > 900) || (alien4topx > 900)) 
			{
			checker3 = 1 ; 
			}
			if ((alien7topx < 50) || (alien6topx < 50) || (alien5topx  < 50 ) || (alien4topx < 50))
			{
			checker3 = 0 ;
			}
			
			//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
			
			
			//missile motion 
			//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
			
				counter = counter + 1 ; 
				
				if (counter  < 100 )
				
				{
				missiletopx = fightertopx  ;
				missiletopy = fightertopy + 40 ; 
				}
				
				else
				{
				missiletopy = missiletopy - 1 ; 
				
				if ( (missiletopy == (alientopy + 100))  & ((alientopx - 40) < missiletopx) & (missiletopx < (alientopx + 40)))
				{
				//explosion = 1 ; 
				alien = 0 ; 
				alientopx = 900 ; 
				alientopy = -1000 ; 
				counter = 0 ; 
				score = score + 1000 ; 
				}
				
				if ( (missiletopy == (alien2topy + 100))  & ((alien2topx - 40) < missiletopx) & (missiletopx < (alien2topx + 40)))
				{
				//explosion2 = 1 ; 
				alien2 = 0 ; 
				alien2topx = 900 ; 
				alien2topy = -1000 ; 
				counter = 0 ; 
					score = score + 1000 ; 
				}
				
				if ( (missiletopy == (alien3topy + 100))  & ((alien3topx - 40) < missiletopx) & (missiletopx < (alien3topx + 40)))
				{
				//explosion3 = 1 ; 
				alien3 = 0 ; 
				alien3topx = 900 ; 
				alien3topy = -1000 ; 
				counter = 0 ; 
				score = score + 1000 ; 
				}
				
				if ( (missiletopy == (alien4topy + 100))  & ((alien4topx - 40) < missiletopx) & (missiletopx < (alien4topx + 40)))
				{
				//explosion4 = 1 ; 
				alien4 = 0 ; 
				alien4topx = 900 ; 
				alien4topy = -1000 ;
				counter = 0 ; 
				score = score + 1000 ; 
				}
				if ( (missiletopy == (alien5topy + 100))  & ((alien5topx - 40) < missiletopx) & (missiletopx < (alien5topx + 40)))
				{
				//explosion5 = 1 ; 
				alien5 = 0 ; 
				alien5topx = 900 ; 
				alien5topy = -1000 ; 
				counter = 0 ; 
					score = score + 1000 ; 
				}
					if ( (missiletopy == (alien6topy + 100))  & ((alien6topx - 40) < missiletopx) & (missiletopx < (alien6topx + 40)))
				{
				//explosion6 = 1 ; 
				alien6 = 0 ; 
				alien6topx = 900 ; 
				alien6topy = -1000 ; 
				counter = 0 ; 
					score = score + 1000 ; 
				}
					if ( (missiletopy == (alien7topy + 100))  & ((alien7topx - 40) < missiletopx) & (missiletopx < (alien7topx + 40)))
				{
				//explosion7 = 1 ; 
				alien7 = 0 ; 
				alien7topx = 900 ; 
				alien7topy = -1000 ; 
				counter = 0 ; 
					score = score + 1000 ; 
				}
				
				if (missiletopy < 0)
				
				{
				counter = 0 ; 
				}
				}
			
			
			
			
			
			//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
			
			//reset
			
			//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
			
			if ((alien == 0) & (alien2 == 0)& (alien3 == 0) & (alien4 == 0) & (alien5 == 0) & (alien6 == 0) & (alien7 == 0))
			{
			resetcounter = resetcounter + 1 ; 
			if (resetcounter == 20)
			{
				  fightertopx = 500 ;
	 fightertopy = 750 ; 
	  missiletopx = 200 ;
	  missiletopy = 200 ; 
	  alientopy = 300 ;
	  alientopx = 200 ; 
	  alien = 1 ; 
	  explosionx = 0 ; 
	  explosiony = 0 ; 
	  explosion = 0 ; 
	  explosionsquare1 = 0  ;
	  expcounter = 0 ; 
	  alien2topx = 400; 
	  alien2topy = 300 ;
	  alien2 = 1; 
	  alien3topx = 600 ; 
	  alien3topy = 300 ; 
	  alien3 = 1 ; 
	
	  alien4topx = 100 ; 
	  alien4topy = 100 ; 
	  alien4 = 1 ; 
	  alien5topx = 300 ; 
	  alien5topy = 100 ; 
	  alien5 = 1 ; 
	  alien6topx = 500 ; 
	  alien6topy = 100 ; 
	  alien6 = 1 ; 
	  alien7topx = 700 ; 
	  alien7topy = 100 ; 
	  alien7 = 1 ; 
			}
			}
			
			//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	

			
		
			repaint() ;	
			
			try
			{
				runner.sleep(5) ;
			}
			catch (InterruptedException e) {}
		}
		
		
	}//closing of run

		public void paint(Graphics g)	
		
	{//opening of paint
	
	setBackground(Color.black) ;
	
	//explosion 
	
	//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	
	//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	//border stuff
	//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	g.setColor(Color.red) ; 
	g.drawString("HIGH SCORE:", 1050, 30) ; 
	g.setColor(Color.white) ; 
	g.drawString("69000", 1150, 30) ; 
	
	
	g.setColor(Color.red) ; 
	g.drawString("1UP:", 1050, 70) ; 
	g.setColor(Color.white) ; 
	g.drawString((Integer.toString(score)), 1150, 70) ;
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	//stars
	// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++                                                               
	g.setColor(Color.red) ; 
	g.fillRect((20    ), (260+ starmotiony), 10, 10) ;
	g.fillRect((500   ), (230+ starmotiony), 10, 10) ;
	g.fillRect((631    ), (456+ starmotiony), 10, 10) ;
	g.setColor(Color.magenta) ; 
	g.fillRect((12    ), (544+ starmotiony), 10, 10) ;
	g.fillRect((506    ), (666+ starmotiony), 10, 10) ;
	g.fillRect((300    ), (873+ starmotiony), 10, 10) ;
	g.setColor(Color.yellow) ; 
	g.fillRect((201    ), (669+ starmotiony), 10, 10) ;
	g.fillRect((702    ), (201+ starmotiony), 10, 10) ;
	g.fillRect((733    ), (772+ starmotiony), 10, 10) ;
	g.setColor(Color.green) ; 
	g.fillRect((809    ), (123+ starmotiony), 10, 10) ;
	
	g.fillRect((477    ), (789+ starmotiony), 10, 10) ;
	g.setColor(Color.blue) ; 
	g.fillRect((925    ), (222+ starmotiony), 10, 10) ;
	g.fillRect((833    ), (444+ starmotiony), 10, 10) ;
	g.fillRect((226    ), (506 + starmotiony), 10, 10) ;
	g.fillRect(( 225   ), (360+ starmotiony), 10, 10) ;
	
	
		g.setColor(Color.red) ; 
	g.fillRect((20    ), (260+ starmotiony2), 10, 10) ;
	g.fillRect((500   ), (230+ starmotiony2), 10, 10) ;
	g.fillRect((631    ), (456+ starmotiony2), 10, 10) ;
	g.setColor(Color.magenta) ; 
	g.fillRect((12    ), (544+ starmotiony2), 10, 10) ;
	g.fillRect((506    ), (666+ starmotiony2), 10, 10) ;
	g.fillRect((300    ), (873+ starmotiony2), 10, 10) ;
	g.setColor(Color.yellow) ; 
	g.fillRect((201    ), (669+ starmotiony2), 10, 10) ;
	g.fillRect((702    ), (201+ starmotiony2), 10, 10) ;
	g.fillRect((733    ), (772+ starmotiony2), 10, 10) ;
	g.setColor(Color.green) ; 
	g.fillRect((809    ), (123+ starmotiony2), 10, 10) ;
	
	g.fillRect((477    ), (789+ starmotiony2), 10, 10) ;
	g.setColor(Color.cyan) ; 
	g.fillRect((925    ), (222+ starmotiony2), 10, 10) ;
	g.fillRect((833    ), (444+ starmotiony2), 10, 10) ;
	g.fillRect((226    ), (506 + starmotiony2), 10, 10) ;
	g.fillRect(( 225   ), (360+ starmotiony2), 10, 10) ;
	
	
			g.setColor(Color.red) ; 
	g.fillRect((20    ), (260+ starmotiony3), 10, 10) ;
	g.fillRect((500   ), (230+ starmotiony3), 10, 10) ;
	g.fillRect((631    ), (456+ starmotiony3), 10, 10) ;
	g.setColor(Color.magenta) ; 
	g.fillRect((12    ), (544+ starmotiony3), 10, 10) ;
	g.fillRect((506    ), (666+ starmotiony3), 10, 10) ;
	g.fillRect((300    ), (873+ starmotiony3), 10, 10) ;
	g.setColor(Color.yellow) ; 
	g.fillRect((201    ), (669+ starmotiony3), 10, 10) ;
	g.fillRect((702    ), (201+ starmotiony3), 10, 10) ;
	g.fillRect((733    ), (772+ starmotiony3), 10, 10) ;
	g.setColor(Color.green) ; 
	g.fillRect((809    ), (123+ starmotiony3), 10, 10) ;
	
	g.fillRect((477    ), (789+ starmotiony3), 10, 10) ;
	g.setColor(Color.cyan) ; 
	g.fillRect((925    ), (222+ starmotiony3), 10, 10) ;
	g.fillRect((833    ), (444+ starmotiony3), 10, 10) ;
	g.fillRect((226    ), (506 + starmotiony3), 10, 10) ;
	g.fillRect(( 225   ), (360+ starmotiony3), 10, 10) ;
	
	
	
	
	
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

	
	//test
	//g.setColor(Color.white) ; 
	//g.fillRect(blue, blue, 10, 10) ; //test
	

	
	//missile
	
	//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	//top
	
	g.setColor(Color.red) ; 
	
	g.fillRect((missiletopx), (missiletopy), 10, 10) ;
	
	//second row
	
	g.fillRect( missiletopx, (missiletopy + 10), 10, 10 ) ; 
	g.fillRect((missiletopx + 10), (missiletopy + 10), 10, 10 ) ; 
	g.fillRect((missiletopx - 10), (missiletopy + 10), 10, 10 ) ; 
	
	//third row and fourht
	
	g.setColor(Color.white) ; 
	
	g.fillRect( missiletopx, (missiletopy + 20), 10, 10 ) ; 
	g.fillRect( missiletopx, (missiletopy + 30), 10, 10 ) ; 
	
	
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	//fighter
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	
	
	//first three sqaures
	
	
	
	g.setColor(Color.white) ; 
	
	g.fillRect(fightertopx, fightertopy, 10, 10) ; //top square of fighter
	
	g.fillRect(fightertopx, (fightertopy + 10), 10, 10) ;
	
	g.fillRect(fightertopx, (fightertopy + 20), 10, 10) ;
	
	
	//first row
	g.fillRect(fightertopx, (fightertopy + 30), 10, 10) ;
	
	g.fillRect((fightertopx + 10), (fightertopy + 30), 10, 10) ;
	
	g.fillRect((fightertopx - 10), (fightertopy  + 30), 10, 10) ;
	
	
	g.setColor(Color.red) ; 
	
	g.fillRect((fightertopx - 30), (fightertopy  + 30), 10, 10) ;
	
	g.fillRect((fightertopx + 30), (fightertopy  + 30), 10, 10) ;
	
	//second row
	
	g.setColor(Color.white) ; 
	
	g.fillRect(fightertopx, (fightertopy + 40), 10, 10) ;
	
	g.fillRect((fightertopx + 10), (fightertopy + 40), 10, 10) ;
	
	g.fillRect((fightertopx - 10), (fightertopy  + 40), 10, 10) ;
	
	g.fillRect((fightertopx - 30), (fightertopy  + 40), 10, 10) ;
	
	g.fillRect((fightertopx + 30), (fightertopy  + 40), 10, 10) ;
	
	//third row
	
	
	g.setColor(Color.red) ; 
	
	g.fillRect(fightertopx, (fightertopy + 50), 10, 10) ;
	
	g.setColor(Color.white) ; 
	
	g.fillRect((fightertopx + 10), (fightertopy + 50), 10, 10) ;
	
	g.fillRect((fightertopx - 10), (fightertopy  + 50), 10, 10) ;
	
	g.setColor(Color.blue) ; 
	
	g.fillRect((fightertopx - 20), (fightertopy  + 50), 10, 10) ;
	
	g.fillRect((fightertopx + 20), (fightertopy  + 50), 10, 10) ;
	
	g.setColor(Color.white) ; 
	
	g.fillRect((fightertopx - 30), (fightertopy  + 50), 10, 10) ;
	
	g.fillRect((fightertopx + 30), (fightertopy  + 50), 10, 10) ;
	
	
	

	//fourth row
	
	g.setColor(Color.red) ; 
	
	g.fillRect(fightertopx, (fightertopy + 60), 10, 10) ;
	

	g.fillRect((fightertopx + 10), (fightertopy + 60), 10, 10) ;
	
	g.fillRect((fightertopx - 10), (fightertopy  + 60), 10, 10) ;
	
	g.setColor(Color.white) ; 
	
	g.fillRect((fightertopx - 20), (fightertopy  + 60), 10, 10) ;
	
	g.fillRect((fightertopx + 20), (fightertopy  + 60), 10, 10) ;
	
	g.setColor(Color.blue) ; 
	
	g.fillRect((fightertopx - 30), (fightertopy  + 60), 10, 10) ;
	
	g.fillRect((fightertopx + 30), (fightertopy  + 60), 10, 10) ;
		
	g.setColor(Color.red) ; 
	
	g.fillRect((fightertopx - 50), (fightertopy  + 60), 10, 10) ;
	
	g.fillRect((fightertopx + 50), (fightertopy  + 60), 10, 10) ;
	
	//fifth row
	
		
	g.setColor(Color.white) ; 
	
	g.fillRect(fightertopx, (fightertopy + 70), 10, 10) ;
	
	g.setColor(Color.red) ; 

	g.fillRect((fightertopx + 10), (fightertopy + 70), 10, 10) ;
	
	g.fillRect((fightertopx - 10), (fightertopy  + 70), 10, 10) ;
	
	g.setColor(Color.white) ; 
	
	g.fillRect((fightertopx - 20), (fightertopy  + 70), 10, 10) ;
	
	g.fillRect((fightertopx + 20), (fightertopy  + 70), 10, 10) ;
	
	
	g.fillRect((fightertopx - 30), (fightertopy  + 70), 10, 10) ;
	
	g.fillRect((fightertopx + 30), (fightertopy  + 70), 10, 10) ;
	
	g.fillRect((fightertopx - 50), (fightertopy  + 70), 10, 10) ;
	
	g.fillRect((fightertopx + 50), (fightertopy  + 70), 10, 10) ;
	
	//sixth row
	
	g.setColor(Color.white) ; 
	
	g.fillRect(fightertopx, (fightertopy + 80), 10, 10) ;

	g.fillRect((fightertopx + 10), (fightertopy + 80), 10, 10) ;
	
	g.fillRect((fightertopx - 10), (fightertopy  + 80), 10, 10) ;
	
	g.fillRect((fightertopx - 20), (fightertopy  + 80), 10, 10) ;
	
	g.fillRect((fightertopx + 20), (fightertopy  + 80), 10, 10) ;
	
	g.fillRect((fightertopx - 30), (fightertopy  + 80), 10, 10) ;
	
	g.fillRect((fightertopx + 30), (fightertopy  + 80), 10, 10) ;
	
	g.fillRect((fightertopx - 40), (fightertopy  + 80), 10, 10) ;
	
	g.fillRect((fightertopx + 40), (fightertopy  + 80), 10, 10) ;
	
	g.fillRect((fightertopx - 50), (fightertopy  + 80), 10, 10) ;
	
	g.fillRect((fightertopx + 50), (fightertopy  + 80), 10, 10) ;
	
	//seventh row
	
		
	g.fillRect(fightertopx, (fightertopy + 90), 10, 10) ;
	
	g.setColor(Color.red) ; 

	g.fillRect((fightertopx + 10), (fightertopy + 90), 10, 10) ;
	
	g.fillRect((fightertopx - 10), (fightertopy  + 90), 10, 10) ;
	
	g.fillRect((fightertopx - 20), (fightertopy  + 90), 10, 10) ;
	
	g.fillRect((fightertopx + 20), (fightertopy  + 90), 10, 10) ;
	
	g.setColor(Color.white) ; 
	
	g.fillRect((fightertopx - 40), (fightertopy  + 90), 10, 10) ;
	
	g.fillRect((fightertopx + 40), (fightertopy  + 90), 10, 10) ;
	
	g.fillRect((fightertopx - 50), (fightertopy  + 90), 10, 10) ;
	
	g.fillRect((fightertopx + 50), (fightertopy  + 90), 10, 10) ;
	
	//eigth row
	
	g.fillRect(fightertopx, (fightertopy + 100), 10, 10) ;
	
	g.fillRect((fightertopx - 50), (fightertopy  + 100), 10, 10) ;
	
	g.fillRect((fightertopx + 50), (fightertopy  + 100), 10, 10) ;
	
	//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	

	
	
	
	// first alien
	
	//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	//first row
	if (alien == 1) 
	{
	g.setColor(Color.pink) ; 
	
	g.fillRect( (alientopx), (alientopy ), 10, 10 ) ;
	
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alientopx - 30), (alientopy ), 10, 10 ) ;
	
	g.fillRect( (alientopx + 30), (alientopy ), 10, 10 ) ;
	
	
	g.fillRect( (alientopx - 40), (alientopy ), 10, 10 ) ;
	
	g.fillRect( (alientopx + 40), (alientopy ), 10, 10 ) ;
	

	
	//secdon row
	
	g.setColor(Color.pink) ; 
	
	g.fillRect( (alientopx ), (alientopy + 10), 10, 10 ) ;
	
	g.fillRect( (alientopx + 10 ), (alientopy + 10), 10, 10 ) ;
	g.fillRect( (alientopx - 10), (alientopy + 10), 10, 10 ) ;
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alientopx - 30), (alientopy + 10 ), 10, 10 ) ;
	
	g.fillRect( (alientopx + 30), (alientopy + 10 ), 10, 10 ) ;
	
	
	g.fillRect( (alientopx - 40), (alientopy + 10 ), 10, 10 ) ;
	
	g.fillRect( (alientopx + 40), (alientopy + 10), 10, 10 ) ;
	
	//third row
	
	g.setColor(Color.yellow) ; 
	
	g.fillRect( (alientopx ), (alientopy + 20), 10, 10 ) ;
	
	g.fillRect( (alientopx + 10 ), (alientopy + 20), 10, 10 ) ;
	g.fillRect( (alientopx - 10), (alientopy + 20), 10, 10 ) ;
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alientopx - 30), (alientopy + 20 ), 10, 10 ) ;
	
	g.fillRect( (alientopx + 30), (alientopy + 20 ), 10, 10 ) ;
	
	
	g.fillRect( (alientopx - 40), (alientopy + 20 ), 10, 10 ) ;
	
	g.fillRect( (alientopx + 40), (alientopy + 20), 10, 10 ) ;
	
	//fourth row
		
	g.setColor(Color.yellow) ; 
	
	g.fillRect( (alientopx ), (alientopy + 30), 10, 10 ) ;
	
	g.fillRect( (alientopx + 10 ), (alientopy + 30), 10, 10 ) ;
	g.fillRect( (alientopx - 10), (alientopy + 30), 10, 10 ) ;
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alientopx - 30), (alientopy + 30 ), 10, 10 ) ;
	
	g.fillRect( (alientopx + 30), (alientopy + 30 ), 10, 10 ) ;
	
	
	g.fillRect( (alientopx - 40), (alientopy + 30 ), 10, 10 ) ;
	
	g.fillRect( (alientopx + 40), (alientopy + 30), 10, 10 ) ;
	
	//fifth row
	
		g.setColor(Color.pink) ; 
	
	g.fillRect( (alientopx ), (alientopy + 40), 10, 10 ) ;
	
	g.fillRect( (alientopx + 10 ), (alientopy + 40), 10, 10 ) ;
	
	g.fillRect( (alientopx - 10), (alientopy + 40), 10, 10 ) ;
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alientopx - 30), (alientopy + 40 ), 10, 10 ) ;
	
	g.fillRect( (alientopx + 30), (alientopy + 40 ), 10, 10 ) ;
	
	//sixth row
	
	g.setColor(Color.pink) ; 
	
	g.fillRect( (alientopx ), (alientopy + 50), 10, 10 ) ;
	
	g.fillRect( (alientopx + 10 ), (alientopy + 50), 10, 10 ) ;
	
	g.fillRect( (alientopx - 10), (alientopy + 50), 10, 10 ) ;
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alientopx - 20), (alientopy + 50 ), 10, 10 ) ;
	
	g.fillRect( (alientopx + 20), (alientopy + 50 ), 10, 10 ) ;
	
	g.fillRect( (alientopx - 30), (alientopy + 50 ), 10, 10 ) ;
	
	g.fillRect( (alientopx + 30), (alientopy + 50 ), 10, 10 ) ;
	
	//seventh row
	
	g.setColor(Color.yellow) ; 
	
	g.fillRect( (alientopx ), (alientopy + 60), 10, 10 ) ;
	
	g.fillRect( (alientopx + 10 ), (alientopy + 60), 10, 10 ) ;
	
	g.fillRect( (alientopx - 10), (alientopy + 60), 10, 10 ) ;
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alientopx - 20), (alientopy + 60 ), 10, 10 ) ;
	
	g.fillRect( (alientopx + 20), (alientopy + 60 ), 10, 10 ) ;
	
	g.fillRect( (alientopx - 30), (alientopy + 60 ), 10, 10 ) ;
	
	g.fillRect( (alientopx + 30), (alientopy + 60 ), 10, 10 ) ;
	
	//eighth row
	
	g.setColor(Color.yellow) ; 
	
	g.fillRect( (alientopx ), (alientopy + 70), 10, 10 ) ;
	
	g.fillRect( (alientopx + 10 ), (alientopy + 70), 10, 10 ) ;
	
	g.fillRect( (alientopx - 10), (alientopy + 70), 10, 10 ) ;
	
	g.fillRect( (alientopx - 20), (alientopy + 70 ), 10, 10 ) ;
	
	g.fillRect( (alientopx + 20), (alientopy + 70 ), 10, 10 ) ;
	
	//ninth
	g.setColor(Color.yellow) ; 
	
	g.fillRect( (alientopx ), (alientopy + 80), 10, 10 ) ;
	
	g.setColor(Color.pink) ; 
	
	g.fillRect( (alientopx + 10 ), (alientopy + 80), 10, 10 ) ;
	
	g.fillRect( (alientopx - 10), (alientopy + 80), 10, 10 ) ;
	

	
	g.fillRect( (alientopx - 20), (alientopy + 80 ), 10, 10 ) ;
	
	g.fillRect( (alientopx + 20), (alientopy + 80 ), 10, 10 ) ;
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alientopx - 30), (alientopy + 80 ), 10, 10 ) ;
	
	g.fillRect( (alientopx + 30), (alientopy + 80 ), 10, 10 ) ;
	
	//tenth
	g.setColor(Color.yellow) ; 
	
	g.fillRect( (alientopx ), (alientopy + 90), 10, 10 ) ;
	
	g.setColor(Color.pink) ; 
	
	g.fillRect( (alientopx + 10 ), (alientopy + 90), 10, 10 ) ;
	
	g.fillRect( (alientopx - 10), (alientopy + 90), 10, 10 ) ;
	
	g.setColor(Color.yellow) ; 
	
	g.fillRect( (alientopx - 20), (alientopy + 90 ), 10, 10 ) ;
	
	g.fillRect( (alientopx + 20), (alientopy + 90 ), 10, 10 ) ;
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alientopx - 40), (alientopy + 90 ), 10, 10 ) ;
	
	g.fillRect( (alientopx + 40), (alientopy + 90 ), 10, 10 ) ;
	
	//eleventh 
	
	g.setColor(Color.yellow) ; 
	
	g.fillRect( (alientopx ), (alientopy + 100), 10, 10 ) ;
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alientopx - 40), (alientopy + 100 ), 10, 10 ) ;
	
	g.fillRect( (alientopx + 40), (alientopy + 100 ), 10, 10 ) ;
	
	
	
	

	
	
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	}
	
	//alien 2
	
	//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	//first row
	
	if (alien2 == 1)
	{
	g.setColor(Color.pink) ; 
	
	g.fillRect( (alien2topx), (alien2topy ), 10, 10 ) ;
	
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alien2topx - 30), (alien2topy ), 10, 10 ) ;
	
	g.fillRect( (alien2topx + 30), (alien2topy ), 10, 10 ) ;
	
	
	g.fillRect( (alien2topx - 40), (alien2topy ), 10, 10 ) ;
	
	g.fillRect( (alien2topx + 40), (alien2topy ), 10, 10 ) ;
	

	
	//secdon row
	
	g.setColor(Color.pink) ; 
	
	g.fillRect( (alien2topx ), (alien2topy + 10), 10, 10 ) ;
	
	g.fillRect( (alien2topx + 10 ), (alien2topy + 10), 10, 10 ) ;
	g.fillRect( (alien2topx - 10), (alien2topy + 10), 10, 10 ) ;
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alien2topx - 30), (alien2topy + 10 ), 10, 10 ) ;
	
	g.fillRect( (alien2topx + 30), (alien2topy + 10 ), 10, 10 ) ;
	
	
	g.fillRect( (alien2topx - 40), (alien2topy + 10 ), 10, 10 ) ;
	
	g.fillRect( (alien2topx + 40), (alien2topy + 10), 10, 10 ) ;
	
	//third row
	
	g.setColor(Color.yellow) ; 
	
	g.fillRect( (alien2topx ), (alien2topy + 20), 10, 10 ) ;
	
	g.fillRect( (alien2topx + 10 ), (alien2topy + 20), 10, 10 ) ;
	g.fillRect( (alien2topx - 10), (alien2topy + 20), 10, 10 ) ;
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alien2topx - 30), (alien2topy + 20 ), 10, 10 ) ;
	
	g.fillRect( (alien2topx + 30), (alien2topy + 20 ), 10, 10 ) ;
	
	
	g.fillRect( (alien2topx - 40), (alien2topy + 20 ), 10, 10 ) ;
	
	g.fillRect( (alien2topx + 40), (alien2topy + 20), 10, 10 ) ;
	
	//fourth row
		
	g.setColor(Color.yellow) ; 
	
	g.fillRect( (alien2topx ), (alien2topy + 30), 10, 10 ) ;
	
	g.fillRect( (alien2topx + 10 ), (alien2topy + 30), 10, 10 ) ;
	g.fillRect( (alien2topx - 10), (alien2topy + 30), 10, 10 ) ;
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alien2topx - 30), (alien2topy + 30 ), 10, 10 ) ;
	
	g.fillRect( (alien2topx + 30), (alien2topy + 30 ), 10, 10 ) ;
	
	
	g.fillRect( (alien2topx - 40), (alien2topy + 30 ), 10, 10 ) ;
	
	g.fillRect( (alien2topx + 40), (alien2topy + 30), 10, 10 ) ;
	
	//fifth row
	
		g.setColor(Color.pink) ; 
	
	g.fillRect( (alien2topx ), (alien2topy + 40), 10, 10 ) ;
	
	g.fillRect( (alien2topx + 10 ), (alien2topy + 40), 10, 10 ) ;
	
	g.fillRect( (alien2topx - 10), (alien2topy + 40), 10, 10 ) ;
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alien2topx - 30), (alien2topy + 40 ), 10, 10 ) ;
	
	g.fillRect( (alien2topx + 30), (alien2topy + 40 ), 10, 10 ) ;
	
	//sixth row
	
	g.setColor(Color.pink) ; 
	
	g.fillRect( (alien2topx ), (alien2topy + 50), 10, 10 ) ;
	
	g.fillRect( (alien2topx + 10 ), (alien2topy + 50), 10, 10 ) ;
	
	g.fillRect( (alien2topx - 10), (alien2topy + 50), 10, 10 ) ;
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alien2topx - 20), (alien2topy + 50 ), 10, 10 ) ;
	
	g.fillRect( (alien2topx + 20), (alien2topy + 50 ), 10, 10 ) ;
	
	g.fillRect( (alien2topx - 30), (alien2topy + 50 ), 10, 10 ) ;
	
	g.fillRect( (alien2topx + 30), (alien2topy + 50 ), 10, 10 ) ;
	
	//seventh row
	
	g.setColor(Color.yellow) ; 
	
	g.fillRect( (alien2topx ), (alien2topy + 60), 10, 10 ) ;
	
	g.fillRect( (alien2topx + 10 ), (alien2topy + 60), 10, 10 ) ;
	
	g.fillRect( (alien2topx - 10), (alien2topy + 60), 10, 10 ) ;
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alien2topx - 20), (alien2topy + 60 ), 10, 10 ) ;
	
	g.fillRect( (alien2topx + 20), (alien2topy + 60 ), 10, 10 ) ;
	
	g.fillRect( (alien2topx - 30), (alien2topy + 60 ), 10, 10 ) ;
	
	g.fillRect( (alien2topx + 30), (alien2topy + 60 ), 10, 10 ) ;
	
	//eighth row
	
	g.setColor(Color.yellow) ; 
	
	g.fillRect( (alien2topx ), (alien2topy + 70), 10, 10 ) ;
	
	g.fillRect( (alien2topx + 10 ), (alien2topy + 70), 10, 10 ) ;
	
	g.fillRect( (alien2topx - 10), (alien2topy + 70), 10, 10 ) ;
	
	g.fillRect( (alien2topx - 20), (alien2topy + 70 ), 10, 10 ) ;
	
	g.fillRect( (alien2topx + 20), (alien2topy + 70 ), 10, 10 ) ;
	
	//ninth
	g.setColor(Color.yellow) ; 
	
	g.fillRect( (alien2topx ), (alien2topy + 80), 10, 10 ) ;
	
	g.setColor(Color.pink) ; 
	
	g.fillRect( (alien2topx + 10 ), (alien2topy + 80), 10, 10 ) ;
	
	g.fillRect( (alien2topx - 10), (alien2topy + 80), 10, 10 ) ;
	

	
	g.fillRect( (alien2topx - 20), (alien2topy + 80 ), 10, 10 ) ;
	
	g.fillRect( (alien2topx + 20), (alien2topy + 80 ), 10, 10 ) ;
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alien2topx - 30), (alien2topy + 80 ), 10, 10 ) ;
	
	g.fillRect( (alien2topx + 30), (alien2topy + 80 ), 10, 10 ) ;
	
	//tenth
	g.setColor(Color.yellow) ; 
	
	g.fillRect( (alien2topx ), (alien2topy + 90), 10, 10 ) ;
	
	g.setColor(Color.pink) ; 
	
	g.fillRect( (alien2topx + 10 ), (alien2topy + 90), 10, 10 ) ;
	
	g.fillRect( (alien2topx - 10), (alien2topy + 90), 10, 10 ) ;
	
	g.setColor(Color.yellow) ; 
	
	g.fillRect( (alien2topx - 20), (alien2topy + 90 ), 10, 10 ) ;
	
	g.fillRect( (alien2topx + 20), (alien2topy + 90 ), 10, 10 ) ;
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alien2topx - 40), (alien2topy + 90 ), 10, 10 ) ;
	
	g.fillRect( (alien2topx + 40), (alien2topy + 90 ), 10, 10 ) ;
	
	//eleventh 
	
	g.setColor(Color.yellow) ; 
	
	g.fillRect( (alien2topx ), (alien2topy + 100), 10, 10 ) ;
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alien2topx - 40), (alien2topy + 100 ), 10, 10 ) ;
	
	g.fillRect( (alien2topx + 40), (alien2topy + 100 ), 10, 10 ) ;
	
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	}
	
	
	// third alien
	
	//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	//first row
	if (alien3 == 1) 
	{
	g.setColor(Color.pink) ; 
	
	g.fillRect( (alien3topx), (alien3topy ), 10, 10 ) ;
	
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alien3topx - 30), (alien3topy ), 10, 10 ) ;
	
	g.fillRect( (alien3topx + 30), (alien3topy ), 10, 10 ) ;
	
	
	g.fillRect( (alien3topx - 40), (alien3topy ), 10, 10 ) ;
	
	g.fillRect( (alien3topx + 40), (alien3topy ), 10, 10 ) ;
	

	
	//secdon row
	
	g.setColor(Color.pink) ; 
	
	g.fillRect( (alien3topx ), (alien3topy + 10), 10, 10 ) ;
	
	g.fillRect( (alien3topx + 10 ), (alien3topy + 10), 10, 10 ) ;
	g.fillRect( (alien3topx - 10), (alien3topy + 10), 10, 10 ) ;
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alien3topx - 30), (alien3topy + 10 ), 10, 10 ) ;
	
	g.fillRect( (alien3topx + 30), (alien3topy + 10 ), 10, 10 ) ;
	
	
	g.fillRect( (alien3topx - 40), (alien3topy + 10 ), 10, 10 ) ;
	
	g.fillRect( (alien3topx + 40), (alien3topy + 10), 10, 10 ) ;
	
	//third row
	
	g.setColor(Color.yellow) ; 
	
	g.fillRect( (alien3topx ), (alien3topy + 20), 10, 10 ) ;
	
	g.fillRect( (alien3topx + 10 ), (alien3topy + 20), 10, 10 ) ;
	g.fillRect( (alien3topx - 10), (alien3topy + 20), 10, 10 ) ;
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alien3topx - 30), (alien3topy + 20 ), 10, 10 ) ;
	
	g.fillRect( (alien3topx + 30), (alien3topy + 20 ), 10, 10 ) ;
	
	
	g.fillRect( (alien3topx - 40), (alien3topy + 20 ), 10, 10 ) ;
	
	g.fillRect( (alien3topx + 40), (alien3topy + 20), 10, 10 ) ;
	
	//fourth row
		
	g.setColor(Color.yellow) ; 
	
	g.fillRect( (alien3topx ), (alien3topy + 30), 10, 10 ) ;
	
	g.fillRect( (alien3topx + 10 ), (alien3topy + 30), 10, 10 ) ;
	g.fillRect( (alien3topx - 10), (alien3topy + 30), 10, 10 ) ;
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alien3topx - 30), (alien3topy + 30 ), 10, 10 ) ;
	
	g.fillRect( (alien3topx + 30), (alien3topy + 30 ), 10, 10 ) ;
	
	
	g.fillRect( (alien3topx - 40), (alien3topy + 30 ), 10, 10 ) ;
	
	g.fillRect( (alien3topx + 40), (alien3topy + 30), 10, 10 ) ;
	
	//fifth row
	
		g.setColor(Color.pink) ; 
	
	g.fillRect( (alien3topx ), (alien3topy + 40), 10, 10 ) ;
	
	g.fillRect( (alien3topx + 10 ), (alien3topy + 40), 10, 10 ) ;
	
	g.fillRect( (alien3topx - 10), (alien3topy + 40), 10, 10 ) ;
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alien3topx - 30), (alien3topy + 40 ), 10, 10 ) ;
	
	g.fillRect( (alien3topx + 30), (alien3topy + 40 ), 10, 10 ) ;
	
	//sixth row
	
	g.setColor(Color.pink) ; 
	
	g.fillRect( (alien3topx ), (alien3topy + 50), 10, 10 ) ;
	
	g.fillRect( (alien3topx + 10 ), (alien3topy + 50), 10, 10 ) ;
	
	g.fillRect( (alien3topx - 10), (alien3topy + 50), 10, 10 ) ;
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alien3topx - 20), (alien3topy + 50 ), 10, 10 ) ;
	
	g.fillRect( (alien3topx + 20), (alien3topy + 50 ), 10, 10 ) ;
	
	g.fillRect( (alien3topx - 30), (alien3topy + 50 ), 10, 10 ) ;
	
	g.fillRect( (alien3topx + 30), (alien3topy + 50 ), 10, 10 ) ;
	
	//seventh row
	
	g.setColor(Color.yellow) ; 
	
	g.fillRect( (alien3topx ), (alien3topy + 60), 10, 10 ) ;
	
	g.fillRect( (alien3topx + 10 ), (alien3topy + 60), 10, 10 ) ;
	
	g.fillRect( (alien3topx - 10), (alien3topy + 60), 10, 10 ) ;
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alien3topx - 20), (alien3topy + 60 ), 10, 10 ) ;
	
	g.fillRect( (alien3topx + 20), (alien3topy + 60 ), 10, 10 ) ;
	
	g.fillRect( (alien3topx - 30), (alien3topy + 60 ), 10, 10 ) ;
	
	g.fillRect( (alien3topx + 30), (alien3topy + 60 ), 10, 10 ) ;
	
	//eighth row
	
	g.setColor(Color.yellow) ; 
	
	g.fillRect( (alien3topx ), (alien3topy + 70), 10, 10 ) ;
	
	g.fillRect( (alien3topx + 10 ), (alien3topy + 70), 10, 10 ) ;
	
	g.fillRect( (alien3topx - 10), (alien3topy + 70), 10, 10 ) ;
	
	g.fillRect( (alien3topx - 20), (alien3topy + 70 ), 10, 10 ) ;
	
	g.fillRect( (alien3topx + 20), (alien3topy + 70 ), 10, 10 ) ;
	
	//ninth
	g.setColor(Color.yellow) ; 
	
	g.fillRect( (alien3topx ), (alien3topy + 80), 10, 10 ) ;
	
	g.setColor(Color.pink) ; 
	
	g.fillRect( (alien3topx + 10 ), (alien3topy + 80), 10, 10 ) ;
	
	g.fillRect( (alien3topx - 10), (alien3topy + 80), 10, 10 ) ;
	

	
	g.fillRect( (alien3topx - 20), (alien3topy + 80 ), 10, 10 ) ;
	
	g.fillRect( (alien3topx + 20), (alien3topy + 80 ), 10, 10 ) ;
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alien3topx - 30), (alien3topy + 80 ), 10, 10 ) ;
	
	g.fillRect( (alien3topx + 30), (alien3topy + 80 ), 10, 10 ) ;
	
	//tenth
	g.setColor(Color.yellow) ; 
	
	g.fillRect( (alien3topx ), (alien3topy + 90), 10, 10 ) ;
	
	g.setColor(Color.pink) ; 
	
	g.fillRect( (alien3topx + 10 ), (alien3topy + 90), 10, 10 ) ;
	
	g.fillRect( (alien3topx - 10), (alien3topy + 90), 10, 10 ) ;
	
	g.setColor(Color.yellow) ; 
	
	g.fillRect( (alien3topx - 20), (alien3topy + 90 ), 10, 10 ) ;
	
	g.fillRect( (alien3topx + 20), (alien3topy + 90 ), 10, 10 ) ;
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alien3topx - 40), (alien3topy + 90 ), 10, 10 ) ;
	
	g.fillRect( (alien3topx + 40), (alien3topy + 90 ), 10, 10 ) ;
	
	//eleventh 
	
	g.setColor(Color.yellow) ; 
	
	g.fillRect( (alien3topx ), (alien3topy + 100), 10, 10 ) ;
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alien3topx - 40), (alien3topy + 100 ), 10, 10 ) ;
	
	g.fillRect( (alien3topx + 40), (alien3topy + 100 ), 10, 10 ) ;
	
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	}
	// fourth alien
	
	//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	if (alien4 == 1)
	//first row
	{
	g.setColor(Color.pink) ; 
	
	g.fillRect( (alien4topx), (alien4topy ), 10, 10 ) ;
	
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alien4topx - 30), (alien4topy ), 10, 10 ) ;
	
	g.fillRect( (alien4topx + 30), (alien4topy ), 10, 10 ) ;
	
	
	g.fillRect( (alien4topx - 40), (alien4topy ), 10, 10 ) ;
	
	g.fillRect( (alien4topx + 40), (alien4topy ), 10, 10 ) ;
	

	
	//secdon row
	
	g.setColor(Color.pink) ; 
	
	g.fillRect( (alien4topx ), (alien4topy + 10), 10, 10 ) ;
	
	g.fillRect( (alien4topx + 10 ), (alien4topy + 10), 10, 10 ) ;
	g.fillRect( (alien4topx - 10), (alien4topy + 10), 10, 10 ) ;
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alien4topx - 30), (alien4topy + 10 ), 10, 10 ) ;
	
	g.fillRect( (alien4topx + 30), (alien4topy + 10 ), 10, 10 ) ;
	
	
	g.fillRect( (alien4topx - 40), (alien4topy + 10 ), 10, 10 ) ;
	
	g.fillRect( (alien4topx + 40), (alien4topy + 10), 10, 10 ) ;
	
	//third row
	
	g.setColor(Color.yellow) ; 
	
	g.fillRect( (alien4topx ), (alien4topy + 20), 10, 10 ) ;
	
	g.fillRect( (alien4topx + 10 ), (alien4topy + 20), 10, 10 ) ;
	g.fillRect( (alien4topx - 10), (alien4topy + 20), 10, 10 ) ;
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alien4topx - 30), (alien4topy + 20 ), 10, 10 ) ;
	
	g.fillRect( (alien4topx + 30), (alien4topy + 20 ), 10, 10 ) ;
	
	
	g.fillRect( (alien4topx - 40), (alien4topy + 20 ), 10, 10 ) ;
	
	g.fillRect( (alien4topx + 40), (alien4topy + 20), 10, 10 ) ;
	
	//fourth row
		
	g.setColor(Color.yellow) ; 
	
	g.fillRect( (alien4topx ), (alien4topy + 30), 10, 10 ) ;
	
	g.fillRect( (alien4topx + 10 ), (alien4topy + 30), 10, 10 ) ;
	g.fillRect( (alien4topx - 10), (alien4topy + 30), 10, 10 ) ;
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alien4topx - 30), (alien4topy + 30 ), 10, 10 ) ;
	
	g.fillRect( (alien4topx + 30), (alien4topy + 30 ), 10, 10 ) ;
	
	
	g.fillRect( (alien4topx - 40), (alien4topy + 30 ), 10, 10 ) ;
	
	g.fillRect( (alien4topx + 40), (alien4topy + 30), 10, 10 ) ;
	
	//fifth row
	
		g.setColor(Color.pink) ; 
	
	g.fillRect( (alien4topx ), (alien4topy + 40), 10, 10 ) ;
	
	g.fillRect( (alien4topx + 10 ), (alien4topy + 40), 10, 10 ) ;
	
	g.fillRect( (alien4topx - 10), (alien4topy + 40), 10, 10 ) ;
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alien4topx - 30), (alien4topy + 40 ), 10, 10 ) ;
	
	g.fillRect( (alien4topx + 30), (alien4topy + 40 ), 10, 10 ) ;
	
	//sixth row
	
	g.setColor(Color.pink) ; 
	
	g.fillRect( (alien4topx ), (alien4topy + 50), 10, 10 ) ;
	
	g.fillRect( (alien4topx + 10 ), (alien4topy + 50), 10, 10 ) ;
	
	g.fillRect( (alien4topx - 10), (alien4topy + 50), 10, 10 ) ;
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alien4topx - 20), (alien4topy + 50 ), 10, 10 ) ;
	
	g.fillRect( (alien4topx + 20), (alien4topy + 50 ), 10, 10 ) ;
	
	g.fillRect( (alien4topx - 30), (alien4topy + 50 ), 10, 10 ) ;
	
	g.fillRect( (alien4topx + 30), (alien4topy + 50 ), 10, 10 ) ;
	
	//seventh row
	
	g.setColor(Color.yellow) ; 
	
	g.fillRect( (alien4topx ), (alien4topy + 60), 10, 10 ) ;
	
	g.fillRect( (alien4topx + 10 ), (alien4topy + 60), 10, 10 ) ;
	
	g.fillRect( (alien4topx - 10), (alien4topy + 60), 10, 10 ) ;
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alien4topx - 20), (alien4topy + 60 ), 10, 10 ) ;
	
	g.fillRect( (alien4topx + 20), (alien4topy + 60 ), 10, 10 ) ;
	
	g.fillRect( (alien4topx - 30), (alien4topy + 60 ), 10, 10 ) ;
	
	g.fillRect( (alien4topx + 30), (alien4topy + 60 ), 10, 10 ) ;
	
	//eighth row
	
	g.setColor(Color.yellow) ; 
	
	g.fillRect( (alien4topx ), (alien4topy + 70), 10, 10 ) ;
	
	g.fillRect( (alien4topx + 10 ), (alien4topy + 70), 10, 10 ) ;
	
	g.fillRect( (alien4topx - 10), (alien4topy + 70), 10, 10 ) ;
	
	g.fillRect( (alien4topx - 20), (alien4topy + 70 ), 10, 10 ) ;
	
	g.fillRect( (alien4topx + 20), (alien4topy + 70 ), 10, 10 ) ;
	
	//ninth
	g.setColor(Color.yellow) ; 
	
	g.fillRect( (alien4topx ), (alien4topy + 80), 10, 10 ) ;
	
	g.setColor(Color.pink) ; 
	
	g.fillRect( (alien4topx + 10 ), (alien4topy + 80), 10, 10 ) ;
	
	g.fillRect( (alien4topx - 10), (alien4topy + 80), 10, 10 ) ;
	

	
	g.fillRect( (alien4topx - 20), (alien4topy + 80 ), 10, 10 ) ;
	
	g.fillRect( (alien4topx + 20), (alien4topy + 80 ), 10, 10 ) ;
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alien4topx - 30), (alien4topy + 80 ), 10, 10 ) ;
	
	g.fillRect( (alien4topx + 30), (alien4topy + 80 ), 10, 10 ) ;
	
	//tenth
	g.setColor(Color.yellow) ; 
	
	g.fillRect( (alien4topx ), (alien4topy + 90), 10, 10 ) ;
	
	g.setColor(Color.pink) ; 
	
	g.fillRect( (alien4topx + 10 ), (alien4topy + 90), 10, 10 ) ;
	
	g.fillRect( (alien4topx - 10), (alien4topy + 90), 10, 10 ) ;
	
	g.setColor(Color.yellow) ; 
	
	g.fillRect( (alien4topx - 20), (alien4topy + 90 ), 10, 10 ) ;
	
	g.fillRect( (alien4topx + 20), (alien4topy + 90 ), 10, 10 ) ;
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alien4topx - 40), (alien4topy + 90 ), 10, 10 ) ;
	
	g.fillRect( (alien4topx + 40), (alien4topy + 90 ), 10, 10 ) ;
	
	//eleventh 
	
	g.setColor(Color.yellow) ; 
	
	g.fillRect( (alien4topx ), (alien4topy + 100), 10, 10 ) ;
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alien4topx - 40), (alien4topy + 100 ), 10, 10 ) ;
	
	g.fillRect( (alien4topx + 40), (alien4topy + 100 ), 10, 10 ) ;
	
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	}
	
	// fifth alien
	
	//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	 if (alien5 == 1)
	 {
	//first row
	g.setColor(Color.pink) ; 
	
	g.fillRect( (alien5topx), (alien5topy ), 10, 10 ) ;
	
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alien5topx - 30), (alien5topy ), 10, 10 ) ;
	
	g.fillRect( (alien5topx + 30), (alien5topy ), 10, 10 ) ;
	
	
	g.fillRect( (alien5topx - 40), (alien5topy ), 10, 10 ) ;
	
	g.fillRect( (alien5topx + 40), (alien5topy ), 10, 10 ) ;
	

	
	//secdon row
	
	g.setColor(Color.pink) ; 
	
	g.fillRect( (alien5topx ), (alien5topy + 10), 10, 10 ) ;
	
	g.fillRect( (alien5topx + 10 ), (alien5topy + 10), 10, 10 ) ;
	g.fillRect( (alien5topx - 10), (alien5topy + 10), 10, 10 ) ;
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alien5topx - 30), (alien5topy + 10 ), 10, 10 ) ;
	
	g.fillRect( (alien5topx + 30), (alien5topy + 10 ), 10, 10 ) ;
	
	
	g.fillRect( (alien5topx - 40), (alien5topy + 10 ), 10, 10 ) ;
	
	g.fillRect( (alien5topx + 40), (alien5topy + 10), 10, 10 ) ;
	
	//third row
	
	g.setColor(Color.yellow) ; 
	
	g.fillRect( (alien5topx ), (alien5topy + 20), 10, 10 ) ;
	
	g.fillRect( (alien5topx + 10 ), (alien5topy + 20), 10, 10 ) ;
	g.fillRect( (alien5topx - 10), (alien5topy + 20), 10, 10 ) ;
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alien5topx - 30), (alien5topy + 20 ), 10, 10 ) ;
	
	g.fillRect( (alien5topx + 30), (alien5topy + 20 ), 10, 10 ) ;
	
	
	g.fillRect( (alien5topx - 40), (alien5topy + 20 ), 10, 10 ) ;
	
	g.fillRect( (alien5topx + 40), (alien5topy + 20), 10, 10 ) ;
	
	//fourth row
		
	g.setColor(Color.yellow) ; 
	
	g.fillRect( (alien5topx ), (alien5topy + 30), 10, 10 ) ;
	
	g.fillRect( (alien5topx + 10 ), (alien5topy + 30), 10, 10 ) ;
	g.fillRect( (alien5topx - 10), (alien5topy + 30), 10, 10 ) ;
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alien5topx - 30), (alien5topy + 30 ), 10, 10 ) ;
	
	g.fillRect( (alien5topx + 30), (alien5topy + 30 ), 10, 10 ) ;
	
	
	g.fillRect( (alien5topx - 40), (alien5topy + 30 ), 10, 10 ) ;
	
	g.fillRect( (alien5topx + 40), (alien5topy + 30), 10, 10 ) ;
	
	//fifth row
	
		g.setColor(Color.pink) ; 
	
	g.fillRect( (alien5topx ), (alien5topy + 40), 10, 10 ) ;
	
	g.fillRect( (alien5topx + 10 ), (alien5topy + 40), 10, 10 ) ;
	
	g.fillRect( (alien5topx - 10), (alien5topy + 40), 10, 10 ) ;
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alien5topx - 30), (alien5topy + 40 ), 10, 10 ) ;
	
	g.fillRect( (alien5topx + 30), (alien5topy + 40 ), 10, 10 ) ;
	
	//sixth row
	
	g.setColor(Color.pink) ; 
	
	g.fillRect( (alien5topx ), (alien5topy + 50), 10, 10 ) ;
	
	g.fillRect( (alien5topx + 10 ), (alien5topy + 50), 10, 10 ) ;
	
	g.fillRect( (alien5topx - 10), (alien5topy + 50), 10, 10 ) ;
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alien5topx - 20), (alien5topy + 50 ), 10, 10 ) ;
	
	g.fillRect( (alien5topx + 20), (alien5topy + 50 ), 10, 10 ) ;
	
	g.fillRect( (alien5topx - 30), (alien5topy + 50 ), 10, 10 ) ;
	
	g.fillRect( (alien5topx + 30), (alien5topy + 50 ), 10, 10 ) ;
	
	//seventh row
	
	g.setColor(Color.yellow) ; 
	
	g.fillRect( (alien5topx ), (alien5topy + 60), 10, 10 ) ;
	
	g.fillRect( (alien5topx + 10 ), (alien5topy + 60), 10, 10 ) ;
	
	g.fillRect( (alien5topx - 10), (alien5topy + 60), 10, 10 ) ;
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alien5topx - 20), (alien5topy + 60 ), 10, 10 ) ;
	
	g.fillRect( (alien5topx + 20), (alien5topy + 60 ), 10, 10 ) ;
	
	g.fillRect( (alien5topx - 30), (alien5topy + 60 ), 10, 10 ) ;
	
	g.fillRect( (alien5topx + 30), (alien5topy + 60 ), 10, 10 ) ;
	
	//eighth row
	
	g.setColor(Color.yellow) ; 
	
	g.fillRect( (alien5topx ), (alien5topy + 70), 10, 10 ) ;
	
	g.fillRect( (alien5topx + 10 ), (alien5topy + 70), 10, 10 ) ;
	
	g.fillRect( (alien5topx - 10), (alien5topy + 70), 10, 10 ) ;
	
	g.fillRect( (alien5topx - 20), (alien5topy + 70 ), 10, 10 ) ;
	
	g.fillRect( (alien5topx + 20), (alien5topy + 70 ), 10, 10 ) ;
	
	//ninth
	g.setColor(Color.yellow) ; 
	
	g.fillRect( (alien5topx ), (alien5topy + 80), 10, 10 ) ;
	
	g.setColor(Color.pink) ; 
	
	g.fillRect( (alien5topx + 10 ), (alien5topy + 80), 10, 10 ) ;
	
	g.fillRect( (alien5topx - 10), (alien5topy + 80), 10, 10 ) ;
	

	
	g.fillRect( (alien5topx - 20), (alien5topy + 80 ), 10, 10 ) ;
	
	g.fillRect( (alien5topx + 20), (alien5topy + 80 ), 10, 10 ) ;
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alien5topx - 30), (alien5topy + 80 ), 10, 10 ) ;
	
	g.fillRect( (alien5topx + 30), (alien5topy + 80 ), 10, 10 ) ;
	
	//tenth
	g.setColor(Color.yellow) ; 
	
	g.fillRect( (alien5topx ), (alien5topy + 90), 10, 10 ) ;
	
	g.setColor(Color.pink) ; 
	
	g.fillRect( (alien5topx + 10 ), (alien5topy + 90), 10, 10 ) ;
	
	g.fillRect( (alien5topx - 10), (alien5topy + 90), 10, 10 ) ;
	
	g.setColor(Color.yellow) ; 
	
	g.fillRect( (alien5topx - 20), (alien5topy + 90 ), 10, 10 ) ;
	
	g.fillRect( (alien5topx + 20), (alien5topy + 90 ), 10, 10 ) ;
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alien5topx - 40), (alien5topy + 90 ), 10, 10 ) ;
	
	g.fillRect( (alien5topx + 40), (alien5topy + 90 ), 10, 10 ) ;
	
	//eleventh 
	
	g.setColor(Color.yellow) ; 
	
	g.fillRect( (alien5topx ), (alien5topy + 100), 10, 10 ) ;
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alien5topx - 40), (alien5topy + 100 ), 10, 10 ) ;
	
	g.fillRect( (alien5topx + 40), (alien5topy + 100 ), 10, 10 ) ;
	
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	}
	
	
		// sxith alien
	
	//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	if (alien6 == 1) 
	{
	//first row
	g.setColor(Color.pink) ; 
	
	g.fillRect( (alien6topx), (alien6topy ), 10, 10 ) ;
	
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alien6topx - 30), (alien6topy ), 10, 10 ) ;
	
	g.fillRect( (alien6topx + 30), (alien6topy ), 10, 10 ) ;
	
	
	g.fillRect( (alien6topx - 40), (alien6topy ), 10, 10 ) ;
	
	g.fillRect( (alien6topx + 40), (alien6topy ), 10, 10 ) ;
	

	
	//secdon row
	
	g.setColor(Color.pink) ; 
	
	g.fillRect( (alien6topx ), (alien6topy + 10), 10, 10 ) ;
	
	g.fillRect( (alien6topx + 10 ), (alien6topy + 10), 10, 10 ) ;
	g.fillRect( (alien6topx - 10), (alien6topy + 10), 10, 10 ) ;
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alien6topx - 30), (alien6topy + 10 ), 10, 10 ) ;
	
	g.fillRect( (alien6topx + 30), (alien6topy + 10 ), 10, 10 ) ;
	
	
	g.fillRect( (alien6topx - 40), (alien6topy + 10 ), 10, 10 ) ;
	
	g.fillRect( (alien6topx + 40), (alien6topy + 10), 10, 10 ) ;
	
	//third row
	
	g.setColor(Color.yellow) ; 
	
	g.fillRect( (alien6topx ), (alien6topy + 20), 10, 10 ) ;
	
	g.fillRect( (alien6topx + 10 ), (alien6topy + 20), 10, 10 ) ;
	g.fillRect( (alien6topx - 10), (alien6topy + 20), 10, 10 ) ;
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alien6topx - 30), (alien6topy + 20 ), 10, 10 ) ;
	
	g.fillRect( (alien6topx + 30), (alien6topy + 20 ), 10, 10 ) ;
	
	
	g.fillRect( (alien6topx - 40), (alien6topy + 20 ), 10, 10 ) ;
	
	g.fillRect( (alien6topx + 40), (alien6topy + 20), 10, 10 ) ;
	
	//fourth row
		
	g.setColor(Color.yellow) ; 
	
	g.fillRect( (alien6topx ), (alien6topy + 30), 10, 10 ) ;
	
	g.fillRect( (alien6topx + 10 ), (alien6topy + 30), 10, 10 ) ;
	g.fillRect( (alien6topx - 10), (alien6topy + 30), 10, 10 ) ;
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alien6topx - 30), (alien6topy + 30 ), 10, 10 ) ;
	
	g.fillRect( (alien6topx + 30), (alien6topy + 30 ), 10, 10 ) ;
	
	
	g.fillRect( (alien6topx - 40), (alien6topy + 30 ), 10, 10 ) ;
	
	g.fillRect( (alien6topx + 40), (alien6topy + 30), 10, 10 ) ;
	
	//fifth row
	
		g.setColor(Color.pink) ; 
	
	g.fillRect( (alien6topx ), (alien6topy + 40), 10, 10 ) ;
	
	g.fillRect( (alien6topx + 10 ), (alien6topy + 40), 10, 10 ) ;
	
	g.fillRect( (alien6topx - 10), (alien6topy + 40), 10, 10 ) ;
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alien6topx - 30), (alien6topy + 40 ), 10, 10 ) ;
	
	g.fillRect( (alien6topx + 30), (alien6topy + 40 ), 10, 10 ) ;
	
	//sixth row
	
	g.setColor(Color.pink) ; 
	
	g.fillRect( (alien6topx ), (alien6topy + 50), 10, 10 ) ;
	
	g.fillRect( (alien6topx + 10 ), (alien6topy + 50), 10, 10 ) ;
	
	g.fillRect( (alien6topx - 10), (alien6topy + 50), 10, 10 ) ;
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alien6topx - 20), (alien6topy + 50 ), 10, 10 ) ;
	
	g.fillRect( (alien6topx + 20), (alien6topy + 50 ), 10, 10 ) ;
	
	g.fillRect( (alien6topx - 30), (alien6topy + 50 ), 10, 10 ) ;
	
	g.fillRect( (alien6topx + 30), (alien6topy + 50 ), 10, 10 ) ;
	
	//seventh row
	
	g.setColor(Color.yellow) ; 
	
	g.fillRect( (alien6topx ), (alien6topy + 60), 10, 10 ) ;
	
	g.fillRect( (alien6topx + 10 ), (alien6topy + 60), 10, 10 ) ;
	
	g.fillRect( (alien6topx - 10), (alien6topy + 60), 10, 10 ) ;
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alien6topx - 20), (alien6topy + 60 ), 10, 10 ) ;
	
	g.fillRect( (alien6topx + 20), (alien6topy + 60 ), 10, 10 ) ;
	
	g.fillRect( (alien6topx - 30), (alien6topy + 60 ), 10, 10 ) ;
	
	g.fillRect( (alien6topx + 30), (alien6topy + 60 ), 10, 10 ) ;
	
	//eighth row
	
	g.setColor(Color.yellow) ; 
	
	g.fillRect( (alien6topx ), (alien6topy + 70), 10, 10 ) ;
	
	g.fillRect( (alien6topx + 10 ), (alien6topy + 70), 10, 10 ) ;
	
	g.fillRect( (alien6topx - 10), (alien6topy + 70), 10, 10 ) ;
	
	g.fillRect( (alien6topx - 20), (alien6topy + 70 ), 10, 10 ) ;
	
	g.fillRect( (alien6topx + 20), (alien6topy + 70 ), 10, 10 ) ;
	
	//ninth
	g.setColor(Color.yellow) ; 
	
	g.fillRect( (alien6topx ), (alien6topy + 80), 10, 10 ) ;
	
	g.setColor(Color.pink) ; 
	
	g.fillRect( (alien6topx + 10 ), (alien6topy + 80), 10, 10 ) ;
	
	g.fillRect( (alien6topx - 10), (alien6topy + 80), 10, 10 ) ;
	

	
	g.fillRect( (alien6topx - 20), (alien6topy + 80 ), 10, 10 ) ;
	
	g.fillRect( (alien6topx + 20), (alien6topy + 80 ), 10, 10 ) ;
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alien6topx - 30), (alien6topy + 80 ), 10, 10 ) ;
	
	g.fillRect( (alien6topx + 30), (alien6topy + 80 ), 10, 10 ) ;
	
	//tenth
	g.setColor(Color.yellow) ; 
	
	g.fillRect( (alien6topx ), (alien6topy + 90), 10, 10 ) ;
	
	g.setColor(Color.pink) ; 
	
	g.fillRect( (alien6topx + 10 ), (alien6topy + 90), 10, 10 ) ;
	
	g.fillRect( (alien6topx - 10), (alien6topy + 90), 10, 10 ) ;
	
	g.setColor(Color.yellow) ; 
	
	g.fillRect( (alien6topx - 20), (alien6topy + 90 ), 10, 10 ) ;
	
	g.fillRect( (alien6topx + 20), (alien6topy + 90 ), 10, 10 ) ;
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alien6topx - 40), (alien6topy + 90 ), 10, 10 ) ;
	
	g.fillRect( (alien6topx + 40), (alien6topy + 90 ), 10, 10 ) ;
	
	//eleventh 
	
	g.setColor(Color.yellow) ; 
	
	g.fillRect( (alien6topx ), (alien6topy + 100), 10, 10 ) ;
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alien6topx - 40), (alien6topy + 100 ), 10, 10 ) ;
	
	g.fillRect( (alien6topx + 40), (alien6topy + 100 ), 10, 10 ) ;
	
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	}
	
		// seventh alien
	
	//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	if (alien7 == 1)
	{
	//first row
	g.setColor(Color.pink) ; 
	
	g.fillRect( (alien7topx), (alien7topy ), 10, 10 ) ;
	
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alien7topx - 30), (alien7topy ), 10, 10 ) ;
	
	g.fillRect( (alien7topx + 30), (alien7topy ), 10, 10 ) ;
	
	
	g.fillRect( (alien7topx - 40), (alien7topy ), 10, 10 ) ;
	
	g.fillRect( (alien7topx + 40), (alien7topy ), 10, 10 ) ;
	

	
	//secdon row
	
	g.setColor(Color.pink) ; 
	
	g.fillRect( (alien7topx ), (alien7topy + 10), 10, 10 ) ;
	
	g.fillRect( (alien7topx + 10 ), (alien7topy + 10), 10, 10 ) ;
	g.fillRect( (alien7topx - 10), (alien7topy + 10), 10, 10 ) ;
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alien7topx - 30), (alien7topy + 10 ), 10, 10 ) ;
	
	g.fillRect( (alien7topx + 30), (alien7topy + 10 ), 10, 10 ) ;
	
	
	g.fillRect( (alien7topx - 40), (alien7topy + 10 ), 10, 10 ) ;
	
	g.fillRect( (alien7topx + 40), (alien7topy + 10), 10, 10 ) ;
	
	//third row
	
	g.setColor(Color.yellow) ; 
	
	g.fillRect( (alien7topx ), (alien7topy + 20), 10, 10 ) ;
	
	g.fillRect( (alien7topx + 10 ), (alien7topy + 20), 10, 10 ) ;
	g.fillRect( (alien7topx - 10), (alien7topy + 20), 10, 10 ) ;
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alien7topx - 30), (alien7topy + 20 ), 10, 10 ) ;
	
	g.fillRect( (alien7topx + 30), (alien7topy + 20 ), 10, 10 ) ;
	
	
	g.fillRect( (alien7topx - 40), (alien7topy + 20 ), 10, 10 ) ;
	
	g.fillRect( (alien7topx + 40), (alien7topy + 20), 10, 10 ) ;
	
	//fourth row
		
	g.setColor(Color.yellow) ; 
	
	g.fillRect( (alien7topx ), (alien7topy + 30), 10, 10 ) ;
	
	g.fillRect( (alien7topx + 10 ), (alien7topy + 30), 10, 10 ) ;
	g.fillRect( (alien7topx - 10), (alien7topy + 30), 10, 10 ) ;
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alien7topx - 30), (alien7topy + 30 ), 10, 10 ) ;
	
	g.fillRect( (alien7topx + 30), (alien7topy + 30 ), 10, 10 ) ;
	
	
	g.fillRect( (alien7topx - 40), (alien7topy + 30 ), 10, 10 ) ;
	
	g.fillRect( (alien7topx + 40), (alien7topy + 30), 10, 10 ) ;
	
	//fifth row
	
		g.setColor(Color.pink) ; 
	
	g.fillRect( (alien7topx ), (alien7topy + 40), 10, 10 ) ;
	
	g.fillRect( (alien7topx + 10 ), (alien7topy + 40), 10, 10 ) ;
	
	g.fillRect( (alien7topx - 10), (alien7topy + 40), 10, 10 ) ;
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alien7topx - 30), (alien7topy + 40 ), 10, 10 ) ;
	
	g.fillRect( (alien7topx + 30), (alien7topy + 40 ), 10, 10 ) ;
	
	//sixth row
	
	g.setColor(Color.pink) ; 
	
	g.fillRect( (alien7topx ), (alien7topy + 50), 10, 10 ) ;
	
	g.fillRect( (alien7topx + 10 ), (alien7topy + 50), 10, 10 ) ;
	
	g.fillRect( (alien7topx - 10), (alien7topy + 50), 10, 10 ) ;
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alien7topx - 20), (alien7topy + 50 ), 10, 10 ) ;
	
	g.fillRect( (alien7topx + 20), (alien7topy + 50 ), 10, 10 ) ;
	
	g.fillRect( (alien7topx - 30), (alien7topy + 50 ), 10, 10 ) ;
	
	g.fillRect( (alien7topx + 30), (alien7topy + 50 ), 10, 10 ) ;
	
	//seventh row
	
	g.setColor(Color.yellow) ; 
	
	g.fillRect( (alien7topx ), (alien7topy + 60), 10, 10 ) ;
	
	g.fillRect( (alien7topx + 10 ), (alien7topy + 60), 10, 10 ) ;
	
	g.fillRect( (alien7topx - 10), (alien7topy + 60), 10, 10 ) ;
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alien7topx - 20), (alien7topy + 60 ), 10, 10 ) ;
	
	g.fillRect( (alien7topx + 20), (alien7topy + 60 ), 10, 10 ) ;
	
	g.fillRect( (alien7topx - 30), (alien7topy + 60 ), 10, 10 ) ;
	
	g.fillRect( (alien7topx + 30), (alien7topy + 60 ), 10, 10 ) ;
	
	//eighth row
	
	g.setColor(Color.yellow) ; 
	
	g.fillRect( (alien7topx ), (alien7topy + 70), 10, 10 ) ;
	
	g.fillRect( (alien7topx + 10 ), (alien7topy + 70), 10, 10 ) ;
	
	g.fillRect( (alien7topx - 10), (alien7topy + 70), 10, 10 ) ;
	
	g.fillRect( (alien7topx - 20), (alien7topy + 70 ), 10, 10 ) ;
	
	g.fillRect( (alien7topx + 20), (alien7topy + 70 ), 10, 10 ) ;
	
	//ninth
	g.setColor(Color.yellow) ; 
	
	g.fillRect( (alien7topx ), (alien7topy + 80), 10, 10 ) ;
	
	g.setColor(Color.pink) ; 
	
	g.fillRect( (alien7topx + 10 ), (alien7topy + 80), 10, 10 ) ;
	
	g.fillRect( (alien7topx - 10), (alien7topy + 80), 10, 10 ) ;
	

	
	g.fillRect( (alien7topx - 20), (alien7topy + 80 ), 10, 10 ) ;
	
	g.fillRect( (alien7topx + 20), (alien7topy + 80 ), 10, 10 ) ;
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alien7topx - 30), (alien7topy + 80 ), 10, 10 ) ;
	
	g.fillRect( (alien7topx + 30), (alien7topy + 80 ), 10, 10 ) ;
	
	//tenth
	g.setColor(Color.yellow) ; 
	
	g.fillRect( (alien7topx ), (alien7topy + 90), 10, 10 ) ;
	
	g.setColor(Color.pink) ; 
	
	g.fillRect( (alien7topx + 10 ), (alien7topy + 90), 10, 10 ) ;
	
	g.fillRect( (alien7topx - 10), (alien7topy + 90), 10, 10 ) ;
	
	g.setColor(Color.yellow) ; 
	
	g.fillRect( (alien7topx - 20), (alien7topy + 90 ), 10, 10 ) ;
	
	g.fillRect( (alien7topx + 20), (alien7topy + 90 ), 10, 10 ) ;
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alien7topx - 40), (alien7topy + 90 ), 10, 10 ) ;
	
	g.fillRect( (alien7topx + 40), (alien7topy + 90 ), 10, 10 ) ;
	
	//eleventh 
	
	g.setColor(Color.yellow) ; 
	
	g.fillRect( (alien7topx ), (alien7topy + 100), 10, 10 ) ;
	
	g.setColor(Color.green) ; 
	
	g.fillRect( (alien7topx - 40), (alien7topy + 100 ), 10, 10 ) ;
	
	g.fillRect( (alien7topx + 40), (alien7topy + 100 ), 10, 10 ) ;
	
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		}

	if ((alien == 0) & (alien2 == 0) & (alien3 == 0) & (alien4 == 0) & (alien5 == 0) & (alien6 == 0) & (alien7 == 0))

	{
	g.setColor(Color.red) ; 
	g.drawString("GAME OVER!", 500, 500) ;
	
	}
	

	}//clsoign of paint

}//closing of scrolltext