package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.Task;
import java.util.Map;
import q0.C3626l;
import q0.InterfaceC3620f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class f implements InterfaceC3620f {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C3626l f16128a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f16129b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(g gVar, C3626l c3626l) {
        this.f16129b = gVar;
        this.f16128a = c3626l;
    }

    @Override // q0.InterfaceC3620f
    public final void a(Task task) {
        Map map;
        map = this.f16129b.f16131b;
        map.remove(this.f16128a);
    }
}
