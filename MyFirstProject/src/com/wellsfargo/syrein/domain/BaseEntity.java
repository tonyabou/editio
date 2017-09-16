package com.wellsfargo.syrein.domain;

import java.util.UUID;

public abstract class BaseEntity extends DomainEntity {
	
	private String primaryName;
	private AssetType assetType;
	public String getPrimaryName() {
		return primaryName;
	}
	public void setPrimaryName(String primaryName) {
		this.primaryName = primaryName;
	}
	public AssetType getAssetType() {
		return assetType;
	}
	public void setAssetType(AssetType assetType) {
		this.assetType = assetType;
	}
}
