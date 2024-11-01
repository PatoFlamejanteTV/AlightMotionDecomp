package com.stripe.android.view;

import java.util.Calendar;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    public static final X f28885a = new X();

    private X() {
    }

    public static final boolean c(int i8, int i9) {
        if (i9 < 100) {
            i9 = f28885a.a(i9);
        }
        Calendar calendar = Calendar.getInstance();
        AbstractC3292y.h(calendar, "getInstance(...)");
        return d(i8, i9, calendar);
    }

    public static final boolean d(int i8, int i9, Calendar calendar) {
        int i10;
        AbstractC3292y.i(calendar, "calendar");
        if (1 > i8 || i8 >= 13 || i9 < 0 || i9 >= 9981 || i9 < (i10 = calendar.get(1))) {
            return false;
        }
        if (i9 <= i10 && i8 < calendar.get(2) + 1) {
            return false;
        }
        return true;
    }

    public final int a(int i8) {
        Calendar calendar = Calendar.getInstance();
        AbstractC3292y.h(calendar, "getInstance(...)");
        return b(i8, calendar);
    }

    public final int b(int i8, Calendar calendar) {
        AbstractC3292y.i(calendar, "calendar");
        int i9 = calendar.get(1);
        int i10 = i9 / 100;
        int i11 = i9 % 100;
        if (i11 > 80 && i8 < 20) {
            i10++;
        } else if (i11 < 20 && i8 > 80) {
            i10--;
        }
        return (i10 * 100) + i8;
    }
}
