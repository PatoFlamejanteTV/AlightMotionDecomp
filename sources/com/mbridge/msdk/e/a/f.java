package com.mbridge.msdk.e.a;

import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;

/* loaded from: classes4.dex */
public final class f implements v {

    /* renamed from: a, reason: collision with root package name */
    private int f20035a;

    /* renamed from: b, reason: collision with root package name */
    private int f20036b;

    /* renamed from: c, reason: collision with root package name */
    private final int f20037c;

    /* renamed from: d, reason: collision with root package name */
    private final float f20038d;

    public f() {
        this(DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS, 1, 1.0f);
    }

    @Override // com.mbridge.msdk.e.a.v
    public final int a() {
        return this.f20035a;
    }

    @Override // com.mbridge.msdk.e.a.v
    public final int b() {
        return this.f20036b;
    }

    public f(int i8, int i9, float f8) {
        this.f20035a = i8;
        this.f20037c = i9;
        this.f20038d = f8;
    }

    @Override // com.mbridge.msdk.e.a.v
    public final void a(z zVar) throws z {
        int i8 = this.f20036b + 1;
        this.f20036b = i8;
        int i9 = this.f20035a;
        this.f20035a = i9 + ((int) (i9 * this.f20038d));
        if (i8 > this.f20037c) {
            throw zVar;
        }
    }
}
