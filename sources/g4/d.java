package g4;

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
        final /* synthetic */ Modifier f32290a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f32291b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f32292c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f32293d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f32294e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f32295f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f32296g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Modifier modifier, long j8, float f8, long j9, int i8, int i9, int i10) {
            super(2);
            this.f32290a = modifier;
            this.f32291b = j8;
            this.f32292c = f8;
            this.f32293d = j9;
            this.f32294e = i8;
            this.f32295f = i9;
            this.f32296g = i10;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            d.a(this.f32290a, this.f32291b, this.f32292c, this.f32293d, this.f32294e, composer, RecomposeScopeImplKt.updateChangedFlags(this.f32295f | 1), this.f32296g);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(androidx.compose.ui.Modifier r23, long r24, float r26, long r27, int r29, androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.d.a(androidx.compose.ui.Modifier, long, float, long, int, androidx.compose.runtime.Composer, int, int):void");
    }
}
