package L0;

import J0.AbstractC1253j;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
class d {

    /* renamed from: a, reason: collision with root package name */
    private final Map f5233a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final int f5234b;

    /* renamed from: c, reason: collision with root package name */
    private final int f5235c;

    public d(int i8, int i9) {
        this.f5234b = i8;
        this.f5235c = i9;
    }

    private String b(String str) {
        if (str != null) {
            return c(str, this.f5235c);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    public static String c(String str, int i8) {
        if (str != null) {
            String trim = str.trim();
            if (trim.length() > i8) {
                return trim.substring(0, i8);
            }
            return trim;
        }
        return str;
    }

    public synchronized Map a() {
        return DesugarCollections.unmodifiableMap(new HashMap(this.f5233a));
    }

    public synchronized boolean d(String str, String str2) {
        String b9 = b(str);
        if (this.f5233a.size() >= this.f5234b && !this.f5233a.containsKey(b9)) {
            G0.g.f().k("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f5234b);
            return false;
        }
        String c8 = c(str2, this.f5235c);
        if (AbstractC1253j.y((String) this.f5233a.get(b9), c8)) {
            return false;
        }
        Map map = this.f5233a;
        if (str2 == null) {
            c8 = "";
        }
        map.put(b9, c8);
        return true;
    }

    public synchronized void e(Map map) {
        String c8;
        try {
            int i8 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String b9 = b((String) entry.getKey());
                if (this.f5233a.size() >= this.f5234b && !this.f5233a.containsKey(b9)) {
                    i8++;
                }
                String str = (String) entry.getValue();
                Map map2 = this.f5233a;
                if (str == null) {
                    c8 = "";
                } else {
                    c8 = c(str, this.f5235c);
                }
                map2.put(b9, c8);
            }
            if (i8 > 0) {
                G0.g.f().k("Ignored " + i8 + " entries when adding custom keys. Maximum allowable: " + this.f5234b);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
