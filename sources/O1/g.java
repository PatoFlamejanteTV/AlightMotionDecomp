package O1;

import java.io.Serializable;
import java.text.ParseException;

/* loaded from: classes4.dex */
public abstract class g implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private w f6960a = null;

    /* renamed from: b, reason: collision with root package name */
    private d2.c[] f6961b = null;

    public static d2.c[] e(String str) {
        String trim = str.trim();
        int indexOf = trim.indexOf(".");
        if (indexOf != -1) {
            int i8 = indexOf + 1;
            int indexOf2 = trim.indexOf(".", i8);
            if (indexOf2 != -1) {
                int i9 = indexOf2 + 1;
                int indexOf3 = trim.indexOf(".", i9);
                if (indexOf3 == -1) {
                    return new d2.c[]{new d2.c(trim.substring(0, indexOf)), new d2.c(trim.substring(i8, indexOf2)), new d2.c(trim.substring(i9))};
                }
                int i10 = indexOf3 + 1;
                int indexOf4 = trim.indexOf(".", i10);
                if (indexOf4 != -1) {
                    if (indexOf4 != -1 && trim.indexOf(".", indexOf4 + 1) != -1) {
                        throw new ParseException("Invalid serialized unsecured/JWS/JWE object: Too many part delimiters", 0);
                    }
                    return new d2.c[]{new d2.c(trim.substring(0, indexOf)), new d2.c(trim.substring(i8, indexOf2)), new d2.c(trim.substring(i9, indexOf3)), new d2.c(trim.substring(i10, indexOf4)), new d2.c(trim.substring(indexOf4 + 1))};
                }
                throw new ParseException("Invalid serialized JWE object: Missing fourth delimiter", 0);
            }
            throw new ParseException("Invalid serialized unsecured/JWS/JWE object: Missing second delimiter", 0);
        }
        throw new ParseException("Invalid serialized unsecured/JWS/JWE object: Missing part delimiters", 0);
    }

    public String a() {
        if (this.f6961b == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (d2.c cVar : this.f6961b) {
            if (sb.length() > 0) {
                sb.append('.');
            }
            if (cVar != null) {
                sb.append(cVar);
            }
        }
        return sb.toString();
    }

    public w b() {
        return this.f6960a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(d2.c... cVarArr) {
        this.f6961b = cVarArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d(w wVar) {
        this.f6960a = wVar;
    }
}
