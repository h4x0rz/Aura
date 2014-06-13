package com.vp.aura.Models;

public class Visit {
	
	private Integer id;
	private String start_time;
	private Object end_time;
	private Integer company_id;
	private String device_uuid;
	private Integer region_id;
	private String region_type;
	
	public Integer getId() {
		return id;
		}

		public void setId(Integer id) {
		this.id = id;
		}

		public String getStart_time() {
		return start_time;
		}

		public void setStart_time(String start_time) {
		this.start_time = start_time;
		}

		public Object getEnd_time() {
		return end_time;
		}

		public void setEnd_time(Object end_time) {
		this.end_time = end_time;
		}

		public Integer getCompany_id() {
		return company_id;
		}

		public void setCompany_id(Integer company_id) {
		this.company_id = company_id;
		}

		public String getDevice_uuid() {
		return device_uuid;
		}

		public void setDevice_uuid(String device_uuid) {
		this.device_uuid = device_uuid;
		}

		public Integer getRegion_id() {
		return region_id;
		}

		public void setRegion_id(Integer region_id) {
		this.region_id = region_id;
		}

		public String getRegion_type() {
		return region_type;
		}

		public void setRegion_type(String region_type) {
		this.region_type = region_type;
		}

}
