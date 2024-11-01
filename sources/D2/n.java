package d2;

import java.security.cert.X509Certificate;
import java.text.ParseException;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class n {
    public static List a(List list) {
        if (list == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (int i8 = 0; i8 < list.size(); i8++) {
            if (list.get(i8) != null) {
                X509Certificate a9 = o.a(((C2747a) list.get(i8)).a());
                if (a9 != null) {
                    linkedList.add(a9);
                } else {
                    throw new ParseException("Invalid X.509 certificate at position " + i8, 0);
                }
            }
        }
        return linkedList;
    }

    public static List b(List list) {
        if (list == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (int i8 = 0; i8 < list.size(); i8++) {
            Object obj = list.get(i8);
            if (obj != null) {
                if (obj instanceof String) {
                    linkedList.add(new C2747a((String) obj));
                } else {
                    throw new ParseException("The X.509 certificate at position " + i8 + " must be encoded as a Base64 string", 0);
                }
            } else {
                throw new ParseException("The X.509 certificate at position " + i8 + " must not be null", 0);
            }
        }
        return linkedList;
    }
}
