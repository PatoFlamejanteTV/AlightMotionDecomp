package i6;

import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: i6.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC2978f {

    /* renamed from: i6.f$a */
    /* loaded from: classes5.dex */
    public static final class a {
        public static boolean a(InterfaceC2978f interfaceC2978f, Comparable value) {
            AbstractC3292y.i(value, "value");
            if (value.compareTo(interfaceC2978f.getStart()) >= 0 && value.compareTo(interfaceC2978f.getEndInclusive()) <= 0) {
                return true;
            }
            return false;
        }

        public static boolean b(InterfaceC2978f interfaceC2978f) {
            if (interfaceC2978f.getStart().compareTo(interfaceC2978f.getEndInclusive()) > 0) {
                return true;
            }
            return false;
        }
    }

    Comparable getEndInclusive();

    Comparable getStart();

    boolean isEmpty();
}
