package com.mbridge.msdk.mbbanner.common.communication;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.h;
import com.mbridge.msdk.foundation.db.k;
import com.mbridge.msdk.foundation.db.p;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.m;
import com.mbridge.msdk.foundation.same.f.b;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ah;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.i;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.mbsignalcommon.communication.c;
import com.mbridge.msdk.mbsignalcommon.communication.d;
import com.mbridge.msdk.mbsignalcommon.windvane.g;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class a extends c {

    /* renamed from: b, reason: collision with root package name */
    private WeakReference<Context> f21668b;

    /* renamed from: c, reason: collision with root package name */
    private List<CampaignEx> f21669c;

    /* renamed from: d, reason: collision with root package name */
    private String f21670d;

    /* renamed from: e, reason: collision with root package name */
    private String f21671e;

    /* renamed from: f, reason: collision with root package name */
    private int f21672f;

    /* renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.b.a f21673g;

    /* renamed from: h, reason: collision with root package name */
    private BannerExpandDialog f21674h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f21675i = false;

    public a(Context context, String str, String str2) {
        this.f21670d = str;
        this.f21671e = str2;
        this.f21668b = new WeakReference<>(context);
    }

    public final void a(com.mbridge.msdk.mbbanner.common.b.a aVar) {
        if (aVar != null) {
            this.f21673g = aVar;
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.a, com.mbridge.msdk.mbsignalcommon.communication.b
    public final void b(Object obj, String str) {
        CampaignEx campaignEx;
        ad.b("BannerSignalCommunicationImpl", CampaignEx.JSON_NATIVE_VIDEO_CLICK);
        try {
            List<CampaignEx> list = this.f21669c;
            if (list == null) {
                return;
            }
            if (list != null && list.size() > 0) {
                campaignEx = this.f21669c.get(0);
            } else {
                campaignEx = null;
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    JSONObject campaignToJsonObject = CampaignEx.campaignToJsonObject(campaignEx);
                    JSONObject jSONObject = new JSONObject(str).getJSONObject("pt");
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        campaignToJsonObject.put(next, jSONObject.getString(next));
                    }
                    CampaignEx parseCampaignWithBackData = CampaignEx.parseCampaignWithBackData(campaignToJsonObject);
                    String optString = campaignToJsonObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
                    if (!TextUtils.isEmpty(optString)) {
                        parseCampaignWithBackData.setCampaignUnitId(optString);
                    }
                    campaignEx = parseCampaignWithBackData;
                } catch (JSONException e8) {
                    e8.printStackTrace();
                }
                com.mbridge.msdk.mbbanner.common.b.a aVar = this.f21673g;
                if (aVar != null) {
                    aVar.a(campaignEx);
                }
            }
        } catch (Throwable th) {
            ad.a("BannerSignalCommunicationImpl", CampaignEx.JSON_NATIVE_VIDEO_CLICK, th);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.a, com.mbridge.msdk.mbsignalcommon.communication.b
    public final void c(Object obj, String str) {
        if (obj != null) {
            try {
                int optInt = new JSONObject(str).optInt("isReady", 1);
                g.a().a(obj, d.a(0));
                com.mbridge.msdk.mbbanner.common.b.a aVar = this.f21673g;
                if (aVar != null) {
                    aVar.b(optInt);
                }
            } catch (Throwable th) {
                ad.a("BannerSignalCommunicationImpl", "readyStatus", th);
            }
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public final void close() {
        ad.b("BannerSignalCommunicationImpl", CampaignEx.JSON_NATIVE_VIDEO_CLOSE);
        try {
            com.mbridge.msdk.mbbanner.common.b.a aVar = this.f21673g;
            if (aVar != null) {
                aVar.a();
            }
        } catch (Throwable th) {
            ad.a("BannerSignalCommunicationImpl", CampaignEx.JSON_NATIVE_VIDEO_CLOSE, th);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.a, com.mbridge.msdk.mbsignalcommon.communication.b
    public final void d(Object obj, String str) {
        ad.b("BannerSignalCommunicationImpl", "toggleCloseBtn");
        try {
            if (!TextUtils.isEmpty(str)) {
                int optInt = new JSONObject(str).optInt("state");
                com.mbridge.msdk.mbbanner.common.b.a aVar = this.f21673g;
                if (aVar != null) {
                    aVar.a(optInt);
                }
            }
        } catch (Throwable th) {
            ad.a("BannerSignalCommunicationImpl", "toggleCloseBtn", th);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.a, com.mbridge.msdk.mbsignalcommon.communication.b
    public final void e(Object obj, String str) {
        ad.b("BannerSignalCommunicationImpl", "triggerCloseBtn");
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("state");
                com.mbridge.msdk.mbbanner.common.b.a aVar = this.f21673g;
                if (aVar != null) {
                    aVar.a(optString);
                }
                g.a().a(obj, d.a(0));
            }
        } catch (Throwable th) {
            ad.a("BannerSignalCommunicationImpl", "triggerCloseBtn", th);
            g.a().a(obj, d.a(-1));
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public final void expand(String str, boolean z8) {
        Context context;
        try {
            String str2 = "";
            if (getMraidCampaign() != null) {
                if (TextUtils.isEmpty(getMraidCampaign().getBannerHtml())) {
                    str2 = getMraidCampaign().getBannerUrl();
                } else {
                    str2 = "file:////" + getMraidCampaign().getBannerHtml();
                }
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str)) {
                str2 = str;
            }
            bundle.putString("url", str2);
            bundle.putBoolean("shouldUseCustomClose", z8);
            WeakReference<Context> weakReference = this.f21668b;
            if (weakReference != null && (context = weakReference.get()) != null) {
                BannerExpandDialog bannerExpandDialog = this.f21674h;
                if (bannerExpandDialog != null && bannerExpandDialog.isShowing()) {
                    return;
                }
                BannerExpandDialog bannerExpandDialog2 = new BannerExpandDialog(context, bundle, this.f21673g);
                this.f21674h = bannerExpandDialog2;
                bannerExpandDialog2.setCampaignList(this.f21671e, this.f21669c);
                this.f21674h.show();
            }
            com.mbridge.msdk.mbbanner.common.b.a aVar = this.f21673g;
            if (aVar != null) {
                aVar.a(true);
            }
            com.mbridge.msdk.mbbanner.common.d.a.a(this.f21671e, getMraidCampaign(), str);
        } catch (Throwable th) {
            ad.a("BannerSignalCommunicationImpl", "expand", th);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public final CampaignEx getMraidCampaign() {
        List<CampaignEx> list = this.f21669c;
        if (list != null && list.size() > 0) {
            return this.f21669c.get(0);
        }
        return null;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.a, com.mbridge.msdk.mbsignalcommon.communication.b
    public final void i(Object obj, String str) {
        ad.a("BannerSignalCommunicationImpl", "sendImpressions:" + str);
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONArray jSONArray = new JSONArray(str);
                final ArrayList arrayList = new ArrayList();
                for (int i8 = 0; i8 < jSONArray.length(); i8++) {
                    String string = jSONArray.getString(i8);
                    for (CampaignEx campaignEx : this.f21669c) {
                        if (campaignEx.getId().equals(string)) {
                            com.mbridge.msdk.foundation.same.a.d.a(this.f21671e, campaignEx, "banner");
                            arrayList.add(string);
                        }
                    }
                }
                b.b().execute(new Runnable() { // from class: com.mbridge.msdk.mbbanner.common.communication.a.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            k a9 = k.a(h.a(com.mbridge.msdk.foundation.controller.c.m().c()));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                a9.a((String) it.next());
                            }
                        } catch (Exception e8) {
                            ad.b("BannerSignalCommunicationImpl", e8.getMessage());
                        }
                    }
                });
            }
        } catch (Throwable th) {
            ad.a("BannerSignalCommunicationImpl", "sendImpressions", th);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.a, com.mbridge.msdk.mbsignalcommon.communication.b
    public final void j(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            d.a(obj, "params is empty");
            return;
        }
        try {
            a(obj, new JSONObject(str));
        } catch (Throwable th) {
            ad.a("BannerSignalCommunicationImpl", th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.a, com.mbridge.msdk.mbsignalcommon.communication.b
    public final void k(Object obj, String str) {
        boolean z8;
        boolean z9;
        ad.a("BannerSignalCommunicationImpl", "reportUrls:" + str);
        if (TextUtils.isEmpty(str)) {
            d.a(obj, "params is null");
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                for (int i8 = 0; i8 < jSONArray.length(); i8++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i8);
                    int optInt = jSONObject.optInt("type");
                    String a9 = ai.a(jSONObject.optString("url"), "&tun=", z.q() + "");
                    int optInt2 = jSONObject.optInt("report");
                    CampaignEx campaignEx = null;
                    if (optInt2 == 0) {
                        Context c8 = com.mbridge.msdk.foundation.controller.c.m().c();
                        List<CampaignEx> list = this.f21669c;
                        if (list != null) {
                            campaignEx = list.get(0);
                        }
                        CampaignEx campaignEx2 = campaignEx;
                        if (optInt != 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        com.mbridge.msdk.click.a.a(c8, campaignEx2, "", a9, false, z9);
                    } else {
                        Context c9 = com.mbridge.msdk.foundation.controller.c.m().c();
                        List<CampaignEx> list2 = this.f21669c;
                        if (list2 != null) {
                            campaignEx = list2.get(0);
                        }
                        CampaignEx campaignEx3 = campaignEx;
                        if (optInt != 0) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        com.mbridge.msdk.click.a.a(c9, campaignEx3, "", a9, false, z8, optInt2);
                    }
                }
                g.a().a(obj, d.a(0));
            } catch (Throwable th) {
                ad.a("BannerSignalCommunicationImpl", "reportUrls", th);
            }
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public final void open(String str) {
        ad.b("BannerSignalCommunicationImpl", "open");
        try {
            ad.b("BannerSignalCommunicationImpl", str);
            if (this.f21669c.size() > 1) {
                com.mbridge.msdk.foundation.controller.c.m().c().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                str = null;
            }
            com.mbridge.msdk.mbbanner.common.b.a aVar = this.f21673g;
            if (aVar != null) {
                aVar.a(true, str);
            }
        } catch (Throwable th) {
            ad.a("BannerSignalCommunicationImpl", "open", th);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public final void unload() {
        close();
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public final void useCustomClose(boolean z8) {
        int i8;
        if (z8) {
            i8 = 2;
        } else {
            i8 = 1;
        }
        try {
            com.mbridge.msdk.mbbanner.common.b.a aVar = this.f21673g;
            if (aVar != null) {
                aVar.a(i8);
            }
        } catch (Throwable th) {
            ad.a("BannerSignalCommunicationImpl", "useCustomClose", th);
        }
    }

    public final void a(List<CampaignEx> list) {
        this.f21669c = list;
    }

    public final void a(int i8) {
        this.f21672f = i8;
    }

    public final void a() {
        if (this.f21673g != null) {
            this.f21673g = null;
        }
        if (this.f21674h != null) {
            this.f21674h = null;
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.a, com.mbridge.msdk.mbsignalcommon.communication.b
    public final void a(Object obj, String str) {
        ad.b("BannerSignalCommunicationImpl", "BANNER INIT INVOKE");
        try {
            JSONObject jSONObject = new JSONObject();
            i iVar = new i(com.mbridge.msdk.foundation.controller.c.m().c());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("dev_close_state", this.f21672f);
            jSONObject.put("sdkSetting", jSONObject2);
            jSONObject.put("device", iVar.a());
            jSONObject.put("campaignList", CampaignEx.parseCamplistToJson(this.f21669c));
            com.mbridge.msdk.c.k d8 = com.mbridge.msdk.c.h.a().d(com.mbridge.msdk.foundation.controller.c.m().k(), this.f21671e);
            if (d8 == null) {
                d8 = com.mbridge.msdk.c.k.d(this.f21671e);
            }
            if (!TextUtils.isEmpty(this.f21670d)) {
                d8.a(this.f21670d);
            }
            jSONObject.put("unitSetting", d8.x());
            String g8 = com.mbridge.msdk.c.h.a().g(com.mbridge.msdk.foundation.controller.c.m().k());
            if (!TextUtils.isEmpty(g8)) {
                jSONObject.put("appSetting", new JSONObject(g8));
            }
            jSONObject.put("sdk_info", com.mbridge.msdk.mbsignalcommon.base.d.f21720a);
            ad.b("BannerSignalCommunicationImpl", "init" + jSONObject.toString());
            g.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable th) {
            ad.a("BannerSignalCommunicationImpl", "init", th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [org.json.JSONObject, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0, types: [org.json.JSONObject] */
    private static void a(Object obj, JSONObject jSONObject) {
        ?? r32;
        String str;
        String str2;
        String str3;
        int i8;
        String str4;
        File file;
        String str5;
        ?? jSONObject2 = new JSONObject();
        String str6 = "message";
        String str7 = "code";
        int i9 = 1;
        if (jSONObject == null) {
            try {
                jSONObject2.put("code", 1);
                jSONObject2.put("message", "params is null");
                g.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                return;
            } catch (JSONException e8) {
                ad.a("BannerSignalCommunicationImpl", e8.getMessage());
                return;
            }
        }
        try {
            jSONObject2.put("code", 0);
            jSONObject2.put("message", "");
            JSONArray jSONArray = jSONObject.getJSONArray("resource");
            if (jSONArray != null) {
                try {
                    if (jSONArray.length() > 0) {
                        ?? jSONArray2 = new JSONArray();
                        int length = jSONArray.length();
                        int i10 = 0;
                        while (i10 < length) {
                            JSONObject jSONObject3 = jSONArray.getJSONObject(i10);
                            String optString = jSONObject3.optString("ref", "");
                            int i11 = jSONObject3.getInt("type");
                            ?? jSONObject4 = new JSONObject();
                            JSONArray jSONArray3 = jSONArray;
                            if (i11 == i9 && !TextUtils.isEmpty(optString)) {
                                JSONObject jSONObject5 = new JSONObject();
                                m a9 = p.a(h.a(com.mbridge.msdk.foundation.controller.c.m().c())).a(optString);
                                if (a9 != null) {
                                    i8 = length;
                                    ad.a("BannerSignalCommunicationImpl", "VideoBean not null");
                                    jSONObject5.put("type", 1);
                                    str2 = str6;
                                    try {
                                        jSONObject5.put("videoDataLength", a9.d());
                                        String e9 = a9.e();
                                        str3 = str7;
                                        if (TextUtils.isEmpty(e9)) {
                                            try {
                                                ad.a("BannerSignalCommunicationImpl", "VideoPath null");
                                                jSONObject5.put(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, "");
                                                jSONObject5.put("path4Web", "");
                                            } catch (Throwable th) {
                                                th = th;
                                                r32 = str2;
                                                str = str3;
                                                try {
                                                    jSONObject2.put(str, 1);
                                                    jSONObject2.put(r32, th.getLocalizedMessage());
                                                    g.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                                                } catch (JSONException e10) {
                                                    ad.a("BannerSignalCommunicationImpl", e10.getMessage());
                                                    return;
                                                }
                                            }
                                        } else {
                                            ad.a("BannerSignalCommunicationImpl", "VideoPath not null");
                                            jSONObject5.put(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, e9);
                                            jSONObject5.put("path4Web", e9);
                                        }
                                        if (a9.b() == 5) {
                                            jSONObject5.put("downloaded", 1);
                                        } else {
                                            jSONObject5.put("downloaded", 0);
                                        }
                                        jSONObject4.put(optString, jSONObject5);
                                        jSONArray2.put(jSONObject4);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        str3 = str7;
                                        r32 = str2;
                                        str = str3;
                                        jSONObject2.put(str, 1);
                                        jSONObject2.put(r32, th.getLocalizedMessage());
                                        g.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                                    }
                                } else {
                                    str2 = str6;
                                    str3 = str7;
                                    i8 = length;
                                    ad.a("BannerSignalCommunicationImpl", "VideoBean null");
                                }
                                i10++;
                                jSONArray = jSONArray3;
                                length = i8;
                                str6 = str2;
                                str7 = str3;
                                i9 = 1;
                            } else {
                                str2 = str6;
                                str3 = str7;
                                i8 = length;
                                if (i11 == 2 && !TextUtils.isEmpty(optString)) {
                                    JSONObject jSONObject6 = new JSONObject();
                                    jSONObject6.put("type", 2);
                                    jSONObject6.put(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, H5DownLoadManager.getInstance().getResAddress(optString) == null ? "" : H5DownLoadManager.getInstance().getH5ResAddress(optString));
                                    jSONObject4.put(optString, jSONObject6);
                                    jSONArray2.put(jSONObject4);
                                } else if (i11 == 3 && !TextUtils.isEmpty(optString)) {
                                    try {
                                        file = new File(optString);
                                    } catch (Throwable th3) {
                                        if (MBridgeConstans.DEBUG) {
                                            th3.printStackTrace();
                                        }
                                    }
                                    if (file.exists() && file.isFile() && file.canRead()) {
                                        ad.a("BannerSignalCommunicationImpl", "getFileInfo Mraid file " + optString);
                                        str4 = "file:////" + optString;
                                        JSONObject jSONObject7 = new JSONObject();
                                        jSONObject7.put("type", 3);
                                        jSONObject7.put(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, str4);
                                        jSONObject4.put(optString, jSONObject7);
                                        jSONArray2.put(jSONObject4);
                                    }
                                    str4 = "";
                                    JSONObject jSONObject72 = new JSONObject();
                                    jSONObject72.put("type", 3);
                                    jSONObject72.put(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, str4);
                                    jSONObject4.put(optString, jSONObject72);
                                    jSONArray2.put(jSONObject4);
                                } else if (i11 == 4 && !TextUtils.isEmpty(optString)) {
                                    JSONObject jSONObject8 = new JSONObject();
                                    jSONObject8.put("type", 4);
                                    jSONObject8.put(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, ah.a(optString) == null ? "" : ah.a(optString));
                                    jSONObject4.put(optString, jSONObject8);
                                    jSONArray2.put(jSONObject4);
                                }
                                i10++;
                                jSONArray = jSONArray3;
                                length = i8;
                                str6 = str2;
                                str7 = str3;
                                i9 = 1;
                            }
                        }
                        str2 = str6;
                        str3 = str7;
                        jSONObject2.put("resource", jSONArray2);
                        g.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                        return;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    str2 = str6;
                }
            }
            str = "code";
            r32 = 1;
        } catch (Throwable th5) {
            th = th5;
            r32 = "message";
            str = "code";
        }
        try {
            try {
                jSONObject2.put(str, 1);
                str5 = "message";
            } catch (JSONException e11) {
                e = e11;
                str5 = "message";
            } catch (Throwable th6) {
                th = th6;
                r32 = "message";
                jSONObject2.put(str, 1);
                jSONObject2.put(r32, th.getLocalizedMessage());
                g.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            }
            try {
                jSONObject2.put(str5, "resource is null");
                g.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                r32 = str5;
            } catch (JSONException e12) {
                e = e12;
                ad.a("BannerSignalCommunicationImpl", e.getMessage());
                r32 = str5;
            }
        } catch (Throwable th7) {
            th = th7;
            jSONObject2.put(str, 1);
            jSONObject2.put(r32, th.getLocalizedMessage());
            g.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        }
    }
}
