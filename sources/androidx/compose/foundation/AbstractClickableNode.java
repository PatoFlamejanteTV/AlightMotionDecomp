package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.f;
import androidx.compose.ui.semantics.Role;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3462k;

/* loaded from: classes.dex */
abstract class AbstractClickableNode extends DelegatingNode implements PointerInputModifierNode, KeyInputModifierNode {
    private boolean enabled;
    private final InteractionData interactionData;
    private MutableInteractionSource interactionSource;
    private Function0 onClick;
    private String onClickLabel;
    private Role role;

    @StabilityInferred(parameters = 0)
    /* loaded from: classes.dex */
    public static final class InteractionData {
        public static final int $stable = 8;
        private PressInteraction.Press pressInteraction;
        private final Map<Key, PressInteraction.Press> currentKeyPressInteractions = new LinkedHashMap();
        private long centreOffset = Offset.Companion.m2728getZeroF1C5BW0();

        /* renamed from: getCentreOffset-F1C5BW0, reason: not valid java name */
        public final long m245getCentreOffsetF1C5BW0() {
            return this.centreOffset;
        }

        public final Map<Key, PressInteraction.Press> getCurrentKeyPressInteractions() {
            return this.currentKeyPressInteractions;
        }

        public final PressInteraction.Press getPressInteraction() {
            return this.pressInteraction;
        }

        /* renamed from: setCentreOffset-k-4lQ0M, reason: not valid java name */
        public final void m246setCentreOffsetk4lQ0M(long j8) {
            this.centreOffset = j8;
        }

        public final void setPressInteraction(PressInteraction.Press press) {
            this.pressInteraction = press;
        }
    }

    public /* synthetic */ AbstractClickableNode(MutableInteractionSource mutableInteractionSource, boolean z8, String str, Role role, Function0 function0, AbstractC3284p abstractC3284p) {
        this(mutableInteractionSource, z8, str, role, function0);
    }

    /* renamed from: updateCommon-XHw0xAI$default, reason: not valid java name */
    public static /* synthetic */ void m240updateCommonXHw0xAI$default(AbstractClickableNode abstractClickableNode, MutableInteractionSource mutableInteractionSource, boolean z8, String str, Role role, Function0 function0, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 8) != 0) {
                role = null;
            }
            abstractClickableNode.m244updateCommonXHw0xAI(mutableInteractionSource, z8, str, role, function0);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateCommon-XHw0xAI");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void disposeInteractionSource() {
        PressInteraction.Press pressInteraction = this.interactionData.getPressInteraction();
        if (pressInteraction != null) {
            this.interactionSource.tryEmit(new PressInteraction.Cancel(pressInteraction));
        }
        Iterator<T> it = this.interactionData.getCurrentKeyPressInteractions().values().iterator();
        while (it.hasNext()) {
            this.interactionSource.tryEmit(new PressInteraction.Cancel((PressInteraction.Press) it.next()));
        }
        this.interactionData.setPressInteraction(null);
        this.interactionData.getCurrentKeyPressInteractions().clear();
    }

    public abstract AbstractClickablePointerInputNode getClickablePointerInputNode();

    public abstract ClickableSemanticsNode getClickableSemanticsNode();

    /* JADX INFO: Access modifiers changed from: protected */
    public final InteractionData getInteractionData() {
        return this.interactionData;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ boolean interceptOutOfBoundsChildEvents() {
        return f.a(this);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        getClickablePointerInputNode().onCancelPointerInput();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ void onDensityChange() {
        f.b(this);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        disposeInteractionSource();
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* renamed from: onKeyEvent-ZmokQxo, reason: not valid java name */
    public boolean mo241onKeyEventZmokQxo(KeyEvent event) {
        AbstractC3292y.i(event, "event");
        if (this.enabled && Clickable_androidKt.m307isPressZmokQxo(event)) {
            if (this.interactionData.getCurrentKeyPressInteractions().containsKey(Key.m3565boximpl(KeyEvent_androidKt.m3876getKeyZmokQxo(event)))) {
                return false;
            }
            PressInteraction.Press press = new PressInteraction.Press(this.interactionData.m245getCentreOffsetF1C5BW0(), null);
            this.interactionData.getCurrentKeyPressInteractions().put(Key.m3565boximpl(KeyEvent_androidKt.m3876getKeyZmokQxo(event)), press);
            AbstractC3462k.d(getCoroutineScope(), null, null, new AbstractClickableNode$onKeyEvent$1(this, press, null), 3, null);
        } else {
            if (!this.enabled || !Clickable_androidKt.m305isClickZmokQxo(event)) {
                return false;
            }
            PressInteraction.Press remove = this.interactionData.getCurrentKeyPressInteractions().remove(Key.m3565boximpl(KeyEvent_androidKt.m3876getKeyZmokQxo(event)));
            if (remove != null) {
                AbstractC3462k.d(getCoroutineScope(), null, null, new AbstractClickableNode$onKeyEvent$2$1(this, remove, null), 3, null);
            }
            this.onClick.invoke();
        }
        return true;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY, reason: not valid java name */
    public void mo242onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pass, long j8) {
        AbstractC3292y.i(pointerEvent, "pointerEvent");
        AbstractC3292y.i(pass, "pass");
        getClickablePointerInputNode().mo242onPointerEventH0pRuoY(pointerEvent, pass, j8);
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* renamed from: onPreKeyEvent-ZmokQxo, reason: not valid java name */
    public boolean mo243onPreKeyEventZmokQxo(KeyEvent event) {
        AbstractC3292y.i(event, "event");
        return false;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ void onViewConfigurationChange() {
        f.c(this);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ boolean sharePointerInputWithSiblings() {
        return f.d(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: updateCommon-XHw0xAI, reason: not valid java name */
    public final void m244updateCommonXHw0xAI(MutableInteractionSource interactionSource, boolean z8, String str, Role role, Function0 onClick) {
        AbstractC3292y.i(interactionSource, "interactionSource");
        AbstractC3292y.i(onClick, "onClick");
        if (!AbstractC3292y.d(this.interactionSource, interactionSource)) {
            disposeInteractionSource();
            this.interactionSource = interactionSource;
        }
        if (this.enabled != z8) {
            if (!z8) {
                disposeInteractionSource();
            }
            this.enabled = z8;
        }
        this.onClickLabel = str;
        this.role = role;
        this.onClick = onClick;
    }

    private AbstractClickableNode(MutableInteractionSource interactionSource, boolean z8, String str, Role role, Function0 onClick) {
        AbstractC3292y.i(interactionSource, "interactionSource");
        AbstractC3292y.i(onClick, "onClick");
        this.interactionSource = interactionSource;
        this.enabled = z8;
        this.onClickLabel = str;
        this.role = role;
        this.onClick = onClick;
        this.interactionData = new InteractionData();
    }
}
