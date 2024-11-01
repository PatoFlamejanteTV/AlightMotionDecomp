package com.mbridge.msdk.foundation.download;

/* loaded from: classes4.dex */
public enum DownloadResourceType {
    DOWNLOAD_RESOURCE_TYPE_VIDEO(0),
    DOWNLOAD_RESOURCE_TYPE_ZIP(1),
    DOWNLOAD_RESOURCE_TYPE_IMAGE(2),
    DOWNLOAD_RESOURCE_TYPE_HTML(3),
    DOWNLOAD_RESOURCE_TYPE_OTHER(4),
    DOWNLOAD_RESOURCE_TYPE_APK(5);

    public int resourceType;

    DownloadResourceType(int i8) {
        this.resourceType = i8;
    }

    public static DownloadResourceType getDownloadResourceType(int i8) {
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 3) {
                        if (i8 != 4) {
                            if (i8 != 5) {
                                return null;
                            }
                            return DOWNLOAD_RESOURCE_TYPE_APK;
                        }
                        return DOWNLOAD_RESOURCE_TYPE_OTHER;
                    }
                    return DOWNLOAD_RESOURCE_TYPE_HTML;
                }
                return DOWNLOAD_RESOURCE_TYPE_IMAGE;
            }
            return DOWNLOAD_RESOURCE_TYPE_ZIP;
        }
        return DOWNLOAD_RESOURCE_TYPE_VIDEO;
    }
}
