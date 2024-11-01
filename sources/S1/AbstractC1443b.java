package S1;

import java.nio.ByteBuffer;
import java.security.Provider;
import java.security.SecureRandom;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: S1.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1443b {
    private static Cipher a(SecretKey secretKey, boolean z8, byte[] bArr, Provider provider) {
        try {
            Cipher a9 = i.a("AES/CBC/PKCS5Padding", provider);
            SecretKeySpec secretKeySpec = new SecretKeySpec(secretKey.getEncoded(), "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
            if (z8) {
                a9.init(1, secretKeySpec, ivParameterSpec);
            } else {
                a9.init(2, secretKeySpec, ivParameterSpec);
            }
            return a9;
        } catch (Exception e8) {
            throw new O1.f(e8.getMessage(), e8);
        }
    }

    public static byte[] b(SecretKey secretKey, byte[] bArr, byte[] bArr2, Provider provider) {
        try {
            return a(secretKey, false, bArr, provider).doFinal(bArr2);
        } catch (Exception e8) {
            throw new O1.f(e8.getMessage(), e8);
        }
    }

    public static byte[] c(SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, Provider provider, Provider provider2) {
        j jVar = new j(secretKey);
        byte[] c8 = AbstractC1442a.c(bArr3);
        if (T1.a.a(Arrays.copyOf(s.b(jVar.b(), ByteBuffer.allocate(bArr3.length + bArr.length + bArr2.length + c8.length).put(bArr3).put(bArr).put(bArr2).put(c8).array(), provider2), jVar.c()), bArr4)) {
            return b(jVar.a(), bArr, bArr2, provider);
        }
        throw new O1.f("MAC check failed");
    }

    public static byte[] d(O1.m mVar, SecretKey secretKey, d2.c cVar, d2.c cVar2, d2.c cVar3, d2.c cVar4, Provider provider, Provider provider2) {
        byte[] bArr;
        byte[] bArr2 = null;
        if (mVar.d("epu") instanceof String) {
            bArr = new d2.c((String) mVar.d("epu")).a();
        } else {
            bArr = null;
        }
        if (mVar.d("epv") instanceof String) {
            bArr2 = new d2.c((String) mVar.d("epv")).a();
        }
        if (T1.a.a(cVar4.a(), s.b(u.b(secretKey, mVar.v(), bArr, bArr2), (mVar.h().toString() + "." + cVar.toString() + "." + cVar2.toString() + "." + cVar3.toString()).getBytes(d2.m.f31296a), provider2))) {
            return b(u.a(secretKey, mVar.v(), bArr, bArr2), cVar2.a(), cVar3.a(), provider);
        }
        throw new O1.f("MAC check failed");
    }

    public static byte[] e(SecretKey secretKey, byte[] bArr, byte[] bArr2, Provider provider) {
        try {
            return a(secretKey, true, bArr, provider).doFinal(bArr2);
        } catch (Exception e8) {
            throw new O1.f(e8.getMessage(), e8);
        }
    }

    public static f f(SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3, Provider provider, Provider provider2) {
        j jVar = new j(secretKey);
        byte[] e8 = e(jVar.a(), bArr, bArr2, provider);
        byte[] c8 = AbstractC1442a.c(bArr3);
        return new f(e8, Arrays.copyOf(s.b(jVar.b(), ByteBuffer.allocate(bArr3.length + bArr.length + e8.length + c8.length).put(bArr3).put(bArr).put(e8).put(c8).array(), provider2), jVar.c()));
    }

    public static f g(O1.m mVar, SecretKey secretKey, d2.c cVar, byte[] bArr, byte[] bArr2, Provider provider, Provider provider2) {
        byte[] bArr3;
        byte[] bArr4 = null;
        if (mVar.d("epu") instanceof String) {
            bArr3 = new d2.c((String) mVar.d("epu")).a();
        } else {
            bArr3 = null;
        }
        if (mVar.d("epv") instanceof String) {
            bArr4 = new d2.c((String) mVar.d("epv")).a();
        }
        byte[] e8 = e(u.a(secretKey, mVar.v(), bArr3, bArr4), bArr, bArr2, provider);
        return new f(e8, s.b(u.b(secretKey, mVar.v(), bArr3, bArr4), (mVar.h() + "." + cVar + "." + d2.c.e(bArr) + "." + d2.c.e(e8)).getBytes(d2.m.f31296a), provider2));
    }

    public static byte[] h(SecureRandom secureRandom) {
        byte[] bArr = new byte[d2.e.c(128)];
        secureRandom.nextBytes(bArr);
        return bArr;
    }
}
