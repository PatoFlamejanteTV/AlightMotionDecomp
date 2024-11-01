package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.m;
import com.google.gson.p;
import com.google.gson.q;
import com.google.gson.r;
import com.google.gson.reflect.TypeToken;
import t1.C4002a;
import t1.EnumC4003b;
import t1.c;

/* loaded from: classes4.dex */
public final class NumberTypeAdapter extends TypeAdapter {

    /* renamed from: b, reason: collision with root package name */
    private static final r f18840b = f(p.f19041b);

    /* renamed from: a, reason: collision with root package name */
    private final q f18841a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f18843a;

        static {
            int[] iArr = new int[EnumC4003b.values().length];
            f18843a = iArr;
            try {
                iArr[EnumC4003b.NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18843a[EnumC4003b.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18843a[EnumC4003b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private NumberTypeAdapter(q qVar) {
        this.f18841a = qVar;
    }

    public static r e(q qVar) {
        if (qVar == p.f19041b) {
            return f18840b;
        }
        return f(qVar);
    }

    private static r f(q qVar) {
        return new r() { // from class: com.google.gson.internal.bind.NumberTypeAdapter.1
            @Override // com.google.gson.r
            public TypeAdapter a(Gson gson, TypeToken typeToken) {
                if (typeToken.c() == Number.class) {
                    return NumberTypeAdapter.this;
                }
                return null;
            }
        };
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Number b(C4002a c4002a) {
        EnumC4003b N8 = c4002a.N();
        int i8 = a.f18843a[N8.ordinal()];
        if (i8 != 1) {
            if (i8 != 2 && i8 != 3) {
                throw new m("Expecting number, got: " + N8 + "; at path " + c4002a.getPath());
            }
            return this.f18841a.a(c4002a);
        }
        c4002a.J();
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void d(c cVar, Number number) {
        cVar.P(number);
    }
}
