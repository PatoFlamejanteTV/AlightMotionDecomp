package x1;

import java.util.regex.Pattern;
import y1.C4236a;

/* loaded from: classes4.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    private static Pattern f40943a = Pattern.compile("^[0-1]*$", 2);

    public static String a(String str) {
        if (f40943a.matcher(str).matches() && str.length() % 6 == 0) {
            String str2 = "";
            int i8 = 0;
            while (i8 < str.length()) {
                int i9 = i8 + 6;
                int a9 = AbstractC4206j.a(str.substring(i8, i9));
                if (a9 == 63) {
                    str2 = str2 + " ";
                } else {
                    str2 = str2 + ((char) (a9 + 65));
                }
                i8 = i9;
            }
            return str2.trim();
        }
        throw new C4236a("Undecodable FixedString '" + str + "'");
    }

    public static String b(String str, int i8) {
        while (str.length() < i8) {
            str = str + " ";
        }
        String str2 = "";
        for (int i9 = 0; i9 < str.length(); i9++) {
            char charAt = str.charAt(i9);
            if (charAt == ' ') {
                str2 = str2 + AbstractC4206j.b(63, 6);
            } else if (charAt >= 'A') {
                str2 = str2 + AbstractC4206j.b(str.charAt(i9) - 'A', 6);
            } else {
                throw new y1.b("Unencodable FixedString '" + str + "'");
            }
        }
        return str2;
    }
}
