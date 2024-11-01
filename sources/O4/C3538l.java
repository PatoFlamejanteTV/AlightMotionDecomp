package o4;

import androidx.compose.material.ColorsKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnitKt;

/* renamed from: o4.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3538l {

    /* renamed from: a, reason: collision with root package name */
    public static final C3538l f36005a;

    /* renamed from: b, reason: collision with root package name */
    private static final C3534h f36006b;

    /* renamed from: c, reason: collision with root package name */
    private static final C3534h f36007c;

    /* renamed from: d, reason: collision with root package name */
    private static final C3536j f36008d;

    /* renamed from: e, reason: collision with root package name */
    private static final n f36009e;

    /* renamed from: f, reason: collision with root package name */
    private static final C3529c f36010f;

    static {
        C3538l c3538l = new C3538l();
        f36005a = c3538l;
        Color.Companion companion = Color.Companion;
        f36006b = new C3534h(companion.m2985getWhite0d7_KjU(), ColorKt.Color(863533184), ColorKt.Color(863533184), companion.m2974getBlack0d7_KjU(), ColorKt.Color(2566914048L), companion.m2974getBlack0d7_KjU(), ColorKt.Color(2570861635L), ColorKt.Color(2566914048L), ColorsKt.m1177lightColors2qZNXz8$default(ColorKt.Color(4278221567L), 0L, 0L, 0L, 0L, companion.m2985getWhite0d7_KjU(), companion.m2982getRed0d7_KjU(), 0L, 0L, 0L, companion.m2974getBlack0d7_KjU(), 0L, 2974, null), null);
        f36007c = new C3534h(companion.m2977getDarkGray0d7_KjU(), ColorKt.Color(4286085248L), ColorKt.Color(4286085248L), companion.m2985getWhite0d7_KjU(), ColorKt.Color(2583691263L), companion.m2985getWhite0d7_KjU(), ColorKt.Color(1644167167), companion.m2985getWhite0d7_KjU(), ColorsKt.m1175darkColors2qZNXz8$default(ColorKt.Color(4278219988L), 0L, 0L, 0L, 0L, ColorKt.Color(4281216558L), companion.m2982getRed0d7_KjU(), 0L, 0L, 0L, companion.m2985getWhite0d7_KjU(), 0L, 2974, null), null);
        C3536j c3536j = new C3536j(6.0f, 1.0f, 2.0f);
        f36008d = c3536j;
        FontWeight.Companion companion2 = FontWeight.Companion;
        n nVar = new n(companion2.getNormal().getWeight(), companion2.getMedium().getWeight(), companion2.getBold().getWeight(), 1.0f, TextUnitKt.getSp(9), TextUnitKt.getSp(12), TextUnitKt.getSp(13), TextUnitKt.getSp(14), TextUnitKt.getSp(16), TextUnitKt.getSp(20), null, null, null, null, null, null, null, null, 260096, null);
        f36009e = nVar;
        f36010f = new C3529c(new C3527a(c3538l.a(false).g().m1155getPrimary0d7_KjU(), companion.m2985getWhite0d7_KjU(), companion.m2983getTransparent0d7_KjU(), AbstractC3539m.m(), companion.m2985getWhite0d7_KjU(), null), new C3527a(c3538l.a(true).g().m1155getPrimary0d7_KjU(), companion.m2985getWhite0d7_KjU(), companion.m2983getTransparent0d7_KjU(), AbstractC3539m.m(), companion.m2985getWhite0d7_KjU(), null), new C3528b(c3536j.e(), 0.0f), new C3530d(nVar.f(), nVar.n(), null));
    }

    private C3538l() {
    }

    public final C3534h a(boolean z8) {
        if (z8) {
            return f36007c;
        }
        return f36006b;
    }

    public final C3534h b() {
        return f36007c;
    }

    public final C3534h c() {
        return f36006b;
    }

    public final C3529c d() {
        return f36010f;
    }

    public final C3536j e() {
        return f36008d;
    }

    public final n f() {
        return f36009e;
    }
}
