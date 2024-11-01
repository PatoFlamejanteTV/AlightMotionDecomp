package com.mbridge.msdk.mbsignalcommon.webEnvCheck;

import com.mbridge.msdk.foundation.controller.c;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class WebGLCheckSignal extends BaseWebGLCheckSignal {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f21806g = 0;

    public void webglState(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            c.m().c(jSONObject.optInt("webgl"));
            c.m().a(jSONObject);
        } catch (JSONException e8) {
            e8.printStackTrace();
        }
    }
}
