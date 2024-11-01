package com.mbridge.msdk.videocommon.download;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Patterns;
import android.webkit.URLUtil;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.videocommon.download.e;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: c, reason: collision with root package name */
    private static d f24341c;

    /* renamed from: a, reason: collision with root package name */
    private CopyOnWriteArrayList<String> f24342a;

    /* renamed from: b, reason: collision with root package name */
    private ConcurrentMap<String, Object> f24343b;

    /* renamed from: d, reason: collision with root package name */
    private g f24344d;

    /* renamed from: e, reason: collision with root package name */
    private e f24345e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f24346f;

    /* renamed from: g, reason: collision with root package name */
    private final String f24347g = CampaignEx.JSON_KEY_LOCAL_REQUEST_ID;

    /* renamed from: h, reason: collision with root package name */
    private final String f24348h = "down_type";

    private d() {
        this.f24346f = false;
        try {
            this.f24344d = g.a();
            this.f24345e = e.a.f24351a;
            this.f24342a = new CopyOnWriteArrayList<>();
            this.f24343b = new ConcurrentHashMap();
            com.mbridge.msdk.c.g b9 = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
            if (b9 != null) {
                this.f24346f = b9.y(1);
            }
        } catch (Throwable th) {
            ad.a("H5DownLoadManager", th.getMessage(), th);
        }
    }

    public static synchronized d a() {
        d dVar;
        synchronized (d.class) {
            try {
                if (f24341c == null) {
                    f24341c = new d();
                }
                dVar = f24341c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    public final String a(String str) {
        try {
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        if (!Patterns.WEB_URL.matcher(str).matches()) {
            if (URLUtil.isValidUrl(str)) {
            }
            return str;
        }
        Uri parse = Uri.parse(str);
        String path = parse.getPath();
        if (TextUtils.isEmpty(path) || !TextUtils.isEmpty(parse.getQueryParameter("urlDebug"))) {
            return str;
        }
        if (path.toLowerCase().endsWith(".zip")) {
            g gVar = this.f24344d;
            if (gVar != null) {
                return gVar.a(str);
            }
            return null;
        }
        e eVar = this.f24345e;
        return eVar != null ? eVar.a(str) : str;
    }
}
