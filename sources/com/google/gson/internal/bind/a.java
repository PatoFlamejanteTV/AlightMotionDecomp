package com.google.gson.internal.bind;

import com.google.gson.d;
import com.google.gson.f;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.k;
import j$.util.Objects;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import t1.c;

/* loaded from: classes4.dex */
public final class a extends c {

    /* renamed from: p, reason: collision with root package name */
    private static final Writer f18957p = new C0385a();

    /* renamed from: q, reason: collision with root package name */
    private static final k f18958q = new k("closed");

    /* renamed from: m, reason: collision with root package name */
    private final List f18959m;

    /* renamed from: n, reason: collision with root package name */
    private String f18960n;

    /* renamed from: o, reason: collision with root package name */
    private f f18961o;

    /* renamed from: com.google.gson.internal.bind.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    class C0385a extends Writer {
        C0385a() {
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i8, int i9) {
            throw new AssertionError();
        }
    }

    public a() {
        super(f18957p);
        this.f18959m = new ArrayList();
        this.f18961o = h.f18799a;
    }

    private f U() {
        return (f) this.f18959m.get(r0.size() - 1);
    }

    private void V(f fVar) {
        if (this.f18960n != null) {
            if (!fVar.j() || p()) {
                ((i) U()).m(this.f18960n, fVar);
            }
            this.f18960n = null;
            return;
        }
        if (this.f18959m.isEmpty()) {
            this.f18961o = fVar;
            return;
        }
        f U8 = U();
        if (U8 instanceof d) {
            ((d) U8).m(fVar);
            return;
        }
        throw new IllegalStateException();
    }

    @Override // t1.c
    public c M(double d8) {
        if (!r() && (Double.isNaN(d8) || Double.isInfinite(d8))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d8);
        }
        V(new k(Double.valueOf(d8)));
        return this;
    }

    @Override // t1.c
    public c N(long j8) {
        V(new k(Long.valueOf(j8)));
        return this;
    }

    @Override // t1.c
    public c O(Boolean bool) {
        if (bool == null) {
            return z();
        }
        V(new k(bool));
        return this;
    }

    @Override // t1.c
    public c P(Number number) {
        if (number == null) {
            return z();
        }
        if (!r()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        V(new k(number));
        return this;
    }

    @Override // t1.c
    public c Q(String str) {
        if (str == null) {
            return z();
        }
        V(new k(str));
        return this;
    }

    @Override // t1.c
    public c R(boolean z8) {
        V(new k(Boolean.valueOf(z8)));
        return this;
    }

    public f T() {
        if (this.f18959m.isEmpty()) {
            return this.f18961o;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f18959m);
    }

    @Override // t1.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f18959m.isEmpty()) {
            this.f18959m.add(f18958q);
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override // t1.c, java.io.Flushable
    public void flush() {
    }

    @Override // t1.c
    public c g() {
        d dVar = new d();
        V(dVar);
        this.f18959m.add(dVar);
        return this;
    }

    @Override // t1.c
    public c h() {
        i iVar = new i();
        V(iVar);
        this.f18959m.add(iVar);
        return this;
    }

    @Override // t1.c
    public c j() {
        if (!this.f18959m.isEmpty() && this.f18960n == null) {
            if (U() instanceof d) {
                this.f18959m.remove(r0.size() - 1);
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // t1.c
    public c k() {
        if (!this.f18959m.isEmpty() && this.f18960n == null) {
            if (U() instanceof i) {
                this.f18959m.remove(r0.size() - 1);
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // t1.c
    public c u(String str) {
        Objects.requireNonNull(str, "name == null");
        if (!this.f18959m.isEmpty() && this.f18960n == null) {
            if (U() instanceof i) {
                this.f18960n = str;
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // t1.c
    public c z() {
        V(h.f18799a);
        return this;
    }
}
