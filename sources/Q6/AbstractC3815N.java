package q6;

import p6.EnumC3588a;
import s6.C3980F;

/* renamed from: q6.N, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3815N {

    /* renamed from: a, reason: collision with root package name */
    private static final C3980F f37392a = new C3980F("NONE");

    /* renamed from: b, reason: collision with root package name */
    private static final C3980F f37393b = new C3980F("PENDING");

    public static final w a(Object obj) {
        if (obj == null) {
            obj = r6.s.f38851a;
        }
        return new C3814M(obj);
    }

    public static final InterfaceC3821f d(InterfaceC3813L interfaceC3813L, U5.g gVar, int i8, EnumC3588a enumC3588a) {
        if (((i8 >= 0 && i8 < 2) || i8 == -2) && enumC3588a == EnumC3588a.DROP_OLDEST) {
            return interfaceC3813L;
        }
        return AbstractC3804C.e(interfaceC3813L, gVar, i8, enumC3588a);
    }
}
