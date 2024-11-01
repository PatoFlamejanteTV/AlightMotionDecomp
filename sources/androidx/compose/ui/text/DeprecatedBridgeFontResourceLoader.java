package androidx.compose.ui.text;

import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontKt;
import androidx.compose.ui.text.platform.Synchronization_jvmKt;
import androidx.compose.ui.text.platform.SynchronizedObject;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3284p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DeprecatedBridgeFontResourceLoader implements Font.ResourceLoader {
    public static final Companion Companion = new Companion(null);
    private static Map<FontFamily.Resolver, Font.ResourceLoader> cache = new LinkedHashMap();
    private static final SynchronizedObject lock = Synchronization_jvmKt.createSynchronizedObject();
    private final FontFamily.Resolver fontFamilyResolver;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final Font.ResourceLoader from(FontFamily.Resolver resolver) {
            synchronized (getLock()) {
                Companion companion = DeprecatedBridgeFontResourceLoader.Companion;
                Font.ResourceLoader resourceLoader = companion.getCache().get(resolver);
                if (resourceLoader != null) {
                    return resourceLoader;
                }
                DeprecatedBridgeFontResourceLoader deprecatedBridgeFontResourceLoader = new DeprecatedBridgeFontResourceLoader(resolver, null);
                companion.getCache().put(resolver, deprecatedBridgeFontResourceLoader);
                return deprecatedBridgeFontResourceLoader;
            }
        }

        public final Map<FontFamily.Resolver, Font.ResourceLoader> getCache() {
            return DeprecatedBridgeFontResourceLoader.cache;
        }

        public final SynchronizedObject getLock() {
            return DeprecatedBridgeFontResourceLoader.lock;
        }

        public final void setCache(Map<FontFamily.Resolver, Font.ResourceLoader> map) {
            DeprecatedBridgeFontResourceLoader.cache = map;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public /* synthetic */ DeprecatedBridgeFontResourceLoader(FontFamily.Resolver resolver, AbstractC3284p abstractC3284p) {
        this(resolver);
    }

    @Override // androidx.compose.ui.text.font.Font.ResourceLoader
    public Object load(Font font) {
        return androidx.compose.ui.text.font.b.a(this.fontFamilyResolver, FontKt.toFontFamily(font), font.getWeight(), font.mo4735getStyle_LCdwA(), 0, 8, null).getValue();
    }

    private DeprecatedBridgeFontResourceLoader(FontFamily.Resolver resolver) {
        this.fontFamilyResolver = resolver;
    }
}
