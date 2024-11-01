package com.mbridge.msdk.foundation.download.utils;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipInputStream;

/* loaded from: classes4.dex */
public class UnzipUtility {
    private static final int BUFFER_SIZE = 4096;
    private static final String TAG = "UnzipUtility";

    private void extractFile(ZipInputStream zipInputStream, String str) throws IOException {
        File file = new File(str);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        BufferedOutputStream bufferedOutputStream = null;
        try {
            try {
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file));
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = zipInputStream.read(bArr);
                        if (read != -1) {
                            bufferedOutputStream2.write(bArr, 0, read);
                        } else {
                            bufferedOutputStream2.close();
                            return;
                        }
                    }
                } catch (IOException e8) {
                    e = e8;
                    throw new IOException(e);
                } catch (Throwable th) {
                    th = th;
                    bufferedOutputStream = bufferedOutputStream2;
                    if (bufferedOutputStream != null) {
                        bufferedOutputStream.close();
                    }
                    throw th;
                }
            } catch (IOException e9) {
                e = e9;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x00fe, code lost:            r14.close();     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0102, code lost:            r14 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0103, code lost:            com.mbridge.msdk.foundation.tools.ad.b(com.mbridge.msdk.foundation.download.utils.UnzipUtility.TAG, r14.getMessage());     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x011b, code lost:            r14.close();     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x011f, code lost:            r14 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0120, code lost:            com.mbridge.msdk.foundation.tools.ad.b(com.mbridge.msdk.foundation.download.utils.UnzipUtility.TAG, r14.getMessage());     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int unzip(java.lang.String r14, java.lang.String r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.download.utils.UnzipUtility.unzip(java.lang.String, java.lang.String):int");
    }
}
