package O3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* renamed from: O3.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1368p {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O3.p$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f7732a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f7733b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f7734c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f7735d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, Modifier modifier, int i8, int i9) {
            super(2);
            this.f7732a = str;
            this.f7733b = modifier;
            this.f7734c = i8;
            this.f7735d = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC1368p.a(this.f7732a, this.f7733b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7734c | 1), this.f7735d);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(java.lang.String r27, androidx.compose.ui.Modifier r28, androidx.compose.runtime.Composer r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.AbstractC1368p.a(java.lang.String, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }
}
