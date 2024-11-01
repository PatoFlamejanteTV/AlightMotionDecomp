package com.mbridge.msdk.foundation.download.download;

/* loaded from: classes4.dex */
public class DownLoadUtils {
    private static final int DOWNLOAD_CONNECTION_TIME_OUT = 20000;
    private static final int DOWNLOAD_READ_TIME_OUT = 30000;
    public static final String END_TAG = "<mbridgeloadend></mbridgeloadend>";
    private static final String TAG = "DownLoadUtils";

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:            r3.onFailed("url is error");     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:            return;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void getSourceCodeFromNetUrl(final java.lang.String r2, final com.mbridge.msdk.foundation.download.download.H5DownLoadManager.IOnDownLoadH5Source r3, final boolean r4) {
        /*
            boolean r0 = com.mbridge.msdk.foundation.tools.an.a(r2)     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L1c
            boolean r0 = android.webkit.URLUtil.isNetworkUrl(r2)     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto Ld
            goto L1c
        Ld:
            com.mbridge.msdk.foundation.download.download.DownloadTask r0 = com.mbridge.msdk.foundation.download.download.DownloadTask.getInstance()     // Catch: java.lang.Throwable -> L1a
            com.mbridge.msdk.foundation.download.download.DownLoadUtils$1 r1 = new com.mbridge.msdk.foundation.download.download.DownLoadUtils$1     // Catch: java.lang.Throwable -> L1a
            r1.<init>()     // Catch: java.lang.Throwable -> L1a
            r0.runTask(r1)     // Catch: java.lang.Throwable -> L1a
            goto L2b
        L1a:
            r2 = move-exception
            goto L24
        L1c:
            if (r3 == 0) goto L23
            java.lang.String r2 = "url is error"
            r3.onFailed(r2)     // Catch: java.lang.Throwable -> L1a
        L23:
            return
        L24:
            boolean r3 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r3 == 0) goto L2b
            r2.printStackTrace()
        L2b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.download.download.DownLoadUtils.getSourceCodeFromNetUrl(java.lang.String, com.mbridge.msdk.foundation.download.download.H5DownLoadManager$IOnDownLoadH5Source, boolean):void");
    }
}
