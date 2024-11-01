package S1;

import java.util.Collection;

/* loaded from: classes4.dex */
public abstract class e {
    private static String a(Collection collection) {
        StringBuilder sb = new StringBuilder();
        Object[] array = collection.toArray();
        for (int i8 = 0; i8 < array.length; i8++) {
            if (i8 != 0) {
                if (i8 < array.length - 1) {
                    sb.append(", ");
                } else if (i8 == array.length - 1) {
                    sb.append(" or ");
                }
            }
            sb.append(array[i8].toString());
        }
        return sb.toString();
    }

    public static String b(O1.d dVar, Collection collection) {
        return "Unsupported JWE encryption method " + dVar + ", must be " + a(collection);
    }

    public static String c(O1.i iVar, Collection collection) {
        return "Unsupported JWE algorithm " + iVar + ", must be " + a(collection);
    }

    public static String d(O1.p pVar, Collection collection) {
        return "Unsupported JWS algorithm " + pVar + ", must be " + a(collection);
    }
}
