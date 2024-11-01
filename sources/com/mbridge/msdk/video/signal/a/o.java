package com.mbridge.msdk.video.signal.a;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.al;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class o extends p {

    /* renamed from: a, reason: collision with root package name */
    private Activity f23870a;

    /* renamed from: b, reason: collision with root package name */
    private MBridgeContainerView f23871b;

    public o(Activity activity, MBridgeContainerView mBridgeContainerView) {
        this.f23870a = activity;
        this.f23871b = mBridgeContainerView;
    }

    @Override // com.mbridge.msdk.video.signal.a.g, com.mbridge.msdk.video.signal.i
    public final String a() {
        if (this.f23871b == null) {
            super.a();
        } else {
            try {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.f23871b.getCampaign());
                String unitID = this.f23871b.getUnitID();
                com.mbridge.msdk.videocommon.d.c a9 = com.mbridge.msdk.videocommon.d.b.a() == null ? null : com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), unitID);
                JSONObject jSONObject = new JSONObject();
                if (a9 != null) {
                    jSONObject = a9.E();
                }
                ad.a("JSRewardVideoV1", "getEndScreenInfo success campaign = " + this.f23871b.getCampaign());
                return a(arrayList, unitID, "MAL_16.7.31,3.0.1", jSONObject);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return super.a();
    }

    @Override // com.mbridge.msdk.video.signal.a.g, com.mbridge.msdk.video.signal.i
    public final void b(String str) {
        super.b(str);
        try {
            if (this.f23870a != null && !TextUtils.isEmpty(str)) {
                if (str.equals("landscape")) {
                    this.f23870a.setRequestedOrientation(0);
                } else if (str.equals("portrait")) {
                    this.f23870a.setRequestedOrientation(1);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.g, com.mbridge.msdk.video.signal.i
    public final void c(String str) {
        MBridgeContainerView mBridgeContainerView;
        super.c(str);
        try {
            if (this.f23870a != null && !TextUtils.isEmpty(str) && (mBridgeContainerView = this.f23871b) != null) {
                mBridgeContainerView.handlerPlayableException(str);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.g, com.mbridge.msdk.video.signal.h
    public final void notifyCloseBtn(int i8) {
        super.notifyCloseBtn(i8);
        MBridgeContainerView mBridgeContainerView = this.f23871b;
        if (mBridgeContainerView != null) {
            mBridgeContainerView.notifyCloseBtn(i8);
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.g, com.mbridge.msdk.video.signal.h
    public final void toggleCloseBtn(int i8) {
        super.toggleCloseBtn(i8);
        MBridgeContainerView mBridgeContainerView = this.f23871b;
        if (mBridgeContainerView != null) {
            mBridgeContainerView.toggleCloseBtn(i8);
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.g, com.mbridge.msdk.video.signal.i
    public final void a(String str) {
        MBridgeContainerView mBridgeContainerView;
        super.a(str);
        try {
            if (this.f23870a == null || TextUtils.isEmpty(str) || !str.equals(CampaignEx.JSON_NATIVE_VIDEO_CLICK) || (mBridgeContainerView = this.f23871b) == null) {
                return;
            }
            mBridgeContainerView.triggerCloseBtn(str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private String a(List<CampaignEx> list, String str, String str2, JSONObject jSONObject) {
        if (list == null) {
            return null;
        }
        try {
            if (list.size() <= 0) {
                return null;
            }
            Object parseCamplistToJson = CampaignEx.parseCamplistToJson(list);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("campaignList", parseCamplistToJson);
            try {
                jSONObject2.put("device", new com.mbridge.msdk.foundation.tools.h(com.mbridge.msdk.foundation.controller.c.m().c()).a());
                jSONObject2.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
                jSONObject2.put("sdk_info", str2);
                jSONObject2.put("unitSetting", jSONObject);
                if (com.mbridge.msdk.c.h.a() != null) {
                    String g8 = com.mbridge.msdk.c.h.a().g(com.mbridge.msdk.foundation.controller.c.m().k());
                    if (!TextUtils.isEmpty(g8)) {
                        JSONObject jSONObject3 = new JSONObject(g8);
                        try {
                            Context c8 = com.mbridge.msdk.foundation.controller.c.m().c();
                            String obj = al.a(c8, "MBridge_ConfirmTitle" + str, "").toString();
                            String obj2 = al.a(c8, "MBridge_ConfirmContent" + str, "").toString();
                            String obj3 = al.a(c8, "MBridge_CancelText" + str, "").toString();
                            String obj4 = al.a(c8, "MBridge_ConfirmText" + str, "").toString();
                            if (!TextUtils.isEmpty(obj)) {
                                jSONObject3.put("confirm_title", obj);
                            }
                            if (!TextUtils.isEmpty(obj2)) {
                                jSONObject3.put("confirm_description", obj2);
                            }
                            if (!TextUtils.isEmpty(obj3)) {
                                jSONObject3.put("confirm_t", obj3);
                            }
                            if (!TextUtils.isEmpty(obj4)) {
                                jSONObject3.put("confirm_c_play", obj4);
                            }
                            if (!TextUtils.isEmpty(obj4)) {
                                jSONObject3.put("confirm_c_rv", obj4);
                            }
                        } catch (Exception e8) {
                            e8.printStackTrace();
                        }
                        String c9 = com.mbridge.msdk.c.h.a().c(str);
                        if (!TextUtils.isEmpty(c9)) {
                            jSONObject3.put("ivreward", new JSONObject(c9));
                        }
                        jSONObject2.put("appSetting", jSONObject3);
                    }
                }
                return jSONObject2.toString();
            } catch (JSONException e9) {
                throw new RuntimeException(e9);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
