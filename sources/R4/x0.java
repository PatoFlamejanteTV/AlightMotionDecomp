package r4;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public abstract class x0 {

    /* loaded from: classes4.dex */
    public static final class a extends x0 {

        /* renamed from: a, reason: collision with root package name */
        private final C2.c f38693a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f38694b;

        /* renamed from: c, reason: collision with root package name */
        private final C0871a f38695c;

        /* renamed from: d, reason: collision with root package name */
        private final List f38696d;

        /* renamed from: r4.x0$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0871a implements t0 {

            /* renamed from: a, reason: collision with root package name */
            private final String f38697a;

            /* renamed from: b, reason: collision with root package name */
            private final C2.c f38698b;

            /* renamed from: c, reason: collision with root package name */
            private final int f38699c;

            public C0871a(String id, C2.c label, int i8) {
                AbstractC3292y.i(id, "id");
                AbstractC3292y.i(label, "label");
                this.f38697a = id;
                this.f38698b = label;
                this.f38699c = i8;
            }

            public final String a() {
                return this.f38697a;
            }

            @Override // r4.t0
            public C2.c b() {
                return this.f38698b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0871a)) {
                    return false;
                }
                C0871a c0871a = (C0871a) obj;
                if (AbstractC3292y.d(this.f38697a, c0871a.f38697a) && AbstractC3292y.d(this.f38698b, c0871a.f38698b) && this.f38699c == c0871a.f38699c) {
                    return true;
                }
                return false;
            }

            @Override // r4.t0
            public Integer getIcon() {
                return Integer.valueOf(this.f38699c);
            }

            public int hashCode() {
                return (((this.f38697a.hashCode() * 31) + this.f38698b.hashCode()) * 31) + this.f38699c;
            }

            public String toString() {
                return "Item(id=" + this.f38697a + ", label=" + this.f38698b + ", icon=" + this.f38699c + ")";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C2.c title, boolean z8, C0871a currentItem, List items) {
            super(null);
            AbstractC3292y.i(title, "title");
            AbstractC3292y.i(currentItem, "currentItem");
            AbstractC3292y.i(items, "items");
            this.f38693a = title;
            this.f38694b = z8;
            this.f38695c = currentItem;
            this.f38696d = items;
        }

        public final C0871a a() {
            return this.f38695c;
        }

        public final boolean b() {
            return this.f38694b;
        }

        public final List c() {
            return this.f38696d;
        }

        public final C2.c d() {
            return this.f38693a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (AbstractC3292y.d(this.f38693a, aVar.f38693a) && this.f38694b == aVar.f38694b && AbstractC3292y.d(this.f38695c, aVar.f38695c) && AbstractC3292y.d(this.f38696d, aVar.f38696d)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f38693a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f38694b)) * 31) + this.f38695c.hashCode()) * 31) + this.f38696d.hashCode();
        }

        public String toString() {
            return "Dropdown(title=" + this.f38693a + ", hide=" + this.f38694b + ", currentItem=" + this.f38695c + ", items=" + this.f38696d + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends x0 {

        /* renamed from: a, reason: collision with root package name */
        private final List f38700a;

        /* renamed from: b, reason: collision with root package name */
        private final List f38701b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List staticIcons, List animatedIcons) {
            super(null);
            AbstractC3292y.i(staticIcons, "staticIcons");
            AbstractC3292y.i(animatedIcons, "animatedIcons");
            this.f38700a = staticIcons;
            this.f38701b = animatedIcons;
        }

        public final List a() {
            return this.f38701b;
        }

        public final List b() {
            return this.f38700a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (AbstractC3292y.d(this.f38700a, bVar.f38700a) && AbstractC3292y.d(this.f38701b, bVar.f38701b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f38700a.hashCode() * 31) + this.f38701b.hashCode();
        }

        public String toString() {
            return "MultiTrailing(staticIcons=" + this.f38700a + ", animatedIcons=" + this.f38701b + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends x0 {

        /* renamed from: e, reason: collision with root package name */
        public static final int f38702e = 0;

        /* renamed from: a, reason: collision with root package name */
        private final int f38703a;

        /* renamed from: b, reason: collision with root package name */
        private final Integer f38704b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f38705c;

        /* renamed from: d, reason: collision with root package name */
        private final Function0 f38706d;

        public /* synthetic */ c(int i8, Integer num, boolean z8, Function0 function0, int i9, AbstractC3284p abstractC3284p) {
            this(i8, (i9 & 2) != 0 ? null : num, z8, (i9 & 8) != 0 ? null : function0);
        }

        public final Integer a() {
            return this.f38704b;
        }

        public final int b() {
            return this.f38703a;
        }

        public final Function0 c() {
            return this.f38706d;
        }

        public final boolean d() {
            return this.f38705c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f38703a == cVar.f38703a && AbstractC3292y.d(this.f38704b, cVar.f38704b) && this.f38705c == cVar.f38705c && AbstractC3292y.d(this.f38706d, cVar.f38706d)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int i8 = this.f38703a * 31;
            Integer num = this.f38704b;
            int i9 = 0;
            if (num == null) {
                hashCode = 0;
            } else {
                hashCode = num.hashCode();
            }
            int a9 = (((i8 + hashCode) * 31) + androidx.compose.foundation.a.a(this.f38705c)) * 31;
            Function0 function0 = this.f38706d;
            if (function0 != null) {
                i9 = function0.hashCode();
            }
            return a9 + i9;
        }

        public String toString() {
            return "Trailing(idRes=" + this.f38703a + ", contentDescription=" + this.f38704b + ", isTintable=" + this.f38705c + ", onClick=" + this.f38706d + ")";
        }

        public c(int i8, Integer num, boolean z8, Function0 function0) {
            super(null);
            this.f38703a = i8;
            this.f38704b = num;
            this.f38705c = z8;
            this.f38706d = function0;
        }
    }

    public /* synthetic */ x0(AbstractC3284p abstractC3284p) {
        this();
    }

    private x0() {
    }
}
