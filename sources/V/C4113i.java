package v;

import android.content.Context;

/* renamed from: v.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C4113i {

    /* renamed from: a, reason: collision with root package name */
    private final Context f40404a;

    /* renamed from: b, reason: collision with root package name */
    private final E.a f40405b;

    /* renamed from: c, reason: collision with root package name */
    private final E.a f40406c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4113i(Context context, E.a aVar, E.a aVar2) {
        this.f40404a = context;
        this.f40405b = aVar;
        this.f40406c = aVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC4112h a(String str) {
        return AbstractC4112h.a(this.f40404a, this.f40405b, this.f40406c, str);
    }
}
