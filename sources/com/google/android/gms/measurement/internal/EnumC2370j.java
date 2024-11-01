package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
enum EnumC2370j {
    UNSET('0'),
    REMOTE_DEFAULT('1'),
    REMOTE_DELEGATION('2'),
    MANIFEST('3'),
    INITIALIZATION('4'),
    API('5'),
    CHILD_ACCOUNT('6'),
    TCF('7'),
    REMOTE_ENFORCED_DEFAULT('8'),
    FAILSAFE('9');


    /* renamed from: a, reason: collision with root package name */
    private final char f17870a;

    EnumC2370j(char c8) {
        this.f17870a = c8;
    }

    public static EnumC2370j b(char c8) {
        for (EnumC2370j enumC2370j : values()) {
            if (enumC2370j.f17870a == c8) {
                return enumC2370j;
            }
        }
        return UNSET;
    }
}
