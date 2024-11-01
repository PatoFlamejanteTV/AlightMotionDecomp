package N3;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public interface m {

    /* loaded from: classes4.dex */
    public static final class a implements m {

        /* renamed from: a, reason: collision with root package name */
        private final Function0 f6606a;

        public a(Function0 onComplete) {
            AbstractC3292y.i(onComplete, "onComplete");
            this.f6606a = onComplete;
        }

        public final Function0 a() {
            return this.f6606a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements m {

        /* renamed from: a, reason: collision with root package name */
        private final C2.c f6607a;

        public b(C2.c cVar) {
            this.f6607a = cVar;
        }

        public final C2.c a() {
            return this.f6607a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && AbstractC3292y.d(this.f6607a, ((b) obj).f6607a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            C2.c cVar = this.f6607a;
            if (cVar == null) {
                return 0;
            }
            return cVar.hashCode();
        }

        public String toString() {
            return "Idle(error=" + this.f6607a + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements m {

        /* renamed from: a, reason: collision with root package name */
        public static final c f6608a = new c();

        private c() {
        }

        public boolean equals(Object obj) {
            if (this == obj || (obj instanceof c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -295978178;
        }

        public String toString() {
            return "Processing";
        }
    }
}
