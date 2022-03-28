package com.stir.cscu9t4practical1;

public class Swim extends Entry {
	
	private String activity;
	private boolean outdoors;
	
	
	public Swim(String n, int d, int m, int y, int h, int min, int s, float dist, String act, boolean od)
	{
		super(n, d, m, y, h, min, s, dist);
		this.activity = act;
		this.outdoors = od;
	}
	
	public String getActivity()
	{
		return activity;
	}
	
	public boolean isOutdoors()
	{
		return outdoors;
	}
	
	public String getEntry () {
		  
		if (outdoors == true) 
		{
		String result = getName()+" swam " + getDistance() + " km in "
	             +getHour()+":"+getMin()+":"+ getSec() + " on "
	             +getDay()+"/"+getMonth()+"/"+getYear() + "Location: Outdoors" + "\n";
	   return result;
		}
		else {
			String result = getName()+" swam " + getDistance() + " km in "
		             +getHour()+":"+getMin()+":"+ getSec() + " on "
		             +getDay()+"/"+getMonth()+"/"+getYear() + "Location: Indoors" + "\n";
		   return result;
			}
	  }

}

