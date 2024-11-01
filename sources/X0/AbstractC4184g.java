package x0;

/* renamed from: x0.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC4184g {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 != null) {
                return;
            }
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(valueOf.length() + 26);
            sb.append("null value in entry: ");
            sb.append(valueOf);
            sb.append("=null");
            throw new NullPointerException(sb.toString());
        }
        String valueOf2 = String.valueOf(obj2);
        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 24);
        sb2.append("null key in entry: null=");
        sb2.append(valueOf2);
        throw new NullPointerException(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(int i8, String str) {
        if (i8 >= 0) {
            return i8;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i8);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(boolean z8) {
        w0.h.o(z8, "no calls to next() since the last call to remove()");
    }
}
