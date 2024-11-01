package androidx.compose.foundation.text;

import Q5.I;
import U5.d;
import V5.b;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class CoreTextFieldKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x06ba A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x06f0  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0744  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x07bb  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x075e  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x06f3  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x07e1  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03fa  */
    /* JADX WARN: Type inference failed for: r0v26, types: [androidx.compose.ui.Modifier] */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void CoreTextField(androidx.compose.ui.text.input.TextFieldValue r46, kotlin.jvm.functions.Function1 r47, androidx.compose.ui.Modifier r48, androidx.compose.ui.text.TextStyle r49, androidx.compose.ui.text.input.VisualTransformation r50, kotlin.jvm.functions.Function1 r51, androidx.compose.foundation.interaction.MutableInteractionSource r52, androidx.compose.ui.graphics.Brush r53, boolean r54, int r55, int r56, androidx.compose.ui.text.input.ImeOptions r57, androidx.compose.foundation.text.KeyboardActions r58, boolean r59, boolean r60, c6.InterfaceC2073o r61, androidx.compose.runtime.Composer r62, int r63, int r64, int r65) {
        /*
            Method dump skipped, instructions count: 2045
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField(androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.input.VisualTransformation, kotlin.jvm.functions.Function1, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, boolean, int, int, androidx.compose.ui.text.input.ImeOptions, androidx.compose.foundation.text.KeyboardActions, boolean, boolean, c6.o, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CoreTextField$lambda$8(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void CoreTextFieldRootBox(Modifier modifier, TextFieldSelectionManager textFieldSelectionManager, InterfaceC2072n interfaceC2072n, Composer composer, int i8) {
        Composer startRestartGroup = composer.startRestartGroup(-20551815);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-20551815, i8, -1, "androidx.compose.foundation.text.CoreTextFieldRootBox (CoreTextField.kt:723)");
        }
        startRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), true, startRestartGroup, 48);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Function0 constructor = companion.getConstructor();
        InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor);
        } else {
            startRestartGroup.useNode();
        }
        Composer m2473constructorimpl = Updater.m2473constructorimpl(startRestartGroup);
        Updater.m2480setimpl(m2473constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m2480setimpl(m2473constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        InterfaceC2072n setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(-1985516685);
        interfaceC2072n.invoke(startRestartGroup, Integer.valueOf(((((i8 >> 3) & 112) | 8) >> 3) & 14));
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new CoreTextFieldKt$CoreTextFieldRootBox$2(modifier, textFieldSelectionManager, interfaceC2072n, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void SelectionToolbarAndHandles(TextFieldSelectionManager textFieldSelectionManager, boolean z8, Composer composer, int i8) {
        TextLayoutResultProxy layoutResult;
        TextLayoutResult value;
        boolean z9;
        Composer startRestartGroup = composer.startRestartGroup(626339208);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(626339208, i8, -1, "androidx.compose.foundation.text.SelectionToolbarAndHandles (CoreTextField.kt:1047)");
        }
        if (z8) {
            TextFieldState state$foundation_release = textFieldSelectionManager.getState$foundation_release();
            TextLayoutResult textLayoutResult = null;
            if (state$foundation_release != null && (layoutResult = state$foundation_release.getLayoutResult()) != null && (value = layoutResult.getValue()) != null) {
                TextFieldState state$foundation_release2 = textFieldSelectionManager.getState$foundation_release();
                if (state$foundation_release2 != null) {
                    z9 = state$foundation_release2.isLayoutResultStale();
                } else {
                    z9 = true;
                }
                if (!z9) {
                    textLayoutResult = value;
                }
            }
            if (textLayoutResult != null) {
                if (!TextRange.m4663getCollapsedimpl(textFieldSelectionManager.getValue$foundation_release().m4906getSelectiond9O1mEE())) {
                    int originalToTransformed = textFieldSelectionManager.getOffsetMapping$foundation_release().originalToTransformed(TextRange.m4669getStartimpl(textFieldSelectionManager.getValue$foundation_release().m4906getSelectiond9O1mEE()));
                    int originalToTransformed2 = textFieldSelectionManager.getOffsetMapping$foundation_release().originalToTransformed(TextRange.m4664getEndimpl(textFieldSelectionManager.getValue$foundation_release().m4906getSelectiond9O1mEE()));
                    ResolvedTextDirection bidiRunDirection = textLayoutResult.getBidiRunDirection(originalToTransformed);
                    ResolvedTextDirection bidiRunDirection2 = textLayoutResult.getBidiRunDirection(Math.max(originalToTransformed2 - 1, 0));
                    startRestartGroup.startReplaceableGroup(-498388703);
                    TextFieldState state$foundation_release3 = textFieldSelectionManager.getState$foundation_release();
                    if (state$foundation_release3 != null && state$foundation_release3.getShowSelectionHandleStart()) {
                        TextFieldSelectionManagerKt.TextFieldSelectionHandle(true, bidiRunDirection, textFieldSelectionManager, startRestartGroup, 518);
                    }
                    startRestartGroup.endReplaceableGroup();
                    TextFieldState state$foundation_release4 = textFieldSelectionManager.getState$foundation_release();
                    if (state$foundation_release4 != null && state$foundation_release4.getShowSelectionHandleEnd()) {
                        TextFieldSelectionManagerKt.TextFieldSelectionHandle(false, bidiRunDirection2, textFieldSelectionManager, startRestartGroup, 518);
                    }
                }
                TextFieldState state$foundation_release5 = textFieldSelectionManager.getState$foundation_release();
                if (state$foundation_release5 != null) {
                    if (textFieldSelectionManager.isTextChanged$foundation_release()) {
                        state$foundation_release5.setShowFloatingToolbar(false);
                    }
                    if (state$foundation_release5.getHasFocus()) {
                        if (state$foundation_release5.getShowFloatingToolbar()) {
                            textFieldSelectionManager.showSelectionToolbar$foundation_release();
                        } else {
                            textFieldSelectionManager.hideSelectionToolbar$foundation_release();
                        }
                    }
                }
            }
        } else {
            textFieldSelectionManager.hideSelectionToolbar$foundation_release();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new CoreTextFieldKt$SelectionToolbarAndHandles$2(textFieldSelectionManager, z8, i8));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void TextFieldCursorHandle(TextFieldSelectionManager manager, Composer composer, int i8) {
        AbstractC3292y.i(manager, "manager");
        Composer startRestartGroup = composer.startRestartGroup(-1436003720);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1436003720, i8, -1, "androidx.compose.foundation.text.TextFieldCursorHandle (CoreTextField.kt:1090)");
        }
        TextFieldState state$foundation_release = manager.getState$foundation_release();
        if (state$foundation_release != null && state$foundation_release.getShowCursorHandle()) {
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed = startRestartGroup.changed(manager);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = manager.cursorDragObserver$foundation_release();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            TextDragObserver textDragObserver = (TextDragObserver) rememberedValue;
            long m1060getCursorPositiontuRUvjQ$foundation_release = manager.m1060getCursorPositiontuRUvjQ$foundation_release((Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity()));
            Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion, textDragObserver, new CoreTextFieldKt$TextFieldCursorHandle$1(textDragObserver, null));
            Offset m2701boximpl = Offset.m2701boximpl(m1060getCursorPositiontuRUvjQ$foundation_release);
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed2 = startRestartGroup.changed(m2701boximpl);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new CoreTextFieldKt$TextFieldCursorHandle$2$1(m1060getCursorPositiontuRUvjQ$foundation_release);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            AndroidCursorHandle_androidKt.m832CursorHandleULxng0E(m1060getCursorPositiontuRUvjQ$foundation_release, SemanticsModifierKt.semantics$default(pointerInput, false, (Function1) rememberedValue2, 1, null), null, startRestartGroup, 384);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new CoreTextFieldKt$TextFieldCursorHandle$3(manager, i8));
        }
    }

    public static final Object bringSelectionEndIntoView(BringIntoViewRequester bringIntoViewRequester, TextFieldValue textFieldValue, TextDelegate textDelegate, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, d dVar) {
        Rect rect;
        int originalToTransformed = offsetMapping.originalToTransformed(TextRange.m4666getMaximpl(textFieldValue.m4906getSelectiond9O1mEE()));
        if (originalToTransformed < textLayoutResult.getLayoutInput().getText().length()) {
            rect = textLayoutResult.getBoundingBox(originalToTransformed);
        } else if (originalToTransformed != 0) {
            rect = textLayoutResult.getBoundingBox(originalToTransformed - 1);
        } else {
            rect = new Rect(0.0f, 0.0f, 1.0f, IntSize.m5320getHeightimpl(TextFieldDelegateKt.computeSizeForDefaultText$default(textDelegate.getStyle(), textDelegate.getDensity(), textDelegate.getFontFamilyResolver(), null, 0, 24, null)));
        }
        Object bringIntoView = bringIntoViewRequester.bringIntoView(rect, dVar);
        if (bringIntoView == b.e()) {
            return bringIntoView;
        }
        return I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void endInputSession(TextFieldState textFieldState) {
        TextInputSession inputSession = textFieldState.getInputSession();
        if (inputSession != null) {
            TextFieldDelegate.Companion.onBlur$foundation_release(inputSession, textFieldState.getProcessor(), textFieldState.getOnValueChange());
        }
        textFieldState.setInputSession(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyFocusedRect(TextFieldState textFieldState, TextFieldValue textFieldValue, OffsetMapping offsetMapping) {
        Snapshot createNonObservableSnapshot = Snapshot.Companion.createNonObservableSnapshot();
        try {
            Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
            try {
                TextLayoutResultProxy layoutResult = textFieldState.getLayoutResult();
                if (layoutResult == null) {
                    return;
                }
                TextInputSession inputSession = textFieldState.getInputSession();
                if (inputSession == null) {
                    return;
                }
                LayoutCoordinates layoutCoordinates = textFieldState.getLayoutCoordinates();
                if (layoutCoordinates == null) {
                    return;
                }
                TextFieldDelegate.Companion.notifyFocusedRect$foundation_release(textFieldValue, textFieldState.getTextDelegate(), layoutResult.getValue(), layoutCoordinates, inputSession, textFieldState.getHasFocus(), offsetMapping);
                I i8 = I.f8786a;
            } finally {
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
            }
        } finally {
            createNonObservableSnapshot.dispose();
        }
    }

    private static final Modifier previewKeyEventToDeselectOnBack(Modifier modifier, TextFieldState textFieldState, TextFieldSelectionManager textFieldSelectionManager) {
        return KeyInputModifierKt.onPreviewKeyEvent(modifier, new CoreTextFieldKt$previewKeyEventToDeselectOnBack$1(textFieldState, textFieldSelectionManager));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startInputSession(TextInputService textInputService, TextFieldState textFieldState, TextFieldValue textFieldValue, ImeOptions imeOptions, OffsetMapping offsetMapping) {
        textFieldState.setInputSession(TextFieldDelegate.Companion.onFocus$foundation_release(textInputService, textFieldValue, textFieldState.getProcessor(), imeOptions, textFieldState.getOnValueChange(), textFieldState.getOnImeActionPerformed()));
        notifyFocusedRect(textFieldState, textFieldValue, offsetMapping);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tapToFocus(TextFieldState textFieldState, FocusRequester focusRequester, boolean z8) {
        TextInputSession inputSession;
        if (!textFieldState.getHasFocus()) {
            focusRequester.requestFocus();
        } else if (z8 && (inputSession = textFieldState.getInputSession()) != null) {
            inputSession.showSoftwareKeyboard();
        }
    }
}
