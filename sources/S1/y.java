package S1;

import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Signature;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;

/* loaded from: classes4.dex */
public abstract class y {
    public static Signature a(O1.p pVar, Provider provider) {
        Signature b9;
        Signature c8;
        Signature b10;
        Signature c9;
        Signature b11;
        Signature c10;
        Signature b12;
        Signature b13;
        Signature b14;
        if (pVar.equals(O1.p.f7041g) && (b14 = b("SHA256withRSA", provider)) != null) {
            return b14;
        }
        if (pVar.equals(O1.p.f7042h) && (b13 = b("SHA384withRSA", provider)) != null) {
            return b13;
        }
        if (pVar.equals(O1.p.f7043i) && (b12 = b("SHA512withRSA", provider)) != null) {
            return b12;
        }
        O1.p pVar2 = O1.p.f7048n;
        if (pVar.equals(pVar2) && (c10 = c("RSASSA-PSS", provider, new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1))) != null) {
            return c10;
        }
        if (pVar.equals(pVar2) && (b11 = b("SHA256withRSAandMGF1", provider)) != null) {
            return b11;
        }
        O1.p pVar3 = O1.p.f7049o;
        if (pVar.equals(pVar3) && (c9 = c("RSASSA-PSS", provider, new PSSParameterSpec("SHA-384", "MGF1", MGF1ParameterSpec.SHA384, 48, 1))) != null) {
            return c9;
        }
        if (pVar.equals(pVar3) && (b10 = b("SHA384withRSAandMGF1", provider)) != null) {
            return b10;
        }
        O1.p pVar4 = O1.p.f7050p;
        if (pVar.equals(pVar4) && (c8 = c("RSASSA-PSS", provider, new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1))) != null) {
            return c8;
        }
        if (pVar.equals(pVar4) && (b9 = b("SHA512withRSAandMGF1", provider)) != null) {
            return b9;
        }
        throw new O1.f(e.d(pVar, z.f9400c));
    }

    private static Signature b(String str, Provider provider) {
        return c(str, provider, null);
    }

    private static Signature c(String str, Provider provider, PSSParameterSpec pSSParameterSpec) {
        Signature signature;
        try {
            if (provider != null) {
                signature = Signature.getInstance(str, provider);
            } else {
                signature = Signature.getInstance(str);
            }
            if (pSSParameterSpec != null) {
                try {
                    signature.setParameter(pSSParameterSpec);
                } catch (InvalidAlgorithmParameterException e8) {
                    throw new O1.f("Invalid RSASSA-PSS salt length parameter: " + e8.getMessage(), e8);
                }
            }
            return signature;
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }
}
