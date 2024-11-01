package com.google.gson;

import java.math.BigDecimal;
import t1.C4002a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public abstract class p implements q {

    /* renamed from: a, reason: collision with root package name */
    public static final p f19040a;

    /* renamed from: b, reason: collision with root package name */
    public static final p f19041b;

    /* renamed from: c, reason: collision with root package name */
    public static final p f19042c;

    /* renamed from: d, reason: collision with root package name */
    public static final p f19043d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ p[] f19044e;

    /* loaded from: classes4.dex */
    enum a extends p {
        a(String str, int i8) {
            super(str, i8, null);
        }

        @Override // com.google.gson.q
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Double a(C4002a c4002a) {
            return Double.valueOf(c4002a.E());
        }
    }

    static {
        a aVar = new a("DOUBLE", 0);
        f19040a = aVar;
        p pVar = new p("LAZILY_PARSED_NUMBER", 1) { // from class: com.google.gson.p.b
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.q
            public Number a(C4002a c4002a) {
                return new com.google.gson.internal.f(c4002a.L());
            }
        };
        f19041b = pVar;
        p pVar2 = new p("LONG_OR_DOUBLE", 2) { // from class: com.google.gson.p.c
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.q
            public Number a(C4002a c4002a) {
                String L8 = c4002a.L();
                try {
                    try {
                        return Long.valueOf(Long.parseLong(L8));
                    } catch (NumberFormatException e8) {
                        throw new j("Cannot parse " + L8 + "; at path " + c4002a.r(), e8);
                    }
                } catch (NumberFormatException unused) {
                    Double valueOf = Double.valueOf(L8);
                    if (!valueOf.isInfinite()) {
                        if (valueOf.isNaN()) {
                        }
                        return valueOf;
                    }
                    if (!c4002a.u()) {
                        throw new t1.d("JSON forbids NaN and infinities: " + valueOf + "; at path " + c4002a.r());
                    }
                    return valueOf;
                }
            }
        };
        f19042c = pVar2;
        p pVar3 = new p("BIG_DECIMAL", 3) { // from class: com.google.gson.p.d
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.q
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public BigDecimal a(C4002a c4002a) {
                String L8 = c4002a.L();
                try {
                    return new BigDecimal(L8);
                } catch (NumberFormatException e8) {
                    throw new j("Cannot parse " + L8 + "; at path " + c4002a.r(), e8);
                }
            }
        };
        f19043d = pVar3;
        f19044e = new p[]{aVar, pVar, pVar2, pVar3};
    }

    private p(String str, int i8) {
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) f19044e.clone();
    }

    /* synthetic */ p(String str, int i8, a aVar) {
        this(str, i8);
    }
}
