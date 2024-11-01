package com.google.gson.internal;

/* loaded from: classes4.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    private static final int f18978a = a();

    private static int a() {
        return c(System.getProperty("java.version"));
    }

    private static int b(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i8 = 0; i8 < str.length(); i8++) {
                char charAt = str.charAt(i8);
                if (!Character.isDigit(charAt)) {
                    break;
                }
                sb.append(charAt);
            }
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    static int c(String str) {
        int e8 = e(str);
        if (e8 == -1) {
            e8 = b(str);
        }
        if (e8 == -1) {
            return 6;
        }
        return e8;
    }

    public static boolean d() {
        if (f18978a >= 9) {
            return true;
        }
        return false;
    }

    private static int e(String str) {
        try {
            String[] split = str.split("[._]");
            int parseInt = Integer.parseInt(split[0]);
            if (parseInt == 1 && split.length > 1) {
                return Integer.parseInt(split[1]);
            }
            return parseInt;
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
