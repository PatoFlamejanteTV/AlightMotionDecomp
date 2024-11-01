package M7;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f6293a;

    public d() {
        this.f6293a = new HashMap(14);
    }

    public synchronized String a(c cVar) {
        return (String) this.f6293a.get(cVar.toString());
    }

    public synchronized boolean b(c cVar) {
        return this.f6293a.containsKey(cVar.toString());
    }

    public synchronized d c(c cVar, String str) {
        d(cVar.toString(), str);
        return this;
    }

    public synchronized d d(String str, String str2) {
        try {
            if (str2 == null) {
                this.f6293a.remove(str);
            } else if (str2.length() > 0) {
                this.f6293a.put(str, str2);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized Map e() {
        return new HashMap(this.f6293a);
    }

    public synchronized d f(c cVar, int i8) {
        return h(cVar, String.valueOf(i8));
    }

    public synchronized d g(c cVar, long j8) {
        return h(cVar, String.valueOf(j8));
    }

    public synchronized d h(c cVar, String str) {
        if (!b(cVar)) {
            c(cVar, str);
        }
        return this;
    }

    public d(d dVar) {
        HashMap hashMap = new HashMap(14);
        this.f6293a = hashMap;
        hashMap.putAll(dVar.f6293a);
    }
}
