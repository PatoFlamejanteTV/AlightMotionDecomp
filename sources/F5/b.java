package F5;

import Q5.I;
import c6.InterfaceC2072n;
import com.inmobi.cmp.core.model.Vector;
import com.mbridge.msdk.MBridgeConstans;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.T;
import l6.n;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f2692a = new b();

    /* loaded from: classes5.dex */
    public static final class a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ T f2693a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(T t8) {
            super(2);
            this.f2693a = t8;
        }

        @Override // c6.InterfaceC2072n
        public Object invoke(Object obj, Object obj2) {
            char c8;
            int intValue = ((Number) obj).intValue();
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            if (intValue > 0 && intValue <= n.L((CharSequence) this.f2693a.f34573a) + 1) {
                T t8 = this.f2693a;
                StringBuilder sb = new StringBuilder((String) t8.f34573a);
                int i8 = intValue - 1;
                if (booleanValue) {
                    c8 = '1';
                } else {
                    c8 = '0';
                }
                sb.setCharAt(i8, c8);
                String sb2 = sb.toString();
                AbstractC3292y.h(sb2, "StringBuilder(result).ap…             }.toString()");
                t8.f34573a = sb2;
            }
            return I.f8786a;
        }
    }

    public final String a(Vector vector) {
        AbstractC3292y.i(vector, "vector");
        T t8 = new T();
        t8.f34573a = n.v(MBridgeConstans.ENDCARD_URL_TYPE_PL, vector.getMaxId());
        vector.forEach(new a(t8));
        return (String) t8.f34573a;
    }
}
