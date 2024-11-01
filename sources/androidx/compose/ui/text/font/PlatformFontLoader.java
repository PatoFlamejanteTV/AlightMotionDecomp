package androidx.compose.ui.text.font;

/* loaded from: classes.dex */
public interface PlatformFontLoader {
    Object awaitLoad(Font font, U5.d dVar);

    Object getCacheKey();

    Object loadBlocking(Font font);
}
