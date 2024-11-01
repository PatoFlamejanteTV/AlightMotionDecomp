package n2;

/* renamed from: n2.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3399b {

    /* renamed from: a, reason: collision with root package name */
    public static final C3399b f35318a = new C3399b();

    private C3399b() {
    }

    public final boolean a(String str) {
        if (str == null) {
            return false;
        }
        int i8 = 0;
        boolean z8 = true;
        for (int length = str.length() - 1; -1 < length; length--) {
            char charAt = str.charAt(length);
            if (!Character.isDigit(charAt)) {
                return false;
            }
            int numericValue = Character.getNumericValue(charAt);
            z8 = !z8;
            if (z8) {
                numericValue *= 2;
            }
            if (numericValue > 9) {
                numericValue -= 9;
            }
            i8 += numericValue;
        }
        if (i8 % 10 != 0) {
            return false;
        }
        return true;
    }
}
