package y7;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.util.HashSet;
import java.util.Set;

/* renamed from: y7.A, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4249A {

    /* renamed from: y7.A$a */
    /* loaded from: classes5.dex */
    private static class a extends ObjectInputStream {

        /* renamed from: c, reason: collision with root package name */
        private static final Set f41179c;

        /* renamed from: a, reason: collision with root package name */
        private final Class f41180a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f41181b;

        static {
            HashSet hashSet = new HashSet();
            f41179c = hashSet;
            hashSet.add("java.util.TreeMap");
            hashSet.add("java.lang.Integer");
            hashSet.add("java.lang.Number");
            hashSet.add("org.bouncycastle.pqc.crypto.xmss.BDS");
            hashSet.add("java.util.ArrayList");
            hashSet.add("org.bouncycastle.pqc.crypto.xmss.XMSSNode");
            hashSet.add("[B");
            hashSet.add("java.util.LinkedList");
            hashSet.add("java.util.Stack");
            hashSet.add("java.util.Vector");
            hashSet.add("[Ljava.lang.Object;");
            hashSet.add("org.bouncycastle.pqc.crypto.xmss.BDSTreeHash");
        }

        a(Class cls, InputStream inputStream) {
            super(inputStream);
            this.f41181b = false;
            this.f41180a = cls;
        }

        @Override // java.io.ObjectInputStream
        protected Class resolveClass(ObjectStreamClass objectStreamClass) {
            if (!this.f41181b) {
                if (objectStreamClass.getName().equals(this.f41180a.getName())) {
                    this.f41181b = true;
                } else {
                    throw new InvalidClassException("unexpected class: ", objectStreamClass.getName());
                }
            } else if (!f41179c.contains(objectStreamClass.getName())) {
                throw new InvalidClassException("unexpected class: ", objectStreamClass.getName());
            }
            return super.resolveClass(objectStreamClass);
        }
    }

    public static long a(byte[] bArr, int i8, int i9) {
        if (bArr != null) {
            long j8 = 0;
            for (int i10 = i8; i10 < i8 + i9; i10++) {
                j8 = (j8 << 8) | (bArr[i10] & 255);
            }
            return j8;
        }
        throw new NullPointerException("in == null");
    }

    public static int b(int i8, int i9) {
        for (int i10 = 0; i10 < i9; i10++) {
            if (((i8 >> i10) & 1) == 0) {
                return i10;
            }
        }
        return 0;
    }

    public static byte[] c(byte[] bArr) {
        if (bArr != null) {
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        throw new NullPointerException("in == null");
    }

    public static byte[][] d(byte[][] bArr) {
        if (!k(bArr)) {
            byte[][] bArr2 = new byte[bArr.length];
            for (int i8 = 0; i8 < bArr.length; i8++) {
                byte[] bArr3 = new byte[bArr[i8].length];
                bArr2[i8] = bArr3;
                byte[] bArr4 = bArr[i8];
                System.arraycopy(bArr4, 0, bArr3, 0, bArr4.length);
            }
            return bArr2;
        }
        throw new NullPointerException("in has null pointers");
    }

    public static void e(byte[] bArr, byte[] bArr2, int i8) {
        if (bArr != null) {
            if (bArr2 != null) {
                if (i8 >= 0) {
                    if (bArr2.length + i8 <= bArr.length) {
                        for (int i9 = 0; i9 < bArr2.length; i9++) {
                            bArr[i8 + i9] = bArr2[i9];
                        }
                        return;
                    }
                    throw new IllegalArgumentException("src length + offset must not be greater than size of destination");
                }
                throw new IllegalArgumentException("offset hast to be >= 0");
            }
            throw new NullPointerException("src == null");
        }
        throw new NullPointerException("dst == null");
    }

    public static Object f(byte[] bArr, Class cls) {
        a aVar = new a(cls, new ByteArrayInputStream(bArr));
        Object readObject = aVar.readObject();
        if (aVar.available() == 0) {
            if (cls.isInstance(readObject)) {
                return readObject;
            }
            throw new IOException("unexpected class found in ObjectInputStream");
        }
        throw new IOException("unexpected data found at end of ObjectInputStream");
    }

    public static byte[] g(byte[] bArr, int i8, int i9) {
        if (bArr != null) {
            if (i8 >= 0) {
                if (i9 >= 0) {
                    if (i8 + i9 <= bArr.length) {
                        byte[] bArr2 = new byte[i9];
                        for (int i10 = 0; i10 < i9; i10++) {
                            bArr2[i10] = bArr[i8 + i10];
                        }
                        return bArr2;
                    }
                    throw new IllegalArgumentException("offset + length must not be greater then size of source array");
                }
                throw new IllegalArgumentException("length hast to be >= 0");
            }
            throw new IllegalArgumentException("offset hast to be >= 0");
        }
        throw new NullPointerException("src == null");
    }

    public static int h(d7.e eVar) {
        if (eVar != null) {
            String e8 = eVar.e();
            if (e8.equals("SHAKE128")) {
                return 32;
            }
            if (e8.equals("SHAKE256")) {
                return 64;
            }
            return eVar.f();
        }
        throw new NullPointerException("digest == null");
    }

    public static int i(long j8, int i8) {
        return (int) (j8 & ((1 << i8) - 1));
    }

    public static long j(long j8, int i8) {
        return j8 >> i8;
    }

    public static boolean k(byte[][] bArr) {
        if (bArr == null) {
            return true;
        }
        for (byte[] bArr2 : bArr) {
            if (bArr2 == null) {
                return true;
            }
        }
        return false;
    }

    public static boolean l(int i8, long j8) {
        if (j8 >= 0) {
            if (j8 < (1 << i8)) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("index must not be negative");
    }

    public static boolean m(long j8, int i8, int i9) {
        if (j8 == 0 || (j8 + 1) % ((long) Math.pow(1 << i8, i9)) != 0) {
            return false;
        }
        return true;
    }

    public static boolean n(long j8, int i8, int i9) {
        if (j8 == 0 || j8 % ((long) Math.pow(1 << i8, i9 + 1)) != 0) {
            return false;
        }
        return true;
    }

    public static int o(int i8) {
        int i9 = 0;
        while (true) {
            i8 >>= 1;
            if (i8 != 0) {
                i9++;
            } else {
                return i9;
            }
        }
    }

    public static byte[] p(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(obj);
        objectOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] q(long j8, int i8) {
        byte[] bArr = new byte[i8];
        for (int i9 = i8 - 1; i9 >= 0; i9--) {
            bArr[i9] = (byte) j8;
            j8 >>>= 8;
        }
        return bArr;
    }
}
