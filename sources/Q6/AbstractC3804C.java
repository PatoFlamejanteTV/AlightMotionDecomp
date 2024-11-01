package q6;

import p6.EnumC3588a;
import s6.C3980F;

/* renamed from: q6.C */
/* loaded from: classes5.dex */
public abstract class AbstractC3804C {

    /* renamed from: a */
    public static final C3980F f37351a = new C3980F("NO_VALUE");

    public static final v a(int i8, int i9, EnumC3588a enumC3588a) {
        if (i8 >= 0) {
            if (i9 >= 0) {
                if (i8 <= 0 && i9 <= 0 && enumC3588a != EnumC3588a.SUSPEND) {
                    throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + enumC3588a).toString());
                }
                int i10 = i9 + i8;
                if (i10 < 0) {
                    i10 = Integer.MAX_VALUE;
                }
                return new C3803B(i8, i10, enumC3588a);
            }
            throw new IllegalArgumentException(("extraBufferCapacity cannot be negative, but was " + i9).toString());
        }
        throw new IllegalArgumentException(("replay cannot be negative, but was " + i8).toString());
    }

    public static /* synthetic */ v b(int i8, int i9, EnumC3588a enumC3588a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = 0;
        }
        if ((i10 & 4) != 0) {
            enumC3588a = EnumC3588a.SUSPEND;
        }
        return a(i8, i9, enumC3588a);
    }

    public static final InterfaceC3821f e(InterfaceC3802A interfaceC3802A, U5.g gVar, int i8, EnumC3588a enumC3588a) {
        if ((i8 == 0 || i8 == -3) && enumC3588a == EnumC3588a.SUSPEND) {
            return interfaceC3802A;
        }
        return new r6.h(interfaceC3802A, gVar, i8, enumC3588a);
    }

    public static final Object f(Object[] objArr, long j8) {
        return objArr[(objArr.length - 1) & ((int) j8)];
    }

    public static final void g(Object[] objArr, long j8, Object obj) {
        objArr[(objArr.length - 1) & ((int) j8)] = obj;
    }
}
