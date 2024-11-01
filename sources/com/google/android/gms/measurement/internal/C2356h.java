package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.A3;
import java.util.EnumMap;

/* renamed from: com.google.android.gms.measurement.internal.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2356h {

    /* renamed from: a, reason: collision with root package name */
    private final EnumMap f17834a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2356h() {
        this.f17834a = new EnumMap(A3.a.class);
    }

    public static C2356h a(String str) {
        EnumMap enumMap = new EnumMap(A3.a.class);
        if (str.length() >= A3.a.values().length) {
            int i8 = 0;
            if (str.charAt(0) == '1') {
                A3.a[] values = A3.a.values();
                int length = values.length;
                int i9 = 1;
                while (i8 < length) {
                    enumMap.put((EnumMap) values[i8], (A3.a) EnumC2370j.b(str.charAt(i9)));
                    i8++;
                    i9++;
                }
                return new C2356h(enumMap);
            }
        }
        return new C2356h();
    }

    public final EnumC2370j b(A3.a aVar) {
        EnumC2370j enumC2370j = (EnumC2370j) this.f17834a.get(aVar);
        if (enumC2370j == null) {
            return EnumC2370j.UNSET;
        }
        return enumC2370j;
    }

    public final void c(A3.a aVar, int i8) {
        EnumC2370j enumC2370j = EnumC2370j.UNSET;
        if (i8 != -30) {
            if (i8 != -20) {
                if (i8 != -10) {
                    if (i8 != 0) {
                        if (i8 == 30) {
                            enumC2370j = EnumC2370j.INITIALIZATION;
                        }
                    }
                } else {
                    enumC2370j = EnumC2370j.MANIFEST;
                }
            }
            enumC2370j = EnumC2370j.API;
        } else {
            enumC2370j = EnumC2370j.TCF;
        }
        this.f17834a.put((EnumMap) aVar, (A3.a) enumC2370j);
    }

    public final void d(A3.a aVar, EnumC2370j enumC2370j) {
        this.f17834a.put((EnumMap) aVar, (A3.a) enumC2370j);
    }

    public final String toString() {
        char c8;
        StringBuilder sb = new StringBuilder("1");
        for (A3.a aVar : A3.a.values()) {
            EnumC2370j enumC2370j = (EnumC2370j) this.f17834a.get(aVar);
            if (enumC2370j == null) {
                enumC2370j = EnumC2370j.UNSET;
            }
            c8 = enumC2370j.f17870a;
            sb.append(c8);
        }
        return sb.toString();
    }

    private C2356h(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(A3.a.class);
        this.f17834a = enumMap2;
        enumMap2.putAll(enumMap);
    }
}
