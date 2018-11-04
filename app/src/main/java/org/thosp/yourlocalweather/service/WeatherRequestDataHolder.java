package org.thosp.yourlocalweather.service;

import java.io.Serializable;

public class WeatherRequestDataHolder implements Serializable {
    private final long locationId;
    private final String updateSource;
    private int attempts;
    private long timestamp;
    private boolean forceUpdate;

    public WeatherRequestDataHolder(long locationId, String updateSource) {
        this.locationId = locationId;
        this.updateSource = updateSource;
        this.attempts = 0;
        this.timestamp = System.currentTimeMillis();
        this.forceUpdate = false;
    }

    public WeatherRequestDataHolder(long locationId, String updateSource, boolean forceUpdate) {
        this.locationId = locationId;
        this.updateSource = updateSource;
        this.attempts = 0;
        this.timestamp = System.currentTimeMillis();
        this.forceUpdate = forceUpdate;
    }

    public void increaseAttempts() {
        attempts++;
    }

    public int getAttempts() {
        return attempts;
    }

    public long getLocationId() {
        return locationId;
    }

    public String getUpdateSource() {
        return updateSource;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public boolean isForceUpdate() {
        return forceUpdate;
    }

    @Override
    public String toString() {
        return "WeatherRequestDataHolder:locationId=" + locationId + ", updateSource="
                + updateSource + ", attempts=" + attempts + ", forceUpdate=" + forceUpdate;
    }
}
