package com.wellsfargo.syrein.domain;

import java.util.Date;

public class SolarFlipFund extends BaseEntity {
	private int lifeTerm;
	private Date forecastTermEndDate;

	public int getLifeTerm() {
		return lifeTerm;
	}

	public void setLifeTerm(int lifeTerm) {
		this.lifeTerm = lifeTerm;
	}

	public Date getForecastTermEndDate() {
		return forecastTermEndDate;
	}

	public void setForecastTermEndDate(Date forecastTermEndDate) {
		this.forecastTermEndDate = forecastTermEndDate;
	}
	
	@Override
	public AssetType getAssetType() {
		return AssetType.SolarFlip;
	}
	
}
