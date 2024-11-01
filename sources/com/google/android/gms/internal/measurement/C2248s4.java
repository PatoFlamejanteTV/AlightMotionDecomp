package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2240r4;

/* renamed from: com.google.android.gms.internal.measurement.s4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2248s4 implements U4 {

    /* renamed from: a, reason: collision with root package name */
    private static final C2248s4 f16988a = new C2248s4();

    private C2248s4() {
    }

    public static C2248s4 c() {
        return f16988a;
    }

    @Override // com.google.android.gms.internal.measurement.U4
    public final W4 a(Class cls) {
        if (AbstractC2240r4.class.isAssignableFrom(cls)) {
            try {
                return (W4) AbstractC2240r4.l(cls.asSubclass(AbstractC2240r4.class)).o(AbstractC2240r4.c.f16961c, null, null);
            } catch (Exception e8) {
                throw new RuntimeException("Unable to get message info for " + cls.getName(), e8);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
    }

    @Override // com.google.android.gms.internal.measurement.U4
    public final boolean b(Class cls) {
        return AbstractC2240r4.class.isAssignableFrom(cls);
    }
}
