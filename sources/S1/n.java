package S1;

/* loaded from: classes4.dex */
public abstract class n {
    public static byte[] a(O1.m mVar, byte[] bArr) {
        O1.c u8 = mVar.u();
        if (u8 == null) {
            return bArr;
        }
        if (u8.equals(O1.c.f6941b)) {
            try {
                return d2.g.a(bArr);
            } catch (Exception e8) {
                throw new O1.f("Couldn't compress plain text: " + e8.getMessage(), e8);
            }
        }
        throw new O1.f("Unsupported compression algorithm: " + u8);
    }

    public static byte[] b(O1.m mVar, byte[] bArr) {
        O1.c u8 = mVar.u();
        if (u8 == null) {
            return bArr;
        }
        if (u8.equals(O1.c.f6941b)) {
            try {
                return d2.g.b(bArr);
            } catch (Exception e8) {
                throw new O1.f("Couldn't decompress plain text: " + e8.getMessage(), e8);
            }
        }
        throw new O1.f("Unsupported compression algorithm: " + u8);
    }
}
