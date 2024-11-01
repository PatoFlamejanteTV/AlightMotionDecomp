package g3;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public abstract class z {

    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32282a;

        static {
            int[] iArr = new int[y.values().length];
            try {
                iArr[y.f32276b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[y.f32277c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[y.f32278d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f32282a = iArr;
        }
    }

    public static final String a(y yVar) {
        AbstractC3292y.i(yVar, "<this>");
        int i8 = a.f32282a[yVar.ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 == 3) {
                    return "link_card_brand";
                }
                throw new Q5.p();
            }
            return "payment_method_mode";
        }
        return "passthrough";
    }
}
