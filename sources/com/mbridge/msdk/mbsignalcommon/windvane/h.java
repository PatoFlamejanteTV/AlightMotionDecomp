package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;

/* loaded from: classes4.dex */
public abstract class h {

    /* renamed from: b, reason: collision with root package name */
    protected Context f21855b;

    /* renamed from: c, reason: collision with root package name */
    protected Object f21856c;

    /* renamed from: d, reason: collision with root package name */
    protected WindVaneWebView f21857d;

    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        this.f21855b = context;
        this.f21857d = windVaneWebView;
    }

    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        this.f21856c = obj;
        this.f21857d = windVaneWebView;
    }
}
