package x1;

import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.regex.Pattern;
import y1.C4236a;

/* renamed from: x1.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4203g {

    /* renamed from: a, reason: collision with root package name */
    private static Pattern f40936a = Pattern.compile("^[0-1]*$", 2);

    public static int a(String str) {
        if (f40936a.matcher(str).matches() && str.length() >= 2 && str.indexOf("11") == str.length() - 2) {
            ArrayList arrayList = new ArrayList();
            for (int i8 = 0; i8 < str.length() - 1; i8++) {
                if (i8 == 0) {
                    arrayList.add(1);
                } else if (i8 == 1) {
                    arrayList.add(2);
                } else {
                    arrayList.add(Integer.valueOf(((Integer) arrayList.get(i8 - 1)).intValue() + ((Integer) arrayList.get(i8 - 2)).intValue()));
                }
            }
            int i9 = 0;
            for (int i10 = 0; i10 < str.length() - 1; i10++) {
                if (str.charAt(i10) == '1') {
                    i9 += ((Integer) arrayList.get(i10)).intValue();
                }
            }
            return i9;
        }
        throw new C4236a("Undecodable FibonacciInteger '" + str + "'");
    }

    public static String b(int i8) {
        ArrayList arrayList = new ArrayList();
        if (i8 >= 1) {
            arrayList.add(1);
            int i9 = 2;
            if (i8 >= 2) {
                arrayList.add(2);
                while (true) {
                    int i10 = i9 - 1;
                    int i11 = i9 - 2;
                    if (i8 < ((Integer) arrayList.get(i10)).intValue() + ((Integer) arrayList.get(i11)).intValue()) {
                        break;
                    }
                    arrayList.add(Integer.valueOf(((Integer) arrayList.get(i10)).intValue() + ((Integer) arrayList.get(i11)).intValue()));
                    i9++;
                }
            }
        }
        String str = "1";
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            int intValue = ((Integer) arrayList.get(size)).intValue();
            if (i8 >= intValue) {
                str = "1" + str;
                i8 -= intValue;
            } else {
                str = MBridgeConstans.ENDCARD_URL_TYPE_PL + str;
            }
        }
        return str;
    }
}
