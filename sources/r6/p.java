package r6;

import p6.EnumC3588a;
import q6.InterfaceC3821f;

/* loaded from: classes5.dex */
public interface p extends InterfaceC3821f {

    /* loaded from: classes5.dex */
    public static final class a {
        public static /* synthetic */ InterfaceC3821f a(p pVar, U5.g gVar, int i8, EnumC3588a enumC3588a, int i9, Object obj) {
            if (obj == null) {
                if ((i9 & 1) != 0) {
                    gVar = U5.h.f10149a;
                }
                if ((i9 & 2) != 0) {
                    i8 = -3;
                }
                if ((i9 & 4) != 0) {
                    enumC3588a = EnumC3588a.SUSPEND;
                }
                return pVar.b(gVar, i8, enumC3588a);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
        }
    }

    InterfaceC3821f b(U5.g gVar, int i8, EnumC3588a enumC3588a);
}
