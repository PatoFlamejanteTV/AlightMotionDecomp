package F2;

import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public interface a {

    /* renamed from: F2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC0036a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0037a f2128a = new C0037a(null);

        /* renamed from: F2.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0037a {
            private C0037a() {
            }

            public final AbstractC0036a a(Throwable cause, String str) {
                AbstractC3292y.i(cause, "cause");
                return new b(cause, str);
            }

            public final AbstractC0036a b(Object obj) {
                return new c(obj);
            }

            public /* synthetic */ C0037a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        /* renamed from: F2.a$a$b */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC0036a {

            /* renamed from: b, reason: collision with root package name */
            private final Throwable f2129b;

            /* renamed from: c, reason: collision with root package name */
            private final String f2130c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Throwable cause, String str) {
                super(null);
                AbstractC3292y.i(cause, "cause");
                this.f2129b = cause;
                this.f2130c = str;
            }

            public final Throwable a() {
                return this.f2129b;
            }

            public final String b() {
                return this.f2130c;
            }
        }

        /* renamed from: F2.a$a$c */
        /* loaded from: classes4.dex */
        public static final class c extends AbstractC0036a {

            /* renamed from: b, reason: collision with root package name */
            private final Object f2131b;

            public c(Object obj) {
                super(null);
                this.f2131b = obj;
            }

            public final Object a() {
                return this.f2131b;
            }
        }

        public /* synthetic */ AbstractC0036a(AbstractC3284p abstractC3284p) {
            this();
        }

        private AbstractC0036a() {
        }
    }

    List e();

    boolean f();
}
