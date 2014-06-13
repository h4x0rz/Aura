package com.vp.aura.Controllers;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Context;

import com.estimote.sdk.Beacon;
import com.estimote.sdk.BeaconManager;
import com.estimote.sdk.Region;

public class AuraBeaconManager{
	

	public void Ranging(Context context)
	{
		// Configure BeaconManager.
		BeaconManager beaconManager = new BeaconManager(context);
		beaconManager.setRangingListener(new BeaconManager.RangingListener() {
			@Override
			public void onBeaconsDiscovered(Region region, final List<Beacon> beacons) {
				
						for(int i=0;i<=beacons.size()-1;i++)
						{
							String UUID = beacons.get(i).getProximityUUID();
							int major = beacons.get(i).getMajor();
							int minor = beacons.get(i).getMinor();

							String beaconRequest = "UUID="+UUID+"&major="+Integer.toString(major)+"&minor="+Integer.toString(minor);

							if(!knownBeacons.contains(beaconRequest))
							{
							knownBeacons.add(beaconRequest);
							new GetBeaconTask().execute("http://aura-core.herokuapp.com/api/beacons?" + beaconRequest);
							}
						}
						
						if(knownBeacons.size() > beacons.size())							
						{
							List<String> goneBeacons = new ArrayList<String>(knownBeacons);
							
							for(int n=0; n <= knownBeacons.size()-1; n++)
							{
								String UUID = beacons.get(n).getProximityUUID();
								int major = beacons.get(n).getMajor();
								int minor = beacons.get(n).getMinor();

								String beaconRequest = "UUID="+UUID+"&major="+Integer.toString(major)+"&minor="+Integer.toString(minor);
								if(goneBeacons.contains(beaconRequest))
								{
									goneBeacons.remove(beaconRequest);
								}
							}
							
							for(int v=0; v <= goneBeacons.size()-1; v++ )
							{
						    	new GetBeaconAndEndVisitTask().execute("http://aura-core.herokuapp.com/api/beacons?" + goneBeacons.get(v));
							}
						}

						// RestEasy.getBeacon(beacons.get(0).getProximityUUID(), beacons.get(0).getMajor(), beacons.get(0).getMinor());

						/* for(int i=0;i<=knownBeacons.size()-1;i++)
							{
							new GetBeaconTask().execute("http://aura-core.herokuapp.com/api/beacons?" + knownBeacons.get(i));
							} 
						*/

					}
				});
			}

	
}
