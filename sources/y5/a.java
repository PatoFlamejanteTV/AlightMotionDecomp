package Y5;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public abstract class a extends X5.a {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y5.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0269a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0269a f13143a = new C0269a();

        /* renamed from: b, reason: collision with root package name */
        public static final Integer f13144b;

        static {
            Integer num;
            Object obj;
            Integer num2 = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            if (obj instanceof Integer) {
                num = (Integer) obj;
                if (num != null && num.intValue() > 0) {
                    num2 = num;
                }
                f13144b = num2;
            }
            num = null;
            if (num != null) {
                num2 = num;
            }
            f13144b = num2;
        }

        private C0269a() {
        }
    }

    private final boolean c(int i8) {
        Integer num = C0269a.f13144b;
        if (num != null && num.intValue() < i8) {
            return false;
        }
        return true;
    }

    @Override // X5.a
    public void a(Throwable cause, Throwable exception) {
        AbstractC3292y.i(cause, "cause");
        AbstractC3292y.i(exception, "exception");
        if (c(19)) {
            cause.addSuppressed(exception);
        } else {
            super.a(cause, exception);
        }
    }
}
