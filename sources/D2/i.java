package d2;

/* loaded from: classes4.dex */
public abstract class i {
    public static byte[] a(int i8) {
        return new byte[]{(byte) (i8 >>> 24), (byte) ((i8 >>> 16) & 255), (byte) ((i8 >>> 8) & 255), (byte) (i8 & 255)};
    }
}
