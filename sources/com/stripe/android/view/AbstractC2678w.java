package com.stripe.android.view;

import R5.AbstractC1435t;
import g3.EnumC2906e;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: com.stripe.android.view.w, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2678w {
    public static final EnumC2906e a(EnumC2906e enumC2906e, List possibleBrands, List merchantPreferredBrands) {
        AbstractC3292y.i(possibleBrands, "possibleBrands");
        AbstractC3292y.i(merchantPreferredBrands, "merchantPreferredBrands");
        Object obj = null;
        if (enumC2906e != EnumC2906e.f32125w && !AbstractC1435t.d0(possibleBrands, enumC2906e)) {
            enumC2906e = null;
        }
        Iterator it = merchantPreferredBrands.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (possibleBrands.contains((EnumC2906e) next)) {
                obj = next;
                break;
            }
        }
        EnumC2906e enumC2906e2 = (EnumC2906e) obj;
        if (enumC2906e == null) {
            if (enumC2906e2 == null) {
                return EnumC2906e.f32125w;
            }
            return enumC2906e2;
        }
        return enumC2906e;
    }
}
