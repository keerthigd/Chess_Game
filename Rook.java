package Rook_pack;
import Piece_pack.*;
import Board_pack.*;
public class Rook extends Piece
{

public Rook(int a1,int b1,String col)
	{
		a=a1;
		b=b1;
		colour=col;
	}
	
	public boolean Possible(int c,int d)
	{
	   int diff_x=c-a;
		int diff_y=d-b;
		boolean result=false;
		Piece tpiece;
		int start=0,end=0;
		int count=0;
		if(diff_x==0 && diff_y!=0)
		{
			if(diff_y>0)
			{
				start=b+1;
				end=d-1;
				for(int y1=start;y1<=end;y1++)
				{
					tpiece=Board.Board_piece[a][y1];
						
						if(tpiece==null)
						{
							count++;
						}
						else
						{
							break;
						}
				}
					
					
			}
		
			else if(diff_y<0)
			{
				start=d+1;
				end=b-1;
				for(int y2=start;y2<=end;y2++)
				{
					tpiece=Board.Board_piece[a][y2];
					
					    if(tpiece==null)
						{
							count++;
						}
						else
						{
							break;
						}
				
				}
				
			}
		
			if(count==(end-start+1))
				{
					tpiece=Board.Board_piece[c][d];
					
						if(tpiece==null)
						{
							result=true;
						}
						else if(tpiece!=null)
						{
							if(!tpiece.colour.equals(colour))
							{
								result=true;
							}
				        }
				}		
		}
	else if(diff_y==0 && diff_x!=0)
	{
						count=0;

		            if(diff_x>0)
					{
						start=a+1;
						end=c-1;
						for(int i=start;i<=end;i++)
					      {
						tpiece=Board.Board_piece[i][b];
						
							if(tpiece==null)
							{
								count++;
							}
							else
							{
								break;
							}
					      }
					
						
					}	
					else if(diff_x<0)
					{
						start=c+1;
						end=a-1;
						for(int i=start;i<=end;i++)
					     {
						    tpiece=Board.Board_piece[i][b];
						
							if(tpiece==null)
							{
								count++;
							}
							else
							{
								break;
							}
					      }
				
					}
				
				
					
					if(count==(end-start+1))
					{
						tpiece=Board.Board_piece[c][d];
						
							if(tpiece==null)
							{
								result=true;
							}
							else if(tpiece!=null)
							{
								if(!tpiece.colour.equals(colour))
								{
									result=true;
								}
							}
					}
			
		
		
	}
	  
	return result;  
	
}
	  public String toString()
	{
		Class c=this.getClass();
		return colour.charAt(0)+" rk";
	}
	


}