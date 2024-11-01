package androidx.compose.ui.text.platform;

import R5.AbstractC1435t;
import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontListFontFamily;
import androidx.compose.ui.text.font.FontMatcher;
import androidx.compose.ui.text.font.FontSynthesis_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class AndroidFontListTypeface implements AndroidTypeface {
    private final FontFamily fontFamily;
    private final FontMatcher fontMatcher$1;
    private final Map<Font, Typeface> loadedTypefaces;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final FontMatcher fontMatcher = new FontMatcher();

    /* loaded from: classes.dex */
    private static final class Companion {
        private Companion() {
        }

        public final FontMatcher getFontMatcher() {
            return AndroidFontListTypeface.fontMatcher;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AndroidFontListTypeface(androidx.compose.ui.text.font.FontListFontFamily r8, android.content.Context r9, java.util.List<Q5.r> r10, androidx.compose.ui.text.font.FontMatcher r11) {
        /*
            r7 = this;
            r7.<init>()
            r7.fontMatcher$1 = r11
            java.util.List r11 = r8.getFonts()
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r11.size()
            r0.<init>(r1)
            int r1 = r11.size()
            r2 = 0
            r3 = 0
        L18:
            if (r3 >= r1) goto L37
            java.lang.Object r4 = r11.get(r3)
            r5 = r4
            androidx.compose.ui.text.font.Font r5 = (androidx.compose.ui.text.font.Font) r5
            int r5 = r5.mo4725getLoadingStrategyPKNRLFQ()
            androidx.compose.ui.text.font.FontLoadingStrategy$Companion r6 = androidx.compose.ui.text.font.FontLoadingStrategy.Companion
            int r6 = r6.m4771getBlockingPKNRLFQ()
            boolean r5 = androidx.compose.ui.text.font.FontLoadingStrategy.m4766equalsimpl0(r5, r6)
            if (r5 == 0) goto L34
            r0.add(r4)
        L34:
            int r3 = r3 + 1
            goto L18
        L37:
            if (r10 == 0) goto La3
            java.util.ArrayList r11 = new java.util.ArrayList
            int r1 = r10.size()
            r11.<init>(r1)
            int r1 = r10.size()
            r3 = 0
        L47:
            if (r3 >= r1) goto L71
            java.lang.Object r4 = r10.get(r3)
            Q5.r r4 = (Q5.r) r4
            java.lang.Object r5 = r4.a()
            androidx.compose.ui.text.font.FontWeight r5 = (androidx.compose.ui.text.font.FontWeight) r5
            java.lang.Object r4 = r4.b()
            androidx.compose.ui.text.font.FontStyle r4 = (androidx.compose.ui.text.font.FontStyle) r4
            int r4 = r4.m4782unboximpl()
            androidx.compose.ui.text.font.FontMatcher r6 = r7.fontMatcher$1
            java.util.List r4 = r6.m4775matchFontRetOiIg(r0, r5, r4)
            java.lang.Object r4 = R5.AbstractC1435t.o0(r4)
            androidx.compose.ui.text.font.Font r4 = (androidx.compose.ui.text.font.Font) r4
            r11.add(r4)
            int r3 = r3 + 1
            goto L47
        L71:
            java.util.List r10 = androidx.compose.ui.util.ListUtilsKt.fastFilterNotNull(r11)
            if (r10 == 0) goto La3
            java.util.HashSet r11 = new java.util.HashSet
            int r1 = r10.size()
            r11.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r3 = r10.size()
            r1.<init>(r3)
            int r3 = r10.size()
            r4 = 0
        L8e:
            if (r4 >= r3) goto La4
            java.lang.Object r5 = r10.get(r4)
            r6 = r5
            androidx.compose.ui.text.font.Font r6 = (androidx.compose.ui.text.font.Font) r6
            boolean r6 = r11.add(r6)
            if (r6 == 0) goto La0
            r1.add(r5)
        La0:
            int r4 = r4 + 1
            goto L8e
        La3:
            r1 = 0
        La4:
            if (r1 != 0) goto La7
            goto La8
        La7:
            r0 = r1
        La8:
            boolean r10 = r0.isEmpty()
            r10 = r10 ^ 1
            if (r10 == 0) goto Le9
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>()
            int r11 = r0.size()
        Lb9:
            if (r2 >= r11) goto Le4
            java.lang.Object r1 = r0.get(r2)
            androidx.compose.ui.text.font.Font r1 = (androidx.compose.ui.text.font.Font) r1
            androidx.compose.ui.text.platform.AndroidTypefaceCache r3 = androidx.compose.ui.text.platform.AndroidTypefaceCache.INSTANCE     // Catch: java.lang.Exception -> Lcd
            android.graphics.Typeface r3 = r3.getOrCreate(r9, r1)     // Catch: java.lang.Exception -> Lcd
            r10.put(r1, r3)     // Catch: java.lang.Exception -> Lcd
            int r2 = r2 + 1
            goto Lb9
        Lcd:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Cannot create Typeface from "
            r9.append(r10)
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        Le4:
            r7.loadedTypefaces = r10
            r7.fontFamily = r8
            return
        Le9:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Could not match font"
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.platform.AndroidFontListTypeface.<init>(androidx.compose.ui.text.font.FontListFontFamily, android.content.Context, java.util.List, androidx.compose.ui.text.font.FontMatcher):void");
    }

    @Override // androidx.compose.ui.text.font.Typeface
    public FontFamily getFontFamily() {
        return this.fontFamily;
    }

    public final FontMatcher getFontMatcher() {
        return this.fontMatcher$1;
    }

    @Override // androidx.compose.ui.text.platform.AndroidTypeface
    /* renamed from: getNativeTypeface-PYhJU0U */
    public Typeface mo4909getNativeTypefacePYhJU0U(FontWeight fontWeight, int i8, int i9) {
        Font font = (Font) AbstractC1435t.o0(this.fontMatcher$1.m4775matchFontRetOiIg(new ArrayList(this.loadedTypefaces.keySet()), fontWeight, i8));
        if (font != null) {
            Typeface typeface = this.loadedTypefaces.get(font);
            if (typeface != null) {
                Object m4800synthesizeTypefaceFxwP2eA = FontSynthesis_androidKt.m4800synthesizeTypefaceFxwP2eA(i9, typeface, font, fontWeight, i8);
                AbstractC3292y.g(m4800synthesizeTypefaceFxwP2eA, "null cannot be cast to non-null type android.graphics.Typeface");
                return (Typeface) m4800synthesizeTypefaceFxwP2eA;
            }
            throw new IllegalStateException("Could not load typeface".toString());
        }
        throw new IllegalStateException("Could not load font".toString());
    }

    public /* synthetic */ AndroidFontListTypeface(FontListFontFamily fontListFontFamily, Context context, List list, FontMatcher fontMatcher2, int i8, AbstractC3284p abstractC3284p) {
        this(fontListFontFamily, context, (i8 & 4) != 0 ? null : list, (i8 & 8) != 0 ? fontMatcher : fontMatcher2);
    }
}
