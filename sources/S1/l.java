package S1;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import j$.util.DesugarCollections;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes4.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f9385a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f9386b;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        O1.d dVar = O1.d.f6943e;
        linkedHashSet.add(dVar);
        O1.d dVar2 = O1.d.f6944f;
        linkedHashSet.add(dVar2);
        O1.d dVar3 = O1.d.f6945g;
        linkedHashSet.add(dVar3);
        O1.d dVar4 = O1.d.f6948j;
        linkedHashSet.add(dVar4);
        O1.d dVar5 = O1.d.f6949k;
        linkedHashSet.add(dVar5);
        O1.d dVar6 = O1.d.f6950l;
        linkedHashSet.add(dVar6);
        O1.d dVar7 = O1.d.f6946h;
        linkedHashSet.add(dVar7);
        O1.d dVar8 = O1.d.f6947i;
        linkedHashSet.add(dVar8);
        O1.d dVar9 = O1.d.f6951m;
        linkedHashSet.add(dVar9);
        f9385a = DesugarCollections.unmodifiableSet(linkedHashSet);
        HashMap hashMap = new HashMap();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        hashSet.add(dVar4);
        hashSet2.add(dVar5);
        hashSet3.add(dVar6);
        hashSet3.add(dVar);
        hashSet3.add(dVar7);
        hashSet3.add(dVar9);
        hashSet4.add(dVar2);
        hashSet5.add(dVar3);
        hashSet5.add(dVar8);
        hashMap.put(128, DesugarCollections.unmodifiableSet(hashSet));
        hashMap.put(Integer.valueOf(PsExtractor.AUDIO_STREAM), DesugarCollections.unmodifiableSet(hashSet2));
        hashMap.put(256, DesugarCollections.unmodifiableSet(hashSet3));
        hashMap.put(384, DesugarCollections.unmodifiableSet(hashSet4));
        hashMap.put(512, DesugarCollections.unmodifiableSet(hashSet5));
        f9386b = DesugarCollections.unmodifiableMap(hashMap);
    }

    private static void a(SecretKey secretKey, O1.d dVar) {
        try {
            if (dVar.c() == d2.e.f(secretKey.getEncoded())) {
                return;
            }
            throw new O1.u("The Content Encryption Key (CEK) length for " + dVar + " must be " + dVar.c() + " bits");
        } catch (d2.h e8) {
            throw new O1.u("The Content Encryption Key (CEK) is too long: " + e8.getMessage());
        }
    }

    public static byte[] b(O1.m mVar, d2.c cVar, d2.c cVar2, d2.c cVar3, d2.c cVar4, SecretKey secretKey, U1.c cVar5) {
        byte[] c8;
        a(secretKey, mVar.v());
        byte[] a9 = AbstractC1442a.a(mVar);
        if (!mVar.v().equals(O1.d.f6943e) && !mVar.v().equals(O1.d.f6944f) && !mVar.v().equals(O1.d.f6945g)) {
            if (!mVar.v().equals(O1.d.f6948j) && !mVar.v().equals(O1.d.f6949k) && !mVar.v().equals(O1.d.f6950l)) {
                if (!mVar.v().equals(O1.d.f6946h) && !mVar.v().equals(O1.d.f6947i)) {
                    if (mVar.v().equals(O1.d.f6951m)) {
                        c8 = C.a(secretKey, cVar2.a(), cVar3.a(), a9, cVar4.a());
                    } else {
                        throw new O1.f(e.b(mVar.v(), f9385a));
                    }
                } else {
                    c8 = AbstractC1443b.d(mVar, secretKey, cVar, cVar2, cVar3, cVar4, cVar5.d(), cVar5.f());
                }
            } else {
                c8 = AbstractC1444c.c(secretKey, cVar2.a(), cVar3.a(), a9, cVar4.a(), cVar5.d());
            }
        } else {
            c8 = AbstractC1443b.c(secretKey, cVar2.a(), cVar3.a(), a9, cVar4.a(), cVar5.d(), cVar5.f());
        }
        return n.b(mVar, c8);
    }

    public static O1.j c(O1.m mVar, byte[] bArr, SecretKey secretKey, d2.c cVar, U1.c cVar2) {
        byte[] h8;
        f f8;
        byte[] bArr2;
        a(secretKey, mVar.v());
        byte[] a9 = n.a(mVar, bArr);
        byte[] a10 = AbstractC1442a.a(mVar);
        if (!mVar.v().equals(O1.d.f6943e) && !mVar.v().equals(O1.d.f6944f) && !mVar.v().equals(O1.d.f6945g)) {
            if (!mVar.v().equals(O1.d.f6948j) && !mVar.v().equals(O1.d.f6949k) && !mVar.v().equals(O1.d.f6950l)) {
                if (!mVar.v().equals(O1.d.f6946h) && !mVar.v().equals(O1.d.f6947i)) {
                    if (mVar.v().equals(O1.d.f6951m)) {
                        d2.f fVar = new d2.f(null);
                        f8 = C.b(secretKey, fVar, a9, a10);
                        bArr2 = (byte[]) fVar.a();
                    } else {
                        throw new O1.f(e.b(mVar.v(), f9385a));
                    }
                } else {
                    h8 = AbstractC1443b.h(cVar2.b());
                    f8 = AbstractC1443b.g(mVar, secretKey, cVar, h8, a9, cVar2.d(), cVar2.f());
                }
            } else {
                d2.f fVar2 = new d2.f(AbstractC1444c.e(cVar2.b()));
                f8 = AbstractC1444c.d(secretKey, fVar2, a9, a10, cVar2.d());
                bArr2 = (byte[]) fVar2.a();
            }
            return new O1.j(mVar, cVar, d2.c.e(bArr2), d2.c.e(f8.b()), d2.c.e(f8.a()));
        }
        h8 = AbstractC1443b.h(cVar2.b());
        f8 = AbstractC1443b.f(secretKey, h8, a9, a10, cVar2.d(), cVar2.f());
        bArr2 = h8;
        return new O1.j(mVar, cVar, d2.c.e(bArr2), d2.c.e(f8.b()), d2.c.e(f8.a()));
    }

    public static SecretKey d(O1.d dVar, SecureRandom secureRandom) {
        Set set = f9385a;
        if (set.contains(dVar)) {
            byte[] bArr = new byte[d2.e.c(dVar.c())];
            secureRandom.nextBytes(bArr);
            return new SecretKeySpec(bArr, "AES");
        }
        throw new O1.f(e.b(dVar, set));
    }
}
