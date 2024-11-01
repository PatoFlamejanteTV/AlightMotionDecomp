package c;

import Q5.I;
import c6.InterfaceC2072n;
import com.inmobi.cmp.core.model.Vector;
import com.inmobi.cmp.core.model.gbc.GoogleBasicConsents;
import com.inmobi.cmp.core.model.portalconfig.GBCConsentValue;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* renamed from: c.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2001i {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f15173b;

    /* renamed from: a, reason: collision with root package name */
    public static final C2001i f15172a = new C2001i();

    /* renamed from: c, reason: collision with root package name */
    public static Vector f15174c = new Vector(null, 1, null);

    /* renamed from: c.i$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Vector f15175a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Vector vector) {
            super(2);
            this.f15175a = vector;
        }

        @Override // c6.InterfaceC2072n
        public Object invoke(Object obj, Object obj2) {
            int intValue = ((Number) obj).intValue();
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            if (!this.f15175a.contains(intValue)) {
                if (booleanValue) {
                    this.f15175a.set(intValue);
                } else {
                    this.f15175a.unset(intValue);
                }
            }
            return I.f8786a;
        }
    }

    public final Vector a(Vector vector, Vector newVector) {
        AbstractC3292y.i(newVector, "newVector");
        if (vector != null) {
            vector.forEach(new a(newVector));
        }
        return newVector;
    }

    public final GoogleBasicConsents b() {
        return new GoogleBasicConsents(c("adStorage"), c("adUserData"), c("adPersonalization"), c("analyticsStorage"));
    }

    public final GBCConsentValue c(String str) {
        boolean z8;
        Vector vector = f15174c;
        int e8 = e(str);
        if (vector.contains(e8)) {
            z8 = AbstractC3292y.d(vector.get(e8), Boolean.TRUE);
        } else {
            z8 = false;
        }
        if (z8) {
            return GBCConsentValue.GRANTED;
        }
        return GBCConsentValue.DENIED;
    }

    public final void d(int i8, GBCConsentValue value) {
        AbstractC3292y.i(value, "value");
        if (value == GBCConsentValue.GRANTED) {
            f15174c.set(i8);
        } else {
            f15174c.unset(i8);
        }
    }

    public final int e(String value) {
        AbstractC3292y.i(value, "value");
        if (AbstractC3292y.d(value, "adStorage")) {
            return 1;
        }
        if (AbstractC3292y.d(value, "adUserData")) {
            return 2;
        }
        if (AbstractC3292y.d(value, "adPersonalization")) {
            return 3;
        }
        if (AbstractC3292y.d(value, "analyticsStorage")) {
            return 4;
        }
        return 0;
    }
}
