package x1;

import com.mbridge.msdk.MBridgeConstans;

/* renamed from: x1.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4201e extends AbstractC4199c {
    @Override // x1.AbstractC4199c
    protected String g(String str) {
        while (str.length() % 8 > 0) {
            str = str + MBridgeConstans.ENDCARD_URL_TYPE_PL;
        }
        while (str.length() % 6 > 0) {
            str = str + MBridgeConstans.ENDCARD_URL_TYPE_PL;
        }
        return str;
    }
}
