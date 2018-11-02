package com.weather.domain.restAPI;

public class TemperatureDetails {
	
	private String temp_max;
	
	private String temp_min;
	
	private String temp;
	
	private String pressure;
	
	private String sea_level;
	
	private String grnd_level;
	
	private String humidity;
	
	private String temp_kf;
	
	public String getTemp_max() {
		return temp_max;
	}

	public void setTemp_max(String temp_max) {
		this.temp_max = temp_max;
	}

	public String getTemp_min() {
		return temp_min;
	}

	public void setTemp_min(String temp_min) {
		this.temp_min = temp_min;
	}

	public String getTemp() {
		return temp;
	}

	public void setTemp(String temp) {
		this.temp = temp;
	}

	public String getPressure() {
		return pressure;
	}

	public void setPressure(String pressure) {
		this.pressure = pressure;
	}

	public String getSea_level() {
		return sea_level;
	}

	public void setSea_level(String sea_level) {
		this.sea_level = sea_level;
	}

	public String getGrnd_level() {
		return grnd_level;
	}

	public void setGrnd_level(String grnd_level) {
		this.grnd_level = grnd_level;
	}

	public String getHumidity() {
		return humidity;
	}

	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}

	public String getTemp_kf() {
		return temp_kf;
	}

	public void setTemp_kf(String temp_kf) {
		this.temp_kf = temp_kf;
	}

}
