package com.google.android.gms.common.api.internal;

import N.C1341d;
import O.a;
import Q.AbstractC1396p;
import q0.C3626l;

/* renamed from: com.google.android.gms.common.api.internal.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2086d {

    /* renamed from: a, reason: collision with root package name */
    private final C1341d[] f16119a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f16120b;

    /* renamed from: c, reason: collision with root package name */
    private final int f16121c;

    /* renamed from: com.google.android.gms.common.api.internal.d$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private P.i f16122a;

        /* renamed from: c, reason: collision with root package name */
        private C1341d[] f16124c;

        /* renamed from: b, reason: collision with root package name */
        private boolean f16123b = true;

        /* renamed from: d, reason: collision with root package name */
        private int f16125d = 0;

        /* synthetic */ a(P.z zVar) {
        }

        public AbstractC2086d a() {
            boolean z8;
            if (this.f16122a != null) {
                z8 = true;
            } else {
                z8 = false;
            }
            AbstractC1396p.b(z8, "execute parameter required");
            return new t(this, this.f16124c, this.f16123b, this.f16125d);
        }

        public a b(P.i iVar) {
            this.f16122a = iVar;
            return this;
        }

        public a c(boolean z8) {
            this.f16123b = z8;
            return this;
        }

        public a d(C1341d... c1341dArr) {
            this.f16124c = c1341dArr;
            return this;
        }

        public a e(int i8) {
            this.f16125d = i8;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC2086d(C1341d[] c1341dArr, boolean z8, int i8) {
        this.f16119a = c1341dArr;
        boolean z9 = false;
        if (c1341dArr != null && z8) {
            z9 = true;
        }
        this.f16120b = z9;
        this.f16121c = i8;
    }

    public static a a() {
        return new a(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void b(a.b bVar, C3626l c3626l);

    public boolean c() {
        return this.f16120b;
    }

    public final int d() {
        return this.f16121c;
    }

    public final C1341d[] e() {
        return this.f16119a;
    }
}
