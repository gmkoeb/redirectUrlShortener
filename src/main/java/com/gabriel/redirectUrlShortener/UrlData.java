package com.gabriel.redirectUrlShortener;

public class UrlData {
    private String originalUrl;
    private long expirationTime;

    public UrlData() {}

    public UrlData(String originalUrl, long expirationTime){
        this.originalUrl = originalUrl;
        this.expirationTime = expirationTime;
    }

    public long getExpirationTime() { return expirationTime; }
    public void setExpirationTime() { this.expirationTime = expirationTime; }

    public String getOriginalUrl() { return originalUrl; }
    public void setOriginalUrl() { this.originalUrl = originalUrl; }
}
