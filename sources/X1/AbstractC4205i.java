package x1;

import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import y1.C4236a;

/* renamed from: x1.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4205i {

    /* renamed from: a, reason: collision with root package name */
    private static Pattern f40938a = Pattern.compile("^[0-1]*$", 2);

    public static List a(String str) {
        if (f40938a.matcher(str).matches()) {
            ArrayList arrayList = new ArrayList();
            int i8 = 0;
            while (i8 < str.length()) {
                int i9 = i8 + 1;
                arrayList.add(Boolean.valueOf(AbstractC4200d.a(str.substring(i8, i9))));
                i8 = i9;
            }
            return arrayList;
        }
        throw new C4236a("Undecodable FixedBitfield '" + str + "'");
    }

    public static String b(List list, int i8) {
        String str = "";
        for (int i9 = 0; i9 < list.size(); i9++) {
            str = str + AbstractC4200d.b((Boolean) list.get(i9));
        }
        while (str.length() < i8) {
            str = str + MBridgeConstans.ENDCARD_URL_TYPE_PL;
        }
        return str;
    }
}
