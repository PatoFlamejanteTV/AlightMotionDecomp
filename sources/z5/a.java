package Z5;

import g6.AbstractC2923c;
import h6.C2958a;

/* loaded from: classes5.dex */
public class a extends Y5.a {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z5.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0276a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0276a f13942a = new C0276a();

        /* renamed from: b, reason: collision with root package name */
        public static final Integer f13943b;

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
                f13943b = num2;
            }
            num = null;
            if (num != null) {
                num2 = num;
            }
            f13943b = num2;
        }

        private C0276a() {
        }
    }

    private final boolean c(int i8) {
        Integer num = C0276a.f13943b;
        if (num != null && num.intValue() < i8) {
            return false;
        }
        return true;
    }

    @Override // X5.a
    public AbstractC2923c b() {
        if (c(34)) {
            return new C2958a();
        }
        return super.b();
    }
}
