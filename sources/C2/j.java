package c2;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
abstract class j {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Object obj) {
        Class<?> cls = obj.getClass();
        String replace = cls.getName().replace('.', '/');
        if (!c(replace)) {
            b(cls.getClassLoader().getResourceAsStream(replace + ".class"));
        }
    }

    static void b(InputStream inputStream) {
        if (inputStream != null) {
            try {
                DataInputStream dataInputStream = new DataInputStream(inputStream);
                try {
                    dataInputStream.readInt();
                    int readUnsignedShort = dataInputStream.readUnsignedShort();
                    dataInputStream.close();
                    if (readUnsignedShort == 65535) {
                        return;
                    } else {
                        throw new IllegalStateException("ASM9_EXPERIMENTAL can only be used by classes compiled with --enable-preview");
                    }
                } catch (Throwable th) {
                    try {
                        dataInputStream.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            } catch (IOException e8) {
                throw new IllegalStateException("I/O error, can't check class version", e8);
            }
        }
        throw new IllegalStateException("Bytecode not available, can't check class version");
    }

    static boolean c(String str) {
        if (!str.startsWith("com/nimbusds/jose/shaded/ow2asm/")) {
            return false;
        }
        if (!str.contains("Test$")) {
            if (!Pattern.matches("com/nimbusds/jose/shaded/ow2asm/util/Trace(Annotation|Class|Field|Method|Module|RecordComponent|Signature)Visitor(\\$.*)?", str)) {
                if (!Pattern.matches("com/nimbusds/jose/shaded/ow2asm/util/Check(Annotation|Class|Field|Method|Module|RecordComponent|Signature)Adapter(\\$.*)?", str)) {
                    return false;
                }
            }
        }
        return true;
    }
}
