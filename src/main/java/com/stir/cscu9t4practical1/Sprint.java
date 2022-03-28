package com.stir.cscu9t4practical1;

public class Sprint extends Entry {
	
	private String activity;
	
	
	public Sprint(String n, int d, int m, int y, int h, int min, int s, float dist, String act)
	{
		super(n, d, m, y, h, min, s, dist);
		this.activity = act;
	}
	
	public String getActivity()
	{
		return activity;
	}
	
	public String getEntry () {
		  
		  String result = getName()+" ran " + getDistance() + " km in "
	             +getHour()+":"+getMin()+":"+ getSec() + " on "
	             +getDay()+"/"+getMonth()+"/"+getYear()+"\n";
	   return result;
	  }

}

