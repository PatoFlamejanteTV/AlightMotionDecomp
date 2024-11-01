package com.google.android.gms.auth.api.signin;

import K.o;
import N.AbstractC1349l;
import N.C1344g;
import O.e;
import P.C1377a;
import Q.AbstractC1395o;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;

/* loaded from: classes3.dex */
public class b extends O.e {

    /* renamed from: k, reason: collision with root package name */
    private static final f f16044k = new f(null);

    /* renamed from: l, reason: collision with root package name */
    static int f16045l = 1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, H.a.f3154b, googleSignInOptions, new e.a.C0134a().b(new C1377a()).a());
    }

    private final synchronized int v() {
        int i8;
        try {
            i8 = f16045l;
            if (i8 == 1) {
                Context k8 = k();
                C1344g n8 = C1344g.n();
                int h8 = n8.h(k8, AbstractC1349l.f6370a);
                if (h8 == 0) {
                    i8 = 4;
                    f16045l = 4;
                } else if (n8.b(k8, h8, null) == null && DynamiteModule.a(k8, "com.google.android.gms.auth.api.fallback") != 0) {
                    i8 = 3;
                    f16045l = 3;
                } else {
                    i8 = 2;
                    f16045l = 2;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return i8;
    }

    public Intent s() {
        Context k8 = k();
        int v8 = v();
        int i8 = v8 - 1;
        if (v8 != 0) {
            if (i8 != 2) {
                if (i8 != 3) {
                    return o.b(k8, (GoogleSignInOptions) j());
                }
                return o.c(k8, (GoogleSignInOptions) j());
            }
            return o.a(k8, (GoogleSignInOptions) j());
        }
        throw null;
    }

    public Task t() {
        boolean z8;
        O.f b9 = b();
        Context k8 = k();
        if (v() == 3) {
            z8 = true;
        } else {
            z8 = false;
        }
        return AbstractC1395o.b(o.e(b9, k8, z8));
    }

    public Task u() {
        boolean z8;
        O.f b9 = b();
        Context k8 = k();
        if (v() == 3) {
            z8 = true;
        } else {
            z8 = false;
        }
        return AbstractC1395o.b(o.f(b9, k8, z8));
    }
}
