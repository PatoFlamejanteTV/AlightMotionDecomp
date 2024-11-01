package x1;

import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import y1.C4236a;

/* loaded from: classes4.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    private static Pattern f40941a = Pattern.compile("^[0-1]*$", 2);

    public static List a(String str) {
        if (f40941a.matcher(str).matches()) {
            int i8 = 12;
            if (str.length() >= 12) {
                ArrayList arrayList = new ArrayList();
                int a9 = AbstractC4206j.a(str.substring(0, 12));
                for (int i9 = 0; i9 < a9; i9++) {
                    int i10 = i8 + 1;
                    if (AbstractC4200d.a(str.substring(i8, i10))) {
                        int i11 = i8 + 17;
                        i8 += 33;
                        int a10 = AbstractC4206j.a(str.substring(i11, i8));
                        for (int a11 = AbstractC4206j.a(str.substring(i10, i11)); a11 <= a10; a11++) {
                            arrayList.add(Integer.valueOf(a11));
                        }
                    } else {
                        i8 += 17;
                        arrayList.add(Integer.valueOf(AbstractC4206j.a(str.substring(i10, i8))));
                    }
                }
                return arrayList;
            }
        }
        throw new C4236a("Undecodable FixedIntegerRange '" + str + "'");
    }

    public static String b(List list) {
        Collections.sort(list);
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        while (i8 < list.size()) {
            int i9 = i8;
            while (i9 < list.size() - 1) {
                int i10 = i9 + 1;
                if (((Integer) list.get(i9)).intValue() + 1 == ((Integer) list.get(i10)).intValue()) {
                    i9 = i10;
                }
            }
            int i11 = i9 + 1;
            arrayList.add(list.subList(i8, i11));
            i8 = i11;
        }
        String b9 = AbstractC4206j.b(arrayList.size(), 12);
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            if (((List) arrayList.get(i12)).size() == 1) {
                b9 = b9 + MBridgeConstans.ENDCARD_URL_TYPE_PL + AbstractC4206j.b(((Integer) ((List) arrayList.get(i12)).get(0)).intValue(), 16);
            } else {
                b9 = b9 + "1" + AbstractC4206j.b(((Integer) ((List) arrayList.get(i12)).get(0)).intValue(), 16) + AbstractC4206j.b(((Integer) ((List) arrayList.get(i12)).get(((List) arrayList.get(i12)).size() - 1)).intValue(), 16);
            }
        }
        return b9;
    }
}
