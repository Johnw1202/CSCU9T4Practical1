package com.stir.cscu9t4practical1;

public class Cycle extends Entry {
	
	private String activity;
	private boolean headwind;
	
	
	public Cycle(String n, int d, int m, int y, int h, int min, int s, float dist, String act, boolean hw)
	{
		super(n, d, m, y, h, min, s, dist);
		this.activity = act;
		this.headwind = hw;
	}
	
	public String getActivity()
	{
		return activity;
	}
	
	public boolean isHeadwind()
	{
		return headwind;
	}

	public String getEntry () {
		  
		if (headwind == true) 
		{
		String result = getName()+" cycled " + getDistance() + " km in "
	             +getHour()+":"+getMin()+":"+ getSec() + " on "
	             +getDay()+"/"+getMonth()+"/"+getYear() + "Headwind: Yes" + "\n";
	   return result;
		}
		else {
			String result = getName()+" cycled " + getDistance() + " km in "
		             +getHour()+":"+getMin()+":"+ getSec() + " on "
		             +getDay()+"/"+getMonth()+"/"+getYear() + "Headwind: No" + "\n";
		   return result;
			}
	  }
	
}

