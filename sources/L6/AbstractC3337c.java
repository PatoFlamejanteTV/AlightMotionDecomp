package l6;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: l6.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3337c extends AbstractC3336b {
    public static int g(char c8) {
        int b9 = AbstractC3336b.b(c8, 10);
        if (b9 >= 0) {
            return b9;
        }
        throw new IllegalArgumentException("Char " + c8 + " is not a decimal digit");
    }

    public static final boolean h(char c8, char c9, boolean z8) {
        if (c8 == c9) {
            return true;
        }
        if (!z8) {
            return false;
        }
        char upperCase = Character.toUpperCase(c8);
        char upperCase2 = Character.toUpperCase(c9);
        if (upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) {
            return true;
        }
        return false;
    }

    public static String i(char c8) {
        return E.a(c8);
    }
}
