package com.mbridge.msdk.foundation.tools;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.SecureRandom;

/* loaded from: classes4.dex */
final class ap {

    /* loaded from: classes4.dex */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        static final char[] f21267a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

        /* renamed from: b, reason: collision with root package name */
        static final SecureRandom f21268b = new SecureRandom();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(File file) {
        try {
            if (file.exists()) {
                d(file);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] b(File file) throws IOException {
        if (!file.isFile()) {
            return null;
        }
        long length = file.length();
        if ((length >> 32) == 0) {
            int i8 = (int) length;
            byte[] bArr = new byte[i8];
            a(file, bArr, i8);
            return bArr;
        }
        throw new IllegalArgumentException("file too large, path:" + file.getPath());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(File file) throws IOException {
        if (file.isFile()) {
            return true;
        }
        File parentFile = file.getParentFile();
        if (parentFile != null && ((parentFile.isDirectory() || parentFile.mkdirs()) && file.createNewFile())) {
            return true;
        }
        return false;
    }

    private static void d(File file) {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                d(file2);
            }
        }
        file.delete();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(File file, byte[] bArr, int i8) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        int i9 = 0;
        while (i9 < i8) {
            try {
                int read = randomAccessFile.read(bArr, i9, i8 - i9);
                if (read < 0) {
                    break;
                } else {
                    i9 += read;
                }
            } finally {
                a(randomAccessFile);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b() {
        byte[] bArr = new byte[16];
        a.f21268b.nextBytes(bArr);
        char[] cArr = new char[32];
        for (int i8 = 0; i8 < 16; i8++) {
            byte b9 = bArr[i8];
            int i9 = i8 << 1;
            char[] cArr2 = a.f21267a;
            cArr[i9] = cArr2[(b9 >> 4) & 15];
            cArr[i9 + 1] = cArr2[b9 & 15];
        }
        return new String(cArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            Method declaredMethod = cls.getDeclaredMethod("pageSize", null);
            declaredMethod.setAccessible(true);
            return ((Integer) declaredMethod.invoke(declaredField.get(null), null)).intValue();
        } catch (Throwable unused) {
            return 4096;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(File file, byte[] bArr) {
        File file2;
        try {
            file2 = new File(file.getParent(), file.getName() + ".tmp");
        } catch (Exception unused) {
        }
        if (!c(file2)) {
            return false;
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
        try {
            randomAccessFile.setLength(bArr.length);
            randomAccessFile.write(bArr);
            a(randomAccessFile);
            if (!file.exists() || file.delete()) {
                return file2.renameTo(file);
            }
            return false;
        } catch (Throwable th) {
            a(randomAccessFile);
            throw th;
        }
    }
}
