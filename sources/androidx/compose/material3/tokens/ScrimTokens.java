package androidx.compose.material3.tokens;

/* loaded from: classes.dex */
public final class ScrimTokens {
    public static final float ContainerOpacity = 0.32f;
    public static final ScrimTokens INSTANCE = new ScrimTokens();
    private static final ColorSchemeKeyTokens ContainerColor = ColorSchemeKeyTokens.Scrim;

    private ScrimTokens() {
    }

    public final ColorSchemeKeyTokens getContainerColor() {
        return ContainerColor;
    }
}
