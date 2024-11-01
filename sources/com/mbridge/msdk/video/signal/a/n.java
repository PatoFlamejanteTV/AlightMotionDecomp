package com.mbridge.msdk.video.signal.a;

import android.util.Base64;
import android.webkit.WebView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class n extends f {

    /* renamed from: a, reason: collision with root package name */
    private WebView f23869a;

    public n(WebView webView) {
        this.f23869a = webView;
    }

    @Override // com.mbridge.msdk.video.signal.a.f, com.mbridge.msdk.video.signal.g
    public final void a(int i8) {
        super.a(i8);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(NotificationCompat.CATEGORY_STATUS, i8);
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(this.f23869a, "onVideoStatusNotify", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.f, com.mbridge.msdk.video.signal.g
    public final void a(int i8, String str) {
        super.a(i8, str);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", i8);
            jSONObject.put("pt", str);
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(this.f23869a, "onJSClick", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.f, com.mbridge.msdk.video.signal.g
    public final void a(MBridgeVideoView.b bVar) {
        super.a(bVar);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("progress", a(bVar.f23748a, bVar.f23749b));
            jSONObject.put("time", String.valueOf(bVar.f23748a));
            jSONObject.put(TypedValues.TransitionType.S_DURATION, String.valueOf(bVar.f23749b));
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(this.f23869a, "onVideoProgressNotify", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    private String a(int i8, int i9) {
        if (i9 != 0) {
            try {
                return ai.a(Double.valueOf(i8 / i9)) + "";
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return i9 + "";
    }

    @Override // com.mbridge.msdk.video.signal.a.f, com.mbridge.msdk.video.signal.g
    public final void a(Object obj) {
        String str;
        super.a(obj);
        if (obj != null && (obj instanceof String)) {
            str = Base64.encodeToString(obj.toString().getBytes(), 2);
        } else {
            str = "";
        }
        com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(this.f23869a, "webviewshow", str);
    }

    @Override // com.mbridge.msdk.video.signal.a.f, com.mbridge.msdk.video.signal.g
    public final void a(int i8, int i9, int i10, int i11) {
        super.a(i8, i9, i10, i11);
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            String str = "landscape";
            if (i8 != 2 ? i9 != 2 : i9 == 1) {
                str = "portrait";
            }
            jSONObject2.put("orientation", str);
            jSONObject2.put("screen_width", i10);
            jSONObject2.put("screen_height", i11);
            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(this.f23869a, "showDataInfo", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
    }
}
