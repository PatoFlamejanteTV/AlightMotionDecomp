package q5;

import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: q5.A, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3768A {

    /* renamed from: q5.A$a */
    /* loaded from: classes5.dex */
    public static final class a extends AbstractC3768A {

        /* renamed from: a, reason: collision with root package name */
        public static final a f37253a = new a();

        private a() {
            super(null);
        }
    }

    /* renamed from: q5.A$b */
    /* loaded from: classes5.dex */
    public static final class b extends AbstractC3768A {

        /* renamed from: a, reason: collision with root package name */
        public static final b f37254a = new b();

        private b() {
            super(null);
        }
    }

    /* renamed from: q5.A$c */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC3768A {

        /* renamed from: a, reason: collision with root package name */
        private final Object f37255a;

        public c(Object obj) {
            super(null);
            this.f37255a = obj;
        }

        public final Object a() {
            return this.f37255a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && AbstractC3292y.d(this.f37255a, ((c) obj).f37255a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            Object obj = this.f37255a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f37255a + ')';
        }
    }

    private AbstractC3768A() {
    }

    public /* synthetic */ AbstractC3768A(AbstractC3284p abstractC3284p) {
        this();
    }
}
