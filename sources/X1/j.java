package X1;

import java.io.IOException;

/* loaded from: classes4.dex */
abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final e f10947a;

    /* renamed from: b, reason: collision with root package name */
    public static final f f10948b;

    /* renamed from: c, reason: collision with root package name */
    public static final d f10949c;

    /* renamed from: d, reason: collision with root package name */
    public static final c f10950d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f10951e;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class b implements h {
        private b() {
        }

        @Override // X1.j.h
        public void a(String str, Appendable appendable) {
            try {
                int length = str.length();
                for (int i8 = 0; i8 < length; i8++) {
                    char charAt = str.charAt(i8);
                    if (charAt != '\f') {
                        if (charAt != '\r') {
                            if (charAt != '\"') {
                                if (charAt != '/') {
                                    if (charAt != '\\') {
                                        switch (charAt) {
                                            case '\b':
                                                appendable.append("\\b");
                                                break;
                                            case '\t':
                                                appendable.append("\\t");
                                                break;
                                            case '\n':
                                                appendable.append("\\n");
                                                break;
                                            default:
                                                if ((charAt >= 0 && charAt <= 31) || ((charAt >= 127 && charAt <= 159) || (charAt >= 8192 && charAt <= 8447))) {
                                                    appendable.append("\\u");
                                                    appendable.append("0123456789ABCDEF".charAt((charAt >> '\f') & 15));
                                                    appendable.append("0123456789ABCDEF".charAt((charAt >> '\b') & 15));
                                                    appendable.append("0123456789ABCDEF".charAt((charAt >> 4) & 15));
                                                    appendable.append("0123456789ABCDEF".charAt(charAt & 15));
                                                    break;
                                                } else {
                                                    appendable.append(charAt);
                                                    break;
                                                }
                                                break;
                                        }
                                    } else {
                                        appendable.append("\\\\");
                                    }
                                } else {
                                    appendable.append("\\/");
                                }
                            } else {
                                appendable.append("\\\"");
                            }
                        } else {
                            appendable.append("\\r");
                        }
                    } else {
                        appendable.append("\\f");
                    }
                }
            } catch (IOException unused) {
                throw new RuntimeException("Impossible Error");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class c implements h {
        private c() {
        }

        @Override // X1.j.h
        public void a(String str, Appendable appendable) {
            try {
                int length = str.length();
                for (int i8 = 0; i8 < length; i8++) {
                    char charAt = str.charAt(i8);
                    if (charAt != '\f') {
                        if (charAt != '\r') {
                            if (charAt != '\"') {
                                if (charAt != '\\') {
                                    switch (charAt) {
                                        case '\b':
                                            appendable.append("\\b");
                                            break;
                                        case '\t':
                                            appendable.append("\\t");
                                            break;
                                        case '\n':
                                            appendable.append("\\n");
                                            break;
                                        default:
                                            if ((charAt >= 0 && charAt <= 31) || ((charAt >= 127 && charAt <= 159) || (charAt >= 8192 && charAt <= 8447))) {
                                                appendable.append("\\u");
                                                appendable.append("0123456789ABCDEF".charAt((charAt >> '\f') & 15));
                                                appendable.append("0123456789ABCDEF".charAt((charAt >> '\b') & 15));
                                                appendable.append("0123456789ABCDEF".charAt((charAt >> 4) & 15));
                                                appendable.append("0123456789ABCDEF".charAt(charAt & 15));
                                                break;
                                            } else {
                                                appendable.append(charAt);
                                                break;
                                            }
                                    }
                                } else {
                                    appendable.append("\\\\");
                                }
                            } else {
                                appendable.append("\\\"");
                            }
                        } else {
                            appendable.append("\\r");
                        }
                    } else {
                        appendable.append("\\f");
                    }
                }
            } catch (IOException unused) {
                throw new RuntimeException("Impossible Exception");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class d implements g {
        private d() {
        }

        @Override // X1.j.g
        public boolean a(String str) {
            if (str == null) {
                return false;
            }
            int length = str.length();
            if (length == 0 || str.trim() != str) {
                return true;
            }
            char charAt = str.charAt(0);
            if (j.c(charAt) || j.f(charAt)) {
                return true;
            }
            for (int i8 = 1; i8 < length; i8++) {
                char charAt2 = str.charAt(i8);
                if (j.e(charAt2) || j.f(charAt2)) {
                    return true;
                }
            }
            if (j.a(str)) {
                return true;
            }
            char charAt3 = str.charAt(0);
            if ((charAt3 >= '0' && charAt3 <= '9') || charAt3 == '-') {
                int i9 = 1;
                while (i9 < length) {
                    charAt3 = str.charAt(i9);
                    if (charAt3 < '0' || charAt3 > '9') {
                        break;
                    }
                    i9++;
                }
                if (i9 == length) {
                    return true;
                }
                if (charAt3 == '.') {
                    i9++;
                }
                while (i9 < length) {
                    charAt3 = str.charAt(i9);
                    if (charAt3 < '0' || charAt3 > '9') {
                        break;
                    }
                    i9++;
                }
                if (i9 == length) {
                    return true;
                }
                if (charAt3 == 'E' || charAt3 == 'e') {
                    int i10 = i9 + 1;
                    if (i10 == length) {
                        return false;
                    }
                    char charAt4 = str.charAt(i10);
                    if (charAt4 != '+' && charAt4 != '-') {
                        i9 = i10;
                    } else {
                        i9 += 2;
                        str.charAt(i9);
                    }
                }
                if (i9 == length) {
                    return false;
                }
                while (i9 < length) {
                    char charAt5 = str.charAt(i9);
                    if (charAt5 < '0' || charAt5 > '9') {
                        break;
                    }
                    i9++;
                }
                if (i9 == length) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class e implements g {
        private e() {
        }

        @Override // X1.j.g
        public boolean a(String str) {
            if (str == null) {
                return false;
            }
            int length = str.length();
            if (length == 0 || str.trim() != str) {
                return true;
            }
            char charAt = str.charAt(0);
            if ((charAt >= '0' && charAt <= '9') || charAt == '-') {
                return true;
            }
            for (int i8 = 0; i8 < length; i8++) {
                char charAt2 = str.charAt(i8);
                if (j.b(charAt2) || j.c(charAt2) || j.d(charAt2) || j.f(charAt2)) {
                    return true;
                }
            }
            if (!j.a(str)) {
                return false;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class f implements g {
        private f() {
        }

        @Override // X1.j.g
        public boolean a(String str) {
            return true;
        }
    }

    /* loaded from: classes4.dex */
    public interface g {
        boolean a(String str);
    }

    /* loaded from: classes4.dex */
    public interface h {
        void a(String str, Appendable appendable);
    }

    static {
        f10947a = new e();
        f10948b = new f();
        f10949c = new d();
        f10950d = new c();
        f10951e = new b();
    }

    public static boolean a(String str) {
        if (str.length() < 3) {
            return false;
        }
        char charAt = str.charAt(0);
        if (charAt == 'n') {
            return str.equals("null");
        }
        if (charAt == 't') {
            return str.equals("true");
        }
        if (charAt == 'f') {
            return str.equals("false");
        }
        if (charAt != 'N') {
            return false;
        }
        return str.equals("NaN");
    }

    public static boolean b(char c8) {
        if (c8 != '\r' && c8 != '\n' && c8 != '\t' && c8 != ' ') {
            return false;
        }
        return true;
    }

    public static boolean c(char c8) {
        if (c8 != '{' && c8 != '[' && c8 != ',' && c8 != '}' && c8 != ']' && c8 != ':' && c8 != '\'' && c8 != '\"') {
            return false;
        }
        return true;
    }

    public static boolean d(char c8) {
        if (c8 != '\b' && c8 != '\f' && c8 != '\n') {
            return false;
        }
        return true;
    }

    public static boolean e(char c8) {
        if (c8 != '}' && c8 != ']' && c8 != ',' && c8 != ':') {
            return false;
        }
        return true;
    }

    public static boolean f(char c8) {
        if ((c8 >= 0 && c8 <= 31) || ((c8 >= 127 && c8 <= 159) || (c8 >= 8192 && c8 <= 8447))) {
            return true;
        }
        return false;
    }
}
