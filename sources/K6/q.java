package K6;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private final String[] f5065a;

    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        final List f5066a = new ArrayList(20);

        private void e(String str, String str2) {
            if (str != null) {
                if (!str.isEmpty()) {
                    int length = str.length();
                    for (int i8 = 0; i8 < length; i8++) {
                        char charAt = str.charAt(i8);
                        if (charAt <= ' ' || charAt >= 127) {
                            throw new IllegalArgumentException(L6.c.o("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i8), str));
                        }
                    }
                    if (str2 != null) {
                        int length2 = str2.length();
                        for (int i9 = 0; i9 < length2; i9++) {
                            char charAt2 = str2.charAt(i9);
                            if ((charAt2 <= 31 && charAt2 != '\t') || charAt2 >= 127) {
                                throw new IllegalArgumentException(L6.c.o("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt2), Integer.valueOf(i9), str, str2));
                            }
                        }
                        return;
                    }
                    throw new NullPointerException("value for name " + str + " == null");
                }
                throw new IllegalArgumentException("name is empty");
            }
            throw new NullPointerException("name == null");
        }

        public a a(String str, String str2) {
            e(str, str2);
            return c(str, str2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a b(String str) {
            int indexOf = str.indexOf(":", 1);
            if (indexOf != -1) {
                return c(str.substring(0, indexOf), str.substring(indexOf + 1));
            }
            if (str.startsWith(":")) {
                return c("", str.substring(1));
            }
            return c("", str);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a c(String str, String str2) {
            this.f5066a.add(str);
            this.f5066a.add(str2.trim());
            return this;
        }

        public q d() {
            return new q(this);
        }

        public String f(String str) {
            for (int size = this.f5066a.size() - 2; size >= 0; size -= 2) {
                if (str.equalsIgnoreCase((String) this.f5066a.get(size))) {
                    return (String) this.f5066a.get(size + 1);
                }
            }
            return null;
        }

        public a g(String str) {
            int i8 = 0;
            while (i8 < this.f5066a.size()) {
                if (str.equalsIgnoreCase((String) this.f5066a.get(i8))) {
                    this.f5066a.remove(i8);
                    this.f5066a.remove(i8);
                    i8 -= 2;
                }
                i8 += 2;
            }
            return this;
        }

        public a h(String str, String str2) {
            e(str, str2);
            g(str);
            c(str, str2);
            return this;
        }
    }

    q(a aVar) {
        List list = aVar.f5066a;
        this.f5065a = (String[]) list.toArray(new String[list.size()]);
    }

    private static String b(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    public String a(String str) {
        return b(this.f5065a, str);
    }

    public String c(int i8) {
        return this.f5065a[i8 * 2];
    }

    public a d() {
        a aVar = new a();
        Collections.addAll(aVar.f5066a, this.f5065a);
        return aVar;
    }

    public int e() {
        return this.f5065a.length / 2;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof q) && Arrays.equals(((q) obj).f5065a, this.f5065a)) {
            return true;
        }
        return false;
    }

    public String f(int i8) {
        return this.f5065a[(i8 * 2) + 1];
    }

    public List g(String str) {
        int e8 = e();
        ArrayList arrayList = null;
        for (int i8 = 0; i8 < e8; i8++) {
            if (str.equalsIgnoreCase(c(i8))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(f(i8));
            }
        }
        if (arrayList != null) {
            return DesugarCollections.unmodifiableList(arrayList);
        }
        return Collections.emptyList();
    }

    public int hashCode() {
        return Arrays.hashCode(this.f5065a);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int e8 = e();
        for (int i8 = 0; i8 < e8; i8++) {
            sb.append(c(i8));
            sb.append(": ");
            sb.append(f(i8));
            sb.append("\n");
        }
        return sb.toString();
    }
}
