package S1;

import j$.util.DesugarCollections;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class v extends h {

    /* renamed from: d, reason: collision with root package name */
    public static final Set f9396d;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f9397c;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(O1.p.f7038d);
        linkedHashSet.add(O1.p.f7039e);
        linkedHashSet.add(O1.p.f7040f);
        f9396d = DesugarCollections.unmodifiableSet(linkedHashSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public v(byte[] bArr, Set set) {
        super(set);
        if (bArr.length >= 32) {
            this.f9397c = bArr;
            return;
        }
        throw new O1.u("The secret length must be at least 256 bits");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String h(O1.p pVar) {
        if (pVar.equals(O1.p.f7038d)) {
            return "HMACSHA256";
        }
        if (pVar.equals(O1.p.f7039e)) {
            return "HMACSHA384";
        }
        if (pVar.equals(O1.p.f7040f)) {
            return "HMACSHA512";
        }
        throw new O1.f(e.d(pVar, f9396d));
    }

    public byte[] i() {
        return this.f9397c;
    }
}
