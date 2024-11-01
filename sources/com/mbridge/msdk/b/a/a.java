package com.mbridge.msdk.b.a;

import com.mbridge.msdk.out.PreloadListener;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public final class a implements PreloadListener {

    /* renamed from: a, reason: collision with root package name */
    WeakReference<PreloadListener> f19109a;

    /* renamed from: b, reason: collision with root package name */
    private int f19110b = 0;

    /* renamed from: c, reason: collision with root package name */
    private boolean f19111c = false;

    public a(PreloadListener preloadListener) {
        if (preloadListener != null) {
            this.f19109a = new WeakReference<>(preloadListener);
        }
    }

    public final boolean a() {
        return this.f19111c;
    }

    @Override // com.mbridge.msdk.out.PreloadListener
    public final void onPreloadFaild(String str) {
        WeakReference<PreloadListener> weakReference = this.f19109a;
        if (weakReference != null && weakReference.get() != null) {
            this.f19109a.get().onPreloadFaild(str);
        }
    }

    @Override // com.mbridge.msdk.out.PreloadListener
    public final void onPreloadSucceed() {
        WeakReference<PreloadListener> weakReference = this.f19109a;
        if (weakReference != null && weakReference.get() != null) {
            this.f19109a.get().onPreloadSucceed();
        }
    }

    public final void a(boolean z8) {
        this.f19111c = z8;
    }
}
