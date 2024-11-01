package androidx.compose.foundation.gestures;

import Q5.I;
import Q5.s;
import androidx.compose.foundation.gestures.ContentInViewModifier;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.geometry.Rect;
import i6.i;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import n6.InterfaceC3470o;

/* loaded from: classes.dex */
public final class BringIntoViewRequestPriorityQueue {
    private final MutableVector<ContentInViewModifier.Request> requests = new MutableVector<>(new ContentInViewModifier.Request[16], 0);

    public final void cancelAndRemoveAll(Throwable th) {
        MutableVector<ContentInViewModifier.Request> mutableVector = this.requests;
        int size = mutableVector.getSize();
        InterfaceC3470o[] interfaceC3470oArr = new InterfaceC3470o[size];
        for (int i8 = 0; i8 < size; i8++) {
            interfaceC3470oArr[i8] = mutableVector.getContent()[i8].getContinuation();
        }
        for (int i9 = 0; i9 < size; i9++) {
            interfaceC3470oArr[i9].t(th);
        }
        if (!this.requests.isEmpty()) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public final boolean enqueue(ContentInViewModifier.Request request) {
        AbstractC3292y.i(request, "request");
        Rect rect = (Rect) request.getCurrentBounds().invoke();
        if (rect == null) {
            InterfaceC3470o continuation = request.getContinuation();
            s.a aVar = s.f8810b;
            continuation.resumeWith(s.b(I.f8786a));
            return false;
        }
        request.getContinuation().f(new BringIntoViewRequestPriorityQueue$enqueue$1(this, request));
        i iVar = new i(0, this.requests.getSize() - 1);
        int e8 = iVar.e();
        int g8 = iVar.g();
        if (e8 <= g8) {
            while (true) {
                Rect rect2 = (Rect) this.requests.getContent()[g8].getCurrentBounds().invoke();
                if (rect2 != null) {
                    Rect intersect = rect.intersect(rect2);
                    if (AbstractC3292y.d(intersect, rect)) {
                        this.requests.add(g8 + 1, request);
                        return true;
                    }
                    if (!AbstractC3292y.d(intersect, rect2)) {
                        CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                        int size = this.requests.getSize() - 1;
                        if (size <= g8) {
                            while (true) {
                                this.requests.getContent()[g8].getContinuation().t(cancellationException);
                                if (size == g8) {
                                    break;
                                }
                                size++;
                            }
                        }
                    }
                }
                if (g8 == e8) {
                    break;
                }
                g8--;
            }
        }
        this.requests.add(0, request);
        return true;
    }

    public final void forEachFromSmallest(Function1 block) {
        AbstractC3292y.i(block, "block");
        MutableVector mutableVector = this.requests;
        int size = mutableVector.getSize();
        if (size > 0) {
            int i8 = size - 1;
            Object[] content = mutableVector.getContent();
            do {
                block.invoke(((ContentInViewModifier.Request) content[i8]).getCurrentBounds().invoke());
                i8--;
            } while (i8 >= 0);
        }
    }

    public final int getSize() {
        return this.requests.getSize();
    }

    public final boolean isEmpty() {
        return this.requests.isEmpty();
    }

    public final void resumeAndRemoveAll() {
        i iVar = new i(0, this.requests.getSize() - 1);
        int e8 = iVar.e();
        int g8 = iVar.g();
        if (e8 <= g8) {
            while (true) {
                this.requests.getContent()[e8].getContinuation().resumeWith(s.b(I.f8786a));
                if (e8 == g8) {
                    break;
                } else {
                    e8++;
                }
            }
        }
        this.requests.clear();
    }

    public final void resumeAndRemoveWhile(Function1 block) {
        AbstractC3292y.i(block, "block");
        while (this.requests.isNotEmpty() && ((Boolean) block.invoke(((ContentInViewModifier.Request) this.requests.last()).getCurrentBounds().invoke())).booleanValue()) {
            ((ContentInViewModifier.Request) this.requests.removeAt(this.requests.getSize() - 1)).getContinuation().resumeWith(s.b(I.f8786a));
        }
    }
}
