package androidx.compose.ui.text.font;

/* loaded from: classes.dex */
public interface PlatformResolveInterceptor {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final PlatformResolveInterceptor Default = new PlatformResolveInterceptor() { // from class: androidx.compose.ui.text.font.PlatformResolveInterceptor$Companion$Default$1
            @Override // androidx.compose.ui.text.font.PlatformResolveInterceptor
            public /* synthetic */ FontFamily interceptFontFamily(FontFamily fontFamily) {
                return c.a(this, fontFamily);
            }

            @Override // androidx.compose.ui.text.font.PlatformResolveInterceptor
            /* renamed from: interceptFontStyle-T2F_aPo */
            public /* synthetic */ int mo4732interceptFontStyleT2F_aPo(int i8) {
                return c.b(this, i8);
            }

            @Override // androidx.compose.ui.text.font.PlatformResolveInterceptor
            /* renamed from: interceptFontSynthesis-Mscr08Y */
            public /* synthetic */ int mo4733interceptFontSynthesisMscr08Y(int i8) {
                return c.c(this, i8);
            }

            @Override // androidx.compose.ui.text.font.PlatformResolveInterceptor
            public /* synthetic */ FontWeight interceptFontWeight(FontWeight fontWeight) {
                return c.d(this, fontWeight);
            }
        };

        private Companion() {
        }

        public final PlatformResolveInterceptor getDefault$ui_text_release() {
            return Default;
        }
    }

    FontFamily interceptFontFamily(FontFamily fontFamily);

    /* renamed from: interceptFontStyle-T2F_aPo */
    int mo4732interceptFontStyleT2F_aPo(int i8);

    /* renamed from: interceptFontSynthesis-Mscr08Y */
    int mo4733interceptFontSynthesisMscr08Y(int i8);

    FontWeight interceptFontWeight(FontWeight fontWeight);
}
