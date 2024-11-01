package com.stripe.android.googlepaylauncher;

import android.content.Context;
import com.stripe.android.googlepaylauncher.j;

/* loaded from: classes4.dex */
public final class d implements z5.e {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f25068a;

    /* renamed from: b, reason: collision with root package name */
    private final N5.a f25069b;

    /* renamed from: c, reason: collision with root package name */
    private final N5.a f25070c;

    /* renamed from: d, reason: collision with root package name */
    private final N5.a f25071d;

    public d(N5.a aVar, N5.a aVar2, N5.a aVar3, N5.a aVar4) {
        this.f25068a = aVar;
        this.f25069b = aVar2;
        this.f25070c = aVar3;
        this.f25071d = aVar4;
    }

    public static d a(N5.a aVar, N5.a aVar2, N5.a aVar3, N5.a aVar4) {
        return new d(aVar, aVar2, aVar3, aVar4);
    }

    public static c c(Context context, j.d dVar, v2.d dVar2, p3.i iVar) {
        return new c(context, dVar, dVar2, iVar);
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c((Context) this.f25068a.get(), (j.d) this.f25069b.get(), (v2.d) this.f25070c.get(), (p3.i) this.f25071d.get());
    }
}
