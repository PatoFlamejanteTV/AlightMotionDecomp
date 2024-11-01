package X2;

import Q5.I;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes4.dex */
public abstract class d {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f10961a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f10962b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ e f10963c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f10964d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f10965e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, Modifier modifier, e eVar, int i8, int i9) {
            super(2);
            this.f10961a = str;
            this.f10962b = modifier;
            this.f10963c = eVar;
            this.f10964d = i8;
            this.f10965e = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            d.a(this.f10961a, this.f10962b, this.f10963c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f10964d | 1), this.f10965e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(java.lang.String r19, androidx.compose.ui.Modifier r20, X2.e r21, androidx.compose.runtime.Composer r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X2.d.a(java.lang.String, androidx.compose.ui.Modifier, X2.e, androidx.compose.runtime.Composer, int, int):void");
    }
}
