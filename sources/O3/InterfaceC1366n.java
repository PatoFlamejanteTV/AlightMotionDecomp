package O3;

import g3.EnumC2906e;
import kotlin.jvm.internal.AbstractC3292y;
import q6.InterfaceC3813L;

/* renamed from: O3.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC1366n {

    /* renamed from: O3.n$a */
    /* loaded from: classes4.dex */
    public interface a {

        /* renamed from: O3.n$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0149a implements a {

            /* renamed from: a, reason: collision with root package name */
            private final EnumC2906e f7715a;

            public C0149a(EnumC2906e enumC2906e) {
                this.f7715a = enumC2906e;
            }

            public final EnumC2906e a() {
                return this.f7715a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C0149a) && this.f7715a == ((C0149a) obj).f7715a) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                EnumC2906e enumC2906e = this.f7715a;
                if (enumC2906e == null) {
                    return 0;
                }
                return enumC2906e.hashCode();
            }

            public String toString() {
                return "HideBrands(brand=" + this.f7715a + ")";
            }
        }

        /* renamed from: O3.n$a$b */
        /* loaded from: classes4.dex */
        public static final class b implements a {

            /* renamed from: a, reason: collision with root package name */
            private final EnumC2906e f7716a;

            public b(EnumC2906e brand) {
                AbstractC3292y.i(brand, "brand");
                this.f7716a = brand;
            }

            public final EnumC2906e a() {
                return this.f7716a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof b) && this.f7716a == ((b) obj).f7716a) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.f7716a.hashCode();
            }

            public String toString() {
                return "ShowBrands(brand=" + this.f7716a + ")";
            }
        }
    }

    InterfaceC3813L a();

    void b(InterfaceC1365m interfaceC1365m);
}
