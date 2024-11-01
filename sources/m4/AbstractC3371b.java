package m4;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* renamed from: m4.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3371b {

    /* renamed from: a, reason: collision with root package name */
    private static final ProvidableCompositionLocal f35024a = CompositionLocalKt.staticCompositionLocalOf(a.f35025a);

    /* renamed from: m4.b$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f35025a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3370a invoke() {
            return C3372c.f35026a;
        }
    }

    public static final ProvidableCompositionLocal a() {
        return f35024a;
    }
}
