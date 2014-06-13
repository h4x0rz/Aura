package com.vp.aura.Models;

import java.util.ArrayList;
import java.util.List;


public class BeaconObject {

		private String uuid;
		private Integer major;
		private Integer minor;
		private Integer tx_power;
		private Integer exit_timeout;
		private String description;
		private Integer company_id;
		private Integer region_id;
		private Integer site_id;
		private Integer site_region_id;

		public String getUuid() {
			return uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public Integer getMajor() {
			return major;
		}

		public void setMajor(Integer major) {
			this.major = major;
		}

		public Integer getMinor() {
			return minor;
		}

		public void setMinor(Integer minor) {
			this.minor = minor;
		}

		public Integer getTx_power() {
			return tx_power;
		}

		public void setTx_power(Integer tx_power) {
			this.tx_power = tx_power;
		}

		public Integer getExit_timeout() {
			return exit_timeout;
		}

		public void setExit_timeout(Integer exit_timeout) {
			this.exit_timeout = exit_timeout;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Integer getCompany_id() {
			return company_id;
		}

		public void setCompany_id(Integer company_id) {
			this.company_id = company_id;
		}

		public Integer getRegion_id() {
			return region_id;
		}

		public void setRegion_id(Integer region_id) {
			this.region_id = region_id;
		}

		public Integer getSite_id() {
			return site_id;
		}

		public void setSite_id(Integer site_id) {
			this.site_id = site_id;
		}

		public Integer getSite_region_id() {
			return site_region_id;
		}


	}