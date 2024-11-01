package com.mbridge.msdk.video.signal.a;

import android.app.Activity;
import com.mbridge.msdk.video.bt.module.MBridgeBTContainer;

/* loaded from: classes4.dex */
public final class j extends c {

    /* renamed from: a, reason: collision with root package name */
    private Activity f23849a;

    /* renamed from: b, reason: collision with root package name */
    private MBridgeBTContainer f23850b;

    public j(Activity activity, MBridgeBTContainer mBridgeBTContainer) {
        this.f23849a = activity;
        this.f23850b = mBridgeBTContainer;
    }

    @Override // com.mbridge.msdk.video.signal.a.c, com.mbridge.msdk.video.signal.e
    public final void click(int i8, String str) {
        super.click(i8, str);
        MBridgeBTContainer mBridgeBTContainer = this.f23850b;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.click(i8, str);
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.c, com.mbridge.msdk.video.signal.e
    public final void handlerH5Exception(int i8, String str) {
        super.handlerH5Exception(i8, str);
        MBridgeBTContainer mBridgeBTContainer = this.f23850b;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.handlerH5Exception(i8, str);
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.c, com.mbridge.msdk.video.signal.c
    public final void reactDeveloper(Object obj, String str) {
        super.reactDeveloper(obj, str);
        MBridgeBTContainer mBridgeBTContainer = this.f23850b;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.reactDeveloper(obj, str);
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.c, com.mbridge.msdk.video.signal.c
    public final void reportUrls(Object obj, String str) {
        super.reportUrls(obj, str);
        MBridgeBTContainer mBridgeBTContainer = this.f23850b;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.reportUrls(obj, str);
        } else {
            com.mbridge.msdk.video.bt.a.d.c().b(obj, str);
        }
    }
}
