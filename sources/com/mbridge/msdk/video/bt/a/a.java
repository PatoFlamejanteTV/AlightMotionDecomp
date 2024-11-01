package com.mbridge.msdk.video.bt.a;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.h;
import com.mbridge.msdk.foundation.db.k;
import com.mbridge.msdk.foundation.db.p;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.mbridge.msdk.foundation.entity.m;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ah;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.ar;
import com.mbridge.msdk.foundation.tools.r;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.g;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.video.bt.a.b;
import com.mbridge.msdk.video.bt.module.BTBaseView;
import com.mbridge.msdk.video.bt.module.MBTempContainer;
import com.mbridge.msdk.video.bt.module.MBridgeBTContainer;
import com.mbridge.msdk.video.bt.module.MBridgeBTLayout;
import com.mbridge.msdk.video.bt.module.MBridgeBTNativeEC;
import com.mbridge.msdk.video.bt.module.MBridgeBTVideoView;
import com.mbridge.msdk.video.bt.module.MBridgeBTWebView;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static ConcurrentHashMap<String, LinkedHashMap<String, View>> f22979a = new ConcurrentHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private static LinkedHashMap<String, String> f22980b = new LinkedHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private static LinkedHashMap<String, CampaignEx> f22981c = new LinkedHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private static LinkedHashMap<String, com.mbridge.msdk.videocommon.d.c> f22982d = new LinkedHashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private static LinkedHashMap<String, String> f22983e = new LinkedHashMap<>();

    /* renamed from: f, reason: collision with root package name */
    private static LinkedHashMap<String, Integer> f22984f = new LinkedHashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private static LinkedHashMap<String, Activity> f22985g = new LinkedHashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private static volatile int f22986h = 10000;

    /* renamed from: i, reason: collision with root package name */
    private static int f22987i = 0;

    /* renamed from: j, reason: collision with root package name */
    private static int f22988j = 1;

    /* renamed from: k, reason: collision with root package name */
    private static String f22989k = "";

    /* renamed from: l, reason: collision with root package name */
    private static int f22990l;

    /* renamed from: m, reason: collision with root package name */
    private static int f22991m;

    /* renamed from: n, reason: collision with root package name */
    private static int f22992n;

    /* renamed from: o, reason: collision with root package name */
    private static int f22993o;

    /* renamed from: p, reason: collision with root package name */
    private static int f22994p;

    private String h(String str) {
        if (f22980b.containsKey(str)) {
            return f22980b.get(str);
        }
        return "";
    }

    public final void A(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String h8 = h(optString2);
            if (TextUtils.isEmpty(h8) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f21832b) != null) {
                h8 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA) == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b9 = b(optString, h8);
            if (b9.containsKey(optString2)) {
                View view = b9.get(optString2);
                if (view instanceof MBridgeBTVideoView) {
                    ((MBridgeBTVideoView) view).stop();
                    a(obj, optString2);
                    ad.a("OperateViews", "playerStop success");
                    return;
                } else {
                    c(obj, "instanceId is not player");
                    ad.a("OperateViews", "playerStop failed instanceId is not player instanceId = " + optString2);
                    return;
                }
            }
            c(obj, "instanceId not exit");
            ad.a("OperateViews", "playerStop failed instanceId not exit instanceId = " + optString2);
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "playerStop failed: " + th.getMessage());
        }
    }

    public final void B(Object obj, JSONObject jSONObject) {
        try {
            jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            if (jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA) == null) {
                c(obj, "data is empty");
            }
        } catch (Throwable th) {
            c(obj, th.getMessage());
        }
    }

    public final void C(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String h8 = h(optString2);
            if (TextUtils.isEmpty(h8) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f21832b) != null) {
                h8 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA) == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b9 = b(optString, h8);
            if (b9.containsKey(optString2)) {
                View view = b9.get(optString2);
                if (view instanceof MBridgeBTVideoView) {
                    if (((MBridgeBTVideoView) view).playMute()) {
                        a(obj, optString2);
                        ad.a("OperateViews", "playerMute success");
                        return;
                    } else {
                        c(obj, "set mute failed");
                        ad.a("OperateViews", "playerMute failed set mute failed");
                        return;
                    }
                }
                c(obj, "instanceId is not player");
                ad.a("OperateViews", "playerMute failed: instanceId is not player");
                return;
            }
            c(obj, "instanceId not exist");
            ad.a("OperateViews", "playerMute failed: instanceId is not exist");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "playerMute failed: " + th.getMessage());
        }
    }

    public final void D(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String h8 = h(optString2);
            if (TextUtils.isEmpty(h8) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f21832b) != null) {
                h8 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA) == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b9 = b(optString, h8);
            if (b9.containsKey(optString2)) {
                View view = b9.get(optString2);
                if (view instanceof MBridgeBTVideoView) {
                    if (((MBridgeBTVideoView) view).playUnMute()) {
                        a(obj, optString2);
                        a(obj, "onUnmute", optString2);
                        ad.a("OperateViews", "playerUnmute successed");
                        return;
                    } else {
                        a(obj, "set unmute failed");
                        ad.a("OperateViews", "playerUnmute failed: set unmute failed");
                        return;
                    }
                }
                c(obj, "instanceId is not player");
                ad.a("OperateViews", "playerUnmute failed: instanceId is not player");
                return;
            }
            c(obj, "instanceId not exit");
            ad.a("OperateViews", "playerUnmute failed: instanceId not exit");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "playerUnmute failed: " + th.getMessage());
        }
    }

    public final void E(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String h8 = h(optString2);
            if (TextUtils.isEmpty(h8) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f21832b) != null) {
                h8 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA) == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b9 = b(optString, h8);
            if (b9.containsKey(optString2)) {
                View view = b9.get(optString2);
                if (view instanceof MBridgeBTVideoView) {
                    int mute = ((MBridgeBTVideoView) view).getMute();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", f22987i);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("id", optString2);
                    jSONObject3.put(CampaignEx.JSON_NATIVE_VIDEO_MUTE, mute);
                    jSONObject2.put(DataSchemeDataSource.SCHEME_DATA, jSONObject3);
                    g.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                    ad.a("OperateViews", "playerGetMuteState successed mute = " + mute);
                    return;
                }
                c(obj, "instanceId is not player");
                ad.a("OperateViews", "playerGetMuteState failed instanceId is not player");
                return;
            }
            c(obj, "instanceId not exist");
            ad.a("OperateViews", "playerGetMuteState failed instanceId not exist");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "playerGetMuteState failed: " + th.getMessage());
        }
    }

    public final void F(Object obj, JSONObject jSONObject) {
        try {
            jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            if (jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA) == null) {
                c(obj, "data is empty");
            }
        } catch (Throwable th) {
            c(obj, th.getMessage());
        }
    }

    public final void G(Object obj, JSONObject jSONObject) {
        try {
            jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            jSONObject.optString("id");
            if (jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA) == null) {
                c(obj, "data is empty");
            } else {
                c(obj, "android mediaPlayer not support setScaleType");
            }
        } catch (Throwable th) {
            c(obj, th.getMessage());
        }
    }

    public final void H(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String h8 = h(optString2);
            if (TextUtils.isEmpty(h8) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f21832b) != null) {
                h8 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA) == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b9 = b(optString, h8);
            if (b9.containsKey(optString2)) {
                View view = b9.get(optString2);
                if (view instanceof MBTempContainer) {
                    ((MBTempContainer) view).preload();
                    a(obj, optString2);
                    return;
                } else {
                    c(obj, "view not exist");
                    return;
                }
            }
            c(obj, "instanceId not exist");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "preloadSubPlayTemplateView failed: " + th.getMessage());
        }
    }

    public final void I(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        b unused;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String h8 = h(optString2);
            if (TextUtils.isEmpty(h8) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f21832b) != null) {
                h8 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA) == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b9 = b(optString, h8);
            if (b9.size() > 0) {
                MBridgeBTContainer mBridgeBTContainer = null;
                for (View view : b9.values()) {
                    if (view instanceof MBridgeBTContainer) {
                        mBridgeBTContainer = (MBridgeBTContainer) view;
                    } else if (view instanceof MBridgeBTWebView) {
                        ((MBridgeBTWebView) view).onDestory();
                    } else if (view instanceof MBridgeBTVideoView) {
                        ((MBridgeBTVideoView) view).getInstanceId();
                        unused = b.a.f23012a;
                        ((MBridgeBTVideoView) view).onDestory();
                    } else if (view instanceof MBTempContainer) {
                        ((MBTempContainer) view).onDestroy();
                    }
                }
                if (mBridgeBTContainer != null) {
                    mBridgeBTContainer.onAdClose();
                    f22979a.remove(b9);
                    b9.clear();
                    f22979a.remove(optString + "_" + h8);
                    a(obj, optString2);
                    return;
                }
                c(obj, "not found MBridgeBTContainer");
                ad.a("OperateViews", "closeAd successed");
                return;
            }
            c(obj, "unitId or instanceId not exist");
            ad.a("OperateViews", "closeAd failed: unitId or instanceId not exist unitId = " + optString);
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "closeAd failed: " + th.getMessage());
        }
    }

    public final void J(Object obj, JSONObject jSONObject) {
        String str;
        try {
            WindVaneWebView windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f21832b;
            if (windVaneWebView == null) {
                str = "";
            } else {
                str = windVaneWebView.getRid();
            }
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("eventName");
            JSONObject optJSONObject = jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
            LinkedHashMap<String, View> b9 = b(optString, str);
            if (b9 != null && b9.size() > 0) {
                for (View view : b9.values()) {
                    if (view instanceof MBridgeBTWebView) {
                        ((MBridgeBTWebView) view).broadcast(optString2, optJSONObject);
                    }
                    if (view instanceof MBridgeBTLayout) {
                        ((MBridgeBTLayout) view).broadcast(optString2, optJSONObject);
                    }
                }
                a(obj, "");
                return;
            }
            c(obj, "unitId not exist");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "broadcast failed: " + th.getMessage());
        }
    }

    public final void K(Object obj, JSONObject jSONObject) {
        String str;
        com.mbridge.msdk.videocommon.b.c cVar;
        String str2;
        try {
            WindVaneWebView windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f21832b;
            if (windVaneWebView == null) {
                str = "";
            } else {
                str = windVaneWebView.getRid();
            }
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            JSONObject optJSONObject = jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
            String optString3 = optJSONObject.optString("userId");
            boolean optBoolean = optJSONObject.optBoolean("expired");
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("reward");
            String optString4 = optJSONObject.optString("extra");
            if (optJSONObject2 != null) {
                cVar = new com.mbridge.msdk.videocommon.b.c(optJSONObject2.optString("name"), optJSONObject2.optInt(RewardPlus.AMOUNT));
                str2 = optJSONObject2.optString("id");
            } else {
                cVar = null;
                str2 = "";
            }
            LinkedHashMap<String, View> b9 = b(optString, str);
            if (b9.size() > 0 && f22983e.containsKey(optString2)) {
                View view = b9.get(optString2);
                if (view instanceof MBTempContainer) {
                    MBTempContainer mBTempContainer = (MBTempContainer) view;
                    mBTempContainer.setReward(cVar);
                    mBTempContainer.setUserId(optString3);
                    mBTempContainer.setRewardId(str2);
                    mBTempContainer.setCampaignExpired(optBoolean);
                    if (!TextUtils.isEmpty(optString4)) {
                        mBTempContainer.setDeveloperExtraData(optString4);
                    }
                    a(obj, optString2);
                    ad.a("OperateViews", "setSubPlayTemplateInfo success instanceId = " + optString2);
                    return;
                }
                c(obj, "instanceId not exist");
                ad.a("OperateViews", "setSubPlayTemplateInfo failed: instanceId not exist instanceId = " + optString2);
                return;
            }
            c(obj, "unitId not exist");
            ad.a("OperateViews", "setSubPlayTemplateInfo failed: unitId not exist instanceId = " + optString2);
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "setSubPlayTemplateInfo failed: " + th.getMessage());
        }
    }

    public final void L(Object obj, JSONObject jSONObject) {
        try {
            String str = "";
            WindVaneWebView windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f21832b;
            if (windVaneWebView != null) {
                str = windVaneWebView.getRid();
            }
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            JSONObject optJSONObject = jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
            String optString3 = optJSONObject.optString("eventName");
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("eventData");
            if (optJSONObject2 == null) {
                optJSONObject2 = new JSONObject();
            }
            LinkedHashMap<String, View> b9 = b(optString, str);
            if (b9.size() > 0) {
                View view = b9.get(optString2);
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    int childCount = viewGroup.getChildCount();
                    for (int i8 = 0; i8 < childCount; i8++) {
                        View childAt = viewGroup.getChildAt(i8);
                        if (childAt instanceof WindVaneWebView) {
                            g.a().a((WebView) childAt, optString3, Base64.encodeToString(optJSONObject2.toString().getBytes(), 2));
                            a(obj, optString2);
                            ad.a("OperateViews", "webviewFireEvent instanceId = " + optString2);
                            return;
                        }
                    }
                }
                c(obj, "instanceId not exist");
                ad.a("OperateViews", "webviewFireEvent failed: instanceId not exist instanceId = " + optString2);
                return;
            }
            c(obj, "unitId not exist");
            ad.a("OperateViews", "webviewFireEvent failed: unitId not exist");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "webviewFireEvent failed: " + th.getMessage());
        }
    }

    public final void M(Object obj, JSONObject jSONObject) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
            if (optJSONObject == null) {
                c(obj, "data is empty");
                return;
            }
            final CampaignEx parseCampaignWithBackData = CampaignEx.parseCampaignWithBackData(optJSONObject);
            if (parseCampaignWithBackData == null) {
                c(obj, "data camapign is empty");
            } else {
                new Thread(new Runnable() { // from class: com.mbridge.msdk.video.bt.a.a.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            k a9 = k.a(h.a(com.mbridge.msdk.foundation.controller.c.m().c()));
                            if (a9 != null) {
                                if (!a9.b(parseCampaignWithBackData.getId())) {
                                    com.mbridge.msdk.foundation.entity.g gVar = new com.mbridge.msdk.foundation.entity.g();
                                    gVar.a(parseCampaignWithBackData.getId());
                                    gVar.b(parseCampaignWithBackData.getFca());
                                    gVar.c(parseCampaignWithBackData.getFcb());
                                    gVar.a(0);
                                    gVar.d(1);
                                    gVar.a(System.currentTimeMillis());
                                    a9.a(gVar);
                                } else {
                                    a9.a(parseCampaignWithBackData.getId());
                                }
                            }
                            a.a(a.this, parseCampaignWithBackData.getCampaignUnitId(), parseCampaignWithBackData);
                        } catch (Throwable th) {
                            ad.a("OperateViews", th.getMessage(), th);
                        }
                    }
                }).start();
                a(obj, "");
            }
        } catch (Throwable th) {
            c(obj, th.getMessage());
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
    public final void N(Object obj, JSONObject jSONObject) {
        ?? r32;
        String str;
        String str2;
        String str3;
        int i8;
        String a9;
        String str4;
        File file;
        String h5ResAddress;
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
                ad.a("OperateViews", e8.getMessage());
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
                                m a10 = p.a(h.a(com.mbridge.msdk.foundation.controller.c.m().c())).a(optString);
                                if (a10 != null) {
                                    i8 = length;
                                    ad.a("OperateViews", "VideoBean not null");
                                    jSONObject5.put("type", 1);
                                    str2 = str6;
                                    try {
                                        jSONObject5.put("videoDataLength", a10.d());
                                        String e9 = a10.e();
                                        str3 = str7;
                                        if (TextUtils.isEmpty(e9)) {
                                            try {
                                                ad.a("OperateViews", "VideoPath null");
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
                                                    ad.a("OperateViews", e10.getMessage());
                                                    return;
                                                }
                                            }
                                        } else {
                                            ad.a("OperateViews", "VideoPath not null");
                                            jSONObject5.put(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, e9);
                                            jSONObject5.put("path4Web", e9);
                                        }
                                        if (a10.b() == 5) {
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
                                    ad.a("OperateViews", "VideoBean null");
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
                                    if (H5DownLoadManager.getInstance().getH5ResAddress(optString) == null) {
                                        h5ResAddress = "";
                                    } else {
                                        h5ResAddress = H5DownLoadManager.getInstance().getH5ResAddress(optString);
                                    }
                                    jSONObject6.put(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, h5ResAddress);
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
                                        ad.a("OperateViews", "getFileInfo Mraid file " + optString);
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
                                    if (ah.a(optString) == null) {
                                        a9 = "";
                                    } else {
                                        a9 = ah.a(optString);
                                    }
                                    jSONObject8.put(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, a9);
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
                ad.a("OperateViews", e.getMessage());
                r32 = str5;
            }
        } catch (Throwable th7) {
            th = th7;
            jSONObject2.put(str, 1);
            jSONObject2.put(r32, th.getLocalizedMessage());
            g.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        }
    }

    public final void O(Object obj, JSONObject jSONObject) {
        ad.a("OperateViews", "createNativeEC:" + jSONObject);
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            JSONObject optJSONObject = jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
            if (optJSONObject != null && !TextUtils.isEmpty(optString)) {
                String str = "";
                CampaignEx parseCampaignWithBackData = CampaignEx.parseCampaignWithBackData(optJSONObject.optJSONObject("campaign"));
                if (parseCampaignWithBackData != null && !TextUtils.isEmpty(optString)) {
                    parseCampaignWithBackData.setCampaignUnitId(optString);
                    str = parseCampaignWithBackData.getRequestId();
                }
                com.mbridge.msdk.videocommon.d.c a9 = com.mbridge.msdk.videocommon.d.c.a(optJSONObject.optJSONObject("unitSetting"));
                if (a9 != null) {
                    a9.a(optString);
                }
                MBridgeBTNativeEC mBridgeBTNativeEC = new MBridgeBTNativeEC(com.mbridge.msdk.foundation.controller.c.m().c());
                mBridgeBTNativeEC.setCampaign(parseCampaignWithBackData);
                com.mbridge.msdk.video.signal.a.k kVar = new com.mbridge.msdk.video.signal.a.k(null, parseCampaignWithBackData);
                kVar.a(optString);
                mBridgeBTNativeEC.setJSCommon(kVar);
                mBridgeBTNativeEC.setUnitId(optString);
                mBridgeBTNativeEC.setRewardUnitSetting(a9);
                WindVaneWebView windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f21832b;
                if (windVaneWebView != null) {
                    str = windVaneWebView.getRid();
                    mBridgeBTNativeEC.setCreateWebView(windVaneWebView);
                }
                LinkedHashMap<String, View> b9 = b(optString, str);
                String a10 = a();
                f22980b.put(a10, str);
                mBridgeBTNativeEC.setInstanceId(a10);
                b9.put(a10, mBridgeBTNativeEC);
                mBridgeBTNativeEC.preLoadData();
                if (parseCampaignWithBackData == null) {
                    c(obj, "campaign is null");
                    ad.a("OperateViews", "createNativeEC failed");
                    return;
                }
                a(obj, a10);
                ad.a("OperateViews", "createNativeEC instanceId = " + a10);
                return;
            }
            c(obj, "unitId or data is empty");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "createNativeEC failed：" + th.getMessage());
        }
    }

    public final String a() {
        f22986h++;
        return String.valueOf(f22986h);
    }

    public final String c(String str) {
        if (f22983e.containsKey(str)) {
            return f22983e.get(str);
        }
        return "";
    }

    public final void d(String str) {
        f22985g.remove(str);
    }

    public final int e(String str) {
        if (f22984f.containsKey(str)) {
            return f22984f.get(str).intValue();
        }
        return 2;
    }

    public final void f(String str) {
        if (f22983e.containsKey(str)) {
            f22983e.remove(str);
        }
        if (f22982d.containsKey(str)) {
            f22982d.remove(str);
        }
        if (f22981c.containsKey(str)) {
            f22981c.remove(str);
        }
        if (f22980b.containsKey(str)) {
            f22980b.remove(str);
        }
    }

    public final void g(String str) {
        if (f22984f.containsKey(str)) {
            f22984f.remove(str);
        }
    }

    public final void i(Object obj, JSONObject jSONObject) {
        int optInt;
        int optInt2;
        Rect rect;
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String h8 = h(optString2);
            if (TextUtils.isEmpty(h8) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f21832b) != null) {
                h8 = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
            if (optJSONObject == null) {
                c(obj, "data is empty");
                return;
            }
            String optString3 = optJSONObject.optString("id");
            LinkedHashMap<String, View> b9 = b(optString, h8);
            if (b9.containsKey(optString3) && b9.containsKey(optString2)) {
                ViewGroup viewGroup = (ViewGroup) b9.get(optString2);
                View view = b9.get(optString3);
                ar.a(view);
                if (viewGroup != null && view != null) {
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
                    if (view instanceof MBTempContainer) {
                        ad.b("OperateViews", "OperateViews setNotchString = " + String.format("%1$s-%2$s-%3$s-%4$s-%5$s", Integer.valueOf(f22990l), Integer.valueOf(f22991m), Integer.valueOf(f22992n), Integer.valueOf(f22993o), Integer.valueOf(f22994p)));
                        ((MBTempContainer) view).setNotchPadding(f22990l, f22991m, f22992n, f22993o, f22994p);
                        Iterator<View> it = b9.values().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            View next = it.next();
                            if (next instanceof MBridgeBTContainer) {
                                ar.a(view);
                                ((MBridgeBTContainer) next).appendSubView((MBridgeBTContainer) next, (MBTempContainer) view, optJSONObject2);
                                break;
                            }
                        }
                    } else {
                        if (optJSONObject2 == null) {
                            if (view instanceof BTBaseView) {
                                rect = ((BTBaseView) view).getRect();
                                optInt = ((BTBaseView) view).getViewWidth();
                                optInt2 = ((BTBaseView) view).getViewHeight();
                            } else {
                                rect = null;
                                optInt = 0;
                                optInt2 = 0;
                            }
                        } else {
                            Rect rect2 = new Rect(optJSONObject2.optInt(TtmlNode.LEFT, -999), optJSONObject2.optInt("top", -999), optJSONObject2.optInt(TtmlNode.RIGHT, -999), optJSONObject2.optInt("bottom", -999));
                            optInt = optJSONObject2.optInt("width");
                            optInt2 = optJSONObject2.optInt("height");
                            rect = rect2;
                        }
                        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                        if (viewGroup instanceof FrameLayout) {
                            layoutParams = new FrameLayout.LayoutParams(-1, -1);
                        } else if (viewGroup instanceof RelativeLayout) {
                            layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                        } else if (viewGroup instanceof LinearLayout) {
                            layoutParams = new LinearLayout.LayoutParams(-1, -1);
                        }
                        ViewGroup.LayoutParams a9 = a(layoutParams, rect, optInt, optInt2);
                        ar.a(view);
                        viewGroup.addView(view, a9);
                    }
                    a(obj, optString2);
                    a(obj, "onAppendView", optString2);
                    ad.a("OperateViews", "appendSubView parentId = " + optString2 + " childId = " + optString3);
                    return;
                }
                c(obj, "view is not exist");
                return;
            }
            c(obj, "instanceId is not exist");
            ad.a("OperateViews", "appendSubView failed: instanceId is not exist");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "appendSubView failed: " + th.getMessage());
        }
    }

    public final void j(Object obj, JSONObject jSONObject) {
        int optInt;
        int optInt2;
        Rect rect;
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String h8 = h(optString2);
            if (TextUtils.isEmpty(h8) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f21832b) != null) {
                h8 = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
            if (optJSONObject != null && !TextUtils.isEmpty(optString)) {
                String optString3 = optJSONObject.optString("id");
                LinkedHashMap<String, View> b9 = b(optString, h8);
                if (b9.containsKey(optString2) && b9.containsKey(optString3)) {
                    ViewGroup viewGroup = (ViewGroup) b9.get(optString3);
                    View view = b9.get(optString2);
                    ar.a(view);
                    if (viewGroup != null && view != null) {
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
                        if (view instanceof MBTempContainer) {
                            Iterator<View> it = b9.values().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                View next = it.next();
                                if (next instanceof MBridgeBTContainer) {
                                    ar.a(view);
                                    ((MBridgeBTContainer) next).appendSubView((MBridgeBTContainer) next, (MBTempContainer) view, optJSONObject2);
                                    break;
                                }
                            }
                        } else {
                            if (optJSONObject2 == null) {
                                if (view instanceof BTBaseView) {
                                    rect = ((BTBaseView) view).getRect();
                                    optInt = ((BTBaseView) view).getViewWidth();
                                    optInt2 = ((BTBaseView) view).getViewHeight();
                                } else {
                                    optInt = 0;
                                    rect = null;
                                    optInt2 = 0;
                                }
                            } else {
                                Rect rect2 = new Rect(optJSONObject2.optInt(TtmlNode.LEFT, -999), optJSONObject2.optInt("top", -999), optJSONObject2.optInt(TtmlNode.RIGHT, -999), optJSONObject2.optInt("bottom", -999));
                                optInt = optJSONObject2.optInt("width");
                                optInt2 = optJSONObject2.optInt("height");
                                rect = rect2;
                            }
                            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                            if (viewGroup instanceof FrameLayout) {
                                layoutParams = new FrameLayout.LayoutParams(-1, -1);
                            } else if (viewGroup instanceof RelativeLayout) {
                                layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                            } else if (viewGroup instanceof LinearLayout) {
                                layoutParams = new LinearLayout.LayoutParams(-1, -1);
                            }
                            ViewGroup.LayoutParams a9 = a(layoutParams, rect, optInt, optInt2);
                            ar.a(view);
                            viewGroup.addView(view, a9);
                        }
                        a(obj, optString2);
                        a(obj, "onAppendViewTo", optString2);
                        ad.a("OperateViews", "appendViewTo parentId = " + optString3 + " childId = " + optString2);
                        return;
                    }
                    c(obj, "view is not exist");
                    return;
                }
                c(obj, "instanceId is not exist");
                ad.a("OperateViews", "appendViewTo failed: instanceId is not exist");
                return;
            }
            c(obj, "unitId or data is empty");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "appendViewTo failed: " + th.getMessage());
        }
    }

    public final void k(Object obj, JSONObject jSONObject) {
        int optInt;
        int optInt2;
        Rect rect;
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String h8 = h(optString2);
            if (TextUtils.isEmpty(h8) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f21832b) != null) {
                h8 = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
            if (optJSONObject == null) {
                c(obj, "data is empty");
                return;
            }
            String optString3 = optJSONObject.optString("id");
            LinkedHashMap<String, View> b9 = b(optString, h8);
            if (b9.containsKey(optString3) && b9.containsKey(optString2)) {
                ViewGroup viewGroup = (ViewGroup) b9.get(optString2);
                View view = b9.get(optString3);
                if (viewGroup != null && view != null) {
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
                    if (view instanceof MBTempContainer) {
                        ad.b("OperateViews", "OperateViews setNotchString = " + String.format("%1$s-%2$s-%3$s-%4$s-%5$s", Integer.valueOf(f22990l), Integer.valueOf(f22991m), Integer.valueOf(f22992n), Integer.valueOf(f22993o), Integer.valueOf(f22994p)));
                        ((MBTempContainer) view).setNotchPadding(f22990l, f22991m, f22992n, f22993o, f22994p);
                        Iterator<View> it = b9.values().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            View next = it.next();
                            if (next instanceof MBridgeBTContainer) {
                                ar.a(view);
                                ((MBridgeBTContainer) next).appendSubView((MBridgeBTContainer) next, (MBTempContainer) view, optJSONObject2);
                                break;
                            }
                        }
                    } else {
                        if (optJSONObject2 == null) {
                            if (view instanceof BTBaseView) {
                                rect = ((BTBaseView) view).getRect();
                                optInt = ((BTBaseView) view).getViewWidth();
                                optInt2 = ((BTBaseView) view).getViewHeight();
                            } else {
                                rect = null;
                                optInt = 0;
                                optInt2 = 0;
                            }
                        } else {
                            Rect rect2 = new Rect(optJSONObject2.optInt(TtmlNode.LEFT, -999), optJSONObject2.optInt("top", -999), optJSONObject2.optInt(TtmlNode.RIGHT, -999), optJSONObject2.optInt("bottom", -999));
                            optInt = optJSONObject2.optInt("width");
                            optInt2 = optJSONObject2.optInt("height");
                            rect = rect2;
                        }
                        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                        if (viewGroup instanceof FrameLayout) {
                            layoutParams = new FrameLayout.LayoutParams(-1, -1);
                        } else if (viewGroup instanceof RelativeLayout) {
                            layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                        } else if (viewGroup instanceof LinearLayout) {
                            layoutParams = new LinearLayout.LayoutParams(-1, -1);
                        }
                        viewGroup.addView(view, a(layoutParams, rect, optInt, optInt2));
                    }
                    a(obj, optString2);
                    a(obj, "onAppendView", optString2);
                    ad.a("OperateViews", "appendSubView parentId = " + optString2 + " childId = " + optString3);
                    return;
                }
                c(obj, "view is not exist");
                return;
            }
            c(obj, "instanceId is not exist");
            ad.a("OperateViews", "appendSubView failed: instanceId is not exist");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "appendSubView failed: " + th.getMessage());
        }
    }

    public final void l(Object obj, JSONObject jSONObject) {
        int optInt;
        int optInt2;
        Rect rect;
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String h8 = h(optString2);
            if (TextUtils.isEmpty(h8) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f21832b) != null) {
                h8 = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
            if (optJSONObject != null && !TextUtils.isEmpty(optString)) {
                String optString3 = optJSONObject.optString("id");
                LinkedHashMap<String, View> b9 = b(optString, h8);
                if (b9.containsKey(optString2) && b9.containsKey(optString3)) {
                    ViewGroup viewGroup = (ViewGroup) b9.get(optString3);
                    View view = b9.get(optString2);
                    if (viewGroup != null && view != null) {
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
                        if (view instanceof MBTempContainer) {
                            Iterator<View> it = b9.values().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                View next = it.next();
                                if (next instanceof MBridgeBTContainer) {
                                    ar.a(view);
                                    ((MBridgeBTContainer) next).appendSubView((MBridgeBTContainer) next, (MBTempContainer) view, optJSONObject2);
                                    break;
                                }
                            }
                        } else {
                            if (optJSONObject2 == null) {
                                if (view instanceof BTBaseView) {
                                    rect = ((BTBaseView) view).getRect();
                                    optInt = ((BTBaseView) view).getViewWidth();
                                    optInt2 = ((BTBaseView) view).getViewHeight();
                                } else {
                                    optInt = 0;
                                    rect = null;
                                    optInt2 = 0;
                                }
                            } else {
                                Rect rect2 = new Rect(optJSONObject2.optInt(TtmlNode.LEFT, -999), optJSONObject2.optInt("top", -999), optJSONObject2.optInt(TtmlNode.RIGHT, -999), optJSONObject2.optInt("bottom", -999));
                                optInt = optJSONObject2.optInt("width");
                                optInt2 = optJSONObject2.optInt("height");
                                rect = rect2;
                            }
                            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                            if (viewGroup instanceof FrameLayout) {
                                layoutParams = new FrameLayout.LayoutParams(-1, -1);
                            } else if (viewGroup instanceof RelativeLayout) {
                                layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                            } else if (viewGroup instanceof LinearLayout) {
                                layoutParams = new LinearLayout.LayoutParams(-1, -1);
                            }
                            viewGroup.addView(view, a(layoutParams, rect, optInt, optInt2));
                        }
                        a(obj, optString2);
                        a(obj, "onAppendViewTo", optString2);
                        ad.a("OperateViews", "appendViewTo parentId = " + optString3 + " childId = " + optString2);
                        return;
                    }
                    c(obj, "view is not exist");
                    return;
                }
                c(obj, "instanceId is not exist");
                ad.a("OperateViews", "appendViewTo failed: instanceId is not exist");
                return;
            }
            c(obj, "unitId or data is empty");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "appendViewTo failed: " + th.getMessage());
        }
    }

    public final void m(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String h8 = h(optString2);
            if (TextUtils.isEmpty(h8) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f21832b) != null) {
                h8 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA) == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b9 = b(optString, h8);
            if (b9.containsKey(optString2)) {
                View view = b9.get(optString2);
                if (view != null && view.getParent() != null) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        viewGroup.bringChildToFront(view);
                        a(obj, optString2);
                        a(obj, "onBringViewToFront", optString2);
                        ad.a("OperateViews", "bringViewToFront instanceId = " + optString2);
                        return;
                    }
                    c(obj, "parent is null");
                    ad.a("OperateViews", "bringViewToFront failed: parent is null");
                    return;
                }
                c(obj, "view is null");
                ad.a("OperateViews", "bringViewToFront failed: view is null");
                return;
            }
            c(obj, "instanceId is not exist");
            ad.a("OperateViews", "bringViewToFront failed: instanceId is not exist");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "bringViewToFront failed: " + th.getMessage());
        }
    }

    public final void n(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String h8 = h(optString2);
            if (TextUtils.isEmpty(h8) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f21832b) != null) {
                h8 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA) == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b9 = b(optString, h8);
            if (b9.containsKey(optString2)) {
                View view = b9.get(optString2);
                if (view != null) {
                    view.setVisibility(8);
                    a(obj, optString2);
                    a(obj, "onHideView", optString2);
                    ad.a("OperateViews", "hideView instanceId = " + optString2);
                    return;
                }
                c(obj, "view not exist");
                ad.a("OperateViews", "hideView failed: view not exist");
                return;
            }
            c(obj, "instanceId not exist");
            ad.a("OperateViews", "hideView failed: instanceId not exist");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "hideView failed: + " + th.getMessage());
        }
    }

    public final void o(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String h8 = h(optString2);
            if (TextUtils.isEmpty(h8) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f21832b) != null) {
                h8 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA) == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b9 = b(optString, h8);
            if (b9.containsKey(optString2)) {
                View view = b9.get(optString2);
                if (view != null) {
                    view.setVisibility(0);
                    a(obj, optString2);
                    a(obj, "onShowView", optString2);
                    ad.a("OperateViews", "showView instanceId = " + optString2);
                    return;
                }
                c(obj, "view not exist");
                ad.a("OperateViews", "showView failed: view not exist instanceId = " + optString2);
                return;
            }
            c(obj, "instanceId not exist");
            ad.a("OperateViews", "showView failed: instanceId not exist instanceId = " + optString2);
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "showView failed: " + th.getMessage());
        }
    }

    public final void p(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String h8 = h(optString2);
            if (TextUtils.isEmpty(h8) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f21832b) != null) {
                h8 = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
            if (optJSONObject == null) {
                c(obj, "data is empty");
                return;
            }
            String optString3 = optJSONObject.optString("color");
            if (TextUtils.isEmpty(optString3)) {
                c(obj, "color is not exist");
                return;
            }
            LinkedHashMap<String, View> b9 = b(optString, h8);
            if (b9.containsKey(optString2)) {
                View view = b9.get(optString2);
                if (view != null) {
                    a(obj, optString2);
                    view.setBackgroundColor(Color.parseColor(optString3));
                    a(obj, "onViewBgColorChanged", optString2);
                    ad.a("OperateViews", "setViewBgColor instanceId = " + optString2);
                    return;
                }
                c(obj, "view not exist");
                ad.a("OperateViews", "setViewBgColor failed: view not exist instanceId = " + optString2);
                return;
            }
            c(obj, "instanceId not exist");
            ad.a("OperateViews", "setViewBgColor failed: instanceId not exist instanceId = " + optString2);
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "setViewBgColor failed: " + th.getMessage());
        }
    }

    public final void q(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String h8 = h(optString2);
            if (TextUtils.isEmpty(h8) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f21832b) != null) {
                h8 = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
            if (optJSONObject == null) {
                c(obj, "data is empty");
                return;
            }
            double optDouble = optJSONObject.optDouble("alpha", 1.0d);
            LinkedHashMap<String, View> b9 = b(optString, h8);
            if (b9.containsKey(optString2)) {
                View view = b9.get(optString2);
                if (view != null) {
                    view.setAlpha((float) optDouble);
                    a(obj, optString2);
                    a(obj, "onViewAlphaChanged", optString2);
                    ad.a("OperateViews", "setViewAlpha instanceId = " + optString2);
                    return;
                }
                c(obj, "view not exist");
                ad.a("OperateViews", "setViewAlpha failed: view not exist instanceId = " + optString2);
                return;
            }
            c(obj, "instanceId not exist");
            ad.a("OperateViews", "setViewAlpha failed: instanceId not exist instanceId = " + optString2);
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "setViewAlpha failed: " + th.getMessage());
        }
    }

    public final void r(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String h8 = h(optString2);
            if (TextUtils.isEmpty(h8) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f21832b) != null) {
                h8 = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
            if (optJSONObject == null) {
                c(obj, "data is empty");
                return;
            }
            double optDouble = optJSONObject.optDouble("vertical", 1.0d);
            double optDouble2 = optJSONObject.optDouble("horizon", 1.0d);
            LinkedHashMap<String, View> b9 = b(optString, h8);
            if (b9.containsKey(optString2)) {
                View view = b9.get(optString2);
                if (view != null) {
                    view.setScaleX((float) optDouble2);
                    view.setScaleY((float) optDouble);
                    a(obj, optString2);
                    a(obj, "onViewScaleChanged", optString2);
                    ad.a("OperateViews", "setViewScale instanceId = " + optString2);
                    return;
                }
                c(obj, "view not exist");
                ad.a("OperateViews", "setViewScale failed: view not exist instanceId = " + optString2);
                return;
            }
            c(obj, "instanceId not exist");
            ad.a("OperateViews", "setViewScale failed: instanceId not exist instanceId = " + optString2);
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "setViewScale failed: " + th.getMessage());
        }
    }

    public final void s(Object obj, JSONObject jSONObject) {
        int optInt;
        int optInt2;
        Rect rect;
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String h8 = h(optString2);
            if (TextUtils.isEmpty(h8) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f21832b) != null) {
                h8 = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
            if (optJSONObject == null) {
                c(obj, "data is empty");
                return;
            }
            String optString3 = optJSONObject.optString("targetComponentId");
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
            LinkedHashMap<String, View> b9 = b(optString, h8);
            if (b9.containsKey(optString2) && b9.containsKey(optString3)) {
                View view = b9.get(optString2);
                View view2 = b9.get(optString3);
                if (view2 != null && view2.getParent() != null) {
                    ViewGroup viewGroup = (ViewGroup) view2.getParent();
                    int indexOfChild = viewGroup.indexOfChild(view2);
                    if (optJSONObject2 == null) {
                        if (view instanceof BTBaseView) {
                            rect = ((BTBaseView) view).getRect();
                            optInt = ((BTBaseView) view).getViewWidth();
                            optInt2 = ((BTBaseView) view).getViewHeight();
                        } else {
                            optInt = 0;
                            rect = null;
                            optInt2 = 0;
                        }
                    } else {
                        Rect rect2 = new Rect(optJSONObject2.optInt(TtmlNode.LEFT, -999), optJSONObject2.optInt("top", -999), optJSONObject2.optInt(TtmlNode.RIGHT, -999), optJSONObject2.optInt("bottom", -999));
                        optInt = optJSONObject2.optInt("width");
                        optInt2 = optJSONObject2.optInt("height");
                        rect = rect2;
                    }
                    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                    if (viewGroup instanceof FrameLayout) {
                        layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    } else if (viewGroup instanceof RelativeLayout) {
                        layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                    } else if (viewGroup instanceof LinearLayout) {
                        layoutParams = new LinearLayout.LayoutParams(-1, -1);
                    }
                    viewGroup.addView(view, indexOfChild + 1, a(layoutParams, rect, optInt, optInt2));
                    a(obj, optString2);
                    a(obj, "onInsertViewAbove", optString2);
                    ad.a("OperateViews", "insertViewAbove instanceId = " + optString2 + " brotherId = " + optString3);
                    return;
                }
                c(obj, "view not exist");
                ad.a("OperateViews", "insertViewAbove failed: view not exist instanceId = " + optString2);
                return;
            }
            c(obj, "instanceId not exist");
            ad.a("OperateViews", "insertViewAbove failed: instanceId not exist instanceId = " + optString2);
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "insertViewAbove failed: " + th.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r3v12 */
    public final void t(Object obj, JSONObject jSONObject) {
        String str;
        Object obj2;
        String str2;
        int optInt;
        Rect rect;
        Object obj3;
        int i8;
        WindVaneWebView windVaneWebView;
        Object obj4 = obj;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String h8 = h(optString2);
            if (TextUtils.isEmpty(h8) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj4).f21832b) != null) {
                h8 = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
            if (optJSONObject == null) {
                c(obj4, "data is empty");
                return;
            }
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("content");
            if (optJSONObject2 == null) {
                c(obj4, "content is empty");
                return;
            }
            String optString3 = optJSONObject2.optString("fileURL");
            String optString4 = optJSONObject2.optString("filePath");
            String optString5 = optJSONObject2.optString("html");
            if (TextUtils.isEmpty(optString3) && TextUtils.isEmpty(optString4) && TextUtils.isEmpty(optString5)) {
                c(obj4, "url is empty");
                return;
            }
            JSONArray optJSONArray = optJSONObject2.optJSONArray("campaigns");
            List<CampaignEx> arrayList = new ArrayList<>();
            if (optJSONArray != null && optJSONArray.length() > 0) {
                int length = optJSONArray.length();
                int i9 = 0;
                while (i9 < length) {
                    JSONArray jSONArray = optJSONArray;
                    CampaignEx parseCampaignWithBackData = CampaignEx.parseCampaignWithBackData(optJSONArray.getJSONObject(i9));
                    if (parseCampaignWithBackData != null) {
                        parseCampaignWithBackData.setCampaignUnitId(optString);
                        arrayList.add(parseCampaignWithBackData);
                    }
                    i9++;
                    optJSONArray = jSONArray;
                }
            }
            String optString6 = optJSONObject2.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            com.mbridge.msdk.videocommon.d.c a9 = com.mbridge.msdk.videocommon.d.c.a(optJSONObject2.optJSONObject("unitSetting"));
            if (a9 != null) {
                a9.a(optString6);
            }
            JSONObject optJSONObject3 = jSONObject.optJSONObject("rect");
            Rect rect2 = new Rect(-999, -999, -999, -999);
            if (optJSONObject3 != null) {
                try {
                    str2 = "OperateViews";
                } catch (Throwable th) {
                    th = th;
                    str2 = "OperateViews";
                    obj3 = obj;
                    str = str2;
                    obj2 = obj3;
                    c(obj2, th.getMessage());
                    ad.a(str, "webviewLoad failed: " + th.getMessage());
                }
                try {
                    Rect rect3 = new Rect(optJSONObject3.optInt(TtmlNode.LEFT, -999), optJSONObject3.optInt("top", -999), optJSONObject3.optInt(TtmlNode.RIGHT, -999), optJSONObject3.optInt("bottom", -999));
                    int optInt2 = optJSONObject3.optInt("width");
                    optInt = optJSONObject3.optInt("height");
                    rect = rect3;
                    i8 = optInt2;
                } catch (Throwable th2) {
                    th = th2;
                    obj3 = obj;
                    str = str2;
                    obj2 = obj3;
                    c(obj2, th.getMessage());
                    ad.a(str, "webviewLoad failed: " + th.getMessage());
                }
            } else {
                str2 = "OperateViews";
                optInt = 0;
                i8 = 0;
                rect = rect2;
            }
            int optInt3 = optJSONObject2.optInt("refreshCache", 0);
            LinkedHashMap<String, View> b9 = b(optString, h8);
            try {
                if (b9.containsKey(optString2)) {
                    View view = b9.get(optString2);
                    if (view instanceof MBridgeBTWebView) {
                        MBridgeBTWebView mBridgeBTWebView = (MBridgeBTWebView) view;
                        mBridgeBTWebView.setHtml(optString5);
                        mBridgeBTWebView.setFilePath(optString4);
                        mBridgeBTWebView.setFileURL(optString3);
                        mBridgeBTWebView.setRect(rect);
                        mBridgeBTWebView.setLayout(i8, optInt);
                        mBridgeBTWebView.setCampaigns(arrayList);
                        mBridgeBTWebView.setRewardUnitSetting(a9);
                        mBridgeBTWebView.webviewLoad(optInt3);
                        Object obj5 = obj;
                        try {
                            a(obj5, optString2);
                            String str3 = str2;
                            ad.a(str3, "webviewLoad instanceId = " + optString2);
                            i8 = obj5;
                            rect = str3;
                        } catch (Throwable th3) {
                            th = th3;
                            obj3 = obj5;
                            str = str2;
                            obj2 = obj3;
                            c(obj2, th.getMessage());
                            ad.a(str, "webviewLoad failed: " + th.getMessage());
                        }
                    } else {
                        Object obj6 = obj;
                        String str4 = str2;
                        c(obj6, "view not exist");
                        ad.a(str4, "webviewLoad failed: view not exist instanceId = " + optString2);
                        i8 = obj6;
                        rect = str4;
                    }
                } else {
                    Object obj7 = obj;
                    String str5 = str2;
                    c(obj7, "instanceId not exist");
                    ad.a(str5, "webviewLoad failed: instanceId not exist instanceId = " + optString2);
                    i8 = obj7;
                    rect = str5;
                }
            } catch (Throwable th4) {
                th = th4;
                obj2 = i8;
                str = rect;
                c(obj2, th.getMessage());
                ad.a(str, "webviewLoad failed: " + th.getMessage());
            }
        } catch (Throwable th5) {
            th = th5;
            str = "OperateViews";
            obj2 = obj4;
        }
    }

    public final void u(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String h8 = h(optString2);
            if (TextUtils.isEmpty(h8) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f21832b) != null) {
                h8 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA) == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b9 = b(optString, h8);
            if (b9.containsKey(optString2)) {
                View view = b9.get(optString2);
                if (view instanceof MBridgeBTWebView) {
                    if (((MBridgeBTWebView) view).webviewReload()) {
                        a(obj, optString2);
                        ad.a("OperateViews", "webviewReload instanceId = " + optString2);
                        return;
                    }
                    c(obj, "reload failed");
                    ad.a("OperateViews", "webviewReload failed reload failed instanceId = " + optString2);
                    return;
                }
                c(obj, "view not exist");
                ad.a("OperateViews", "webviewReload failed view not exist instanceId = " + optString2);
                return;
            }
            c(obj, "instanceId not exist");
            ad.a("OperateViews", "webviewReload failed instanceId not exist instanceId = " + optString2);
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "webviewReload failed: " + th.getMessage());
        }
    }

    public final void v(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String h8 = h(optString2);
            if (TextUtils.isEmpty(h8) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f21832b) != null) {
                h8 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA) == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b9 = b(optString, h8);
            if (b9.containsKey(optString2)) {
                View view = b9.get(optString2);
                if (view instanceof MBridgeBTWebView) {
                    if (((MBridgeBTWebView) view).webviewGoBack()) {
                        a(obj, optString2);
                        ad.a("OperateViews", "webviewGoBack instanceId = " + optString2);
                        return;
                    }
                    c(obj, "webviewGoBack failed");
                    ad.a("OperateViews", "webviewGoBack failed instanceId = " + optString2);
                    return;
                }
                c(obj, "view not exist");
                ad.a("OperateViews", "webviewGoBack failed view not exist instanceId = " + optString2);
                return;
            }
            c(obj, "instanceId not exist");
            ad.a("OperateViews", "webviewGoBack failed instanceId not exist instanceId = " + optString2);
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "webviewGoBack failed: " + th.getMessage());
        }
    }

    public final void w(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String h8 = h(optString2);
            if (TextUtils.isEmpty(h8) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f21832b) != null) {
                h8 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA) == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b9 = b(optString, h8);
            if (b9.containsKey(optString2)) {
                View view = b9.get(optString2);
                if (view instanceof MBridgeBTWebView) {
                    if (((MBridgeBTWebView) view).webviewGoForward()) {
                        a(obj, optString2);
                        ad.a("OperateViews", "webviewGoForward instanceId = " + optString2);
                        return;
                    }
                    c(obj, "webviewGoForward failed");
                    ad.a("OperateViews", "webviewGoForward failed instanceId = " + optString2);
                    return;
                }
                c(obj, "view not exist");
                ad.a("OperateViews", "webviewGoForward failed view not exist instanceId = " + optString2);
                return;
            }
            c(obj, "instanceId not exist");
            ad.a("OperateViews", "webviewGoForward failed instanceId not exist instanceId = " + optString2);
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "webviewGoForward failed: " + th.getMessage());
        }
    }

    public final void x(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String h8 = h(optString2);
            if (TextUtils.isEmpty(h8) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f21832b) != null) {
                h8 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA) == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b9 = b(optString, h8);
            if (b9.containsKey(optString2)) {
                View view = b9.get(optString2);
                if (view instanceof MBridgeBTVideoView) {
                    ((MBridgeBTVideoView) view).play();
                    a(obj, optString2);
                    ad.a("OperateViews", "playerPlay success");
                    return;
                } else {
                    c(obj, "instanceId is not player");
                    ad.a("OperateViews", "playerPlay failed instanceId is not player instanceId = " + optString2);
                    return;
                }
            }
            c(obj, "instanceId not exit");
            ad.a("OperateViews", "playerPlay failed instanceId not exit instanceId = " + optString2);
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "playerPlay failed: " + th.getMessage());
        }
    }

    public final void y(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String h8 = h(optString2);
            if (TextUtils.isEmpty(h8) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f21832b) != null) {
                h8 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA) == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b9 = b(optString, h8);
            if (b9.containsKey(optString2)) {
                View view = b9.get(optString2);
                if (view instanceof MBridgeBTVideoView) {
                    ((MBridgeBTVideoView) view).pause();
                    a(obj, optString2);
                    ad.a("OperateViews", "playerPause success");
                    return;
                } else {
                    c(obj, "instanceId is not player");
                    ad.a("OperateViews", "playerPause failed instanceId is not player instanceId = " + optString2);
                    return;
                }
            }
            c(obj, "instanceId not exit");
            ad.a("OperateViews", "playerPause failed instanceId not exit instanceId = " + optString2);
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "playerPause failed: " + th.getMessage());
        }
    }

    public final void z(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String h8 = h(optString2);
            if (TextUtils.isEmpty(h8) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f21832b) != null) {
                h8 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA) == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b9 = b(optString, h8);
            if (b9.containsKey(optString2)) {
                View view = b9.get(optString2);
                if (view instanceof MBridgeBTVideoView) {
                    ((MBridgeBTVideoView) view).resume();
                    a(obj, optString2);
                    ad.a("OperateViews", "playerResume success");
                    return;
                } else {
                    c(obj, "instanceId is not player");
                    ad.a("OperateViews", "playerResume failed instanceId is not player instanceId = " + optString2);
                    return;
                }
            }
            c(obj, "instanceId not exit");
            ad.a("OperateViews", "playerResume failed instanceId not exit instanceId = " + optString2);
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "playerResume failed: " + th.getMessage());
        }
    }

    public final com.mbridge.msdk.videocommon.d.c b(String str) {
        if (f22982d.containsKey(str)) {
            return f22982d.get(str);
        }
        return null;
    }

    public final void d(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            JSONObject optJSONObject = jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
            if (optJSONObject != null && !TextUtils.isEmpty(optString)) {
                int optInt = optJSONObject.optInt(CampaignEx.JSON_NATIVE_VIDEO_MUTE);
                String str = "";
                CampaignEx parseCampaignWithBackData = CampaignEx.parseCampaignWithBackData(optJSONObject.optJSONObject("campaign"));
                if (parseCampaignWithBackData != null && !TextUtils.isEmpty(optString)) {
                    parseCampaignWithBackData.setCampaignUnitId(optString);
                    str = parseCampaignWithBackData.getRequestId();
                }
                com.mbridge.msdk.videocommon.d.c a9 = com.mbridge.msdk.videocommon.d.c.a(optJSONObject.optJSONObject("unitSetting"));
                if (a9 != null) {
                    a9.a(optString);
                }
                String optString2 = optJSONObject.optString("userId");
                if (TextUtils.isEmpty(str) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f21832b) != null) {
                    str = windVaneWebView.getRid();
                }
                LinkedHashMap<String, View> b9 = b(optString, str);
                String a10 = a();
                f22980b.put(a10, str);
                MBTempContainer mBTempContainer = new MBTempContainer(com.mbridge.msdk.foundation.controller.c.m().c());
                mBTempContainer.setInstanceId(a10);
                mBTempContainer.setUnitId(optString);
                mBTempContainer.setCampaign(parseCampaignWithBackData);
                mBTempContainer.setRewardUnitSetting(a9);
                mBTempContainer.setBigOffer(true);
                if (!TextUtils.isEmpty(optString2)) {
                    mBTempContainer.setUserId(optString2);
                }
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("reward");
                if (optJSONObject2 != null) {
                    String optString3 = optJSONObject2.optString("id");
                    com.mbridge.msdk.videocommon.b.c cVar = new com.mbridge.msdk.videocommon.b.c(optJSONObject2.optString("name"), optJSONObject2.optInt(RewardPlus.AMOUNT));
                    if (!TextUtils.isEmpty(optString3)) {
                        mBTempContainer.setRewardId(optString3);
                    }
                    if (!TextUtils.isEmpty(cVar.a())) {
                        mBTempContainer.setReward(cVar);
                    }
                }
                String optString4 = optJSONObject.optString("extra");
                if (!TextUtils.isEmpty(optString4)) {
                    mBTempContainer.setDeveloperExtraData(optString4);
                }
                mBTempContainer.setMute(optInt);
                b9.put(a10, mBTempContainer);
                f22983e.put(a10, optString);
                f22981c.put(a10, parseCampaignWithBackData);
                f22982d.put(a10, a9);
                a(obj, a10);
                ad.a("OperateViews", "createSubPlayTemplateView instanceId = " + a10);
                return;
            }
            c(obj, "unitId or data is empty");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "createSubPlayTemplateView failed：" + th.getMessage());
        }
    }

    public final CampaignEx a(String str) {
        if (f22981c.containsKey(str)) {
            return f22981c.get(str);
        }
        return null;
    }

    public final void e(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            if (jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA) != null && !TextUtils.isEmpty(optString)) {
                String h8 = h(optString2);
                if (TextUtils.isEmpty(h8) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f21832b) != null) {
                    h8 = windVaneWebView.getRid();
                }
                LinkedHashMap<String, View> b9 = b(optString, h8);
                if (b9 != null && b9.containsKey(optString2)) {
                    View view = b9.get(optString2);
                    b9.remove(optString2);
                    if (view != null && view.getParent() != null) {
                        ViewGroup viewGroup = (ViewGroup) view.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(view);
                        }
                        if (view instanceof ViewGroup) {
                            ViewGroup viewGroup2 = (ViewGroup) view;
                            if (viewGroup2.getChildCount() > 0) {
                                int childCount = viewGroup2.getChildCount();
                                for (int i8 = 0; i8 < childCount; i8++) {
                                    View childAt = viewGroup2.getChildAt(i8);
                                    if (childAt instanceof MBridgeBTWebView) {
                                        b9.remove(((MBridgeBTWebView) childAt).getInstanceId());
                                        ((MBridgeBTWebView) childAt).onDestory();
                                    } else if (childAt instanceof MBridgeBTVideoView) {
                                        b9.remove(((MBridgeBTVideoView) childAt).getInstanceId());
                                        ((MBridgeBTVideoView) childAt).onDestory();
                                    } else if (childAt instanceof MBTempContainer) {
                                        b9.remove(((MBTempContainer) childAt).getInstanceId());
                                        ((MBTempContainer) childAt).onDestroy();
                                    }
                                }
                            }
                        }
                    }
                    if (view instanceof MBTempContainer) {
                        ((MBTempContainer) view).onDestroy();
                    }
                    if (view instanceof MBridgeBTWebView) {
                        ((MBridgeBTWebView) view).onDestory();
                    }
                    if (view instanceof MBridgeBTVideoView) {
                        ((MBridgeBTVideoView) view).onDestory();
                    }
                    a(obj, optString2);
                    a(obj, "onComponentDestroy", optString2);
                    ad.a("OperateViews", "destroyComponent instanceId = " + optString2);
                    return;
                }
                c(obj, "unitId or instanceId not exist");
                ad.a("OperateViews", "destroyComponent failed");
                return;
            }
            c(obj, "unidId or data is empty");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "destroyComponent failed");
        }
    }

    public final void g(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String h8 = h(optString2);
            if (TextUtils.isEmpty(h8) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f21832b) != null) {
                h8 = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
            if (optJSONObject == null) {
                c(obj, "data is empty");
                return;
            }
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
            if (optJSONObject2 == null) {
                c(obj, "rect not exist");
                return;
            }
            LinkedHashMap<String, View> b9 = b(optString, h8);
            Rect rect = new Rect(optJSONObject2.optInt(TtmlNode.LEFT, -999), optJSONObject2.optInt("top", -999), optJSONObject2.optInt(TtmlNode.RIGHT, -999), optJSONObject2.optInt("bottom", -999));
            int optInt = optJSONObject2.optInt("width");
            int optInt2 = optJSONObject2.optInt("height");
            if (b9.containsKey(optString2)) {
                View view = b9.get(optString2);
                if (view != null) {
                    if (view.getParent() != null) {
                        view.setLayoutParams(a(view.getLayoutParams(), rect, optInt, optInt2));
                        view.requestLayout();
                    } else {
                        if (view instanceof MBridgeBTWebView) {
                            ((MBridgeBTWebView) view).setRect(rect);
                            ((MBridgeBTWebView) view).setLayout(optInt, optInt2);
                        }
                        if (view instanceof MBridgeBTVideoView) {
                            ((MBridgeBTVideoView) view).setRect(rect);
                            ((MBridgeBTVideoView) view).setLayout(optInt, optInt2);
                        }
                    }
                    a(obj, optString2);
                    a(obj, "onViewRectChanged", optString2);
                    ad.a("OperateViews", "setViewRect instanceId = " + optString2);
                    return;
                }
                c(obj, "view is null");
                ad.a("OperateViews", "setViewRect failed: view is null");
                return;
            }
            c(obj, "instanceId not exist");
            ad.a("OperateViews", "setViewRect failed: instanceId not exist");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "setViewRect failed: " + th.getMessage());
        }
    }

    private void c(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f22988j);
            jSONObject.put("message", str);
            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, new JSONObject());
            g.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e8) {
            ad.a("OperateViews", e8.getMessage());
        }
    }

    public final synchronized LinkedHashMap<String, View> b(String str, String str2) {
        if (f22979a.containsKey(str + "_" + str2)) {
            return f22979a.get(str + "_" + str2);
        }
        LinkedHashMap<String, View> linkedHashMap = new LinkedHashMap<>();
        f22979a.put(str + "_" + str2, linkedHashMap);
        return linkedHashMap;
    }

    public final void h(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String h8 = h(optString2);
            if (TextUtils.isEmpty(h8) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f21832b) != null) {
                h8 = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA) == null) {
                c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b9 = b(optString, h8);
            if (b9.containsKey(optString2)) {
                View view = b9.get(optString2);
                if (view != null && view.getParent() != null) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(view);
                        a(obj, optString2);
                        a(obj, "onRemoveFromView", optString2);
                        ad.a("OperateViews", "removeFromSuperView instanceId = " + optString2);
                        return;
                    }
                    c(obj, "parent is null");
                    ad.a("OperateViews", "removeFromSuperView failed: parent is null instanceId = " + optString2);
                    return;
                }
                c(obj, "view is null");
                ad.a("OperateViews", "removeFromSuperView failed: view is null instanceId = " + optString2);
                return;
            }
            c(obj, "params not enough");
            ad.a("OperateViews", "removeFromSuperView failed: params not enough instanceId = " + optString2);
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "removeFromSuperView failed: " + th.getMessage());
        }
    }

    public final void a(String str, String str2) {
        f22980b.put(str, str2);
    }

    public final void a(String str, Activity activity) {
        f22985g.put(str, activity);
    }

    public final void a(String str, int i8) {
        f22984f.put(str, Integer.valueOf(i8));
    }

    public final void a(WebView webView, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f22988j);
            jSONObject.put("message", str);
            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, new JSONObject());
            g.a().a(webView, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e8) {
            ad.a("OperateViews", e8.getMessage());
        }
    }

    public final void b(final Object obj, JSONObject jSONObject) {
        final Rect rect;
        final int i8;
        final int i9;
        try {
            final String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            if (TextUtils.isEmpty(optString)) {
                c(obj, "unitId is empty");
                return;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
            int optInt = optJSONObject.optInt("delay", 0);
            final String optString2 = optJSONObject.optString("fileURL");
            final String optString3 = optJSONObject.optString("filePath");
            final String optString4 = optJSONObject.optString("html");
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
            Rect rect2 = new Rect(-999, -999, -999, -999);
            if (optJSONObject2 != null) {
                Rect rect3 = new Rect(optJSONObject2.optInt(TtmlNode.LEFT, -999), optJSONObject2.optInt("top", -999), optJSONObject2.optInt(TtmlNode.RIGHT, -999), optJSONObject2.optInt("bottom", -999));
                int optInt2 = optJSONObject2.optInt("width");
                i9 = optJSONObject2.optInt("height");
                rect = rect3;
                i8 = optInt2;
            } else {
                rect = rect2;
                i8 = 0;
                i9 = 0;
            }
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.mbridge.msdk.video.bt.a.a.2
                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    WindVaneWebView windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f21832b;
                    if (windVaneWebView != null) {
                        str = windVaneWebView.getRid();
                    } else {
                        str = "";
                        windVaneWebView = null;
                    }
                    LinkedHashMap<String, View> b9 = a.this.b(optString, str);
                    String a9 = a.this.a();
                    a.f22980b.put(a9, str);
                    MBridgeBTWebView mBridgeBTWebView = new MBridgeBTWebView(com.mbridge.msdk.foundation.controller.c.m().c());
                    b9.put(a9, mBridgeBTWebView);
                    mBridgeBTWebView.setInstanceId(a9);
                    mBridgeBTWebView.setUnitId(optString);
                    mBridgeBTWebView.setFileURL(optString2);
                    mBridgeBTWebView.setFilePath(optString3);
                    mBridgeBTWebView.setHtml(optString4);
                    mBridgeBTWebView.setRect(rect);
                    mBridgeBTWebView.setWebViewRid(str);
                    mBridgeBTWebView.setCreateWebView(windVaneWebView);
                    int i10 = i8;
                    if (i10 > 0 || i9 > 0) {
                        mBridgeBTWebView.setLayout(i10, i9);
                    }
                    mBridgeBTWebView.preload();
                    a.this.a(obj, a9);
                    ad.a("OperateViews", "createWebview instanceId = " + a9);
                }
            }, optInt);
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "createWebview failed：" + th.getMessage());
        }
    }

    public final void f(Object obj, JSONObject jSONObject) {
        try {
            jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString = jSONObject.optString("id");
            if (jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA) == null) {
                c(obj, "data is empty");
            } else {
                a(obj, optString);
            }
        } catch (Throwable th) {
            c(obj, th.getMessage());
        }
    }

    public final void c(Object obj, JSONObject jSONObject) {
        b unused;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            JSONObject optJSONObject = jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
            if (optJSONObject != null && !TextUtils.isEmpty(optString)) {
                String str = "";
                CampaignEx parseCampaignWithBackData = CampaignEx.parseCampaignWithBackData(optJSONObject.optJSONObject("campaign"));
                if (parseCampaignWithBackData != null && !TextUtils.isEmpty(optString)) {
                    parseCampaignWithBackData.setCampaignUnitId(optString);
                    str = parseCampaignWithBackData.getRequestId();
                }
                int optInt = optJSONObject.optInt("show_time", 0);
                int optInt2 = optJSONObject.optInt("show_mute", 0);
                int optInt3 = optJSONObject.optInt("show_close", 0);
                int optInt4 = optJSONObject.optInt("orientation", 1);
                int optInt5 = optJSONObject.optInt("show_pgb", 0);
                MBridgeBTVideoView mBridgeBTVideoView = new MBridgeBTVideoView(com.mbridge.msdk.foundation.controller.c.m().c());
                mBridgeBTVideoView.setCampaign(parseCampaignWithBackData);
                mBridgeBTVideoView.setUnitId(optString);
                mBridgeBTVideoView.setShowMute(optInt2);
                mBridgeBTVideoView.setShowTime(optInt);
                mBridgeBTVideoView.setShowClose(optInt3);
                mBridgeBTVideoView.setOrientation(optInt4);
                mBridgeBTVideoView.setProgressBarState(optInt5);
                WindVaneWebView windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f21832b;
                if (windVaneWebView != null) {
                    str = windVaneWebView.getRid();
                    mBridgeBTVideoView.setCreateWebView(windVaneWebView);
                }
                LinkedHashMap<String, View> b9 = b(optString, str);
                String a9 = a();
                f22980b.put(a9, str);
                mBridgeBTVideoView.setInstanceId(a9);
                b9.put(a9, mBridgeBTVideoView);
                mBridgeBTVideoView.preLoadData();
                if (parseCampaignWithBackData == null) {
                    c(obj, "campaign is null");
                    ad.a("OperateViews", "createPlayerView failed");
                } else {
                    a(obj, a9);
                    ad.a("OperateViews", "createPlayerView instanceId = " + a9);
                }
                unused = b.a.f23012a;
                return;
            }
            c(obj, "unitId or data is empty");
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "createPlayerView failed：" + th.getMessage());
        }
    }

    public final void a(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f22987i);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str);
            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
            g.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e8) {
            c(obj, e8.getMessage());
            ad.a("OperateViews", e8.getMessage());
        }
    }

    private void a(Object obj, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f22987i);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str2);
            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
            g.a().a(obj, str, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e8) {
            c(obj, e8.getMessage());
            ad.a("OperateViews", e8.getMessage());
        }
    }

    public final void b(Object obj, JSONObject jSONObject, boolean z8) {
        int optInt;
        int optInt2;
        Rect rect;
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String h8 = h(optString2);
            if (TextUtils.isEmpty(h8) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f21832b) != null) {
                h8 = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
            if (optJSONObject == null) {
                c(obj, "data is empty");
                return;
            }
            String optString3 = optJSONObject.optString("targetComponentId");
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
            LinkedHashMap<String, View> b9 = b(optString, h8);
            if (b9.containsKey(optString2) && b9.containsKey(optString3)) {
                View view = b9.get(optString2);
                View view2 = b9.get(optString3);
                if (view2 != null && view2.getParent() != null) {
                    ViewGroup viewGroup = (ViewGroup) view2.getParent();
                    int indexOfChild = viewGroup.indexOfChild(view2);
                    if (optJSONObject2 == null) {
                        if (view instanceof BTBaseView) {
                            rect = ((BTBaseView) view).getRect();
                            optInt = ((BTBaseView) view).getViewWidth();
                            optInt2 = ((BTBaseView) view).getViewHeight();
                        } else {
                            rect = null;
                            optInt = 0;
                            optInt2 = 0;
                        }
                    } else {
                        Rect rect2 = new Rect(optJSONObject2.optInt(TtmlNode.LEFT, -999), optJSONObject2.optInt("top", -999), optJSONObject2.optInt(TtmlNode.RIGHT, -999), optJSONObject2.optInt("bottom", -999));
                        optInt = optJSONObject2.optInt("width");
                        optInt2 = optJSONObject2.optInt("height");
                        rect = rect2;
                    }
                    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                    if (viewGroup instanceof FrameLayout) {
                        layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    } else if (viewGroup instanceof RelativeLayout) {
                        layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                    } else if (viewGroup instanceof LinearLayout) {
                        layoutParams = new LinearLayout.LayoutParams(-1, -1);
                    }
                    ViewGroup.LayoutParams a9 = a(layoutParams, rect, optInt, optInt2);
                    if (z8) {
                        ar.a(view);
                    }
                    int i8 = indexOfChild - 1;
                    viewGroup.addView(view, i8 > -1 ? i8 : 0, a9);
                    a(obj, optString2);
                    a(obj, "onInsertViewBelow", optString2);
                    ad.a("OperateViews", "insertViewBelow instanceId = " + optString2);
                    return;
                }
                c(obj, "view not exist");
                ad.a("OperateViews", "insertViewBelow failed: view not exist instanceId = " + optString2);
                return;
            }
            c(obj, "instanceId not exist");
            ad.a("OperateViews", "insertViewBelow failed: instanceId not exist instanceId = " + optString2);
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "insertViewBelow failed: " + th.getMessage());
        }
    }

    public final void a(WebView webView, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f22987i);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str2);
            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
            g.a().a(webView, str, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e8) {
            a(webView, e8.getMessage());
            ad.a("OperateViews", e8.getMessage());
        }
    }

    public final void a(final Object obj, JSONObject jSONObject) {
        final Rect rect;
        final int i8;
        final int i9;
        try {
            final String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            if (TextUtils.isEmpty(optString)) {
                c(obj, "unitId is empty");
                return;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
            int optInt = optJSONObject.optInt("delay", 0);
            optJSONObject.optString("fileURL");
            optJSONObject.optString("filePath");
            optJSONObject.optString("html");
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
            Rect rect2 = new Rect(-999, -999, -999, -999);
            if (optJSONObject2 != null) {
                Rect rect3 = new Rect(optJSONObject2.optInt(TtmlNode.LEFT, -999), optJSONObject2.optInt("top", -999), optJSONObject2.optInt(TtmlNode.RIGHT, -999), optJSONObject2.optInt("bottom", -999));
                int optInt2 = optJSONObject2.optInt("width");
                i9 = optJSONObject2.optInt("height");
                rect = rect3;
                i8 = optInt2;
            } else {
                rect = rect2;
                i8 = 0;
                i9 = 0;
            }
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.mbridge.msdk.video.bt.a.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    WindVaneWebView windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f21832b;
                    if (windVaneWebView != null) {
                        str = windVaneWebView.getRid();
                    } else {
                        str = "";
                        windVaneWebView = null;
                    }
                    LinkedHashMap<String, View> b9 = a.this.b(optString, str);
                    String a9 = a.this.a();
                    a.f22980b.put(a9, str);
                    MBridgeBTLayout mBridgeBTLayout = new MBridgeBTLayout(com.mbridge.msdk.foundation.controller.c.m().c());
                    b9.put(a9, mBridgeBTLayout);
                    mBridgeBTLayout.setInstanceId(a9);
                    mBridgeBTLayout.setUnitId(optString);
                    mBridgeBTLayout.setWebView(windVaneWebView);
                    mBridgeBTLayout.setRect(rect);
                    int i10 = i8;
                    if (i10 > 0 || i9 > 0) {
                        mBridgeBTLayout.setLayout(i10, i9);
                    }
                    a.this.a(obj, a9);
                    ad.a("OperateViews", "create view instanceId = " + a9);
                }
            }, optInt);
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "create view failed：" + th.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.widget.LinearLayout$LayoutParams] */
    private ViewGroup.LayoutParams a(ViewGroup.LayoutParams layoutParams, Rect rect, int i8, int i9) {
        if (rect == null) {
            rect = new Rect(-999, -999, -999, -999);
        }
        Context c8 = com.mbridge.msdk.foundation.controller.c.m().c();
        if (c8 == null) {
            return layoutParams;
        }
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
            int i10 = rect.left;
            if (i10 != -999) {
                layoutParams2.leftMargin = ai.a(c8, i10);
            }
            int i11 = rect.top;
            if (i11 != -999) {
                layoutParams2.topMargin = ai.a(c8, i11);
            }
            int i12 = rect.right;
            if (i12 != -999) {
                layoutParams2.rightMargin = ai.a(c8, i12);
            }
            int i13 = rect.bottom;
            if (i13 != -999) {
                layoutParams2.bottomMargin = ai.a(c8, i13);
            }
            if (i8 > 0) {
                layoutParams2.width = ai.a(c8, i8);
            }
            if (i9 > 0) {
                layoutParams2.height = ai.a(c8, i9);
            }
            return layoutParams2;
        }
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
            int i14 = rect.left;
            if (i14 != -999) {
                layoutParams3.leftMargin = ai.a(c8, i14);
            }
            int i15 = rect.top;
            if (i15 != -999) {
                layoutParams3.topMargin = ai.a(c8, i15);
            }
            int i16 = rect.right;
            if (i16 != -999) {
                layoutParams3.rightMargin = ai.a(c8, i16);
            }
            int i17 = rect.bottom;
            if (i17 != -999) {
                layoutParams3.bottomMargin = ai.a(c8, i17);
            }
            if (i8 > 0) {
                layoutParams3.width = ai.a(c8, i8);
            }
            if (i9 > 0) {
                layoutParams3.height = ai.a(c8, i9);
            }
            return layoutParams3;
        }
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            layoutParams = new LinearLayout.LayoutParams(-1, -1);
            int i18 = rect.left;
            if (i18 != -999) {
                ((LinearLayout.LayoutParams) layoutParams).leftMargin = ai.a(c8, i18);
            }
            int i19 = rect.top;
            if (i19 != -999) {
                ((LinearLayout.LayoutParams) layoutParams).topMargin = ai.a(c8, i19);
            }
            int i20 = rect.right;
            if (i20 != -999) {
                ((LinearLayout.LayoutParams) layoutParams).rightMargin = ai.a(c8, i20);
            }
            int i21 = rect.bottom;
            if (i21 != -999) {
                ((LinearLayout.LayoutParams) layoutParams).bottomMargin = ai.a(c8, i21);
            }
            if (i8 > 0) {
                ((LinearLayout.LayoutParams) layoutParams).width = ai.a(c8, i8);
            }
            if (i9 > 0) {
                ((LinearLayout.LayoutParams) layoutParams).height = ai.a(c8, i9);
            }
        }
        return layoutParams;
    }

    public final void b(Object obj, String str) {
        ad.a("OperateViews", "reportUrls:" + str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i8 = 0; i8 < jSONArray.length(); i8++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i8);
                int optInt = jSONObject.optInt("type");
                String a9 = ai.a(jSONObject.optString("url"), "&tun=", z.q() + "");
                int optInt2 = jSONObject.optInt("report");
                if (optInt2 == 0) {
                    com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), (CampaignEx) null, "", a9, false, optInt != 0);
                } else {
                    com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), (CampaignEx) null, "", a9, false, optInt != 0, optInt2);
                }
            }
            try {
                a(obj, "");
            } catch (Throwable th) {
                th = th;
                ad.a("OperateViews", "reportUrls", th);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void a(Object obj, JSONObject jSONObject, boolean z8) {
        int optInt;
        int optInt2;
        Rect rect;
        WindVaneWebView windVaneWebView;
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String optString2 = jSONObject.optString("id");
            String h8 = h(optString2);
            if (TextUtils.isEmpty(h8) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f21832b) != null) {
                h8 = windVaneWebView.getRid();
            }
            JSONObject optJSONObject = jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
            if (optJSONObject == null) {
                c(obj, "data is empty");
                return;
            }
            String optString3 = optJSONObject.optString("targetComponentId");
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
            LinkedHashMap<String, View> b9 = b(optString, h8);
            if (b9.containsKey(optString2) && b9.containsKey(optString3)) {
                View view = b9.get(optString2);
                View view2 = b9.get(optString3);
                if (view2 != null && view2.getParent() != null) {
                    ViewGroup viewGroup = (ViewGroup) view2.getParent();
                    int indexOfChild = viewGroup.indexOfChild(view2);
                    if (optJSONObject2 == null) {
                        if (view instanceof BTBaseView) {
                            rect = ((BTBaseView) view).getRect();
                            optInt = ((BTBaseView) view).getViewWidth();
                            optInt2 = ((BTBaseView) view).getViewHeight();
                        } else {
                            optInt = 0;
                            rect = null;
                            optInt2 = 0;
                        }
                    } else {
                        Rect rect2 = new Rect(optJSONObject2.optInt(TtmlNode.LEFT, -999), optJSONObject2.optInt("top", -999), optJSONObject2.optInt(TtmlNode.RIGHT, -999), optJSONObject2.optInt("bottom", -999));
                        optInt = optJSONObject2.optInt("width");
                        optInt2 = optJSONObject2.optInt("height");
                        rect = rect2;
                    }
                    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                    if (viewGroup instanceof FrameLayout) {
                        layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    } else if (viewGroup instanceof RelativeLayout) {
                        layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                    } else if (viewGroup instanceof LinearLayout) {
                        layoutParams = new LinearLayout.LayoutParams(-1, -1);
                    }
                    ViewGroup.LayoutParams a9 = a(layoutParams, rect, optInt, optInt2);
                    if (z8) {
                        ar.a(view);
                    }
                    viewGroup.addView(view, indexOfChild + 1, a9);
                    a(obj, optString2);
                    a(obj, "onInsertViewAbove", optString2);
                    ad.a("OperateViews", "insertViewAbove instanceId = " + optString2 + " brotherId = " + optString3);
                    return;
                }
                c(obj, "view not exist");
                ad.a("OperateViews", "insertViewAbove failed: view not exist instanceId = " + optString2);
                return;
            }
            c(obj, "instanceId not exist");
            ad.a("OperateViews", "insertViewAbove failed: instanceId not exist instanceId = " + optString2);
        } catch (Throwable th) {
            c(obj, th.getMessage());
            ad.a("OperateViews", "insertViewAbove failed: " + th.getMessage());
        }
    }

    public final void a(int i8, int i9, int i10, int i11, int i12) {
        ad.a("OperateViews", "OperateViews setNotchString = " + String.format("%1$s-%2$s-%3$s-%4$s-%5$s", Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)));
        f22989k = r.a(i8, i9, i10, i11, i12);
        f22990l = i8;
        f22991m = i9;
        f22992n = i10;
        f22993o = i11;
        f22994p = i12;
    }

    static /* synthetic */ void a(a aVar, String str, CampaignEx campaignEx) {
        if (com.mbridge.msdk.foundation.same.a.d.f20693j == null || TextUtils.isEmpty(campaignEx.getId())) {
            return;
        }
        com.mbridge.msdk.foundation.same.a.d.a(str, campaignEx, "reward");
    }
}
