package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.z5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC2305z5 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(J3 j32) {
        C2297y5 c2297y5 = new C2297y5(j32);
        StringBuilder sb = new StringBuilder(c2297y5.w());
        for (int i8 = 0; i8 < c2297y5.w(); i8++) {
            byte a9 = c2297y5.a(i8);
            if (a9 != 34) {
                if (a9 != 39) {
                    if (a9 != 92) {
                        switch (a9) {
                            case 7:
                                sb.append("\\a");
                                break;
                            case 8:
                                sb.append("\\b");
                                break;
                            case 9:
                                sb.append("\\t");
                                break;
                            case 10:
                                sb.append("\\n");
                                break;
                            case 11:
                                sb.append("\\v");
                                break;
                            case 12:
                                sb.append("\\f");
                                break;
                            case 13:
                                sb.append("\\r");
                                break;
                            default:
                                if (a9 >= 32 && a9 <= 126) {
                                    sb.append((char) a9);
                                    break;
                                } else {
                                    sb.append('\\');
                                    sb.append((char) (((a9 >>> 6) & 3) + 48));
                                    sb.append((char) (((a9 >>> 3) & 7) + 48));
                                    sb.append((char) ((a9 & 7) + 48));
                                    break;
                                }
                        }
                    } else {
                        sb.append("\\\\");
                    }
                } else {
                    sb.append("\\'");
                }
            } else {
                sb.append("\\\"");
            }
        }
        return sb.toString();
    }
}
