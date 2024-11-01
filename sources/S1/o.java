package S1;

import j$.util.DesugarCollections;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.crypto.SecretKey;

/* loaded from: classes4.dex */
public abstract class o extends g {

    /* renamed from: e, reason: collision with root package name */
    public static final Set f9388e;

    /* renamed from: f, reason: collision with root package name */
    public static final Set f9389f = l.f9385a;

    /* renamed from: d, reason: collision with root package name */
    private final SecretKey f9390d;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(O1.i.f6974l);
        f9388e = DesugarCollections.unmodifiableSet(linkedHashSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public o(SecretKey secretKey) {
        super(f9388e, h(d2.e.b(secretKey.getEncoded())));
        this.f9390d = secretKey;
    }

    private static Set h(int i8) {
        Set set = (Set) l.f9386b.get(Integer.valueOf(i8));
        if (set != null) {
            return set;
        }
        throw new O1.u("The Content Encryption Key length must be 128 bits (16 bytes), 192 bits (24 bytes), 256 bits (32 bytes), 384 bits (48 bytes) or 512 bites (64 bytes)");
    }

    @Override // S1.g, O1.o
    public /* bridge */ /* synthetic */ Set b() {
        return super.b();
    }

    @Override // S1.g, O1.o
    public /* bridge */ /* synthetic */ Set f() {
        return super.f();
    }

    @Override // S1.g
    public /* bridge */ /* synthetic */ U1.c g() {
        return super.g();
    }

    public SecretKey i() {
        return this.f9390d;
    }
}
