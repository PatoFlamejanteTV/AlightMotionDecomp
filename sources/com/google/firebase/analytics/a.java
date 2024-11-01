package com.google.firebase.analytics;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C2125e1;
import java.util.List;
import java.util.Map;
import l0.z;

/* loaded from: classes.dex */
final class a implements z {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C2125e1 f18402a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(C2125e1 c2125e1) {
        this.f18402a = c2125e1;
    }

    @Override // l0.z
    public final long A() {
        return this.f18402a.b();
    }

    @Override // l0.z
    public final String B() {
        return this.f18402a.F();
    }

    @Override // l0.z
    public final String a() {
        return this.f18402a.H();
    }

    @Override // l0.z
    public final void b(String str, String str2, Bundle bundle) {
        this.f18402a.r(str, str2, bundle);
    }

    @Override // l0.z
    public final int c(String str) {
        return this.f18402a.a(str);
    }

    @Override // l0.z
    public final String d() {
        return this.f18402a.G();
    }

    @Override // l0.z
    public final String e() {
        return this.f18402a.E();
    }

    @Override // l0.z
    public final void f(Bundle bundle) {
        this.f18402a.k(bundle);
    }

    @Override // l0.z
    public final void g(String str) {
        this.f18402a.B(str);
    }

    @Override // l0.z
    public final List h(String str, String str2) {
        return this.f18402a.g(str, str2);
    }

    @Override // l0.z
    public final void i(String str) {
        this.f18402a.y(str);
    }

    @Override // l0.z
    public final Map j(String str, String str2, boolean z8) {
        return this.f18402a.h(str, str2, z8);
    }

    @Override // l0.z
    public final void k(String str, String str2, Bundle bundle) {
        this.f18402a.z(str, str2, bundle);
    }
}
