package u4;

import Q5.I;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* renamed from: u4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4080a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u4.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0904a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f40272a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f40273b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f40274c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f40275d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f40276e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f40277f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0904a(boolean z8, Function1 function1, Modifier modifier, boolean z9, int i8, int i9) {
            super(2);
            this.f40272a = z8;
            this.f40273b = function1;
            this.f40274c = modifier;
            this.f40275d = z9;
            this.f40276e = i8;
            this.f40277f = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC4080a.a(this.f40272a, this.f40273b, this.f40274c, this.f40275d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f40276e | 1), this.f40277f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(boolean r22, kotlin.jvm.functions.Function1 r23, androidx.compose.ui.Modifier r24, boolean r25, androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.AbstractC4080a.a(boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, androidx.compose.runtime.Composer, int, int):void");
    }
}
