package r6;

import p6.EnumC3588a;
import q6.C3803B;
import q6.InterfaceC3813L;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class y extends C3803B implements InterfaceC3813L {
    public y(int i8) {
        super(1, Integer.MAX_VALUE, EnumC3588a.DROP_OLDEST);
        d(Integer.valueOf(i8));
    }

    @Override // q6.InterfaceC3813L
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public Integer getValue() {
        Integer valueOf;
        synchronized (this) {
            valueOf = Integer.valueOf(((Number) L()).intValue());
        }
        return valueOf;
    }

    public final boolean Z(int i8) {
        boolean d8;
        synchronized (this) {
            d8 = d(Integer.valueOf(((Number) L()).intValue() + i8));
        }
        return d8;
    }
}
