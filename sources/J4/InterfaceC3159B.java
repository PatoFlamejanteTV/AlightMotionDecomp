package j4;

import g3.EnumC2906e;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: j4.B, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC3159B {

    /* renamed from: j4.B$a */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC3159B {

        /* renamed from: a, reason: collision with root package name */
        private final List f33718a;

        /* renamed from: b, reason: collision with root package name */
        private final EnumC2906e f33719b;

        public a(List preferredBrands, EnumC2906e enumC2906e) {
            AbstractC3292y.i(preferredBrands, "preferredBrands");
            this.f33718a = preferredBrands;
            this.f33719b = enumC2906e;
        }

        public final EnumC2906e a() {
            return this.f33719b;
        }

        public final List b() {
            return this.f33718a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (AbstractC3292y.d(this.f33718a, aVar.f33718a) && this.f33719b == aVar.f33719b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.f33718a.hashCode() * 31;
            EnumC2906e enumC2906e = this.f33719b;
            if (enumC2906e == null) {
                hashCode = 0;
            } else {
                hashCode = enumC2906e.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            return "Eligible(preferredBrands=" + this.f33718a + ", initialBrand=" + this.f33719b + ")";
        }
    }

    /* renamed from: j4.B$b */
    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC3159B {

        /* renamed from: a, reason: collision with root package name */
        public static final b f33720a = new b();

        private b() {
        }
    }
}
