package com.google.android.gms.measurement.internal;

import android.net.Uri;

/* renamed from: com.google.android.gms.measurement.internal.q4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC2424q4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ boolean f18019a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Uri f18020b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f18021c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ String f18022d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ C2403n4 f18023e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2424q4(C2403n4 c2403n4, boolean z8, Uri uri, String str, String str2) {
        this.f18019a = z8;
        this.f18020b = uri;
        this.f18021c = str;
        this.f18022d = str2;
        this.f18023e = c2403n4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2403n4.a(this.f18023e, this.f18019a, this.f18020b, this.f18021c, this.f18022d);
    }
}
