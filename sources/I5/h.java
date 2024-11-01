package I5;

import Q5.I;
import android.graphics.Bitmap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;
import n6.AbstractC3460j;

/* loaded from: classes5.dex */
public final class h extends AbstractC3293z implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f3784a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar) {
        super(1);
        this.f3784a = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        AbstractC3460j.b(null, new g((Bitmap) obj, this.f3784a, null), 1, null);
        return I.f8786a;
    }
}
