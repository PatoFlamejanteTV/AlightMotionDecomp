package T1;

import java.math.BigInteger;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;

/* loaded from: classes4.dex */
public abstract class b {
    public static boolean a(BigInteger bigInteger, BigInteger bigInteger2, ECParameterSpec eCParameterSpec) {
        EllipticCurve curve = eCParameterSpec.getCurve();
        BigInteger a9 = curve.getA();
        BigInteger b9 = curve.getB();
        BigInteger p8 = ((ECFieldFp) curve.getField()).getP();
        return bigInteger2.pow(2).mod(p8).equals(bigInteger.pow(3).add(a9.multiply(bigInteger)).add(b9).mod(p8));
    }

    public static boolean b(ECPublicKey eCPublicKey, ECParameterSpec eCParameterSpec) {
        ECPoint w8 = eCPublicKey.getW();
        return a(w8.getAffineX(), w8.getAffineY(), eCParameterSpec);
    }
}
