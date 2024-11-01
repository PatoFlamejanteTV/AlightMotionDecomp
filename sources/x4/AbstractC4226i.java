package x4;

import androidx.compose.ui.graphics.painter.Painter;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: x4.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
abstract class AbstractC4226i {

    /* renamed from: x4.i$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC4226i {

        /* renamed from: a, reason: collision with root package name */
        public static final a f41089a = new a();

        private a() {
            super(null);
        }
    }

    /* renamed from: x4.i$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC4226i {

        /* renamed from: a, reason: collision with root package name */
        public static final b f41090a = new b();

        private b() {
            super(null);
        }
    }

    /* renamed from: x4.i$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC4226i {

        /* renamed from: a, reason: collision with root package name */
        private final Painter f41091a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Painter painter) {
            super(null);
            AbstractC3292y.i(painter, "painter");
            this.f41091a = painter;
        }

        public final Painter a() {
            return this.f41091a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && AbstractC3292y.d(this.f41091a, ((c) obj).f41091a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f41091a.hashCode();
        }

        public String toString() {
            return "Success(painter=" + this.f41091a + ")";
        }
    }

    private AbstractC4226i() {
    }

    public /* synthetic */ AbstractC4226i(AbstractC3284p abstractC3284p) {
        this();
    }
}
