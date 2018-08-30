package com.gkatzioura.design.structural.proxy;

public class HttpDataUploadQuotaProxy implements DataUploadService {

    private final HttpDataUploadImpl httpDataUpload;

    public HttpDataUploadQuotaProxy(HttpDataUploadImpl httpDataUpload) {
        this.httpDataUpload = httpDataUpload;
    }

    @Override
    public void upload(String payload) {

        if(quotaExceeded()) {
            throw new IllegalStateException("Quota exceeded cannot upload payload");
        }

        httpDataUpload.upload(payload);
    }

    private boolean quotaExceeded() {

        /**
         * Code that should check whether we exceeded our quota or not
         */

        return false;
    }

}
