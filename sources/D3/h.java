package D3;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private final d f1309a;

    /* loaded from: classes4.dex */
    public static final class a extends h {

        /* renamed from: b, reason: collision with root package name */
        private final Function0 f1310b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function0 onComplete) {
            super(null, 1, 0 == true ? 1 : 0);
            AbstractC3292y.i(onComplete, "onComplete");
            this.f1310b = onComplete;
        }

        public final Function0 b() {
            return this.f1310b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && AbstractC3292y.d(this.f1310b, ((a) obj).f1310b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f1310b.hashCode();
        }

        public String toString() {
            return "FinishProcessing(onComplete=" + this.f1310b + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends h {

        /* renamed from: b, reason: collision with root package name */
        private final d f1311b;

        public /* synthetic */ b(d dVar, int i8, AbstractC3284p abstractC3284p) {
            this((i8 & 1) != 0 ? null : dVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && AbstractC3292y.d(this.f1311b, ((b) obj).f1311b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            d dVar = this.f1311b;
            if (dVar == null) {
                return 0;
            }
            return dVar.hashCode();
        }

        public String toString() {
            return "Reset(message=" + this.f1311b + ")";
        }

        public b(d dVar) {
            super(dVar, null);
            this.f1311b = dVar;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends h {

        /* renamed from: b, reason: collision with root package name */
        public static final c f1312b = new c();

        private c() {
            super(null, 0 == true ? 1 : 0);
        }

        public boolean equals(Object obj) {
            if (this == obj || (obj instanceof c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -1787228877;
        }

        public String toString() {
            return "StartProcessing";
        }
    }

    /* loaded from: classes4.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final C2.c f1313a;

        public d(C2.c message) {
            AbstractC3292y.i(message, "message");
            this.f1313a = message;
        }

        public final C2.c a() {
            return this.f1313a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof d) && AbstractC3292y.d(this.f1313a, ((d) obj).f1313a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f1313a.hashCode();
        }

        public String toString() {
            return "UserErrorMessage(message=" + this.f1313a + ")";
        }
    }

    public /* synthetic */ h(d dVar, AbstractC3284p abstractC3284p) {
        this(dVar);
    }

    public final d a() {
        return this.f1309a;
    }

    private h(d dVar) {
        this.f1309a = dVar;
    }

    public /* synthetic */ h(d dVar, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? null : dVar, null);
    }
}
