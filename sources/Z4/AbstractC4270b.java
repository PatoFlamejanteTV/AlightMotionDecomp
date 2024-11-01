package z4;

import androidx.compose.ui.graphics.ColorFilter;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: z4.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4270b {

    /* renamed from: z4.b$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC4270b {

        /* renamed from: d, reason: collision with root package name */
        public static final int f41481d = 0;

        /* renamed from: a, reason: collision with root package name */
        private final int f41482a;

        /* renamed from: b, reason: collision with root package name */
        private final int f41483b;

        /* renamed from: c, reason: collision with root package name */
        private final ColorFilter f41484c;

        public /* synthetic */ a(int i8, int i9, ColorFilter colorFilter, int i10, AbstractC3284p abstractC3284p) {
            this(i8, i9, (i10 & 4) != 0 ? null : colorFilter);
        }

        public final ColorFilter a() {
            return this.f41484c;
        }

        public final int b() {
            return this.f41483b;
        }

        public final int c() {
            return this.f41482a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f41482a == aVar.f41482a && this.f41483b == aVar.f41483b && AbstractC3292y.d(this.f41484c, aVar.f41484c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int i8 = ((this.f41482a * 31) + this.f41483b) * 31;
            ColorFilter colorFilter = this.f41484c;
            if (colorFilter == null) {
                hashCode = 0;
            } else {
                hashCode = colorFilter.hashCode();
            }
            return i8 + hashCode;
        }

        public String toString() {
            return "Drawable(id=" + this.f41482a + ", contentDescription=" + this.f41483b + ", colorFilter=" + this.f41484c + ")";
        }

        public a(int i8, int i9, ColorFilter colorFilter) {
            super(null);
            this.f41482a = i8;
            this.f41483b = i9;
            this.f41484c = colorFilter;
        }
    }

    public /* synthetic */ AbstractC4270b(AbstractC3284p abstractC3284p) {
        this();
    }

    private AbstractC4270b() {
    }
}
