package q5;

import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: q5.B, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3769B {

    /* renamed from: q5.B$a */
    /* loaded from: classes5.dex */
    public static final class a extends AbstractC3769B {

        /* renamed from: a, reason: collision with root package name */
        public static final a f37256a = new a();

        private a() {
            super(null);
        }
    }

    /* renamed from: q5.B$b */
    /* loaded from: classes5.dex */
    public static final class b extends AbstractC3769B {

        /* renamed from: a, reason: collision with root package name */
        public static final b f37257a = new b();

        private b() {
            super(null);
        }
    }

    /* renamed from: q5.B$c */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC3769B {

        /* renamed from: a, reason: collision with root package name */
        public static final c f37258a = new c();

        private c() {
            super(null);
        }
    }

    /* renamed from: q5.B$d */
    /* loaded from: classes5.dex */
    public static final class d extends AbstractC3769B {

        /* renamed from: a, reason: collision with root package name */
        private final Object f37259a;

        public d(Object obj) {
            super(null);
            this.f37259a = obj;
        }

        public final Object a() {
            return this.f37259a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof d) && AbstractC3292y.d(this.f37259a, ((d) obj).f37259a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            Object obj = this.f37259a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f37259a + ')';
        }
    }

    private AbstractC3769B() {
    }

    public /* synthetic */ AbstractC3769B(AbstractC3284p abstractC3284p) {
        this();
    }
}
