package h5;

import com.mbridge.msdk.foundation.tools.SameMD5;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.Y;

/* renamed from: h5.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2951b {

    /* renamed from: a, reason: collision with root package name */
    public static final C2951b f32648a = new C2951b();

    public final String a(byte[] s8) {
        AbstractC3292y.i(s8, "s");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            messageDigest.update(s8);
            String bigInteger = new BigInteger(1, messageDigest.digest()).toString(16);
            while (bigInteger.length() < 32) {
                Y y8 = Y.f34578a;
                bigInteger = String.format("0%s", Arrays.copyOf(new Object[]{bigInteger}, 1));
                AbstractC3292y.h(bigInteger, "format(...)");
            }
            return bigInteger;
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }
}
