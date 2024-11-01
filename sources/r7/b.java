package R7;

import R5.AbstractC1428l;
import R5.AbstractC1435t;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import l6.AbstractC3335a;
import l6.C3338d;
import l6.n;

/* loaded from: classes5.dex */
public abstract class b {

    /* loaded from: classes5.dex */
    public static final class a extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f9355a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public Object invoke(Object obj) {
            String valueOf;
            String s8 = (String) obj;
            AbstractC3292y.i(s8, "s");
            String lowerCase = s8.toLowerCase(Locale.ROOT);
            AbstractC3292y.h(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (lowerCase.length() > 0) {
                StringBuilder sb = new StringBuilder();
                char charAt = lowerCase.charAt(0);
                if (Character.isLowerCase(charAt)) {
                    Locale locale = Locale.getDefault();
                    AbstractC3292y.h(locale, "getDefault()");
                    valueOf = AbstractC3335a.e(charAt, locale);
                } else {
                    valueOf = String.valueOf(charAt);
                }
                sb.append((Object) valueOf);
                String substring = lowerCase.substring(1);
                AbstractC3292y.h(substring, "this as java.lang.String).substring(startIndex)");
                sb.append(substring);
                return sb.toString();
            }
            return lowerCase;
        }
    }

    /* renamed from: R7.b$b, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0196b extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final C0196b f9356a = new C0196b();

        public C0196b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public Object invoke(Object obj) {
            String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(((Number) obj).byteValue())}, 1));
            AbstractC3292y.h(format, "format(this, *args)");
            return format;
        }
    }

    public static final String a(String str) {
        AbstractC3292y.i(str, "<this>");
        return AbstractC1435t.w0(n.s0(str, new String[]{" "}, false, 0, 6, null), " ", null, null, 0, null, a.f9355a, 30, null);
    }

    public static final String b(String str) {
        AbstractC3292y.i(str, "<this>");
        MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
        byte[] bytes = str.getBytes(C3338d.f34755b);
        AbstractC3292y.h(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] bytes2 = messageDigest.digest(bytes);
        AbstractC3292y.h(bytes2, "bytes");
        return AbstractC1428l.x0(bytes2, "", null, null, 0, null, C0196b.f9356a, 30, null);
    }
}
