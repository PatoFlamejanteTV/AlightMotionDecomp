package j4;

import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.VisualTransformation;
import g3.EnumC2906e;
import kotlin.jvm.internal.AbstractC3292y;
import n2.AbstractC3394E;
import n2.C3399b;
import r4.A0;
import r4.z0;

/* renamed from: j4.J, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3167J {

    /* renamed from: a, reason: collision with root package name */
    private final int f33860a = KeyboardCapitalization.Companion.m4873getNoneIUNYP9k();

    /* renamed from: b, reason: collision with root package name */
    private final String f33861b = "Card number";

    /* renamed from: c, reason: collision with root package name */
    private final int f33862c = AbstractC3394E.f35220a;

    /* renamed from: d, reason: collision with root package name */
    private final int f33863d = KeyboardType.Companion.m4896getNumberPasswordPjHm6EE();

    /* renamed from: e, reason: collision with root package name */
    private final VisualTransformation f33864e = new M(' ');

    public String a(String rawValue) {
        AbstractC3292y.i(rawValue, "rawValue");
        return rawValue;
    }

    public String b(String displayName) {
        AbstractC3292y.i(displayName, "displayName");
        return displayName;
    }

    public r4.y0 c(EnumC2906e brand, String number, int i8) {
        boolean z8;
        AbstractC3292y.i(brand, "brand");
        AbstractC3292y.i(number, "number");
        boolean a9 = C3399b.f35318a.a(number);
        if (brand.n(number) != -1) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (l6.n.T(number)) {
            return z0.a.f38774c;
        }
        if (brand == EnumC2906e.f32125w) {
            return new z0.c(AbstractC3394E.f35261u0, null, true, 2, null);
        }
        if (z8 && number.length() < i8) {
            return new z0.b(AbstractC3394E.f35261u0);
        }
        if (!a9) {
            return new z0.c(AbstractC3394E.f35261u0, null, true, 2, null);
        }
        if (z8 && number.length() == i8) {
            return A0.a.f37859a;
        }
        return new z0.c(AbstractC3394E.f35261u0, null, false, 6, null);
    }

    public String d(String userTyped) {
        AbstractC3292y.i(userTyped, "userTyped");
        StringBuilder sb = new StringBuilder();
        int length = userTyped.length();
        for (int i8 = 0; i8 < length; i8++) {
            char charAt = userTyped.charAt(i8);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "toString(...)");
        return sb2;
    }

    public int e() {
        return this.f33860a;
    }

    public String f() {
        return this.f33861b;
    }

    public int g() {
        return this.f33863d;
    }

    public int h() {
        return this.f33862c;
    }

    public VisualTransformation i() {
        return this.f33864e;
    }
}
