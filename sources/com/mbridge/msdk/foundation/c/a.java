package com.mbridge.msdk.foundation.c;

import android.text.TextUtils;
import android.util.SparseArray;
import com.mbridge.msdk.newreward.function.common.MBridgeError;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final SparseArray<String> f20273a;

    static {
        SparseArray<String> sparseArray = new SparseArray<>();
        f20273a = sparseArray;
        sparseArray.put(880022, "exception when request");
        sparseArray.put(880001, "v3 params invalid");
        sparseArray.put(880002, "v3 request error");
        sparseArray.put(880003, "v3 response error");
        sparseArray.put(880004, "video download error");
        sparseArray.put(880005, "big template download error");
        sparseArray.put(880006, "template download error");
        sparseArray.put(880007, "endcard template download error");
        sparseArray.put(880039, "image download error");
        sparseArray.put(880008, "big template render error");
        sparseArray.put(880009, "template render error");
        sparseArray.put(880010, "load time out error");
        sparseArray.put(880012, "render half img fail");
        sparseArray.put(880013, "write marid fail");
        sparseArray.put(880014, "download js file fail");
        sparseArray.put(880015, "isready false error");
        sparseArray.put(880016, "current unit is loading");
        sparseArray.put(880017, "adn no offer fill");
        sparseArray.put(880018, "local return empty");
        sparseArray.put(880021, "app already install");
        sparseArray.put(880019, "ad over cap");
        sparseArray.put(880020, "load exception");
        sparseArray.put(880023, "v3 time out");
        sparseArray.put(880024, MBridgeError.ERROR_MESSAGE_UN_KNOWN);
        sparseArray.put(880025, "context is null");
        sparseArray.put(880026, "auto refresh fail because unitId status is pause or stop");
        sparseArray.put(880027, "download resource fail");
        sparseArray.put(880000, "has exception happen : ");
        sparseArray.put(880028, "view width or height is 0 or view size is too small");
        sparseArray.put(880029, "AD display requires webView but current environment not included");
        sparseArray.put(880030, "view is null");
        sparseArray.put(880031, "webView was destroyed");
        sparseArray.put(880032, "unitId is null");
        sparseArray.put(880033, "campaign is filtered");
        sparseArray.put(880034, "render dynamic view fail");
        sparseArray.put(880035, "bid token is null");
        sparseArray.put(880036, "view container is null");
        sparseArray.put(880037, "AD parameter setting error");
        sparseArray.put(880038, "cb is open");
        sparseArray.put(880040, "db restore failed");
        sparseArray.put(880041, "network no connection error");
    }

    public static String a(int i8) {
        String str = f20273a.get(i8);
        return TextUtils.isEmpty(str) ? "" : str;
    }

    public static int b(int i8) {
        if (i8 == 880023) {
            return 2;
        }
        if (i8 != 880035) {
            if (i8 == 880038) {
                return 21;
            }
            switch (i8) {
                case 880001:
                    break;
                case 880002:
                    return 1;
                case 880003:
                    return 3;
                case 880004:
                    return 4;
                case 880005:
                    return 5;
                case 880006:
                    return 6;
                case 880007:
                    return 7;
                case 880008:
                    return 8;
                case 880009:
                    return 9;
                case 880010:
                    return 10;
                default:
                    switch (i8) {
                        case 880012:
                            return 12;
                        case 880013:
                            return 13;
                        case 880014:
                            return 14;
                        case 880015:
                            return 15;
                        case 880016:
                            return 16;
                        case 880017:
                            return 17;
                        case 880018:
                            return 18;
                        case 880019:
                            return 19;
                        case 880020:
                            return 20;
                        case 880021:
                            return 11;
                        default:
                            return 880024;
                    }
            }
        }
        return 0;
    }

    public static b b(int i8, String str) {
        return new b(i8, str);
    }

    public static String a(int i8, String str) {
        return i8 + "#" + f20273a.get(i8) + "#" + str;
    }

    public static b a(int i8, int i9, String str) {
        return new b(i8, i9, str);
    }
}
