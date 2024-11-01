package com.mbridge.msdk.foundation.download;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.core.GlobalComponent;
import com.mbridge.msdk.foundation.download.download.ResourceManager;
import com.mbridge.msdk.foundation.download.utils.ILogger;
import com.mbridge.msdk.foundation.same.net.g.b;
import com.mbridge.msdk.foundation.tools.ad;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class DownloadMessage<T> {
    private static final String TAG = "DownloadMessage";
    private boolean checkMD5;
    private int downloadRate;
    private DownloadResourceType downloadResourceType;
    private String downloadUrl;
    private Map<String, Object> extraData;
    private String host;
    private boolean isCache;
    private String md5;
    private T object;
    private String resourceUrl;
    private String saveFileName;
    private String saveFilePath;
    private int from = 0;
    private boolean isUseCronet = false;
    private int md5VerifyResult = 0;

    public DownloadMessage(T t8, String str, String str2, int i8, DownloadResourceType downloadResourceType) {
        this.checkMD5 = false;
        this.md5 = "";
        this.object = t8;
        this.downloadUrl = str;
        this.saveFileName = str2;
        this.downloadRate = i8;
        this.downloadResourceType = downloadResourceType;
        try {
            URL url = new URL(str);
            this.resourceUrl = url.getProtocol() + "://" + url.getHost() + url.getPath();
            ILogger logger = GlobalComponent.getInstance().getLogger();
            StringBuilder sb = new StringBuilder();
            sb.append(" resourceUrl: ");
            sb.append(this.resourceUrl);
            logger.log(TAG, sb.toString());
        } catch (MalformedURLException unused) {
            this.resourceUrl = "";
        }
        try {
            Uri parse = Uri.parse(str);
            String queryParameter = parse.getQueryParameter(ResourceManager.KEY_MD5CHECK);
            String queryParameter2 = parse.getQueryParameter(ResourceManager.KEY_MD5FILENAME);
            if (TextUtils.isEmpty(queryParameter) && !TextUtils.isEmpty(queryParameter2)) {
                this.checkMD5 = true;
                this.md5 = queryParameter2;
            }
        } catch (Throwable th) {
            GlobalComponent.getInstance().getLogger().log(TAG, th.getMessage());
        }
    }

    public void addExtra(String str, Object obj) {
        if (this.extraData == null) {
            this.extraData = new HashMap(4);
        }
        this.extraData.put(str, obj);
    }

    public boolean canUseCronet() {
        return this.isUseCronet;
    }

    public int getDownloadRate() {
        return this.downloadRate;
    }

    public DownloadResourceType getDownloadResourceType() {
        return this.downloadResourceType;
    }

    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public Object getExtra(String str) {
        Map<String, Object> map = this.extraData;
        if (map != null && map.containsKey(str)) {
            return this.extraData.get(str);
        }
        return null;
    }

    public int getFrom() {
        return this.from;
    }

    public String getMd5() {
        return this.md5;
    }

    public int getMd5VerifyResult() {
        return this.md5VerifyResult;
    }

    public T getObject() {
        return this.object;
    }

    public String getResourceUrl() {
        return this.resourceUrl;
    }

    public String getSaveFileName() {
        return this.saveFileName;
    }

    public String getSaveFilePath() {
        return this.saveFilePath;
    }

    public boolean isCache() {
        return this.isCache;
    }

    public boolean isCheckMD5() {
        return this.checkMD5;
    }

    public void setCache(boolean z8) {
        this.isCache = z8;
    }

    public void setCheckMD5(boolean z8) {
        this.checkMD5 = z8;
    }

    public void setDownloadRate(int i8) {
        this.downloadRate = i8;
    }

    public void setFrom(int i8) {
        this.from = i8;
    }

    public void setMd5(String str) {
        this.md5 = str;
    }

    public void setMd5VerifyResult(int i8) {
        this.md5VerifyResult = i8;
    }

    public void setSaveFilePath(String str) {
        this.saveFilePath = str;
    }

    public void setUseCronetDownload(int i8) {
        boolean z8 = true;
        if (i8 != 1 && i8 != 2) {
            z8 = false;
        }
        try {
            this.isUseCronet = z8;
            if (TextUtils.isEmpty(this.downloadUrl)) {
                return;
            }
            if (TextUtils.isEmpty(this.host)) {
                this.host = new URL(this.downloadUrl).getHost();
            }
            if (this.isUseCronet) {
                b.a(this.host);
            }
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
        }
    }
}
