package com.vp.aura.Models;

public class Region {
	
	private Integer id;
	private String region_type;
	private Double latitude;
	private Double longitude;
	private Integer radius;
	private Boolean notify_on_entry;
	private Boolean notify_on_exit;
	private Integer company_id;
	
	public Integer getId() {
		return id;
		}

		public void setId(Integer id) {
		this.id = id;
		}

		public String getRegion_type() {
		return region_type;
		}

		public void setRegion_type(String region_type) {
		this.region_type = region_type;
		}

		public Double getLatitude() {
		return latitude;
		}

		public void setLatitude(Double latitude) {
		this.latitude = latitude;
		}

		public Double getLongitude() {
		return longitude;
		}

		public void setLongitude(Double longitude) {
		this.longitude = longitude;
		}

		public Integer getRadius() {
		return radius;
		}

		public void setRadius(Integer radius) {
		this.radius = radius;
		}

		public Boolean getNotify_on_entry() {
		return notify_on_entry;
		}

		public void setNotify_on_entry(Boolean notify_on_entry) {
		this.notify_on_entry = notify_on_entry;
		}

		public Boolean getNotify_on_exit() {
		return notify_on_exit;
		}

		public void setNotify_on_exit(Boolean notify_on_exit) {
		this.notify_on_exit = notify_on_exit;
		}

		public Integer getCompany_id() {
		return company_id;
		}

		public void setCompany_id(Integer company_id) {
		this.company_id = company_id;
		}

}
