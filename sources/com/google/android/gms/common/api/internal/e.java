package com.google.android.gms.common.api.internal;

import O.g;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class e implements g.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BasePendingResult f16126a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f16127b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(g gVar, BasePendingResult basePendingResult) {
        this.f16127b = gVar;
        this.f16126a = basePendingResult;
    }

    @Override // O.g.a
    public final void a(Status status) {
        Map map;
        map = this.f16127b.f16130a;
        map.remove(this.f16126a);
    }
}
