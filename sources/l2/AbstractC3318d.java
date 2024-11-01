package l2;

import R5.AbstractC1435t;
import a6.AbstractC1677b;
import a6.AbstractC1684i;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: l2.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3318d {
    public static final String a(InputStream inputStream) {
        AbstractC3292y.i(inputStream, "inputStream");
        try {
            try {
                String w02 = AbstractC1435t.w0(AbstractC1684i.e(new BufferedReader(new InputStreamReader(inputStream, "utf-8"))), "\n", null, null, 0, null, null, 62, null);
                AbstractC1677b.a(inputStream, null);
                return w02;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC1677b.a(inputStream, th);
                    throw th2;
                }
            }
        } catch (Exception unused) {
            throw new RuntimeException("Can't parse HTML file.");
        }
    }
}
