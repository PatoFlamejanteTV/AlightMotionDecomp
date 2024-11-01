package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2240r4;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.e4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2128e4 {

    /* renamed from: b, reason: collision with root package name */
    private static volatile C2128e4 f16710b;

    /* renamed from: c, reason: collision with root package name */
    static final C2128e4 f16711c = new C2128e4(true);

    /* renamed from: a, reason: collision with root package name */
    private final Map f16712a = Collections.emptyMap();

    /* renamed from: com.google.android.gms.internal.measurement.e4$a */
    /* loaded from: classes3.dex */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Object f16713a;

        /* renamed from: b, reason: collision with root package name */
        private final int f16714b;

        a(Object obj, int i8) {
            this.f16713a = obj;
            this.f16714b = i8;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f16713a != aVar.f16713a || this.f16714b != aVar.f16714b) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f16713a) * 65535) + this.f16714b;
        }
    }

    private C2128e4(boolean z8) {
    }

    public static C2128e4 a() {
        C2128e4 c2128e4 = f16710b;
        if (c2128e4 != null) {
            return c2128e4;
        }
        synchronized (C2128e4.class) {
            try {
                C2128e4 c2128e42 = f16710b;
                if (c2128e42 != null) {
                    return c2128e42;
                }
                C2128e4 a9 = AbstractC2225p4.a(C2128e4.class);
                f16710b = a9;
                return a9;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final AbstractC2240r4.d b(Y4 y42, int i8) {
        android.support.v4.media.a.a(this.f16712a.get(new a(y42, i8)));
        return null;
    }
}
