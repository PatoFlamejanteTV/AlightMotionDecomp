package androidx.window.core;

import Q5.p;
import R5.AbstractC1428l;
import androidx.window.core.SpecificationComputer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
final class FailedSpecification<T> extends SpecificationComputer<T> {
    private final WindowStrictModeException exception;
    private final Logger logger;
    private final String message;
    private final String tag;
    private final T value;
    private final SpecificationComputer.VerificationMode verificationMode;

    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SpecificationComputer.VerificationMode.values().length];
            iArr[SpecificationComputer.VerificationMode.STRICT.ordinal()] = 1;
            iArr[SpecificationComputer.VerificationMode.LOG.ordinal()] = 2;
            iArr[SpecificationComputer.VerificationMode.QUIET.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FailedSpecification(T value, String tag, String message, Logger logger, SpecificationComputer.VerificationMode verificationMode) {
        AbstractC3292y.i(value, "value");
        AbstractC3292y.i(tag, "tag");
        AbstractC3292y.i(message, "message");
        AbstractC3292y.i(logger, "logger");
        AbstractC3292y.i(verificationMode, "verificationMode");
        this.value = value;
        this.tag = tag;
        this.message = message;
        this.logger = logger;
        this.verificationMode = verificationMode;
        WindowStrictModeException windowStrictModeException = new WindowStrictModeException(createMessage(value, message));
        StackTraceElement[] stackTrace = windowStrictModeException.getStackTrace();
        AbstractC3292y.h(stackTrace, "stackTrace");
        Object[] array = AbstractC1428l.Y(stackTrace, 2).toArray(new StackTraceElement[0]);
        if (array != null) {
            windowStrictModeException.setStackTrace((StackTraceElement[]) array);
            this.exception = windowStrictModeException;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @Override // androidx.window.core.SpecificationComputer
    public T compute() {
        int i8 = WhenMappings.$EnumSwitchMapping$0[this.verificationMode.ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    throw new p();
                }
                return null;
            }
            this.logger.debug(this.tag, createMessage(this.value, this.message));
            return null;
        }
        throw this.exception;
    }

    public final WindowStrictModeException getException() {
        return this.exception;
    }

    public final Logger getLogger() {
        return this.logger;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getTag() {
        return this.tag;
    }

    public final T getValue() {
        return this.value;
    }

    public final SpecificationComputer.VerificationMode getVerificationMode() {
        return this.verificationMode;
    }

    @Override // androidx.window.core.SpecificationComputer
    public SpecificationComputer<T> require(String message, Function1 condition) {
        AbstractC3292y.i(message, "message");
        AbstractC3292y.i(condition, "condition");
        return this;
    }
}
