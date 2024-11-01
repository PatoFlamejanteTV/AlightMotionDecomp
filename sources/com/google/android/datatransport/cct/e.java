package com.google.android.datatransport.cct;

/* loaded from: classes3.dex */
public abstract class e {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length >= 0 && length <= 1) {
            StringBuilder sb = new StringBuilder(str.length() + str2.length());
            for (int i8 = 0; i8 < str.length(); i8++) {
                sb.append(str.charAt(i8));
                if (str2.length() > i8) {
                    sb.append(str2.charAt(i8));
                }
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("Invalid input received");
    }
}
