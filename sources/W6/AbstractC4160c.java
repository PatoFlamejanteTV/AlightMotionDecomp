package w6;

import s6.C3980F;

/* renamed from: w6.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4160c {

    /* renamed from: a, reason: collision with root package name */
    private static final C3980F f40762a = new C3980F("NO_OWNER");

    /* renamed from: b, reason: collision with root package name */
    private static final C3980F f40763b = new C3980F("ALREADY_LOCKED_BY_OWNER");

    public static final InterfaceC4158a a(boolean z8) {
        return new C4159b(z8);
    }

    public static /* synthetic */ InterfaceC4158a b(boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = false;
        }
        return a(z8);
    }
}
