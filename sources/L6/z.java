package l6;

import R5.e0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class z extends y {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f34806a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(CharSequence it) {
            AbstractC3292y.i(it, "it");
            return it.toString();
        }
    }

    public static List O0(CharSequence charSequence, int i8) {
        AbstractC3292y.i(charSequence, "<this>");
        return X0(charSequence, i8, i8, true);
    }

    public static String P0(String str, int i8) {
        AbstractC3292y.i(str, "<this>");
        if (i8 >= 0) {
            String substring = str.substring(i6.m.g(i8, str.length()));
            AbstractC3292y.h(substring, "substring(...)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i8 + " is less than zero.").toString());
    }

    public static char Q0(CharSequence charSequence) {
        AbstractC3292y.i(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static char R0(CharSequence charSequence) {
        AbstractC3292y.i(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(n.L(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static char S0(CharSequence charSequence) {
        AbstractC3292y.i(charSequence, "<this>");
        int length = charSequence.length();
        if (length != 0) {
            if (length == 1) {
                return charSequence.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static String T0(String str, i6.i indices) {
        AbstractC3292y.i(str, "<this>");
        AbstractC3292y.i(indices, "indices");
        if (indices.isEmpty()) {
            return "";
        }
        return x.A0(str, indices);
    }

    public static String U0(String str, int i8) {
        AbstractC3292y.i(str, "<this>");
        if (i8 >= 0) {
            String substring = str.substring(0, i6.m.g(i8, str.length()));
            AbstractC3292y.h(substring, "substring(...)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i8 + " is less than zero.").toString());
    }

    public static String V0(String str, int i8) {
        AbstractC3292y.i(str, "<this>");
        if (i8 >= 0) {
            int length = str.length();
            String substring = str.substring(length - i6.m.g(i8, length));
            AbstractC3292y.h(substring, "substring(...)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i8 + " is less than zero.").toString());
    }

    public static Collection W0(CharSequence charSequence, Collection destination) {
        AbstractC3292y.i(charSequence, "<this>");
        AbstractC3292y.i(destination, "destination");
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            destination.add(Character.valueOf(charSequence.charAt(i8)));
        }
        return destination;
    }

    public static final List X0(CharSequence charSequence, int i8, int i9, boolean z8) {
        AbstractC3292y.i(charSequence, "<this>");
        return Y0(charSequence, i8, i9, z8, a.f34806a);
    }

    public static final List Y0(CharSequence charSequence, int i8, int i9, boolean z8, Function1 transform) {
        int i10;
        AbstractC3292y.i(charSequence, "<this>");
        AbstractC3292y.i(transform, "transform");
        e0.a(i8, i9);
        int length = charSequence.length();
        int i11 = length / i9;
        int i12 = 0;
        if (length % i9 == 0) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        ArrayList arrayList = new ArrayList(i11 + i10);
        while (i12 >= 0 && i12 < length) {
            int i13 = i12 + i8;
            if (i13 < 0 || i13 > length) {
                if (!z8) {
                    break;
                }
                i13 = length;
            }
            arrayList.add(transform.invoke(charSequence.subSequence(i12, i13)));
            i12 += i9;
        }
        return arrayList;
    }
}
