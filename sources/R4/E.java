package r4;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes4.dex */
public abstract class E {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f37975a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f37976b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f37977c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f37978d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f37979e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, Modifier modifier, boolean z8, int i8, int i9) {
            super(2);
            this.f37975a = str;
            this.f37976b = modifier;
            this.f37977c = z8;
            this.f37978d = i8;
            this.f37979e = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            E.a(this.f37975a, this.f37976b, this.f37977c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f37978d | 1), this.f37979e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(java.lang.String r30, androidx.compose.ui.Modifier r31, boolean r32, androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r4.E.a(java.lang.String, androidx.compose.ui.Modifier, boolean, androidx.compose.runtime.Composer, int, int):void");
    }
}
