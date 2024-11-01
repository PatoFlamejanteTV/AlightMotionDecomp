package com.google.android.gms.common.api.internal;

import P.C1380d;
import Q.AbstractC1396p;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes3.dex */
public class LifecycleCallback {

    /* renamed from: a, reason: collision with root package name */
    protected final P.e f16092a;

    /* JADX INFO: Access modifiers changed from: protected */
    public LifecycleCallback(P.e eVar) {
        this.f16092a = eVar;
    }

    protected static P.e c(C1380d c1380d) {
        if (c1380d.d()) {
            return P.D.j(c1380d.b());
        }
        if (c1380d.c()) {
            return P.B.f(c1380d.a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    public static P.e d(Activity activity) {
        return c(new C1380d(activity));
    }

    @Keep
    private static P.e getChimeraLifecycleFragmentImpl(C1380d c1380d) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public Activity b() {
        Activity d8 = this.f16092a.d();
        AbstractC1396p.l(d8);
        return d8;
    }

    public void e(int i8, int i9, Intent intent) {
    }

    public void f(Bundle bundle) {
    }

    public void g() {
    }

    public void h() {
    }

    public void i(Bundle bundle) {
    }

    public void j() {
    }

    public void k() {
    }
}
