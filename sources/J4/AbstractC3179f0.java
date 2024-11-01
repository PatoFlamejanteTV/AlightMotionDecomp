package j4;

import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 1)
@y6.g(with = C3181g0.class)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: j4.f0 */
/* loaded from: classes4.dex */
public abstract class AbstractC3179f0 implements Parcelable {
    public static final a Companion = new a(null);

    /* renamed from: j4.f0$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final y6.b serializer() {
            return C3181g0.f34126c;
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public /* synthetic */ AbstractC3179f0(AbstractC3284p abstractC3284p) {
        this();
    }

    public static /* synthetic */ r4.h0 f(AbstractC3179f0 abstractC3179f0, r4.k0 k0Var, Integer num, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 2) != 0) {
                num = null;
            }
            return abstractC3179f0.b(k0Var, num);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createSectionElement");
    }

    public final r4.h0 a(List sectionFieldElements, Integer num) {
        AbstractC3292y.i(sectionFieldElements, "sectionFieldElements");
        return r4.h0.f38430f.a(sectionFieldElements, num);
    }

    public final r4.h0 b(r4.k0 sectionFieldElement, Integer num) {
        AbstractC3292y.i(sectionFieldElement, "sectionFieldElement");
        return r4.h0.f38430f.b(sectionFieldElement, num);
    }

    private AbstractC3179f0() {
    }
}
