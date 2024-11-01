package androidx.room.util;

import android.annotation.SuppressLint;
import android.os.Build;
import androidx.annotation.RestrictTo;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import kotlin.jvm.internal.AbstractC3292y;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public final class FileUtil {
    @SuppressLint({"LambdaLast"})
    public static final void copy(ReadableByteChannel input, FileChannel output) throws IOException {
        AbstractC3292y.i(input, "input");
        AbstractC3292y.i(output, "output");
        try {
            if (Build.VERSION.SDK_INT > 23) {
                output.transferFrom(input, 0L, Long.MAX_VALUE);
            } else {
                InputStream newInputStream = Channels.newInputStream(input);
                OutputStream newOutputStream = Channels.newOutputStream(output);
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = newInputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    } else {
                        newOutputStream.write(bArr, 0, read);
                    }
                }
            }
            output.force(false);
            input.close();
            output.close();
        } catch (Throwable th) {
            input.close();
            output.close();
            throw th;
        }
    }
}
