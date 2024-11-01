package V1;

import java.text.ParseException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes4.dex */
public enum f {
    SIGN("sign"),
    VERIFY("verify"),
    ENCRYPT("encrypt"),
    DECRYPT("decrypt"),
    WRAP_KEY("wrapKey"),
    UNWRAP_KEY("unwrapKey"),
    DERIVE_KEY("deriveKey"),
    DERIVE_BITS("deriveBits");


    /* renamed from: a, reason: collision with root package name */
    private final String f10470a;

    f(String str) {
        if (str != null) {
            this.f10470a = str;
            return;
        }
        throw new IllegalArgumentException("The key operation identifier must not be null");
    }

    public static Set b(List list) {
        f fVar;
        if (list == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str != null) {
                f[] values = values();
                int length = values.length;
                int i8 = 0;
                while (true) {
                    if (i8 < length) {
                        fVar = values[i8];
                        if (str.equals(fVar.a())) {
                            break;
                        }
                        i8++;
                    } else {
                        fVar = null;
                        break;
                    }
                }
                if (fVar != null) {
                    linkedHashSet.add(fVar);
                } else {
                    throw new ParseException("Invalid JWK operation: " + str, 0);
                }
            }
        }
        return linkedHashSet;
    }

    public String a() {
        return this.f10470a;
    }

    @Override // java.lang.Enum
    public String toString() {
        return a();
    }
}
