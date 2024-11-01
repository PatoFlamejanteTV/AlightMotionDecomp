package P3;

import Q5.I;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import c6.InterfaceC2072n;
import j6.i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.U;

/* loaded from: classes4.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ i[] f8074a = {U.e(new E(e.class, "testMetadata", "getTestMetadata(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1))};

    /* renamed from: b, reason: collision with root package name */
    private static final SemanticsPropertyKey f8075b = new SemanticsPropertyKey("TestMetadata", a.f8076a);

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f8076a = new a();

        a() {
            super(2);
        }

        @Override // c6.InterfaceC2072n
        public final String invoke(String str, String str2) {
            return str;
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f8077a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f8077a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SemanticsPropertyReceiver) obj);
            return I.f8786a;
        }

        public final void invoke(SemanticsPropertyReceiver semantics) {
            AbstractC3292y.i(semantics, "$this$semantics");
            e.a(semantics, this.f8077a);
        }
    }

    public static final void a(SemanticsPropertyReceiver semanticsPropertyReceiver, String str) {
        AbstractC3292y.i(semanticsPropertyReceiver, "<this>");
        f8075b.setValue(semanticsPropertyReceiver, f8074a[0], str);
    }

    public static final Modifier b(Modifier modifier, String str) {
        AbstractC3292y.i(modifier, "<this>");
        return SemanticsModifierKt.semantics$default(modifier, false, new b(str), 1, null);
    }
}
