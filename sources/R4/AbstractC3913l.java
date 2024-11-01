package r4;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* renamed from: r4.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3913l {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r4.l$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f38495a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f38496b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, String str2) {
            super(1);
            this.f38495a = str;
            this.f38496b = str2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SemanticsPropertyReceiver) obj);
            return Q5.I.f8786a;
        }

        public final void invoke(SemanticsPropertyReceiver semantics) {
            AbstractC3292y.i(semantics, "$this$semantics");
            SemanticsPropertiesKt.setTestTag(semantics, this.f38495a);
            SemanticsPropertiesKt.setStateDescription(semantics, this.f38496b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r4.l$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f38497a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f38498b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f38499c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f38500d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f38501e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f38502f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f38503g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f38504h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Modifier modifier, String str, boolean z8, String str2, boolean z9, Function1 function1, int i8, int i9) {
            super(2);
            this.f38497a = modifier;
            this.f38498b = str;
            this.f38499c = z8;
            this.f38500d = str2;
            this.f38501e = z9;
            this.f38502f = function1;
            this.f38503g = i8;
            this.f38504h = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC3913l.a(this.f38497a, this.f38498b, this.f38499c, this.f38500d, this.f38501e, this.f38502f, composer, RecomposeScopeImplKt.updateChangedFlags(this.f38503g | 1), this.f38504h);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(androidx.compose.ui.Modifier r28, java.lang.String r29, boolean r30, java.lang.String r31, boolean r32, kotlin.jvm.functions.Function1 r33, androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 636
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r4.AbstractC3913l.a(androidx.compose.ui.Modifier, java.lang.String, boolean, java.lang.String, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }
}
