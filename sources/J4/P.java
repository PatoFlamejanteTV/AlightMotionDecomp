package j4;

import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.VisualTransformation;
import g3.EnumC2906e;
import kotlin.jvm.internal.AbstractC3292y;
import n2.AbstractC3394E;
import r4.A0;
import r4.z0;

/* loaded from: classes4.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    private final int f33917a = KeyboardCapitalization.Companion.m4873getNoneIUNYP9k();

    /* renamed from: b, reason: collision with root package name */
    private final String f33918b = "cvc";

    /* renamed from: c, reason: collision with root package name */
    private final int f33919c = AbstractC3394E.f35229e0;

    /* renamed from: d, reason: collision with root package name */
    private final int f33920d = KeyboardType.Companion.m4896getNumberPasswordPjHm6EE();

    /* renamed from: e, reason: collision with root package name */
    private final VisualTransformation f33921e = VisualTransformation.Companion.getNone();

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
        if (brand.m() != -1) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (number.length() == 0) {
            return z0.a.f38774c;
        }
        if (brand == EnumC2906e.f32125w) {
            if (number.length() == i8) {
                return A0.a.f37859a;
            }
            return A0.b.f37860a;
        }
        if (z8 && number.length() < i8) {
            return new z0.b(AbstractC3394E.f35263v0);
        }
        if (z8 && number.length() > i8) {
            return new z0.c(AbstractC3394E.f35263v0, null, false, 6, null);
        }
        if (z8 && number.length() == i8) {
            return A0.a.f37859a;
        }
        return new z0.c(AbstractC3394E.f35263v0, null, false, 6, null);
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
        return this.f33917a;
    }

    public String f() {
        return this.f33918b;
    }

    public int g() {
        return this.f33920d;
    }

    public VisualTransformation h() {
        return this.f33921e;
    }
}
