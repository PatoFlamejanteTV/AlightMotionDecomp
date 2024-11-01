package androidx.compose.runtime;

import Q5.r;
import androidx.compose.runtime.tooling.CompositionData;
import c6.InterfaceC2072n;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public interface Composer {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Object Empty = new Object() { // from class: androidx.compose.runtime.Composer$Companion$Empty$1
            public String toString() {
                return "Empty";
            }
        };

        private Companion() {
        }

        public final Object getEmpty() {
            return Empty;
        }

        @InternalComposeTracingApi
        public final void setTracer(CompositionTracer compositionTracer) {
            ComposerKt.access$setCompositionTracer$p(compositionTracer);
        }
    }

    @ComposeCompilerApi
    <V, T> void apply(V v8, InterfaceC2072n interfaceC2072n);

    @InternalComposeApi
    CompositionContext buildContext();

    @ComposeCompilerApi
    boolean changed(byte b9);

    @ComposeCompilerApi
    boolean changed(char c8);

    @ComposeCompilerApi
    boolean changed(double d8);

    @ComposeCompilerApi
    boolean changed(float f8);

    @ComposeCompilerApi
    boolean changed(int i8);

    @ComposeCompilerApi
    boolean changed(long j8);

    @ComposeCompilerApi
    boolean changed(Object obj);

    @ComposeCompilerApi
    boolean changed(short s8);

    @ComposeCompilerApi
    boolean changed(boolean z8);

    @ComposeCompilerApi
    boolean changedInstance(Object obj);

    void collectParameterInformation();

    @InternalComposeApi
    <T> T consume(CompositionLocal<T> compositionLocal);

    @ComposeCompilerApi
    <T> void createNode(Function0 function0);

    @ComposeCompilerApi
    void deactivateToEndGroup(boolean z8);

    @ComposeCompilerApi
    void disableReusing();

    void disableSourceInformation();

    @ComposeCompilerApi
    void enableReusing();

    @ComposeCompilerApi
    void endDefaults();

    @ComposeCompilerApi
    void endMovableGroup();

    @ComposeCompilerApi
    void endNode();

    @InternalComposeApi
    void endProvider();

    @InternalComposeApi
    void endProviders();

    @ComposeCompilerApi
    void endReplaceableGroup();

    @ComposeCompilerApi
    ScopeUpdateScope endRestartGroup();

    @ComposeCompilerApi
    void endReusableGroup();

    @ComposeCompilerApi
    void endToMarker(int i8);

    Applier<?> getApplier();

    U5.g getApplyCoroutineContext();

    ControlledComposition getComposition();

    CompositionData getCompositionData();

    int getCompoundKeyHash();

    CompositionLocalMap getCurrentCompositionLocalMap();

    int getCurrentMarker();

    boolean getDefaultsInvalid();

    boolean getInserting();

    RecomposeScope getRecomposeScope();

    Object getRecomposeScopeIdentity();

    boolean getSkipping();

    @InternalComposeApi
    void insertMovableContent(MovableContent<?> movableContent, Object obj);

    @InternalComposeApi
    void insertMovableContentReferences(List<r> list);

    @ComposeCompilerApi
    Object joinKey(Object obj, Object obj2);

    @InternalComposeApi
    void recordSideEffect(Function0 function0);

    @InternalComposeApi
    void recordUsed(RecomposeScope recomposeScope);

    @ComposeCompilerApi
    Object rememberedValue();

    @ComposeCompilerApi
    void skipCurrentGroup();

    @ComposeCompilerApi
    void skipToGroupEnd();

    void sourceInformation(String str);

    void sourceInformationMarkerEnd();

    void sourceInformationMarkerStart(int i8, String str);

    @ComposeCompilerApi
    void startDefaults();

    @ComposeCompilerApi
    void startMovableGroup(int i8, Object obj);

    @ComposeCompilerApi
    void startNode();

    @InternalComposeApi
    void startProvider(ProvidedValue<?> providedValue);

    @InternalComposeApi
    void startProviders(ProvidedValue<?>[] providedValueArr);

    @ComposeCompilerApi
    void startReplaceableGroup(int i8);

    @ComposeCompilerApi
    Composer startRestartGroup(int i8);

    @ComposeCompilerApi
    void startReusableGroup(int i8, Object obj);

    @ComposeCompilerApi
    void startReusableNode();

    @ComposeCompilerApi
    void updateRememberedValue(Object obj);

    @ComposeCompilerApi
    void useNode();
}
