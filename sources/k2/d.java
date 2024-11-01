package K2;

import D3.f;
import R5.AbstractC1435t;
import c6.InterfaceC2072n;
import com.stripe.android.model.o;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes4.dex */
public abstract class d {

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ o f4577a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(o oVar) {
            super(2);
            this.f4577a = oVar;
        }

        @Override // c6.InterfaceC2072n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(o oVar, o oVar2) {
            int i8;
            if (AbstractC3292y.d(oVar.f25631a, this.f4577a.f25631a)) {
                i8 = -1;
            } else if (AbstractC3292y.d(oVar2.f25631a, this.f4577a.f25631a)) {
                i8 = 1;
            } else {
                i8 = 0;
            }
            return Integer.valueOf(i8);
        }
    }

    public static final List b(List paymentMethods, f.C0023f c0023f) {
        AbstractC3292y.i(paymentMethods, "paymentMethods");
        if (c0023f != null) {
            final a aVar = new a(c0023f.r());
            List P02 = AbstractC1435t.P0(paymentMethods, new Comparator() { // from class: K2.c
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int c8;
                    c8 = d.c(InterfaceC2072n.this, obj, obj2);
                    return c8;
                }
            });
            if (P02 != null) {
                return P02;
            }
            return paymentMethods;
        }
        return paymentMethods;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(InterfaceC2072n tmp0, Object obj, Object obj2) {
        AbstractC3292y.i(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }
}
