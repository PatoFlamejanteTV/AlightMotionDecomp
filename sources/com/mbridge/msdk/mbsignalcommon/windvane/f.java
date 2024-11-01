package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;
import com.mbridge.msdk.mbsignalcommon.communication.BannerSignalPlugin;
import com.mbridge.msdk.mbsignalcommon.mraid.MraidSignalCommunication;
import com.mbridge.msdk.mbsignalcommon.webEnvCheck.WebGLCheckSignal;
import com.mbridge.msdk.video.signal.communication.RewardSignal;
import com.mbridge.msdk.video.signal.communication.VideoCommunication;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static HashMap<String, Class> f21850a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private Context f21851b;

    /* renamed from: c, reason: collision with root package name */
    private Object f21852c;

    /* renamed from: d, reason: collision with root package name */
    private WindVaneWebView f21853d;

    public f(Context context, WindVaneWebView windVaneWebView) {
        this.f21851b = context;
        this.f21853d = windVaneWebView;
        try {
            a(com.mbridge.msdk.mbsignalcommon.base.e.f21721a, Class.forName("com.mbridge.msdk.interstitial.signalcommon.interstitial"));
        } catch (ClassNotFoundException unused) {
        }
        try {
            int i8 = RewardSignal.f23877g;
            a(com.mbridge.msdk.mbsignalcommon.base.e.f21722b, RewardSignal.class);
        } catch (ClassNotFoundException unused2) {
        }
        try {
            int i9 = VideoCommunication.f23903g;
            a(com.mbridge.msdk.mbsignalcommon.base.e.f21723c, VideoCommunication.class);
        } catch (ClassNotFoundException unused3) {
        }
        try {
            int i10 = MraidSignalCommunication.f21794g;
            a(com.mbridge.msdk.mbsignalcommon.base.e.f21725e, MraidSignalCommunication.class);
        } catch (ClassNotFoundException unused4) {
        }
        try {
            int i11 = BannerSignalPlugin.f21786g;
            a(com.mbridge.msdk.mbsignalcommon.base.e.f21726f, BannerSignalPlugin.class);
        } catch (ClassNotFoundException unused5) {
        }
        try {
            a(com.mbridge.msdk.mbsignalcommon.base.e.f21727g, Class.forName("com.mbridge.msdk.splash.signal.SplashSignal"));
        } catch (ClassNotFoundException unused6) {
        }
        try {
            int i12 = WebGLCheckSignal.f21806g;
            a(com.mbridge.msdk.mbsignalcommon.base.e.f21728h, WebGLCheckSignal.class);
        } catch (ClassNotFoundException unused7) {
        }
        try {
            if (com.mbridge.msdk.f.b.a()) {
                Class<?> cls = Class.forName("com.mbridge.msdk.mbsignalcommon.confirmation.bridge.ConfirmationJsBridgePlugin");
                a(cls.getSimpleName(), cls);
            }
        } catch (Exception unused8) {
        }
    }

    public final void a(Context context) {
        this.f21851b = context;
    }

    public final void a(Object obj) {
        this.f21852c = obj;
    }

    private Object a(String str, WindVaneWebView windVaneWebView, Context context) {
        Class cls = f21850a.get(str);
        if (cls == null) {
            return null;
        }
        try {
            if (!h.class.isAssignableFrom(cls)) {
                return null;
            }
            h hVar = (h) cls.newInstance();
            hVar.initialize(context, windVaneWebView);
            hVar.initialize(this.f21852c, windVaneWebView);
            return hVar;
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public final void a(String str, Class cls) {
        if (f21850a == null) {
            f21850a = new HashMap<>();
        }
        f21850a.put(str, cls);
    }

    public final Object a(String str) {
        if (f21850a == null) {
            f21850a = new HashMap<>();
        }
        return a(str, this.f21853d, this.f21851b);
    }
}
