package com.mbridge.msdk.foundation.download.download;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.a.b;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.b.e;
import com.mbridge.msdk.foundation.same.e.a;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.aa;
import com.mbridge.msdk.foundation.tools.ab;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ao;
import java.io.File;
import java.util.List;

/* loaded from: classes4.dex */
public class ResourceManager {
    public static final int EXPIRE_TIME = 259200000;
    public static final String KEY_INDEX_HTML = "foldername";
    public static final String KEY_MD5CHECK = "nc";
    public static final String KEY_MD5FILENAME = "md5filename";
    private static String TAG = "ResourceManager";
    private String mFileSaveSDDir;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class ResourceManagerHolder {
        public static ResourceManager instance = new ResourceManager();

        private ResourceManagerHolder() {
        }
    }

    public static ResourceManager getinstance() {
        return ResourceManagerHolder.instance;
    }

    private String save(String str, String str2, File file) {
        String b9 = ab.b(str2, this.mFileSaveSDDir + "/" + SameMD5.getMD5(ao.b(str)));
        if (TextUtils.isEmpty(b9)) {
            return ab.a(file);
        }
        return b9;
    }

    public void cleanZipRes() {
        try {
            if (!TextUtils.isEmpty(this.mFileSaveSDDir)) {
                DownloadTask.getInstance().runTask(new a() { // from class: com.mbridge.msdk.foundation.download.download.ResourceManager.1
                    @Override // com.mbridge.msdk.foundation.same.e.a
                    public void cancelTask() {
                    }

                    @Override // com.mbridge.msdk.foundation.same.e.a
                    public void pauseTask(boolean z8) {
                    }

                    @Override // com.mbridge.msdk.foundation.same.e.a
                    public void runTask() {
                        ab.a(ResourceManager.this.mFileSaveSDDir);
                    }
                });
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
    }

    public String getResDirFromCampaign(String str) {
        String str2;
        String str3 = "";
        try {
            String str4 = this.mFileSaveSDDir + "/" + SameMD5.getMD5(ao.b(str));
            List<String> queryParameters = Uri.parse(str).getQueryParameters(KEY_INDEX_HTML);
            ad.a(TAG, "check zip 下载情况：url:" + str);
            ad.a(TAG, "check zip 下载情况：indexHtml:" + queryParameters);
            if (queryParameters != null && queryParameters.size() > 0) {
                String str5 = queryParameters.get(0);
                if (!TextUtils.isEmpty(str5)) {
                    String str6 = str4 + "/" + str5 + "/" + str5 + ".html";
                    if (ab.d(str6)) {
                        g b9 = h.a().b(c.m().k());
                        if (b9 != null && !TextUtils.isEmpty(b9.V())) {
                            File file = new File(str6);
                            ab.a(b.c(B1.b.a(MBridgeConstans.OMID_JS_SERVICE_CONTENT, ab.b(file))).getBytes(), file);
                        }
                        try {
                            str2 = str.substring(str.indexOf("?") + 1);
                        } catch (Exception unused) {
                            str2 = "";
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            str3 = "?" + str2;
                        }
                        return "file://" + str6 + str3;
                    }
                    return null;
                }
                return null;
            }
            return null;
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
                return null;
            }
            return null;
        }
    }

    public void init() {
        this.mFileSaveSDDir = e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_RES);
    }

    public synchronized String saveResFile(String str, byte[] bArr) {
        String message;
        String str2 = "unknow exception ";
        if (bArr != null) {
            try {
                try {
                    if (bArr.length > 0) {
                        String str3 = this.mFileSaveSDDir + "/" + SameMD5.getMD5(ao.b(str)) + ".zip";
                        File file = new File(str3);
                        if (ab.a(bArr, file)) {
                            Uri parse = Uri.parse(str);
                            List<String> queryParameters = parse.getQueryParameters(KEY_MD5CHECK);
                            if (queryParameters != null && queryParameters.size() != 0) {
                                str2 = save(str, str3, file);
                            }
                            List<String> queryParameters2 = parse.getQueryParameters(KEY_MD5FILENAME);
                            if (queryParameters2 != null && queryParameters2.size() > 0) {
                                String str4 = queryParameters2.get(0);
                                if (!TextUtils.isEmpty(str4) && str4.equals(aa.a(file))) {
                                    str2 = save(str, str3, file);
                                }
                            }
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            ab.a(file);
                        }
                    }
                } catch (Exception e8) {
                    if (MBridgeConstans.DEBUG) {
                        e8.printStackTrace();
                    }
                    message = e8.getMessage();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        message = str2;
        return message;
    }

    private ResourceManager() {
        init();
    }
}
