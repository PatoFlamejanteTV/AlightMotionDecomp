package d2;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

/* loaded from: classes4.dex */
public abstract class g {
    public static byte[] a(byte[] bArr) {
        Deflater deflater;
        DeflaterOutputStream deflaterOutputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DeflaterOutputStream deflaterOutputStream2 = null;
        try {
            deflater = new Deflater(8, true);
            try {
                deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            deflater = null;
        }
        try {
            deflaterOutputStream.write(bArr);
            deflaterOutputStream.close();
            deflater.end();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th3) {
            th = th3;
            deflaterOutputStream2 = deflaterOutputStream;
            if (deflaterOutputStream2 != null) {
                deflaterOutputStream2.close();
            }
            if (deflater != null) {
                deflater.end();
            }
            throw th;
        }
    }

    public static byte[] b(byte[] bArr) {
        Inflater inflater;
        InflaterInputStream inflaterInputStream = null;
        try {
            inflater = new Inflater(true);
            try {
                InflaterInputStream inflaterInputStream2 = new InflaterInputStream(new ByteArrayInputStream(bArr), inflater);
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr2 = new byte[1024];
                    while (true) {
                        int read = inflaterInputStream2.read(bArr2);
                        if (read > 0) {
                            byteArrayOutputStream.write(bArr2, 0, read);
                        } else {
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            inflaterInputStream2.close();
                            inflater.end();
                            return byteArray;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    inflaterInputStream = inflaterInputStream2;
                    if (inflaterInputStream != null) {
                        inflaterInputStream.close();
                    }
                    if (inflater != null) {
                        inflater.end();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            inflater = null;
        }
    }
}
