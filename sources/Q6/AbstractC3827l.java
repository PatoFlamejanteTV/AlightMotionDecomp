package q6;

import kotlin.jvm.internal.AbstractC3292y;
import n6.InterfaceC3488x0;
import p6.EnumC3588a;
import r6.p;

/* renamed from: q6.l */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC3827l {
    public static final InterfaceC3821f a(InterfaceC3821f interfaceC3821f, int i8, EnumC3588a enumC3588a) {
        int i9;
        EnumC3588a enumC3588a2;
        if (i8 < 0 && i8 != -2 && i8 != -1) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i8).toString());
        }
        if (i8 == -1 && enumC3588a != EnumC3588a.SUSPEND) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
        if (i8 == -1) {
            enumC3588a2 = EnumC3588a.DROP_OLDEST;
            i9 = 0;
        } else {
            i9 = i8;
            enumC3588a2 = enumC3588a;
        }
        if (interfaceC3821f instanceof r6.p) {
            return p.a.a((r6.p) interfaceC3821f, null, i9, enumC3588a2, 1, null);
        }
        return new r6.h(interfaceC3821f, null, i9, enumC3588a2, 2, null);
    }

    public static /* synthetic */ InterfaceC3821f b(InterfaceC3821f interfaceC3821f, int i8, EnumC3588a enumC3588a, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = -2;
        }
        if ((i9 & 2) != 0) {
            enumC3588a = EnumC3588a.SUSPEND;
        }
        return AbstractC3823h.c(interfaceC3821f, i8, enumC3588a);
    }

    private static final void c(U5.g gVar) {
        if (gVar.get(InterfaceC3488x0.f35757n0) == null) {
            return;
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + gVar).toString());
    }

    public static final InterfaceC3821f d(InterfaceC3821f interfaceC3821f) {
        InterfaceC3821f b9;
        b9 = b(interfaceC3821f, -1, null, 2, null);
        return b9;
    }

    public static final InterfaceC3821f e(InterfaceC3821f interfaceC3821f, U5.g gVar) {
        c(gVar);
        if (!AbstractC3292y.d(gVar, U5.h.f10149a)) {
            if (interfaceC3821f instanceof r6.p) {
                return p.a.a((r6.p) interfaceC3821f, gVar, 0, null, 6, null);
            }
            return new r6.h(interfaceC3821f, gVar, 0, null, 12, null);
        }
        return interfaceC3821f;
    }
}
