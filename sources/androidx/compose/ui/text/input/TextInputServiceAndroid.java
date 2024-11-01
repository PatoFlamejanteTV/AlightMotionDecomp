package androidx.compose.ui.text.input;

import Q5.InterfaceC1416k;
import android.graphics.Rect;
import android.view.Choreographer;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.PositionCalculator;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import e6.AbstractC2829a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.T;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class TextInputServiceAndroid implements PlatformTextInputService {
    public static final int $stable = 8;
    private final InterfaceC1416k baseInputConnection$delegate;
    private final CursorAnchorInfoController cursorAnchorInfoController;
    private boolean editorHasFocus;
    private Rect focusedRect;
    private Runnable frameCallback;
    private List<WeakReference<RecordingInputConnection>> ics;
    private ImeOptions imeOptions;
    private final Executor inputCommandProcessorExecutor;
    private final InputMethodManager inputMethodManager;
    private Function1 onEditCommand;
    private Function1 onImeActionPerformed;
    private TextFieldValue state;
    private final MutableVector<TextInputCommand> textInputCommandQueue;
    private final View view;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum TextInputCommand {
        StartInput,
        StopInput,
        ShowKeyboard,
        HideKeyboard
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextInputCommand.values().length];
            try {
                iArr[TextInputCommand.StartInput.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextInputCommand.StopInput.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextInputCommand.ShowKeyboard.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TextInputCommand.HideKeyboard.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TextInputServiceAndroid(View view, PositionCalculator positionCalculator, InputMethodManager inputMethodManager, Executor executor) {
        this.view = view;
        this.inputMethodManager = inputMethodManager;
        this.inputCommandProcessorExecutor = executor;
        this.onEditCommand = TextInputServiceAndroid$onEditCommand$1.INSTANCE;
        this.onImeActionPerformed = TextInputServiceAndroid$onImeActionPerformed$1.INSTANCE;
        this.state = new TextFieldValue("", TextRange.Companion.m4674getZerod9O1mEE(), (TextRange) null, 4, (AbstractC3284p) null);
        this.imeOptions = ImeOptions.Companion.getDefault();
        this.ics = new ArrayList();
        this.baseInputConnection$delegate = Q5.l.a(Q5.o.f8805c, new TextInputServiceAndroid$baseInputConnection$2(this));
        this.cursorAnchorInfoController = new CursorAnchorInfoController(positionCalculator, inputMethodManager);
        this.textInputCommandQueue = new MutableVector<>(new TextInputCommand[16], 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseInputConnection getBaseInputConnection() {
        return (BaseInputConnection) this.baseInputConnection$delegate.getValue();
    }

    private final void processInputCommands() {
        T t8 = new T();
        T t9 = new T();
        MutableVector<TextInputCommand> mutableVector = this.textInputCommandQueue;
        int size = mutableVector.getSize();
        if (size > 0) {
            TextInputCommand[] content = mutableVector.getContent();
            int i8 = 0;
            do {
                processInputCommands$applyToState(content[i8], t8, t9);
                i8++;
            } while (i8 < size);
        }
        this.textInputCommandQueue.clear();
        if (AbstractC3292y.d(t8.f34573a, Boolean.TRUE)) {
            restartInputImmediately();
        }
        Boolean bool = (Boolean) t9.f34573a;
        if (bool != null) {
            setKeyboardVisibleImmediately(bool.booleanValue());
        }
        if (AbstractC3292y.d(t8.f34573a, Boolean.FALSE)) {
            restartInputImmediately();
        }
    }

    private static final void processInputCommands$applyToState(TextInputCommand textInputCommand, T t8, T t9) {
        int i8 = WhenMappings.$EnumSwitchMapping$0[textInputCommand.ordinal()];
        boolean z8 = true;
        if (i8 != 1) {
            if (i8 != 2) {
                if ((i8 == 3 || i8 == 4) && !AbstractC3292y.d(t8.f34573a, Boolean.FALSE)) {
                    if (textInputCommand != TextInputCommand.ShowKeyboard) {
                        z8 = false;
                    }
                    t9.f34573a = Boolean.valueOf(z8);
                    return;
                }
                return;
            }
            Boolean bool = Boolean.FALSE;
            t8.f34573a = bool;
            t9.f34573a = bool;
            return;
        }
        Boolean bool2 = Boolean.TRUE;
        t8.f34573a = bool2;
        t9.f34573a = bool2;
    }

    private final void restartInputImmediately() {
        this.inputMethodManager.restartInput();
    }

    private final void sendInputCommand(TextInputCommand textInputCommand) {
        this.textInputCommandQueue.add(textInputCommand);
        if (this.frameCallback == null) {
            Runnable runnable = new Runnable() { // from class: androidx.compose.ui.text.input.l
                @Override // java.lang.Runnable
                public final void run() {
                    TextInputServiceAndroid.sendInputCommand$lambda$1(TextInputServiceAndroid.this);
                }
            };
            this.inputCommandProcessorExecutor.execute(runnable);
            this.frameCallback = runnable;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendInputCommand$lambda$1(TextInputServiceAndroid textInputServiceAndroid) {
        textInputServiceAndroid.frameCallback = null;
        textInputServiceAndroid.processInputCommands();
    }

    private final void setKeyboardVisibleImmediately(boolean z8) {
        if (z8) {
            this.inputMethodManager.showSoftInput();
        } else {
            this.inputMethodManager.hideSoftInput();
        }
    }

    public final InputConnection createInputConnection(EditorInfo editorInfo) {
        if (!this.editorHasFocus) {
            return null;
        }
        TextInputServiceAndroid_androidKt.update(editorInfo, this.imeOptions, this.state);
        TextInputServiceAndroid_androidKt.updateWithEmojiCompat(editorInfo);
        RecordingInputConnection recordingInputConnection = new RecordingInputConnection(this.state, new InputEventCallback2() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$createInputConnection$1
            @Override // androidx.compose.ui.text.input.InputEventCallback2
            public void onConnectionClosed(RecordingInputConnection recordingInputConnection2) {
                List list;
                List list2;
                List list3;
                list = TextInputServiceAndroid.this.ics;
                int size = list.size();
                for (int i8 = 0; i8 < size; i8++) {
                    list2 = TextInputServiceAndroid.this.ics;
                    if (AbstractC3292y.d(((WeakReference) list2.get(i8)).get(), recordingInputConnection2)) {
                        list3 = TextInputServiceAndroid.this.ics;
                        list3.remove(i8);
                        return;
                    }
                }
            }

            @Override // androidx.compose.ui.text.input.InputEventCallback2
            public void onEditCommands(List<? extends EditCommand> list) {
                Function1 function1;
                function1 = TextInputServiceAndroid.this.onEditCommand;
                function1.invoke(list);
            }

            @Override // androidx.compose.ui.text.input.InputEventCallback2
            /* renamed from: onImeAction-KlQnJC8 */
            public void mo4860onImeActionKlQnJC8(int i8) {
                Function1 function1;
                function1 = TextInputServiceAndroid.this.onImeActionPerformed;
                function1.invoke(ImeAction.m4829boximpl(i8));
            }

            @Override // androidx.compose.ui.text.input.InputEventCallback2
            public void onKeyEvent(KeyEvent keyEvent) {
                BaseInputConnection baseInputConnection;
                baseInputConnection = TextInputServiceAndroid.this.getBaseInputConnection();
                baseInputConnection.sendKeyEvent(keyEvent);
            }

            @Override // androidx.compose.ui.text.input.InputEventCallback2
            public void onRequestCursorAnchorInfo(boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
                CursorAnchorInfoController cursorAnchorInfoController;
                cursorAnchorInfoController = TextInputServiceAndroid.this.cursorAnchorInfoController;
                cursorAnchorInfoController.requestUpdate(z8, z9, z10, z11, z12, z13);
            }
        }, this.imeOptions.getAutoCorrect());
        this.ics.add(new WeakReference<>(recordingInputConnection));
        return recordingInputConnection;
    }

    public final TextFieldValue getState$ui_release() {
        return this.state;
    }

    public final View getView() {
        return this.view;
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void hideSoftwareKeyboard() {
        sendInputCommand(TextInputCommand.HideKeyboard);
    }

    public final boolean isEditorFocused() {
        return this.editorHasFocus;
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void notifyFocusedRect(androidx.compose.ui.geometry.Rect rect) {
        Rect rect2;
        this.focusedRect = new Rect(AbstractC2829a.d(rect.getLeft()), AbstractC2829a.d(rect.getTop()), AbstractC2829a.d(rect.getRight()), AbstractC2829a.d(rect.getBottom()));
        if (this.ics.isEmpty() && (rect2 = this.focusedRect) != null) {
            this.view.requestRectangleOnScreen(new Rect(rect2));
        }
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void showSoftwareKeyboard() {
        sendInputCommand(TextInputCommand.ShowKeyboard);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void startInput(TextFieldValue textFieldValue, ImeOptions imeOptions, Function1 function1, Function1 function12) {
        this.editorHasFocus = true;
        this.state = textFieldValue;
        this.imeOptions = imeOptions;
        this.onEditCommand = function1;
        this.onImeActionPerformed = function12;
        sendInputCommand(TextInputCommand.StartInput);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void stopInput() {
        this.editorHasFocus = false;
        this.onEditCommand = TextInputServiceAndroid$stopInput$1.INSTANCE;
        this.onImeActionPerformed = TextInputServiceAndroid$stopInput$2.INSTANCE;
        this.focusedRect = null;
        sendInputCommand(TextInputCommand.StopInput);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void updateState(TextFieldValue textFieldValue, TextFieldValue textFieldValue2) {
        boolean z8;
        int i8;
        if (TextRange.m4662equalsimpl0(this.state.m4906getSelectiond9O1mEE(), textFieldValue2.m4906getSelectiond9O1mEE()) && AbstractC3292y.d(this.state.m4905getCompositionMzsxiRA(), textFieldValue2.m4905getCompositionMzsxiRA())) {
            z8 = false;
        } else {
            z8 = true;
        }
        this.state = textFieldValue2;
        int size = this.ics.size();
        for (int i9 = 0; i9 < size; i9++) {
            RecordingInputConnection recordingInputConnection = this.ics.get(i9).get();
            if (recordingInputConnection != null) {
                recordingInputConnection.setMTextFieldValue$ui_release(textFieldValue2);
            }
        }
        this.cursorAnchorInfoController.invalidate();
        if (AbstractC3292y.d(textFieldValue, textFieldValue2)) {
            if (z8) {
                InputMethodManager inputMethodManager = this.inputMethodManager;
                int m4667getMinimpl = TextRange.m4667getMinimpl(textFieldValue2.m4906getSelectiond9O1mEE());
                int m4666getMaximpl = TextRange.m4666getMaximpl(textFieldValue2.m4906getSelectiond9O1mEE());
                TextRange m4905getCompositionMzsxiRA = this.state.m4905getCompositionMzsxiRA();
                int i10 = -1;
                if (m4905getCompositionMzsxiRA != null) {
                    i8 = TextRange.m4667getMinimpl(m4905getCompositionMzsxiRA.m4673unboximpl());
                } else {
                    i8 = -1;
                }
                TextRange m4905getCompositionMzsxiRA2 = this.state.m4905getCompositionMzsxiRA();
                if (m4905getCompositionMzsxiRA2 != null) {
                    i10 = TextRange.m4666getMaximpl(m4905getCompositionMzsxiRA2.m4673unboximpl());
                }
                inputMethodManager.updateSelection(m4667getMinimpl, m4666getMaximpl, i8, i10);
                return;
            }
            return;
        }
        if (textFieldValue != null && (!AbstractC3292y.d(textFieldValue.getText(), textFieldValue2.getText()) || (TextRange.m4662equalsimpl0(textFieldValue.m4906getSelectiond9O1mEE(), textFieldValue2.m4906getSelectiond9O1mEE()) && !AbstractC3292y.d(textFieldValue.m4905getCompositionMzsxiRA(), textFieldValue2.m4905getCompositionMzsxiRA())))) {
            restartInputImmediately();
            return;
        }
        int size2 = this.ics.size();
        for (int i11 = 0; i11 < size2; i11++) {
            RecordingInputConnection recordingInputConnection2 = this.ics.get(i11).get();
            if (recordingInputConnection2 != null) {
                recordingInputConnection2.updateInputState(this.state, this.inputMethodManager);
            }
        }
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void updateTextLayoutResult(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Function1 function1, androidx.compose.ui.geometry.Rect rect, androidx.compose.ui.geometry.Rect rect2) {
        this.cursorAnchorInfoController.updateTextLayoutResult(textFieldValue, offsetMapping, textLayoutResult, function1, rect, rect2);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void startInput() {
        sendInputCommand(TextInputCommand.StartInput);
    }

    public /* synthetic */ TextInputServiceAndroid(View view, PositionCalculator positionCalculator, InputMethodManager inputMethodManager, Executor executor, int i8, AbstractC3284p abstractC3284p) {
        this(view, positionCalculator, inputMethodManager, (i8 & 8) != 0 ? TextInputServiceAndroid_androidKt.asExecutor(Choreographer.getInstance()) : executor);
    }

    public TextInputServiceAndroid(View view, PositionCalculator positionCalculator) {
        this(view, positionCalculator, new InputMethodManagerImpl(view), null, 8, null);
    }
}
