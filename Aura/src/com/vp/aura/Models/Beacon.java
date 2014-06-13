package com.vp.aura.Models;

import java.util.ArrayList;
import java.util.List;

public class Beacon {


	private List<BeaconObject> data = new ArrayList<BeaconObject>();

	private List<String> embeds = new ArrayList<String>();

	public List<BeaconObject> getData() {
		return data;
	}

	public void setData(List<BeaconObject> data) {
		this.data = data;
	}

	public List<String> getEmbeds() {
		return embeds;
	}

	public void setEmbeds(List<String> embeds) {
		this.embeds = embeds;
	}
}

