package com.mbridge.msdk.video.signal.factory;

import com.mbridge.msdk.video.signal.a.e;
import com.mbridge.msdk.video.signal.a.h;
import com.mbridge.msdk.video.signal.c;
import com.mbridge.msdk.video.signal.d;
import com.mbridge.msdk.video.signal.f;
import com.mbridge.msdk.video.signal.g;
import com.mbridge.msdk.video.signal.i;
import com.mbridge.msdk.video.signal.j;

/* loaded from: classes4.dex */
public class a implements IJSFactory {

    /* renamed from: a, reason: collision with root package name */
    protected com.mbridge.msdk.video.signal.b f24171a;

    /* renamed from: b, reason: collision with root package name */
    protected d f24172b;

    /* renamed from: c, reason: collision with root package name */
    protected j f24173c;

    /* renamed from: d, reason: collision with root package name */
    protected g f24174d;

    /* renamed from: e, reason: collision with root package name */
    protected f f24175e;

    /* renamed from: f, reason: collision with root package name */
    protected i f24176f;

    /* renamed from: g, reason: collision with root package name */
    protected c f24177g;

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.b getActivityProxy() {
        if (this.f24171a == null) {
            this.f24171a = new com.mbridge.msdk.video.signal.a.b();
        }
        return this.f24171a;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public i getIJSRewardVideoV1() {
        if (this.f24176f == null) {
            this.f24176f = new com.mbridge.msdk.video.signal.a.g();
        }
        return this.f24176f;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public c getJSBTModule() {
        if (this.f24177g == null) {
            this.f24177g = new com.mbridge.msdk.video.signal.a.c();
        }
        return this.f24177g;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public d getJSCommon() {
        if (this.f24172b == null) {
            this.f24172b = new com.mbridge.msdk.video.signal.a.d();
        }
        return this.f24172b;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public f getJSContainerModule() {
        if (this.f24175e == null) {
            this.f24175e = new e();
        }
        return this.f24175e;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public g getJSNotifyProxy() {
        if (this.f24174d == null) {
            this.f24174d = new com.mbridge.msdk.video.signal.a.f();
        }
        return this.f24174d;
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public j getJSVideoModule() {
        if (this.f24173c == null) {
            this.f24173c = new h();
        }
        return this.f24173c;
    }
}
