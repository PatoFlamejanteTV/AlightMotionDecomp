package com.google.android.gms.measurement.internal;

import Q.AbstractC1396p;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.A3;
import com.mbridge.msdk.MBridgeConstans;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.z5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2487z5 {

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f18174b = {"GoogleConsent", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "CmpSdkID"};

    /* renamed from: a, reason: collision with root package name */
    private final Map f18175a;

    private C2487z5(Map map) {
        HashMap hashMap = new HashMap();
        this.f18175a = hashMap;
        hashMap.putAll(map);
    }

    private static int a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getInt(str, -1);
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    public static C2487z5 c(SharedPreferences sharedPreferences) {
        HashMap hashMap = new HashMap();
        String f8 = f(sharedPreferences, "IABTCF_VendorConsents");
        if (!"\u0000".equals(f8) && f8.length() > 754) {
            hashMap.put("GoogleConsent", String.valueOf(f8.charAt(754)));
        }
        int a9 = a(sharedPreferences, "IABTCF_gdprApplies");
        if (a9 != -1) {
            hashMap.put("gdprApplies", String.valueOf(a9));
        }
        int a10 = a(sharedPreferences, "IABTCF_EnableAdvertiserConsentMode");
        if (a10 != -1) {
            hashMap.put("EnableAdvertiserConsentMode", String.valueOf(a10));
        }
        int a11 = a(sharedPreferences, "IABTCF_PolicyVersion");
        if (a11 != -1) {
            hashMap.put("PolicyVersion", String.valueOf(a11));
        }
        String f9 = f(sharedPreferences, "IABTCF_PurposeConsents");
        if (!"\u0000".equals(f9)) {
            hashMap.put("PurposeConsents", f9);
        }
        int a12 = a(sharedPreferences, "IABTCF_CmpSdkID");
        if (a12 != -1) {
            hashMap.put("CmpSdkID", String.valueOf(a12));
        }
        return new C2487z5(hashMap);
    }

    public static String d(String str, boolean z8) {
        if (z8 && str.length() > 4) {
            char[] charArray = str.toCharArray();
            int i8 = 1;
            while (true) {
                if (i8 < 64) {
                    if (charArray[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i8)) {
                        break;
                    }
                    i8++;
                } else {
                    i8 = 0;
                    break;
                }
            }
            charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(1 | i8);
            return String.valueOf(charArray);
        }
        return str;
    }

    private static String f(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "\u0000");
        } catch (ClassCastException unused) {
            return "\u0000";
        }
    }

    private final int h() {
        try {
            String str = (String) this.f18175a.get("CmpSdkID");
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    private final int i() {
        try {
            String str = (String) this.f18175a.get("PolicyVersion");
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final Bundle b() {
        String str;
        String str2;
        if ("1".equals(this.f18175a.get("GoogleConsent")) && "1".equals(this.f18175a.get("gdprApplies")) && "1".equals(this.f18175a.get("EnableAdvertiserConsentMode"))) {
            int i8 = i();
            if (i8 < 0) {
                return Bundle.EMPTY;
            }
            String str3 = (String) this.f18175a.get("PurposeConsents");
            if (TextUtils.isEmpty(str3)) {
                return Bundle.EMPTY;
            }
            Bundle bundle = new Bundle();
            String str4 = "denied";
            if (str3.length() > 0) {
                String str5 = A3.a.AD_STORAGE.f17133a;
                if (str3.charAt(0) != '1') {
                    str2 = "denied";
                } else {
                    str2 = "granted";
                }
                bundle.putString(str5, str2);
            }
            if (str3.length() > 3) {
                String str6 = A3.a.AD_PERSONALIZATION.f17133a;
                if (str3.charAt(2) != '1' || str3.charAt(3) != '1') {
                    str = "denied";
                } else {
                    str = "granted";
                }
                bundle.putString(str6, str);
            }
            if (str3.length() > 6 && i8 >= 4) {
                String str7 = A3.a.AD_USER_DATA.f17133a;
                if (str3.charAt(0) == '1' && str3.charAt(6) == '1') {
                    str4 = "granted";
                }
                bundle.putString(str7, str4);
            }
            return bundle;
        }
        return Bundle.EMPTY;
    }

    public final String e() {
        int i8;
        StringBuilder sb = new StringBuilder();
        sb.append("1");
        int h8 = h();
        if (h8 >= 0 && h8 <= 4095) {
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt((h8 >> 6) & 63));
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(h8 & 63));
        } else {
            sb.append("00");
        }
        int i9 = i();
        if (i9 >= 0 && i9 <= 63) {
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i9));
        } else {
            sb.append(MBridgeConstans.ENDCARD_URL_TYPE_PL);
        }
        AbstractC1396p.a(true);
        if ("1".equals(this.f18175a.get("gdprApplies"))) {
            i8 = 2;
        } else {
            i8 = 0;
        }
        int i10 = i8 | 4;
        if ("1".equals(this.f18175a.get("EnableAdvertiserConsentMode"))) {
            i10 = i8 | 12;
        }
        sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i10));
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2487z5)) {
            return false;
        }
        return g().equalsIgnoreCase(((C2487z5) obj).g());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String g() {
        StringBuilder sb = new StringBuilder();
        for (String str : f18174b) {
            if (this.f18175a.containsKey(str)) {
                if (sb.length() > 0) {
                    sb.append(";");
                }
                sb.append(str);
                sb.append("=");
                sb.append((String) this.f18175a.get(str));
            }
        }
        return sb.toString();
    }

    public final int hashCode() {
        return g().hashCode();
    }

    public final String toString() {
        return g();
    }
}
